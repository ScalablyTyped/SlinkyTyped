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
  def apply(): MenuItemConstructorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MenuItemConstructorOptions]
  }
  @scala.inline
  implicit class MenuItemConstructorOptionsOps[Self <: MenuItemConstructorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccelerator(value: Accelerator): Self = this.set("accelerator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccelerator: Self = this.set("accelerator", js.undefined)
    @scala.inline
    def setAcceleratorWorksWhenHidden(value: Boolean): Self = this.set("acceleratorWorksWhenHidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcceleratorWorksWhenHidden: Self = this.set("acceleratorWorksWhenHidden", js.undefined)
    @scala.inline
    def setAfterVarargs(value: String*): Self = this.set("after", js.Array(value :_*))
    @scala.inline
    def setAfter(value: js.Array[String]): Self = this.set("after", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfter: Self = this.set("after", js.undefined)
    @scala.inline
    def setAfterGroupContainingVarargs(value: String*): Self = this.set("afterGroupContaining", js.Array(value :_*))
    @scala.inline
    def setAfterGroupContaining(value: js.Array[String]): Self = this.set("afterGroupContaining", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterGroupContaining: Self = this.set("afterGroupContaining", js.undefined)
    @scala.inline
    def setBeforeVarargs(value: String*): Self = this.set("before", js.Array(value :_*))
    @scala.inline
    def setBefore(value: js.Array[String]): Self = this.set("before", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBefore: Self = this.set("before", js.undefined)
    @scala.inline
    def setBeforeGroupContainingVarargs(value: String*): Self = this.set("beforeGroupContaining", js.Array(value :_*))
    @scala.inline
    def setBeforeGroupContaining(value: js.Array[String]): Self = this.set("beforeGroupContaining", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeGroupContaining: Self = this.set("beforeGroupContaining", js.undefined)
    @scala.inline
    def setChecked(value: Boolean): Self = this.set("checked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChecked: Self = this.set("checked", js.undefined)
    @scala.inline
    def setClick(
      value: (/* menuItem */ MenuItem, /* browserWindow */ BrowserWindow, /* event */ KeyboardEvent) => Unit
    ): Self = this.set("click", js.Any.fromFunction3(value))
    @scala.inline
    def deleteClick: Self = this.set("click", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setIcon(value: NativeImage_ | String): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setRegisterAccelerator(value: Boolean): Self = this.set("registerAccelerator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegisterAccelerator: Self = this.set("registerAccelerator", js.undefined)
    @scala.inline
    def setRole(
      value: undo | redo | cut | copy | paste | pasteAndMatchStyle | delete | selectAll | reload | forceReload | toggleDevTools | resetZoom | zoomIn | zoomOut | togglefullscreen | window | minimize | close | help | about | services | hide | hideOthers | unhide | quit | startSpeaking | stopSpeaking | zoom | front | appMenu | fileMenu | editMenu | viewMenu | recentDocuments | toggleTabBar | selectNextTab | selectPreviousTab | mergeAllWindows | clearRecentDocuments | moveTabToNewWindow | windowMenu
    ): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    @scala.inline
    def setSublabel(value: String): Self = this.set("sublabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSublabel: Self = this.set("sublabel", js.undefined)
    @scala.inline
    def setSubmenuVarargs(value: MenuItemConstructorOptions*): Self = this.set("submenu", js.Array(value :_*))
    @scala.inline
    def setSubmenu(value: js.Array[MenuItemConstructorOptions] | Menu): Self = this.set("submenu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubmenu: Self = this.set("submenu", js.undefined)
    @scala.inline
    def setType(value: normal | separator | submenu | checkbox | radio): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}

