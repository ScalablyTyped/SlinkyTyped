package typingsSlinky.electronUtil.mod

import typingsSlinky.electron.Electron.Accelerator
import typingsSlinky.electron.Electron.BrowserWindow
import typingsSlinky.electron.Electron.KeyboardEvent
import typingsSlinky.electron.Electron.Menu
import typingsSlinky.electron.Electron.MenuItem
import typingsSlinky.electron.Electron.MenuItemConstructorOptions
import typingsSlinky.electron.Electron.NativeImage_
import typingsSlinky.electronUtil.electronUtilStrings.about
import typingsSlinky.electronUtil.electronUtilStrings.checkbox
import typingsSlinky.electronUtil.electronUtilStrings.clearRecentDocuments
import typingsSlinky.electronUtil.electronUtilStrings.close
import typingsSlinky.electronUtil.electronUtilStrings.copy
import typingsSlinky.electronUtil.electronUtilStrings.cut
import typingsSlinky.electronUtil.electronUtilStrings.delete
import typingsSlinky.electronUtil.electronUtilStrings.editMenu
import typingsSlinky.electronUtil.electronUtilStrings.fileMenu
import typingsSlinky.electronUtil.electronUtilStrings.forceReload
import typingsSlinky.electronUtil.electronUtilStrings.front
import typingsSlinky.electronUtil.electronUtilStrings.help
import typingsSlinky.electronUtil.electronUtilStrings.hide
import typingsSlinky.electronUtil.electronUtilStrings.hideOthers
import typingsSlinky.electronUtil.electronUtilStrings.mergeAllWindows
import typingsSlinky.electronUtil.electronUtilStrings.minimize
import typingsSlinky.electronUtil.electronUtilStrings.moveTabToNewWindow
import typingsSlinky.electronUtil.electronUtilStrings.normal
import typingsSlinky.electronUtil.electronUtilStrings.paste
import typingsSlinky.electronUtil.electronUtilStrings.pasteAndMatchStyle
import typingsSlinky.electronUtil.electronUtilStrings.quit
import typingsSlinky.electronUtil.electronUtilStrings.radio
import typingsSlinky.electronUtil.electronUtilStrings.recentDocuments
import typingsSlinky.electronUtil.electronUtilStrings.redo
import typingsSlinky.electronUtil.electronUtilStrings.reload
import typingsSlinky.electronUtil.electronUtilStrings.resetZoom
import typingsSlinky.electronUtil.electronUtilStrings.selectAll
import typingsSlinky.electronUtil.electronUtilStrings.selectNextTab
import typingsSlinky.electronUtil.electronUtilStrings.selectPreviousTab
import typingsSlinky.electronUtil.electronUtilStrings.separator
import typingsSlinky.electronUtil.electronUtilStrings.services
import typingsSlinky.electronUtil.electronUtilStrings.startSpeaking
import typingsSlinky.electronUtil.electronUtilStrings.stopSpeaking
import typingsSlinky.electronUtil.electronUtilStrings.submenu
import typingsSlinky.electronUtil.electronUtilStrings.toggleDevTools
import typingsSlinky.electronUtil.electronUtilStrings.toggleTabBar
import typingsSlinky.electronUtil.electronUtilStrings.togglefullscreen
import typingsSlinky.electronUtil.electronUtilStrings.undo
import typingsSlinky.electronUtil.electronUtilStrings.unhide
import typingsSlinky.electronUtil.electronUtilStrings.viewMenu
import typingsSlinky.electronUtil.electronUtilStrings.window
import typingsSlinky.electronUtil.electronUtilStrings.windowMenu
import typingsSlinky.electronUtil.electronUtilStrings.zoom
import typingsSlinky.electronUtil.electronUtilStrings.zoomIn
import typingsSlinky.electronUtil.electronUtilStrings.zoomOut
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Readonly<electron.electron.MenuItemConstructorOptions> */
trait OpenUrlMenuItemOptions extends js.Object {
  val accelerator: js.UndefOr[Accelerator] = js.undefined
  val acceleratorWorksWhenHidden: js.UndefOr[Boolean] = js.undefined
  val after: js.UndefOr[js.Array[String]] = js.undefined
  val afterGroupContaining: js.UndefOr[js.Array[String]] = js.undefined
  val before: js.UndefOr[js.Array[String]] = js.undefined
  val beforeGroupContaining: js.UndefOr[js.Array[String]] = js.undefined
  val checked: js.UndefOr[Boolean] = js.undefined
  val click: js.UndefOr[
    js.Function3[
      /* menuItem */ MenuItem, 
      /* browserWindow */ BrowserWindow, 
      /* event */ KeyboardEvent, 
      Unit
    ]
  ] = js.undefined
  val enabled: js.UndefOr[Boolean] = js.undefined
  val icon: js.UndefOr[NativeImage_ | String] = js.undefined
  val id: js.UndefOr[String] = js.undefined
  val label: js.UndefOr[String] = js.undefined
  val registerAccelerator: js.UndefOr[Boolean] = js.undefined
  val role: js.UndefOr[
    undo | redo | cut | copy | paste | pasteAndMatchStyle | delete | selectAll | reload | forceReload | toggleDevTools | resetZoom | zoomIn | zoomOut | togglefullscreen | window | minimize | close | help | about | services | hide | hideOthers | unhide | quit | startSpeaking | stopSpeaking | zoom | front | typingsSlinky.electronUtil.electronUtilStrings.appMenu | fileMenu | editMenu | viewMenu | recentDocuments | toggleTabBar | selectNextTab | selectPreviousTab | mergeAllWindows | clearRecentDocuments | moveTabToNewWindow | windowMenu
  ] = js.undefined
  val sublabel: js.UndefOr[String] = js.undefined
  val submenu: js.UndefOr[js.Array[MenuItemConstructorOptions] | Menu] = js.undefined
  val `type`: js.UndefOr[
    normal | separator | typingsSlinky.electronUtil.electronUtilStrings.submenu | checkbox | radio
  ] = js.undefined
  /**
  	URL to be opened when the menu item is clicked.
  	*/
  val url: String
  val visible: js.UndefOr[Boolean] = js.undefined
}

object OpenUrlMenuItemOptions {
  @scala.inline
  def apply(
    url: String,
    accelerator: Accelerator = null,
    acceleratorWorksWhenHidden: js.UndefOr[Boolean] = js.undefined,
    after: js.Array[String] = null,
    afterGroupContaining: js.Array[String] = null,
    before: js.Array[String] = null,
    beforeGroupContaining: js.Array[String] = null,
    checked: js.UndefOr[Boolean] = js.undefined,
    click: (/* menuItem */ MenuItem, /* browserWindow */ BrowserWindow, /* event */ KeyboardEvent) => Unit = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    icon: NativeImage_ | String = null,
    id: String = null,
    label: String = null,
    registerAccelerator: js.UndefOr[Boolean] = js.undefined,
    role: undo | redo | cut | copy | paste | pasteAndMatchStyle | delete | selectAll | reload | forceReload | toggleDevTools | resetZoom | zoomIn | zoomOut | togglefullscreen | window | minimize | close | help | about | services | hide | hideOthers | unhide | quit | startSpeaking | stopSpeaking | zoom | front | typingsSlinky.electronUtil.electronUtilStrings.appMenu | fileMenu | editMenu | viewMenu | recentDocuments | toggleTabBar | selectNextTab | selectPreviousTab | mergeAllWindows | clearRecentDocuments | moveTabToNewWindow | windowMenu = null,
    sublabel: String = null,
    submenu: js.Array[MenuItemConstructorOptions] | Menu = null,
    `type`: normal | separator | submenu | checkbox | radio = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): OpenUrlMenuItemOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (accelerator != null) __obj.updateDynamic("accelerator")(accelerator.asInstanceOf[js.Any])
    if (!js.isUndefined(acceleratorWorksWhenHidden)) __obj.updateDynamic("acceleratorWorksWhenHidden")(acceleratorWorksWhenHidden.asInstanceOf[js.Any])
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (afterGroupContaining != null) __obj.updateDynamic("afterGroupContaining")(afterGroupContaining.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    if (beforeGroupContaining != null) __obj.updateDynamic("beforeGroupContaining")(beforeGroupContaining.asInstanceOf[js.Any])
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (click != null) __obj.updateDynamic("click")(js.Any.fromFunction3(click))
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(registerAccelerator)) __obj.updateDynamic("registerAccelerator")(registerAccelerator.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (sublabel != null) __obj.updateDynamic("sublabel")(sublabel.asInstanceOf[js.Any])
    if (submenu != null) __obj.updateDynamic("submenu")(submenu.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenUrlMenuItemOptions]
  }
}

