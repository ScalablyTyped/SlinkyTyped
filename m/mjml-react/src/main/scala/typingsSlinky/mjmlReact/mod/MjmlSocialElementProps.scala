package typingsSlinky.mjmlReact.mod

import typingsSlinky.csstype.mod.BackgroundColorProperty
import typingsSlinky.csstype.mod.ColorProperty
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MjmlSocialElementProps extends js.Object {
  var align: js.UndefOr[String] = js.native
  var alt: js.UndefOr[String] = js.native
  var backgroundColor: js.UndefOr[BackgroundColorProperty] = js.native
  var borderRadius: js.UndefOr[String | Double] = js.native
  var color: js.UndefOr[ColorProperty] = js.native
  var fontFamily: js.UndefOr[String] = js.native
  var fontSize: js.UndefOr[String | Double] = js.native
  var iconHeight: js.UndefOr[String] = js.native
  var iconSize: js.UndefOr[String] = js.native
  var lineHeight: js.UndefOr[String | Double] = js.native
  var mode: js.UndefOr[vertical | horizontal] = js.native
  var name: js.UndefOr[
    facebook | `facebook-noshare` | twitter | `twitter-noshare` | google | `google-noshare` | pinterest | `pinterest-noshare` | linkedin | `linkedin-noshare` | tumblr | `tumblr-noshare` | xing | `xing-noshare` | github | instagram | web | snapchat | youtube | vimeo | medium | soundcloud | dribbble
  ] = js.native
  var src: js.UndefOr[String] = js.native
  var textDecoration: js.UndefOr[String] = js.native
}

object MjmlSocialElementProps {
  @scala.inline
  def apply(): MjmlSocialElementProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MjmlSocialElementProps]
  }
  @scala.inline
  implicit class MjmlSocialElementPropsOps[Self <: MjmlSocialElementProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlign(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(js.undefined)
        ret
    }
    @scala.inline
    def withAlt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alt")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundColor(value: BackgroundColorProperty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderRadius(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: ColorProperty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withFontFamily(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontFamily: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontFamily")(js.undefined)
        ret
    }
    @scala.inline
    def withFontSize(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(js.undefined)
        ret
    }
    @scala.inline
    def withIconHeight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withIconSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconSize")(js.undefined)
        ret
    }
    @scala.inline
    def withLineHeight(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: vertical | horizontal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withName(
      value: facebook | `facebook-noshare` | twitter | `twitter-noshare` | google | `google-noshare` | pinterest | `pinterest-noshare` | linkedin | `linkedin-noshare` | tumblr | `tumblr-noshare` | xing | `xing-noshare` | github | instagram | web | snapchat | youtube | vimeo | medium | soundcloud | dribbble
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withSrc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSrc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(js.undefined)
        ret
    }
    @scala.inline
    def withTextDecoration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textDecoration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextDecoration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textDecoration")(js.undefined)
        ret
    }
  }
  
}

