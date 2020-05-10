package typingsSlinky.nwJs.mod._Global_.NWJSHelpers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * nw.Window Option that is in the same format as the Window subfields in manifest format.
  */
@js.native
trait WindowOption extends js.Object {
  /**
    * Whether the window should always stay on top of other windows.
    */
  var always_on_top: js.UndefOr[Boolean] = js.native
  /**
    * Show as desktop background window under X11 environment
    */
  var as_desktop: js.UndefOr[Boolean] = js.native
  /**
    * Specify it to false to make the window frameless
    */
  var frame: js.UndefOr[Boolean] = js.native
  /**
    * Whether window is fullscreen
    */
  var fullscreen: js.UndefOr[Boolean] = js.native
  /**
    * The initial height of the main window.
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * Path to window’s icon
    */
  var icon: js.UndefOr[String] = js.native
  /**
    * The id used to identify the window.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Whether to use Kiosk mode.
    */
  var kiosk: js.UndefOr[Boolean] = js.native
  /**
    * Maximum height of window
    */
  var max_height: js.UndefOr[Double] = js.native
  /**
    * Maximum width of window
    */
  var max_width: js.UndefOr[Double] = js.native
  /**
    * Minimum height of window
    */
  var min_height: js.UndefOr[Double] = js.native
  /**
    * Minimum width of window
    */
  var min_width: js.UndefOr[Double] = js.native
  /**
    * Controls where window will be put, be `null` or `center` or `mouse`
    */
  var position: js.UndefOr[String] = js.native
  /**
    * Whether window is resizable
    */
  var resizable: js.UndefOr[Boolean] = js.native
  /**
    * Specify it to false if you want your app to be hidden on startup
    */
  var show: js.UndefOr[Boolean] = js.native
  /**
    * Whether the window is shown in taskbar or dock. The default is true.
    */
  var show_in_taskbar: js.UndefOr[Boolean] = js.native
  /**
    * The default title of window created by NW.js
    */
  var title: js.UndefOr[String] = js.native
  /**
    * Whether to turn on transparent window mode.
    */
  var transparent: js.UndefOr[Boolean] = js.native
  /**
    * Whether the window should be visible on all workspaces simultaneously (on platforms that support multiple workspaces, currently Mac OS X and Linux).
    */
  var visible_on_all_workspaces: js.UndefOr[Boolean] = js.native
  /**
    * The initial width of the main window.
    */
  var width: js.UndefOr[Double] = js.native
}

object WindowOption {
  @scala.inline
  def apply(): WindowOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowOption]
  }
  @scala.inline
  implicit class WindowOptionOps[Self <: WindowOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlways_on_top(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("always_on_top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlways_on_top: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("always_on_top")(js.undefined)
        ret
    }
    @scala.inline
    def withAs_desktop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("as_desktop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAs_desktop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("as_desktop")(js.undefined)
        ret
    }
    @scala.inline
    def withFrame(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frame")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrame: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frame")(js.undefined)
        ret
    }
    @scala.inline
    def withFullscreen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullscreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullscreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullscreen")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withKiosk(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kiosk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKiosk: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kiosk")(js.undefined)
        ret
    }
    @scala.inline
    def withMax_height(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax_height: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_height")(js.undefined)
        ret
    }
    @scala.inline
    def withMax_width(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax_width: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_width")(js.undefined)
        ret
    }
    @scala.inline
    def withMin_height(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min_height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin_height: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min_height")(js.undefined)
        ret
    }
    @scala.inline
    def withMin_width(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min_width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin_width: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min_width")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withResizable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizable")(js.undefined)
        ret
    }
    @scala.inline
    def withShow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.undefined)
        ret
    }
    @scala.inline
    def withShow_in_taskbar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show_in_taskbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShow_in_taskbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show_in_taskbar")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withTransparent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transparent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransparent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transparent")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible_on_all_workspaces(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible_on_all_workspaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible_on_all_workspaces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible_on_all_workspaces")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

