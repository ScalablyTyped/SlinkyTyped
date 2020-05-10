package typingsSlinky.mjmlReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.csstype.mod.BackgroundColorProperty
import typingsSlinky.csstype.mod.ColorProperty
import typingsSlinky.csstype.mod.TextAlignProperty
import typingsSlinky.csstype.mod.VerticalAlignProperty
import typingsSlinky.mjmlReact.mod.BorderProps
import typingsSlinky.mjmlReact.mod.ClassNameProps
import typingsSlinky.mjmlReact.mod.HrefProps
import typingsSlinky.mjmlReact.mod.MjmlButtonProps
import typingsSlinky.mjmlReact.mod.PaddingProps
import typingsSlinky.mjmlReact.mod.RequiredChildrenProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MjmlButton {
  @JSImport("mjml-react", "MjmlButton")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.mjmlReact.mod.MjmlButton] {
    @scala.inline
    def align(value: String): this.type = set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def backgroundColor(value: BackgroundColorProperty): this.type = set("backgroundColor", value.asInstanceOf[js.Any])
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
    def href(value: String): this.type = set("href", value.asInstanceOf[js.Any])
    @scala.inline
    def innerPadding(value: String): this.type = set("innerPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def lineHeight(value: String | Double): this.type = set("lineHeight", value.asInstanceOf[js.Any])
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
    def rel(value: String): this.type = set("rel", value.asInstanceOf[js.Any])
    @scala.inline
    def target(value: String): this.type = set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def textAlign(value: TextAlignProperty): this.type = set("textAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def textDecoration(value: String): this.type = set("textDecoration", value.asInstanceOf[js.Any])
    @scala.inline
    def textTransform(value: String): this.type = set("textTransform", value.asInstanceOf[js.Any])
    @scala.inline
    def verticalAlign(value: VerticalAlignProperty[String | Double]): this.type = set("verticalAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def width(value: String | Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  def withProps(
    p: RequiredChildrenProps with MjmlButtonProps with PaddingProps with ClassNameProps with HrefProps with BorderProps
  ): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: MjmlButton.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

