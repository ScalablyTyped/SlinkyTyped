package typingsSlinky.mjmlReact.mod

import typingsSlinky.csstype.mod.BackgroundColorProperty
import typingsSlinky.mjmlReact.mjmlReactStrings.left
import typingsSlinky.mjmlReact.mjmlReactStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MjmlAccordionElementProps extends js.Object {
  var backgroundColor: js.UndefOr[BackgroundColorProperty] = js.native
  var fontFamily: js.UndefOr[String] = js.native
  var iconAlign: js.UndefOr[String] = js.native
  var iconHeight: js.UndefOr[String] = js.native
  var iconPosition: js.UndefOr[left | right] = js.native
  var iconUnwrappedAlt: js.UndefOr[String] = js.native
  var iconUnwrappedUrl: js.UndefOr[String] = js.native
  var iconWidth: js.UndefOr[String] = js.native
  var iconWrappedAlt: js.UndefOr[String] = js.native
  var iconWrappedUrl: js.UndefOr[String] = js.native
}

object MjmlAccordionElementProps {
  @scala.inline
  def apply(): MjmlAccordionElementProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MjmlAccordionElementProps]
  }
  @scala.inline
  implicit class MjmlAccordionElementPropsOps[Self <: MjmlAccordionElementProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withIconAlign(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconAlign")(js.undefined)
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
    def withIconPosition(value: left | right): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withIconUnwrappedAlt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconUnwrappedAlt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconUnwrappedAlt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconUnwrappedAlt")(js.undefined)
        ret
    }
    @scala.inline
    def withIconUnwrappedUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconUnwrappedUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconUnwrappedUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconUnwrappedUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withIconWidth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withIconWrappedAlt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconWrappedAlt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconWrappedAlt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconWrappedAlt")(js.undefined)
        ret
    }
    @scala.inline
    def withIconWrappedUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconWrappedUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconWrappedUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconWrappedUrl")(js.undefined)
        ret
    }
  }
  
}

