package typingsSlinky.mjmlReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.csstype.mod.Property.BackgroundColor
import typingsSlinky.csstype.mod.Property.Color
import typingsSlinky.mjmlReact.mjmlReactStrings.`facebook-noshare`
import typingsSlinky.mjmlReact.mjmlReactStrings.`google-noshare`
import typingsSlinky.mjmlReact.mjmlReactStrings.`linkedin-noshare`
import typingsSlinky.mjmlReact.mjmlReactStrings.`pinterest-noshare`
import typingsSlinky.mjmlReact.mjmlReactStrings.`tumblr-noshare`
import typingsSlinky.mjmlReact.mjmlReactStrings.`twitter-noshare`
import typingsSlinky.mjmlReact.mjmlReactStrings.`xing-noshare`
import typingsSlinky.mjmlReact.mjmlReactStrings.dribbble
import typingsSlinky.mjmlReact.mjmlReactStrings.facebook
import typingsSlinky.mjmlReact.mjmlReactStrings.github
import typingsSlinky.mjmlReact.mjmlReactStrings.google
import typingsSlinky.mjmlReact.mjmlReactStrings.horizontal
import typingsSlinky.mjmlReact.mjmlReactStrings.instagram
import typingsSlinky.mjmlReact.mjmlReactStrings.linkedin
import typingsSlinky.mjmlReact.mjmlReactStrings.medium
import typingsSlinky.mjmlReact.mjmlReactStrings.pinterest
import typingsSlinky.mjmlReact.mjmlReactStrings.snapchat
import typingsSlinky.mjmlReact.mjmlReactStrings.soundcloud
import typingsSlinky.mjmlReact.mjmlReactStrings.tumblr
import typingsSlinky.mjmlReact.mjmlReactStrings.twitter
import typingsSlinky.mjmlReact.mjmlReactStrings.vertical
import typingsSlinky.mjmlReact.mjmlReactStrings.vimeo
import typingsSlinky.mjmlReact.mjmlReactStrings.web
import typingsSlinky.mjmlReact.mjmlReactStrings.xing
import typingsSlinky.mjmlReact.mjmlReactStrings.youtube
import typingsSlinky.mjmlReact.mod.HrefProps
import typingsSlinky.mjmlReact.mod.MjmlSocialElementProps
import typingsSlinky.mjmlReact.mod.PaddingProps
import typingsSlinky.mjmlReact.mod.RequiredChildrenProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MjmlSocialElement {
  @JSImport("mjml-react", "MjmlSocialElement")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.mjmlReact.mod.MjmlSocialElement] {
    @scala.inline
    def align(value: String): this.type = set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def alt(value: String): this.type = set("alt", value.asInstanceOf[js.Any])
    @scala.inline
    def backgroundColor(value: BackgroundColor): this.type = set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def borderRadius(value: String | Double): this.type = set("borderRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def color(value: Color): this.type = set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def fontFamily(value: String): this.type = set("fontFamily", value.asInstanceOf[js.Any])
    @scala.inline
    def fontSize(value: String | Double): this.type = set("fontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def href(value: String): this.type = set("href", value.asInstanceOf[js.Any])
    @scala.inline
    def iconHeight(value: String): this.type = set("iconHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def iconSize(value: String): this.type = set("iconSize", value.asInstanceOf[js.Any])
    @scala.inline
    def lineHeight(value: String | Double): this.type = set("lineHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def mode(value: vertical | horizontal): this.type = set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def name(
      value: facebook | `facebook-noshare` | twitter | `twitter-noshare` | google | `google-noshare` | pinterest | `pinterest-noshare` | linkedin | `linkedin-noshare` | tumblr | `tumblr-noshare` | xing | `xing-noshare` | github | instagram | web | snapchat | youtube | vimeo | medium | soundcloud | dribbble
    ): this.type = set("name", value.asInstanceOf[js.Any])
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
    def src(value: String): this.type = set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def target(value: String): this.type = set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def textDecoration(value: String): this.type = set("textDecoration", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: MjmlSocialElementProps with RequiredChildrenProps with HrefProps with PaddingProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: MjmlSocialElement.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

