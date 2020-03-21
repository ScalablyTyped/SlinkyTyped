package typingsSlinky.menubar

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
trait PartialOptions extends js.Object {
  var browserWindow: js.UndefOr[BrowserWindowConstructorOptions] = js.undefined
  var dir: js.UndefOr[String] = js.undefined
  var icon: js.UndefOr[String | NativeImage_] = js.undefined
  var index: js.UndefOr[String | `false`] = js.undefined
  var loadUrlOptions: js.UndefOr[LoadURLOptions] = js.undefined
  var preloadWindow: js.UndefOr[Boolean] = js.undefined
  var showDockIcon: js.UndefOr[Boolean] = js.undefined
  var showOnAllWorkspaces: js.UndefOr[Boolean] = js.undefined
  var showOnRightClick: js.UndefOr[Boolean] = js.undefined
  var tooltip: js.UndefOr[String] = js.undefined
  var tray: js.UndefOr[Tray] = js.undefined
  var windowPosition: js.UndefOr[
    trayLeft | trayBottomLeft | trayRight | trayBottomRight | trayCenter | trayBottomCenter | topLeft | topRight | bottomLeft | bottomRight | topCenter | bottomCenter | leftCenter | rightCenter | center
  ] = js.undefined
}

object PartialOptions {
  @scala.inline
  def apply(
    browserWindow: BrowserWindowConstructorOptions = null,
    dir: String = null,
    icon: String | NativeImage_ = null,
    index: String | `false` = null,
    loadUrlOptions: LoadURLOptions = null,
    preloadWindow: js.UndefOr[Boolean] = js.undefined,
    showDockIcon: js.UndefOr[Boolean] = js.undefined,
    showOnAllWorkspaces: js.UndefOr[Boolean] = js.undefined,
    showOnRightClick: js.UndefOr[Boolean] = js.undefined,
    tooltip: String = null,
    tray: Tray = null,
    windowPosition: trayLeft | trayBottomLeft | trayRight | trayBottomRight | trayCenter | trayBottomCenter | topLeft | topRight | bottomLeft | bottomRight | topCenter | bottomCenter | leftCenter | rightCenter | center = null
  ): PartialOptions = {
    val __obj = js.Dynamic.literal()
    if (browserWindow != null) __obj.updateDynamic("browserWindow")(browserWindow.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (loadUrlOptions != null) __obj.updateDynamic("loadUrlOptions")(loadUrlOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(preloadWindow)) __obj.updateDynamic("preloadWindow")(preloadWindow.asInstanceOf[js.Any])
    if (!js.isUndefined(showDockIcon)) __obj.updateDynamic("showDockIcon")(showDockIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(showOnAllWorkspaces)) __obj.updateDynamic("showOnAllWorkspaces")(showOnAllWorkspaces.asInstanceOf[js.Any])
    if (!js.isUndefined(showOnRightClick)) __obj.updateDynamic("showOnRightClick")(showOnRightClick.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (tray != null) __obj.updateDynamic("tray")(tray.asInstanceOf[js.Any])
    if (windowPosition != null) __obj.updateDynamic("windowPosition")(windowPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialOptions]
  }
}

