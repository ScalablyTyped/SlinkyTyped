package typingsSlinky.antd.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antd.emptyMod.EmptyProps
import typingsSlinky.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Empty {
  
  @JSImport("antd", "Empty")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def description(value: ReactElement): this.type = set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def descriptionReactElement(value: ReactElement): this.type = set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def image(value: ReactElement): this.type = set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def imageReactElement(value: ReactElement): this.type = set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def imageStyle(value: CSSProperties): this.type = set("imageStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Empty.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: EmptyProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
