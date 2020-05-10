package typingsSlinky.reactToolbox.layoutLayoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayoutTheme extends js.Object {
  var appbarFixed: js.UndefOr[String] = js.native
  /**
    * The root class that wraps the whole layout.
    */
  var layout: js.UndefOr[String] = js.native
  /**
    * Added to the root if there is a clipped NavDrawer.
    */
  var navDrawerClipped: js.UndefOr[String] = js.native
  /**
    * Added to the root if there is a pinned `NavDrawer`
    */
  var navDrawerPinned: js.UndefOr[String] = js.native
  /**
    * Added to the root if there is a clipped sidebar.
    */
  var sidebarClipped: js.UndefOr[String] = js.native
  /**
    * Added to the root if there is a pinned sidebar.
    */
  var sidebarPinned: js.UndefOr[String] = js.native
  /**
    * Added to the root element in case there is a sidebar present. width correspond to the value passed to the `Sidebar`.
    */
  var sidebarWidth1: js.UndefOr[String] = js.native
  var sidebarWidth10: js.UndefOr[String] = js.native
  var sidebarWidth100: js.UndefOr[String] = js.native
  var sidebarWidth11: js.UndefOr[String] = js.native
  var sidebarWidth12: js.UndefOr[String] = js.native
  var sidebarWidth2: js.UndefOr[String] = js.native
  var sidebarWidth25: js.UndefOr[String] = js.native
  var sidebarWidth3: js.UndefOr[String] = js.native
  var sidebarWidth33: js.UndefOr[String] = js.native
  var sidebarWidth4: js.UndefOr[String] = js.native
  var sidebarWidth5: js.UndefOr[String] = js.native
  var sidebarWidth50: js.UndefOr[String] = js.native
  var sidebarWidth6: js.UndefOr[String] = js.native
  var sidebarWidth66: js.UndefOr[String] = js.native
  var sidebarWidth7: js.UndefOr[String] = js.native
  var sidebarWidth75: js.UndefOr[String] = js.native
  var sidebarWidth8: js.UndefOr[String] = js.native
  var sidebarWidth9: js.UndefOr[String] = js.native
}

object LayoutTheme {
  @scala.inline
  def apply(): LayoutTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayoutTheme]
  }
  @scala.inline
  implicit class LayoutThemeOps[Self <: LayoutTheme] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppbarFixed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appbarFixed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppbarFixed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appbarFixed")(js.undefined)
        ret
    }
    @scala.inline
    def withLayout(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(js.undefined)
        ret
    }
    @scala.inline
    def withNavDrawerClipped(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navDrawerClipped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavDrawerClipped: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navDrawerClipped")(js.undefined)
        ret
    }
    @scala.inline
    def withNavDrawerPinned(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navDrawerPinned")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavDrawerPinned: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navDrawerPinned")(js.undefined)
        ret
    }
    @scala.inline
    def withSidebarClipped(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sidebarClipped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSidebarClipped: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sidebarClipped")(js.undefined)
        ret
    }
    @scala.inline
    def withSidebarPinned(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sidebarPinned")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSidebarPinned: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sidebarPinned")(js.undefined)
        ret
    }
    @scala.inline
    def withSidebarWidth1(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sidebarWidth1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSidebarWidth1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sidebarWidth1")(js.undefined)
        ret
    }
    @scala.inline
    def withSidebarWidth10(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sidebarWidth10")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSidebarWidth10: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sidebarWidth10")(js.undefined)
        ret
    }
    @scala.inline
    def withSidebarWidth100(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sidebarWidth100")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSidebarWidth100: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sidebarWidth100")(js.undefined)
        ret
    }
    @scala.inline
    def withSidebarWidth11(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sidebarWidth11")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSidebarWidth11: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sidebarWidth11")(js.undefined)
        ret
    }
    @scala.inline
    def withSidebarWidth12(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sidebarWidth12")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSidebarWidth12: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sidebarWidth12")(js.undefined)
        ret
    }
    @scala.inline
    def withSidebarWidth2(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sidebarWidth2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSidebarWidth2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sidebarWidth2")(js.undefined)
        ret
    }
    @scala.inline
    def withSidebarWidth25(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sidebarWidth25")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSidebarWidth25: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sidebarWidth25")(js.undefined)
        ret
    }
    @scala.inline
    def withSidebarWidth3(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sidebarWidth3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSidebarWidth3: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sidebarWidth3")(js.undefined)
        ret
    }
    @scala.inline
    def withSidebarWidth33(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sidebarWidth33")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSidebarWidth33: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sidebarWidth33")(js.undefined)
        ret
    }
    @scala.inline
    def withSidebarWidth4(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sidebarWidth4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSidebarWidth4: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sidebarWidth4")(js.undefined)
        ret
    }
    @scala.inline
    def withSidebarWidth5(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sidebarWidth5")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSidebarWidth5: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sidebarWidth5")(js.undefined)
        ret
    }
    @scala.inline
    def withSidebarWidth50(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sidebarWidth50")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSidebarWidth50: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sidebarWidth50")(js.undefined)
        ret
    }
    @scala.inline
    def withSidebarWidth6(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sidebarWidth6")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSidebarWidth6: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sidebarWidth6")(js.undefined)
        ret
    }
    @scala.inline
    def withSidebarWidth66(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sidebarWidth66")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSidebarWidth66: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sidebarWidth66")(js.undefined)
        ret
    }
    @scala.inline
    def withSidebarWidth7(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sidebarWidth7")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSidebarWidth7: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sidebarWidth7")(js.undefined)
        ret
    }
    @scala.inline
    def withSidebarWidth75(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sidebarWidth75")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSidebarWidth75: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sidebarWidth75")(js.undefined)
        ret
    }
    @scala.inline
    def withSidebarWidth8(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sidebarWidth8")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSidebarWidth8: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sidebarWidth8")(js.undefined)
        ret
    }
    @scala.inline
    def withSidebarWidth9(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sidebarWidth9")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSidebarWidth9: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sidebarWidth9")(js.undefined)
        ret
    }
  }
  
}

