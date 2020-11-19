package typingsSlinky.mjmlReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.csstype.mod.Property.BackgroundColor
import typingsSlinky.csstype.mod.Property.BackgroundRepeat
import typingsSlinky.csstype.mod.Property.BackgroundSize
import typingsSlinky.csstype.mod.Property.TextAlign
import typingsSlinky.csstype.mod.Property.VerticalAlign
import typingsSlinky.mjmlReact.mjmlReactStrings.ltr
import typingsSlinky.mjmlReact.mjmlReactStrings.rtl
import typingsSlinky.mjmlReact.mod.BorderProps
import typingsSlinky.mjmlReact.mod.ClassNameProps
import typingsSlinky.mjmlReact.mod.MjmlSectionProps
import typingsSlinky.mjmlReact.mod.PaddingProps
import typingsSlinky.mjmlReact.mod.RequiredChildrenProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MjmlSection {
  
  @JSImport("mjml-react", "MjmlSection")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.mjmlReact.mod.MjmlSection] {
    
    @scala.inline
    def backgroundColor(value: BackgroundColor): this.type = set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def backgroundRepeat(value: BackgroundRepeat): this.type = set("backgroundRepeat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def backgroundSize(value: BackgroundSize[String | Double]): this.type = set("backgroundSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def backgroundUrl(value: String): this.type = set("backgroundUrl", value.asInstanceOf[js.Any])
    
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
    def cssClass(value: String): this.type = set("cssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def direction(value: ltr | rtl): this.type = set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fullWidth(value: Boolean): this.type = set("fullWidth", value.asInstanceOf[js.Any])
    
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
    def textAlign(value: TextAlign): this.type = set("textAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def verticalAlign(value: VerticalAlign[String | Double]): this.type = set("verticalAlign", value.asInstanceOf[js.Any])
  }
  
  def withProps(
    p: MjmlSectionProps with RequiredChildrenProps with BorderProps with PaddingProps with ClassNameProps
  ): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: MjmlSection.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
