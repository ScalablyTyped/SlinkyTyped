package typingsSlinky.mjmlReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.csstype.mod.BackgroundColorProperty
import typingsSlinky.csstype.mod.ColorProperty
import typingsSlinky.mjmlReact.mjmlReactStrings.horizontal
import typingsSlinky.mjmlReact.mjmlReactStrings.vertical
import typingsSlinky.mjmlReact.mod.MjmlSocialProps
import typingsSlinky.mjmlReact.mod.PaddingProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MjmlSocial {
  @JSImport("mjml-react", "MjmlSocial")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.mjmlReact.mod.MjmlSocial] {
    @scala.inline
    def align(value: String): this.type = set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def borderRadius(value: String | Double): this.type = set("borderRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def color(value: ColorProperty): this.type = set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def containerBackgroundColor(value: BackgroundColorProperty): this.type = set("containerBackgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def fontFamily(value: String): this.type = set("fontFamily", value.asInstanceOf[js.Any])
    @scala.inline
    def fontSize(value: String | Double): this.type = set("fontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def iconHeight(value: String): this.type = set("iconHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def iconSize(value: String): this.type = set("iconSize", value.asInstanceOf[js.Any])
    @scala.inline
    def innerPadding(value: String): this.type = set("innerPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def lineHeight(value: String | Double): this.type = set("lineHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def mode(value: vertical | horizontal): this.type = set("mode", value.asInstanceOf[js.Any])
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
  }
  
  def withProps(p: MjmlSocialProps with PaddingProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: MjmlSocial.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

