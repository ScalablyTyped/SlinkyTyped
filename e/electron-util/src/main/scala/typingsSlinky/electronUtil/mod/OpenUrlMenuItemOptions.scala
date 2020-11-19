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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
      /* browserWindow */ js.UndefOr[BrowserWindow], 
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
  
  val toolTip: js.UndefOr[String] = js.native
  
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
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
      value: (/* menuItem */ MenuItem, /* browserWindow */ js.UndefOr[BrowserWindow], /* event */ KeyboardEvent) => Unit
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
      value: undo | redo | cut | copy | paste | pasteAndMatchStyle | delete | selectAll | reload | forceReload | toggleDevTools | resetZoom | zoomIn | zoomOut | togglefullscreen | window | minimize | close | help | about | services | hide | hideOthers | unhide | quit | startSpeaking | stopSpeaking | zoom | front | typingsSlinky.electronUtil.electronUtilStrings.appMenu | fileMenu | editMenu | viewMenu | recentDocuments | toggleTabBar | selectNextTab | selectPreviousTab | mergeAllWindows | clearRecentDocuments | moveTabToNewWindow | windowMenu
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
    def setToolTip(value: String): Self = this.set("toolTip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToolTip: Self = this.set("toolTip", js.undefined)
    
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
