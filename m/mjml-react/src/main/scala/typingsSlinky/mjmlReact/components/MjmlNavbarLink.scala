package typingsSlinky.mjmlReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.csstype.mod.ColorProperty
import typingsSlinky.mjmlReact.mod.HrefProps
import typingsSlinky.mjmlReact.mod.MjmlNavbarLinkProps
import typingsSlinky.mjmlReact.mod.PaddingProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MjmlNavbarLink {
  @JSImport("mjml-react", "MjmlNavbarLink")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.mjmlReact.mod.MjmlNavbarLink] {
    @scala.inline
    def color(value: ColorProperty): this.type = set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def fontFamily(value: String): this.type = set("fontFamily", value.asInstanceOf[js.Any])
    @scala.inline
    def fontSize(value: String | Double): this.type = set("fontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def fontStyle(value: String): this.type = set("fontStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def fontWeight(value: Double): this.type = set("fontWeight", value.asInstanceOf[js.Any])
    @scala.inline
    def href(value: String): this.type = set("href", value.asInstanceOf[js.Any])
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
    def textDecoration(value: String): this.type = set("textDecoration", value.asInstanceOf[js.Any])
    @scala.inline
    def textTransform(value: String): this.type = set("textTransform", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: MjmlNavbarLinkProps with HrefProps with PaddingProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: MjmlNavbarLink.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

