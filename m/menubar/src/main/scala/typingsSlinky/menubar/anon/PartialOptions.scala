package typingsSlinky.menubar.anon

import typingsSlinky.electron.Electron.BrowserWindowConstructorOptions
import typingsSlinky.electron.Electron.LoadURLOptions
import typingsSlinky.electron.Electron.NativeImage_
import typingsSlinky.electron.mod.Tray
import typingsSlinky.menubar.menubarBooleans.`false`
import typingsSlinky.menubar.menubarStrings.bottomCenter
import typingsSlinky.menubar.menubarStrings.bottomLeft
import typingsSlinky.menubar.menubarStrings.bottomRight
import typingsSlinky.menubar.menubarStrings.center
import typingsSlinky.menubar.menubarStrings.leftCenter
import typingsSlinky.menubar.menubarStrings.rightCenter
import typingsSlinky.menubar.menubarStrings.topCenter
import typingsSlinky.menubar.menubarStrings.topLeft
import typingsSlinky.menubar.menubarStrings.topRight
import typingsSlinky.menubar.menubarStrings.trayBottomCenter
import typingsSlinky.menubar.menubarStrings.trayBottomLeft
import typingsSlinky.menubar.menubarStrings.trayBottomRight
import typingsSlinky.menubar.menubarStrings.trayCenter
import typingsSlinky.menubar.menubarStrings.trayLeft
import typingsSlinky.menubar.menubarStrings.trayRight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<menubar.menubar/lib/types.Options> */
@js.native
trait PartialOptions extends js.Object {
  var browserWindow: js.UndefOr[BrowserWindowConstructorOptions] = js.native
  var dir: js.UndefOr[String] = js.native
  var icon: js.UndefOr[String | NativeImage_] = js.native
  var index: js.UndefOr[String | `false`] = js.native
  var loadUrlOptions: js.UndefOr[LoadURLOptions] = js.native
  var preloadWindow: js.UndefOr[Boolean] = js.native
  var showDockIcon: js.UndefOr[Boolean] = js.native
  var showOnAllWorkspaces: js.UndefOr[Boolean] = js.native
  var showOnRightClick: js.UndefOr[Boolean] = js.native
  var tooltip: js.UndefOr[String] = js.native
  var tray: js.UndefOr[Tray] = js.native
  var windowPosition: js.UndefOr[
    trayLeft | trayBottomLeft | trayRight | trayBottomRight | trayCenter | trayBottomCenter | topLeft | topRight | bottomLeft | bottomRight | topCenter | bottomCenter | leftCenter | rightCenter | center
  ] = js.native
}

object PartialOptions {
  @scala.inline
  def apply(): PartialOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOptions]
  }
  @scala.inline
  implicit class PartialOptionsOps[Self <: PartialOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBrowserWindow(value: BrowserWindowConstructorOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrowserWindow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserWindow")(js.undefined)
        ret
    }
    @scala.inline
    def withDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dir")(js.undefined)
        ret
    }
    @scala.inline
    def withIcon(value: String | NativeImage_): Self = {
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
    def withIndex(value: String | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadUrlOptions(value: LoadURLOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadUrlOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadUrlOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadUrlOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withPreloadWindow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preloadWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreloadWindow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preloadWindow")(js.undefined)
        ret
    }
    @scala.inline
    def withShowDockIcon(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDockIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowDockIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDockIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withShowOnAllWorkspaces(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showOnAllWorkspaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowOnAllWorkspaces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showOnAllWorkspaces")(js.undefined)
        ret
    }
    @scala.inline
    def withShowOnRightClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showOnRightClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowOnRightClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showOnRightClick")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withTray(value: Tray): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tray")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTray: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tray")(js.undefined)
        ret
    }
    @scala.inline
    def withWindowPosition(
      value: trayLeft | trayBottomLeft | trayRight | trayBottomRight | trayCenter | trayBottomCenter | topLeft | topRight | bottomLeft | bottomRight | topCenter | bottomCenter | leftCenter | rightCenter | center
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindowPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowPosition")(js.undefined)
        ret
    }
  }
  
}

