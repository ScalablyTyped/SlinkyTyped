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
@js.native
trait OpenUrlMenuItemOptions extends js.Object {
  val accelerator: js.UndefOr[Accelerator] = js.native
  val acceleratorWorksWhenHidden: js.UndefOr[Boolean] = js.native
  val after: js.UndefOr[js.Array[String]] = js.native
  val afterGroupContaining: js.UndefOr[js.Array[String]] = js.native
  val before: js.UndefOr[js.Array[String]] = js.native
  val beforeGroupContaining: js.UndefOr[js.Array[String]] = js.native
  val checked: js.UndefOr[Boolean] = js.native
  val click: js.UndefOr[
    js.Function3[
      /* menuItem */ MenuItem, 
      /* browserWindow */ BrowserWindow, 
      /* event */ KeyboardEvent, 
      Unit
    ]
  ] = js.native
  val enabled: js.UndefOr[Boolean] = js.native
  val icon: js.UndefOr[NativeImage_ | String] = js.native
  val id: js.UndefOr[String] = js.native
  val label: js.UndefOr[String] = js.native
  val registerAccelerator: js.UndefOr[Boolean] = js.native
  val role: js.UndefOr[
    undo | redo | cut | copy | paste | pasteAndMatchStyle | delete | selectAll | reload | forceReload | toggleDevTools | resetZoom | zoomIn | zoomOut | togglefullscreen | window | minimize | close | help | about | services | hide | hideOthers | unhide | quit | startSpeaking | stopSpeaking | zoom | front | typingsSlinky.electronUtil.electronUtilStrings.appMenu | fileMenu | editMenu | viewMenu | recentDocuments | toggleTabBar | selectNextTab | selectPreviousTab | mergeAllWindows | clearRecentDocuments | moveTabToNewWindow | windowMenu
  ] = js.native
  val sublabel: js.UndefOr[String] = js.native
  val submenu: js.UndefOr[js.Array[MenuItemConstructorOptions] | Menu] = js.native
  val `type`: js.UndefOr[
    normal | separator | typingsSlinky.electronUtil.electronUtilStrings.submenu | checkbox | radio
  ] = js.native
  /**
  	URL to be opened when the menu item is clicked.
  	*/
  val url: String = js.native
  val visible: js.UndefOr[Boolean] = js.native
}

object OpenUrlMenuItemOptions {
  @scala.inline
  def apply(url: String): OpenUrlMenuItemOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenUrlMenuItemOptions]
  }
  @scala.inline
  implicit class OpenUrlMenuItemOptionsOps[Self <: OpenUrlMenuItemOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
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
      value: undo | redo | cut | copy | paste | pasteAndMatchStyle | delete | selectAll | reload | forceReload | toggleDevTools | resetZoom | zoomIn | zoomOut | togglefullscreen | window | minimize | close | help | about | services | hide | hideOthers | unhide | quit | startSpeaking | stopSpeaking | zoom | front | typingsSlinky.electronUtil.electronUtilStrings.appMenu | fileMenu | editMenu | viewMenu | recentDocuments | toggleTabBar | selectNextTab | selectPreviousTab | mergeAllWindows | clearRecentDocuments | moveTabToNewWindow | windowMenu
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

