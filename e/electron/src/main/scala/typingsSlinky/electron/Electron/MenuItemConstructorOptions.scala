package typingsSlinky.electron.Electron

import typingsSlinky.electron.electronStrings.about
import typingsSlinky.electron.electronStrings.appMenu
import typingsSlinky.electron.electronStrings.checkbox
import typingsSlinky.electron.electronStrings.clearRecentDocuments
import typingsSlinky.electron.electronStrings.close
import typingsSlinky.electron.electronStrings.copy
import typingsSlinky.electron.electronStrings.cut
import typingsSlinky.electron.electronStrings.delete
import typingsSlinky.electron.electronStrings.editMenu
import typingsSlinky.electron.electronStrings.fileMenu
import typingsSlinky.electron.electronStrings.forceReload
import typingsSlinky.electron.electronStrings.front
import typingsSlinky.electron.electronStrings.help
import typingsSlinky.electron.electronStrings.hide
import typingsSlinky.electron.electronStrings.hideOthers
import typingsSlinky.electron.electronStrings.mergeAllWindows
import typingsSlinky.electron.electronStrings.minimize
import typingsSlinky.electron.electronStrings.moveTabToNewWindow
import typingsSlinky.electron.electronStrings.normal
import typingsSlinky.electron.electronStrings.paste
import typingsSlinky.electron.electronStrings.pasteAndMatchStyle
import typingsSlinky.electron.electronStrings.quit
import typingsSlinky.electron.electronStrings.radio
import typingsSlinky.electron.electronStrings.recentDocuments
import typingsSlinky.electron.electronStrings.redo
import typingsSlinky.electron.electronStrings.reload
import typingsSlinky.electron.electronStrings.resetZoom
import typingsSlinky.electron.electronStrings.selectAll
import typingsSlinky.electron.electronStrings.selectNextTab
import typingsSlinky.electron.electronStrings.selectPreviousTab
import typingsSlinky.electron.electronStrings.separator
import typingsSlinky.electron.electronStrings.services
import typingsSlinky.electron.electronStrings.startSpeaking
import typingsSlinky.electron.electronStrings.stopSpeaking
import typingsSlinky.electron.electronStrings.submenu
import typingsSlinky.electron.electronStrings.toggleDevTools
import typingsSlinky.electron.electronStrings.toggleTabBar
import typingsSlinky.electron.electronStrings.togglefullscreen
import typingsSlinky.electron.electronStrings.undo
import typingsSlinky.electron.electronStrings.unhide
import typingsSlinky.electron.electronStrings.viewMenu
import typingsSlinky.electron.electronStrings.window
import typingsSlinky.electron.electronStrings.windowMenu
import typingsSlinky.electron.electronStrings.zoom
import typingsSlinky.electron.electronStrings.zoomIn
import typingsSlinky.electron.electronStrings.zoomOut
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuItemConstructorOptions extends js.Object {
  var accelerator: js.UndefOr[Accelerator] = js.undefined
  /**
    * default is true, and when false will prevent the accelerator from triggering the
    * item if the item is not visible`.
    */
  var acceleratorWorksWhenHidden: js.UndefOr[Boolean] = js.undefined
  /**
    * Inserts this item after the item with the specified label. If the referenced
    * item doesn't exist the item will be inserted at the end of the menu.
    */
  var after: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Provides a means for a single context menu to declare the placement of their
    * containing group after the containing group of the item with the specified
    * label.
    */
  var afterGroupContaining: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Inserts this item before the item with the specified label. If the referenced
    * item doesn't exist the item will be inserted at the end of the menu. Also
    * implies that the menu item in question should be placed in the same “group” as
    * the item.
    */
  var before: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Provides a means for a single context menu to declare the placement of their
    * containing group before the containing group of the item with the specified
    * label.
    */
  var beforeGroupContaining: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Should only be specified for checkbox or radio type menu items.
    */
  var checked: js.UndefOr[Boolean] = js.undefined
  /**
    * Will be called with click(menuItem, browserWindow, event) when the menu item is
    * clicked.
    */
  var click: js.UndefOr[
    js.Function3[
      /* menuItem */ MenuItem, 
      /* browserWindow */ BrowserWindow, 
      /* event */ KeyboardEvent, 
      Unit
    ]
  ] = js.undefined
  /**
    * If false, the menu item will be greyed out and unclickable.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  var icon: js.UndefOr[NativeImage_ | String] = js.undefined
  /**
    * Unique within a single menu. If defined then it can be used as a reference to
    * this item by the position attribute.
    */
  var id: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  /**
    * If false, the accelerator won't be registered with the system, but it will still
    * be displayed. Defaults to true.
    */
  var registerAccelerator: js.UndefOr[Boolean] = js.undefined
  /**
    * Can be undo, redo, cut, copy, paste, pasteAndMatchStyle, delete, selectAll,
    * reload, forceReload, toggleDevTools, resetZoom, zoomIn, zoomOut,
    * togglefullscreen, window, minimize, close, help, about, services, hide,
    * hideOthers, unhide, quit, startSpeaking, stopSpeaking, close, minimize, zoom,
    * front, appMenu, fileMenu, editMenu, viewMenu, recentDocuments, toggleTabBar,
    * selectNextTab, selectPreviousTab, mergeAllWindows, clearRecentDocuments,
    * moveTabToNewWindow or windowMenu Define the action of the menu item, when
    * specified the click property will be ignored. See .
    */
  var role: js.UndefOr[
    undo | redo | cut | copy | paste | pasteAndMatchStyle | delete | selectAll | reload | forceReload | toggleDevTools | resetZoom | zoomIn | zoomOut | togglefullscreen | window | minimize | close | help | about | services | hide | hideOthers | unhide | quit | startSpeaking | stopSpeaking | zoom | front | appMenu | fileMenu | editMenu | viewMenu | recentDocuments | toggleTabBar | selectNextTab | selectPreviousTab | mergeAllWindows | clearRecentDocuments | moveTabToNewWindow | windowMenu
  ] = js.undefined
  var sublabel: js.UndefOr[String] = js.undefined
  /**
    * Should be specified for submenu type menu items. If submenu is specified, the
    * type: 'submenu' can be omitted. If the value is not a then it will be
    * automatically converted to one using Menu.buildFromTemplate.
    */
  var submenu: js.UndefOr[js.Array[MenuItemConstructorOptions] | Menu] = js.undefined
  /**
    * Can be normal, separator, submenu, checkbox or radio.
    */
  var `type`: js.UndefOr[normal | separator | submenu | checkbox | radio] = js.undefined
  /**
    * If false, the menu item will be entirely hidden.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object MenuItemConstructorOptions {
  @scala.inline
  def apply(
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
    role: undo | redo | cut | copy | paste | pasteAndMatchStyle | delete | selectAll | reload | forceReload | toggleDevTools | resetZoom | zoomIn | zoomOut | togglefullscreen | window | minimize | close | help | about | services | hide | hideOthers | unhide | quit | startSpeaking | stopSpeaking | zoom | front | appMenu | fileMenu | editMenu | viewMenu | recentDocuments | toggleTabBar | selectNextTab | selectPreviousTab | mergeAllWindows | clearRecentDocuments | moveTabToNewWindow | windowMenu = null,
    sublabel: String = null,
    submenu: js.Array[MenuItemConstructorOptions] | Menu = null,
    `type`: normal | separator | submenu | checkbox | radio = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): MenuItemConstructorOptions = {
    val __obj = js.Dynamic.literal()
    if (accelerator != null) __obj.updateDynamic("accelerator")(accelerator.asInstanceOf[js.Any])
    if (!js.isUndefined(acceleratorWorksWhenHidden)) __obj.updateDynamic("acceleratorWorksWhenHidden")(acceleratorWorksWhenHidden.get.asInstanceOf[js.Any])
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (afterGroupContaining != null) __obj.updateDynamic("afterGroupContaining")(afterGroupContaining.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    if (beforeGroupContaining != null) __obj.updateDynamic("beforeGroupContaining")(beforeGroupContaining.asInstanceOf[js.Any])
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.get.asInstanceOf[js.Any])
    if (click != null) __obj.updateDynamic("click")(js.Any.fromFunction3(click))
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(registerAccelerator)) __obj.updateDynamic("registerAccelerator")(registerAccelerator.get.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (sublabel != null) __obj.updateDynamic("sublabel")(sublabel.asInstanceOf[js.Any])
    if (submenu != null) __obj.updateDynamic("submenu")(submenu.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuItemConstructorOptions]
  }
}

