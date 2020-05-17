package typingsSlinky.materialUi.MaterialUI.Styles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Spacing extends js.Object {
  var desktopDropDownMenuFontSize: js.UndefOr[Double] = js.native
  var desktopDropDownMenuItemHeight: js.UndefOr[Double] = js.native
  var desktopGutter: js.UndefOr[Double] = js.native
  var desktopGutterLess: js.UndefOr[Double] = js.native
  var desktopGutterMini: js.UndefOr[Double] = js.native
  var desktopGutterMore: js.UndefOr[Double] = js.native
  var desktopKeylineIncrement: js.UndefOr[Double] = js.native
  var desktopLeftNavMenuItemHeight: js.UndefOr[Double] = js.native
  var desktopSubheaderHeight: js.UndefOr[Double] = js.native
  var desktopToolbarHeight: js.UndefOr[Double] = js.native
  var iconSize: js.UndefOr[Double] = js.native
}

object Spacing {
  @scala.inline
  def apply(): Spacing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Spacing]
  }
  @scala.inline
  implicit class SpacingOps[Self <: Spacing] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDesktopDropDownMenuFontSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desktopDropDownMenuFontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDesktopDropDownMenuFontSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desktopDropDownMenuFontSize")(js.undefined)
        ret
    }
    @scala.inline
    def withDesktopDropDownMenuItemHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desktopDropDownMenuItemHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDesktopDropDownMenuItemHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desktopDropDownMenuItemHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withDesktopGutter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desktopGutter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDesktopGutter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desktopGutter")(js.undefined)
        ret
    }
    @scala.inline
    def withDesktopGutterLess(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desktopGutterLess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDesktopGutterLess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desktopGutterLess")(js.undefined)
        ret
    }
    @scala.inline
    def withDesktopGutterMini(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desktopGutterMini")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDesktopGutterMini: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desktopGutterMini")(js.undefined)
        ret
    }
    @scala.inline
    def withDesktopGutterMore(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desktopGutterMore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDesktopGutterMore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desktopGutterMore")(js.undefined)
        ret
    }
    @scala.inline
    def withDesktopKeylineIncrement(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desktopKeylineIncrement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDesktopKeylineIncrement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desktopKeylineIncrement")(js.undefined)
        ret
    }
    @scala.inline
    def withDesktopLeftNavMenuItemHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desktopLeftNavMenuItemHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDesktopLeftNavMenuItemHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desktopLeftNavMenuItemHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withDesktopSubheaderHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desktopSubheaderHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDesktopSubheaderHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desktopSubheaderHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withDesktopToolbarHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desktopToolbarHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDesktopToolbarHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desktopToolbarHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withIconSize(value: Double): Self = {
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
  }
  
}

