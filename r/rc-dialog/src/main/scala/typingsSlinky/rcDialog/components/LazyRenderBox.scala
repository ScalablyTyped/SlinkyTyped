package typingsSlinky.rcDialog.components

import org.scalajs.dom.raw.HTMLDivElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.div.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rcDialog.lazyRenderBoxMod.ILazyRenderBoxPropTypes
import typingsSlinky.rcDialog.lazyRenderBoxMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LazyRenderBox {
  
  @JSImport("rc-dialog/lib/LazyRenderBox", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def forceRender(value: Boolean): this.type = set("forceRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hiddenClassName(value: String): this.type = set("hiddenClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onMouseDown(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onMouseDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def role(value: String): this.type = set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ILazyRenderBoxPropTypes): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: LazyRenderBox.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
