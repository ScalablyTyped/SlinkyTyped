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

@js.native
trait MenuItemConstructorOptions extends js.Object {
  var accelerator: js.UndefOr[Accelerator] = js.native
  /**
    * default is true, and when false will prevent the accelerator from triggering the
    * item if the item is not visible`.
    */
  var acceleratorWorksWhenHidden: js.UndefOr[Boolean] = js.native
  /**
    * Inserts this item after the item with the specified label. If the referenced
    * item doesn't exist the item will be inserted at the end of the menu.
    */
  var after: js.UndefOr[js.Array[String]] = js.native
  /**
    * Provides a means for a single context menu to declare the placement of their
    * containing group after the containing group of the item with the specified
    * label.
    */
  var afterGroupContaining: js.UndefOr[js.Array[String]] = js.native
  /**
    * Inserts this item before the item with the specified label. If the referenced
    * item doesn't exist the item will be inserted at the end of the menu. Also
    * implies that the menu item in question should be placed in the same “group” as
    * the item.
    */
  var before: js.UndefOr[js.Array[String]] = js.native
  /**
    * Provides a means for a single context menu to declare the placement of their
    * containing group before the containing group of the item with the specified
    * label.
    */
  var beforeGroupContaining: js.UndefOr[js.Array[String]] = js.native
  /**
    * Should only be specified for checkbox or radio type menu items.
    */
  var checked: js.UndefOr[Boolean] = js.native
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
  ] = js.native
  /**
    * If false, the menu item will be greyed out and unclickable.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  var icon: js.UndefOr[NativeImage_ | String] = js.native
  /**
    * Unique within a single menu. If defined then it can be used as a reference to
    * this item by the position attribute.
    */
  var id: js.UndefOr[String] = js.native
  var label: js.UndefOr[String] = js.native
  /**
    * If false, the accelerator won't be registered with the system, but it will still
    * be displayed. Defaults to true.
    */
  var registerAccelerator: js.UndefOr[Boolean] = js.native
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
  ] = js.native
  var sublabel: js.UndefOr[String] = js.native
  /**
    * Should be specified for submenu type menu items. If submenu is specified, the
    * type: 'submenu' can be omitted. If the value is not a then it will be
    * automatically converted to one using Menu.buildFromTemplate.
    */
  var submenu: js.UndefOr[js.Array[MenuItemConstructorOptions] | Menu] = js.native
  /**
    * Can be normal, separator, submenu, checkbox or radio.
    */
  var `type`: js.UndefOr[normal | separator | submenu | checkbox | radio] = js.native
  /**
    * If false, the menu item will be entirely hidden.
    */
  var visible: js.UndefOr[Boolean] = js.native
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
    def withAccelerator(value: Accelerator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accelerator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccelerator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accelerator")(js.undefined)
        ret
    }
    @scala.inline
    def withAcceleratorWorksWhenHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceleratorWorksWhenHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcceleratorWorksWhenHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceleratorWorksWhenHidden")(js.undefined)
        ret
    }
    @scala.inline
    def withAfter(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterGroupContaining(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterGroupContaining")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfterGroupContaining: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterGroupContaining")(js.undefined)
        ret
    }
    @scala.inline
    def withBefore(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeGroupContaining(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeGroupContaining")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeforeGroupContaining: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeGroupContaining")(js.undefined)
        ret
    }
    @scala.inline
    def withChecked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChecked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checked")(js.undefined)
        ret
    }
    @scala.inline
    def withClick(
      value: (/* menuItem */ MenuItem, /* browserWindow */ BrowserWindow, /* event */ KeyboardEvent) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
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
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withRegisterAccelerator(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerAccelerator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegisterAccelerator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerAccelerator")(js.undefined)
        ret
    }
    @scala.inline
    def withRole(
      value: undo | redo | cut | copy | paste | pasteAndMatchStyle | delete | selectAll | reload | forceReload | toggleDevTools | resetZoom | zoomIn | zoomOut | togglefullscreen | window | minimize | close | help | about | services | hide | hideOthers | unhide | quit | startSpeaking | stopSpeaking | zoom | front | appMenu | fileMenu | editMenu | viewMenu | recentDocuments | toggleTabBar | selectNextTab | selectPreviousTab | mergeAllWindows | clearRecentDocuments | moveTabToNewWindow | windowMenu
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(js.undefined)
        ret
    }
    @scala.inline
    def withSublabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sublabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSublabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sublabel")(js.undefined)
        ret
    }
    @scala.inline
    def withSubmenu(value: js.Array[MenuItemConstructorOptions] | Menu): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubmenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submenu")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: normal | separator | submenu | checkbox | radio): Self = {
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
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
  }
  
}

