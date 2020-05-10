package typingsSlinky.electron.Electron

import typingsSlinky.electron.electronStrings.`appearance-based`
import typingsSlinky.electron.electronStrings.`medium-light`
import typingsSlinky.electron.electronStrings.`ultra-dark`
import typingsSlinky.electron.electronStrings.customButtonsOnHover
import typingsSlinky.electron.electronStrings.dark
import typingsSlinky.electron.electronStrings.default
import typingsSlinky.electron.electronStrings.hidden
import typingsSlinky.electron.electronStrings.hiddenInset
import typingsSlinky.electron.electronStrings.light
import typingsSlinky.electron.electronStrings.menu
import typingsSlinky.electron.electronStrings.popover
import typingsSlinky.electron.electronStrings.selection
import typingsSlinky.electron.electronStrings.sidebar
import typingsSlinky.electron.electronStrings.titlebar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrowserWindowConstructorOptions extends js.Object {
  /**
    * Whether the web view accepts a single mouse-down event that simultaneously
    * activates the window. Default is false.
    */
  var acceptFirstMouse: js.UndefOr[Boolean] = js.native
  /**
    * Whether the window should always stay on top of other windows. Default is false.
    */
  var alwaysOnTop: js.UndefOr[Boolean] = js.native
  /**
    * Auto hide the menu bar unless the Alt key is pressed. Default is false.
    */
  var autoHideMenuBar: js.UndefOr[Boolean] = js.native
  /**
    * Window's background color as a hexadecimal value, like #66CD00 or #FFF or
    * #80FFFFFF (alpha in #AARRGGBB format is supported if transparent is set to
    * true). Default is #FFF (white).
    */
  var backgroundColor: js.UndefOr[String] = js.native
  /**
    * Show window in the center of the screen.
    */
  var center: js.UndefOr[Boolean] = js.native
  /**
    * Whether window is closable. This is not implemented on Linux. Default is true.
    */
  var closable: js.UndefOr[Boolean] = js.native
  /**
    * Forces using dark theme for the window, only works on some GTK+3 desktop
    * environments. Default is false.
    */
  var darkTheme: js.UndefOr[Boolean] = js.native
  /**
    * Whether to hide cursor when typing. Default is false.
    */
  var disableAutoHideCursor: js.UndefOr[Boolean] = js.native
  /**
    * Enable the window to be resized larger than screen. Default is false.
    */
  var enableLargerThanScreen: js.UndefOr[Boolean] = js.native
  /**
    * Whether the window can be focused. Default is true. On Windows setting
    * focusable: false also implies setting skipTaskbar: true. On Linux setting
    * focusable: false makes the window stop interacting with wm, so the window will
    * always stay on top in all workspaces.
    */
  var focusable: js.UndefOr[Boolean] = js.native
  /**
    * Specify false to create a . Default is true.
    */
  var frame: js.UndefOr[Boolean] = js.native
  /**
    * Whether the window should show in fullscreen. When explicitly set to false the
    * fullscreen button will be hidden or disabled on macOS. Default is false.
    */
  var fullscreen: js.UndefOr[Boolean] = js.native
  /**
    * Shows the title in the title bar in full screen mode on macOS for all
    * titleBarStyle options. Default is false.
    */
  var fullscreenWindowTitle: js.UndefOr[Boolean] = js.native
  /**
    * Whether the window can be put into fullscreen mode. On macOS, also whether the
    * maximize/zoom button should toggle full screen mode or maximize window. Default
    * is true.
    */
  var fullscreenable: js.UndefOr[Boolean] = js.native
  /**
    * Whether window should have a shadow. This is only implemented on macOS. Default
    * is true.
    */
  var hasShadow: js.UndefOr[Boolean] = js.native
  /**
    * Window's height in pixels. Default is 600.
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * The window icon. On Windows it is recommended to use ICO icons to get best
    * visual effects, you can also leave it undefined so the executable's icon will be
    * used.
    */
  var icon: js.UndefOr[NativeImage_ | String] = js.native
  /**
    * The kiosk mode. Default is false.
    */
  var kiosk: js.UndefOr[Boolean] = js.native
  /**
    * Window's maximum height. Default is no limit.
    */
  var maxHeight: js.UndefOr[Double] = js.native
  /**
    * Window's maximum width. Default is no limit.
    */
  var maxWidth: js.UndefOr[Double] = js.native
  /**
    * Whether window is maximizable. This is not implemented on Linux. Default is
    * true.
    */
  var maximizable: js.UndefOr[Boolean] = js.native
  /**
    * Window's minimum height. Default is 0.
    */
  var minHeight: js.UndefOr[Double] = js.native
  /**
    * Window's minimum width. Default is 0.
    */
  var minWidth: js.UndefOr[Double] = js.native
  /**
    * Whether window is minimizable. This is not implemented on Linux. Default is
    * true.
    */
  var minimizable: js.UndefOr[Boolean] = js.native
  /**
    * Whether this is a modal window. This only works when the window is a child
    * window. Default is false.
    */
  var modal: js.UndefOr[Boolean] = js.native
  /**
    * Whether window is movable. This is not implemented on Linux. Default is true.
    */
  var movable: js.UndefOr[Boolean] = js.native
  /**
    * Set the initial opacity of the window, between 0.0 (fully transparent) and 1.0
    * (fully opaque). This is only implemented on Windows and macOS.
    */
  var opacity: js.UndefOr[Double] = js.native
  /**
    * Specify parent window. Default is null.
    */
  var parent: js.UndefOr[BrowserWindow] = js.native
  /**
    * Whether window is resizable. Default is true.
    */
  var resizable: js.UndefOr[Boolean] = js.native
  /**
    * Whether window should be shown when created. Default is true.
    */
  var show: js.UndefOr[Boolean] = js.native
  /**
    * Use pre-Lion fullscreen on macOS. Default is false.
    */
  var simpleFullscreen: js.UndefOr[Boolean] = js.native
  /**
    * Whether to show the window in taskbar. Default is false.
    */
  var skipTaskbar: js.UndefOr[Boolean] = js.native
  /**
    * Tab group name, allows opening the window as a native tab on macOS 10.12+.
    * Windows with the same tabbing identifier will be grouped together. This also
    * adds a native new tab button to your window's tab bar and allows your app and
    * window to receive the new-window-for-tab event.
    */
  var tabbingIdentifier: js.UndefOr[String] = js.native
  /**
    * Use WS_THICKFRAME style for frameless windows on Windows, which adds standard
    * window frame. Setting it to false will remove window shadow and window
    * animations. Default is true.
    */
  var thickFrame: js.UndefOr[Boolean] = js.native
  /**
    * Default window title. Default is "Electron". If the HTML tag </code> is defined
    * in the HTML file loaded by <code>loadURL()</code>, this property will be
    * ignored.</foo>
    */
  var title: js.UndefOr[String] = js.native
  /**
    * The style of window title bar. Default is default. Possible values are:
    */
  var titleBarStyle: js.UndefOr[default | hidden | hiddenInset | customButtonsOnHover] = js.native
  /**
    * Makes the window . Default is false.
    */
  var transparent: js.UndefOr[Boolean] = js.native
  /**
    * The type of window, default is normal window. See more about this below.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * The width and height would be used as web page's size, which means the actual
    * window's size will include window frame's size and be slightly larger. Default
    * is false.
    */
  var useContentSize: js.UndefOr[Boolean] = js.native
  /**
    * Add a type of vibrancy effect to the window, only on macOS. Can be
    * appearance-based, light, dark, titlebar, selection, menu, popover, sidebar,
    * medium-light or ultra-dark. Please note that using frame: false in combination
    * with a vibrancy value requires that you use a non-default titleBarStyle as well.
    */
  var vibrancy: js.UndefOr[
    `appearance-based` | light | dark | titlebar | selection | menu | popover | sidebar | `medium-light` | `ultra-dark`
  ] = js.native
  /**
    * Settings of web page's features.
    */
  var webPreferences: js.UndefOr[WebPreferences] = js.native
  /**
    * Window's width in pixels. Default is 800.
    */
  var width: js.UndefOr[Double] = js.native
  /**
    * ( if y is used) Window's left offset from screen. Default is to center the
    * window.
    */
  var x: js.UndefOr[Double] = js.native
  /**
    * ( if x is used) Window's top offset from screen. Default is to center the
    * window.
    */
  var y: js.UndefOr[Double] = js.native
  /**
    * Controls the behavior on macOS when option-clicking the green stoplight button
    * on the toolbar or by clicking the Window > Zoom menu item. If true, the window
    * will grow to the preferred width of the web page when zoomed, false will cause
    * it to zoom to the width of the screen. This will also affect the behavior when
    * calling maximize() directly. Default is false.
    */
  var zoomToPageWidth: js.UndefOr[Boolean] = js.native
}

object BrowserWindowConstructorOptions {
  @scala.inline
  def apply(): BrowserWindowConstructorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrowserWindowConstructorOptions]
  }
  @scala.inline
  implicit class BrowserWindowConstructorOptionsOps[Self <: BrowserWindowConstructorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcceptFirstMouse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptFirstMouse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcceptFirstMouse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptFirstMouse")(js.undefined)
        ret
    }
    @scala.inline
    def withAlwaysOnTop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysOnTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlwaysOnTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysOnTop")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoHideMenuBar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHideMenuBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoHideMenuBar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHideMenuBar")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundColor(value: String): Self = {
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
    def withCenter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(js.undefined)
        ret
    }
    @scala.inline
    def withClosable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClosable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closable")(js.undefined)
        ret
    }
    @scala.inline
    def withDarkTheme(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("darkTheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDarkTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("darkTheme")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableAutoHideCursor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableAutoHideCursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableAutoHideCursor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableAutoHideCursor")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableLargerThanScreen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableLargerThanScreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableLargerThanScreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableLargerThanScreen")(js.undefined)
        ret
    }
    @scala.inline
    def withFocusable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocusable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusable")(js.undefined)
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
    def withFullscreenWindowTitle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullscreenWindowTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullscreenWindowTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullscreenWindowTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withFullscreenable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullscreenable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullscreenable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullscreenable")(js.undefined)
        ret
    }
    @scala.inline
    def withHasShadow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasShadow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasShadow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasShadow")(js.undefined)
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
    def withIcon(value: NativeImage_ | String): Self = {
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
    def withMaxHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximizable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximizable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximizable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximizable")(js.undefined)
        ret
    }
    @scala.inline
    def withMinHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMinWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimizable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimizable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimizable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimizable")(js.undefined)
        ret
    }
    @scala.inline
    def withModal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modal")(js.undefined)
        ret
    }
    @scala.inline
    def withMovable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("movable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMovable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("movable")(js.undefined)
        ret
    }
    @scala.inline
    def withOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(js.undefined)
        ret
    }
    @scala.inline
    def withParent(value: BrowserWindow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(js.undefined)
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
    def withSimpleFullscreen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simpleFullscreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSimpleFullscreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simpleFullscreen")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipTaskbar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipTaskbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipTaskbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipTaskbar")(js.undefined)
        ret
    }
    @scala.inline
    def withTabbingIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabbingIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabbingIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabbingIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withThickFrame(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thickFrame")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThickFrame: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thickFrame")(js.undefined)
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
    def withTitleBarStyle(value: default | hidden | hiddenInset | customButtonsOnHover): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleBarStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleBarStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleBarStyle")(js.undefined)
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
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withUseContentSize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useContentSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseContentSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useContentSize")(js.undefined)
        ret
    }
    @scala.inline
    def withVibrancy(
      value: `appearance-based` | light | dark | titlebar | selection | menu | popover | sidebar | `medium-light` | `ultra-dark`
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vibrancy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVibrancy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vibrancy")(js.undefined)
        ret
    }
    @scala.inline
    def withWebPreferences(value: WebPreferences): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webPreferences")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebPreferences: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webPreferences")(js.undefined)
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
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(js.undefined)
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomToPageWidth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomToPageWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomToPageWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomToPageWidth")(js.undefined)
        ret
    }
  }
  
}

