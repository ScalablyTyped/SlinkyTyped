package typingsSlinky.mjmlReact.mod

import typingsSlinky.csstype.mod.ColorProperty
import typingsSlinky.mjmlReact.mjmlReactStrings.hamburger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MjmlNavbarProps extends js.Object {
  var align: js.UndefOr[String] = js.native
  var baseUrl: js.UndefOr[String] = js.native
  var hamburger: js.UndefOr[typingsSlinky.mjmlReact.mjmlReactStrings.hamburger] = js.native
  var icoAlign: js.UndefOr[String] = js.native
  var icoClose: js.UndefOr[String] = js.native
  var icoColor: js.UndefOr[ColorProperty] = js.native
  var icoFontSize: js.UndefOr[String] = js.native
  var icoLineHeight: js.UndefOr[String] = js.native
  var icoOpen: js.UndefOr[String] = js.native
  var icoPadding: js.UndefOr[String] = js.native
  var icoPaddingBottom: js.UndefOr[String] = js.native
  var icoPaddingLeft: js.UndefOr[String] = js.native
  var icoPaddingRight: js.UndefOr[String] = js.native
  var icoPaddingTop: js.UndefOr[String] = js.native
  var icoTextDecoration: js.UndefOr[String] = js.native
  var icoTextTransform: js.UndefOr[String] = js.native
}

object MjmlNavbarProps {
  @scala.inline
  def apply(): MjmlNavbarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MjmlNavbarProps]
  }
  @scala.inline
  implicit class MjmlNavbarPropsOps[Self <: MjmlNavbarProps] (val x: Self) extends AnyVal {
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
    def withBaseUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withHamburger(value: hamburger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hamburger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHamburger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hamburger")(js.undefined)
        ret
    }
    @scala.inline
    def withIcoAlign(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icoAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcoAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icoAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withIcoClose(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icoClose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcoClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icoClose")(js.undefined)
        ret
    }
    @scala.inline
    def withIcoColor(value: ColorProperty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icoColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcoColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icoColor")(js.undefined)
        ret
    }
    @scala.inline
    def withIcoFontSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icoFontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcoFontSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icoFontSize")(js.undefined)
        ret
    }
    @scala.inline
    def withIcoLineHeight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icoLineHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcoLineHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icoLineHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withIcoOpen(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icoOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcoOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icoOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withIcoPadding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icoPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcoPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icoPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withIcoPaddingBottom(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icoPaddingBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcoPaddingBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icoPaddingBottom")(js.undefined)
        ret
    }
    @scala.inline
    def withIcoPaddingLeft(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icoPaddingLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcoPaddingLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icoPaddingLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withIcoPaddingRight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icoPaddingRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcoPaddingRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icoPaddingRight")(js.undefined)
        ret
    }
    @scala.inline
    def withIcoPaddingTop(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icoPaddingTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcoPaddingTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icoPaddingTop")(js.undefined)
        ret
    }
    @scala.inline
    def withIcoTextDecoration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icoTextDecoration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcoTextDecoration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icoTextDecoration")(js.undefined)
        ret
    }
    @scala.inline
    def withIcoTextTransform(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icoTextTransform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcoTextTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icoTextTransform")(js.undefined)
        ret
    }
  }
  
}

