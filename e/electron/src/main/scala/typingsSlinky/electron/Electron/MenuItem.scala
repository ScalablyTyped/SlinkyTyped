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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MenuItem extends StObject {
  
  var accelerator: js.UndefOr[Accelerator] = js.native
  
  var checked: Boolean = js.native
  
  var click: js.Function = js.native
  
  var commandId: Double = js.native
  
  var enabled: Boolean = js.native
  
  var icon: js.UndefOr[NativeImage_ | String] = js.native
  
  var id: String = js.native
  
  var label: String = js.native
  
  var menu: Menu = js.native
  
  var registerAccelerator: Boolean = js.native
  
  var role: js.UndefOr[
    undo | redo | cut | copy | paste | pasteAndMatchStyle | delete | selectAll | reload | forceReload | toggleDevTools | resetZoom | zoomIn | zoomOut | togglefullscreen | window | minimize | close | help | about | services | hide | hideOthers | unhide | quit | startSpeaking | stopSpeaking | zoom | front | appMenu | fileMenu | editMenu | viewMenu | recentDocuments | toggleTabBar | selectNextTab | selectPreviousTab | mergeAllWindows | clearRecentDocuments | moveTabToNewWindow | windowMenu
  ] = js.native
  
  var sublabel: String = js.native
  
  var submenu: js.UndefOr[Menu] = js.native
  
  var toolTip: String = js.native
  
  var `type`: normal | separator | submenu | checkbox | radio = js.native
  
  var visible: Boolean = js.native
}
object MenuItem {
  
  @scala.inline
  def apply(
    checked: Boolean,
    click: js.Function,
    commandId: Double,
    enabled: Boolean,
    id: String,
    label: String,
    menu: Menu,
    registerAccelerator: Boolean,
    sublabel: String,
    toolTip: String,
    `type`: normal | separator | submenu | checkbox | radio,
    visible: Boolean
  ): MenuItem = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], commandId = commandId.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], menu = menu.asInstanceOf[js.Any], registerAccelerator = registerAccelerator.asInstanceOf[js.Any], sublabel = sublabel.asInstanceOf[js.Any], toolTip = toolTip.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuItem]
  }
  
  @scala.inline
  implicit class MenuItemMutableBuilder[Self <: MenuItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccelerator(value: Accelerator): Self = StObject.set(x, "accelerator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceleratorUndefined: Self = StObject.set(x, "accelerator", js.undefined)
    
    @scala.inline
    def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClick(value: js.Function): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommandId(value: Double): Self = StObject.set(x, "commandId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcon(value: NativeImage_ | String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenu(value: Menu): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegisterAccelerator(value: Boolean): Self = StObject.set(x, "registerAccelerator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRole(
      value: undo | redo | cut | copy | paste | pasteAndMatchStyle | delete | selectAll | reload | forceReload | toggleDevTools | resetZoom | zoomIn | zoomOut | togglefullscreen | window | minimize | close | help | about | services | hide | hideOthers | unhide | quit | startSpeaking | stopSpeaking | zoom | front | appMenu | fileMenu | editMenu | viewMenu | recentDocuments | toggleTabBar | selectNextTab | selectPreviousTab | mergeAllWindows | clearRecentDocuments | moveTabToNewWindow | windowMenu
    ): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    @scala.inline
    def setSublabel(value: String): Self = StObject.set(x, "sublabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubmenu(value: Menu): Self = StObject.set(x, "submenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubmenuUndefined: Self = StObject.set(x, "submenu", js.undefined)
    
    @scala.inline
    def setToolTip(value: String): Self = StObject.set(x, "toolTip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: normal | separator | submenu | checkbox | radio): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
