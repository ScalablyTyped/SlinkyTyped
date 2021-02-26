package typingsSlinky.rmcTrigger.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rmcTrigger.lazyRenderBoxMod.ILazyRenderBoxProps
import typingsSlinky.rmcTrigger.lazyRenderBoxMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LazyRenderBox {
  
  @JSImport("rmc-trigger/lib/LazyRenderBox", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hiddenClassName(value: String): this.type = set("hiddenClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: js.Any): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: LazyRenderBox.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ILazyRenderBoxProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
