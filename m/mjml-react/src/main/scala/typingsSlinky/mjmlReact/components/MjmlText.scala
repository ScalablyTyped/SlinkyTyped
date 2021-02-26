package typingsSlinky.mjmlReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.csstype.mod.BackgroundColorProperty
import typingsSlinky.csstype.mod.ColorProperty
import typingsSlinky.mjmlReact.mod.ClassNameProps
import typingsSlinky.mjmlReact.mod.MjmlTextProps
import typingsSlinky.mjmlReact.mod.PaddingProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MjmlText {
  
  @JSImport("mjml-react", "MjmlText")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.mjmlReact.mod.MjmlText] {
    
    @scala.inline
    def align(value: String): this.type = set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def color(value: ColorProperty): this.type = set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def containerBackgroundColor(value: BackgroundColorProperty): this.type = set("containerBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def cssClass(value: String): this.type = set("cssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fontFamily(value: String): this.type = set("fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fontSize(value: String | Double): this.type = set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fontStyle(value: String): this.type = set("fontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fontWeight(value: Double): this.type = set("fontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def height(value: String | Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def letterSpacing(value: String): this.type = set("letterSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def lineHeight(value: String): this.type = set("lineHeight", value.asInstanceOf[js.Any])
    
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
    def textDecoration(value: String): this.type = set("textDecoration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def textTransform(value: String): this.type = set("textTransform", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: MjmlText.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MjmlTextProps with PaddingProps with ClassNameProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
