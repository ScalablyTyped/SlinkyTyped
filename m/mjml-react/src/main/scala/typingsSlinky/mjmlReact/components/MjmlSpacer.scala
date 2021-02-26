package typingsSlinky.mjmlReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.csstype.mod.BackgroundColorProperty
import typingsSlinky.csstype.mod.VerticalAlignProperty
import typingsSlinky.mjmlReact.mod.BorderProps
import typingsSlinky.mjmlReact.mod.ClassNameProps
import typingsSlinky.mjmlReact.mod.MjmlSpacerProps
import typingsSlinky.mjmlReact.mod.PaddingProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MjmlSpacer {
  
  @JSImport("mjml-react", "MjmlSpacer")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.mjmlReact.mod.MjmlSpacer] {
    
    @scala.inline
    def border(value: String): this.type = set("border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def borderBottom(value: String): this.type = set("borderBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def borderLeft(value: String): this.type = set("borderLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def borderRadius(value: String | Double): this.type = set("borderRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def borderRight(value: String): this.type = set("borderRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def borderTop(value: String): this.type = set("borderTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def containerBackgroundColor(value: BackgroundColorProperty): this.type = set("containerBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def cssClass(value: String): this.type = set("cssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def height(value: String | Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def padding(value: String | Double): this.type = set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def paddingBottom(value: String | Double): this.type = set("paddingBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def paddingLeft(value: String | Double): this.type = set("paddingLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def paddingRight(value: String | Double): this.type = set("paddingRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def paddingTop(value: String | Double): this.type = set("paddingTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def verticalAlign(value: VerticalAlignProperty[String | Double]): this.type = set("verticalAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def width(value: String | Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: MjmlSpacer.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MjmlSpacerProps with BorderProps with PaddingProps with ClassNameProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
