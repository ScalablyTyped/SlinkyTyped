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
trait MenuItemConstructorOptions extends StObject {
  
  var accelerator: js.UndefOr[Accelerator] = js.native
  
  /**
    * default is `true`, and when `false` will prevent the accelerator from triggering
    * the item if the item is not visible`.
    *
    * @platform darwin
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
    * item doesn't exist the item will be inserted at the end of  the menu. Also
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
    * Should only be specified for `checkbox` or `radio` type menu items.
    */
  var checked: js.UndefOr[Boolean] = js.native
  
  /**
    * Will be called with `click(menuItem, browserWindow, event)` when the menu item
    * is clicked.
    */
  var click: js.UndefOr[
    js.Function3[
      /* menuItem */ MenuItem, 
      /* browserWindow */ js.UndefOr[BrowserWindow], 
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
    *
    * @platform linux,win32
    */
  var registerAccelerator: js.UndefOr[Boolean] = js.native
  
  /**
    * Can be `undo`, `redo`, `cut`, `copy`, `paste`, `pasteAndMatchStyle`, `delete`,
    * `selectAll`, `reload`, `forceReload`, `toggleDevTools`, `resetZoom`, `zoomIn`,
    * `zoomOut`, `togglefullscreen`, `window`, `minimize`, `close`, `help`, `about`,
    * `services`, `hide`, `hideOthers`, `unhide`, `quit`, `startSpeaking`,
    * `stopSpeaking`, `zoom`, `front`, `appMenu`, `fileMenu`, `editMenu`, `viewMenu`,
    * `recentDocuments`, `toggleTabBar`, `selectNextTab`, `selectPreviousTab`,
    * `mergeAllWindows`, `clearRecentDocuments`, `moveTabToNewWindow` or `windowMenu`
    * - Define the action of the menu item, when specified the `click` property will
    * be ignored. See roles.
    */
  var role: js.UndefOr[
    undo | redo | cut | copy | paste | pasteAndMatchStyle | delete | selectAll | reload | forceReload | toggleDevTools | resetZoom | zoomIn | zoomOut | togglefullscreen | window | minimize | close | help | about | services | hide | hideOthers | unhide | quit | startSpeaking | stopSpeaking | zoom | front | appMenu | fileMenu | editMenu | viewMenu | recentDocuments | toggleTabBar | selectNextTab | selectPreviousTab | mergeAllWindows | clearRecentDocuments | moveTabToNewWindow | windowMenu
  ] = js.native
  
  var sublabel: js.UndefOr[String] = js.native
  
  /**
    * Should be specified for `submenu` type menu items. If `submenu` is specified,
    * the `type: 'submenu'` can be omitted. If the value is not a `Menu` then it will
    * be automatically converted to one using `Menu.buildFromTemplate`.
    */
  var submenu: js.UndefOr[js.Array[MenuItemConstructorOptions] | Menu] = js.native
  
  /**
    * Hover text for this menu item.
    *
    * @platform darwin
    */
  var toolTip: js.UndefOr[String] = js.native
  
  /**
    * Can be `normal`, `separator`, `submenu`, `checkbox` or `radio`.
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
  implicit class MenuItemConstructorOptionsMutableBuilder[Self <: MenuItemConstructorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccelerator(value: Accelerator): Self = StObject.set(x, "accelerator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceleratorUndefined: Self = StObject.set(x, "accelerator", js.undefined)
    
    @scala.inline
    def setAcceleratorWorksWhenHidden(value: Boolean): Self = StObject.set(x, "acceleratorWorksWhenHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceleratorWorksWhenHiddenUndefined: Self = StObject.set(x, "acceleratorWorksWhenHidden", js.undefined)
    
    @scala.inline
    def setAfter(value: js.Array[String]): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterGroupContaining(value: js.Array[String]): Self = StObject.set(x, "afterGroupContaining", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterGroupContainingUndefined: Self = StObject.set(x, "afterGroupContaining", js.undefined)
    
    @scala.inline
    def setAfterGroupContainingVarargs(value: String*): Self = StObject.set(x, "afterGroupContaining", js.Array(value :_*))
    
    @scala.inline
    def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
    
    @scala.inline
    def setAfterVarargs(value: String*): Self = StObject.set(x, "after", js.Array(value :_*))
    
    @scala.inline
    def setBefore(value: js.Array[String]): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeGroupContaining(value: js.Array[String]): Self = StObject.set(x, "beforeGroupContaining", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeGroupContainingUndefined: Self = StObject.set(x, "beforeGroupContaining", js.undefined)
    
    @scala.inline
    def setBeforeGroupContainingVarargs(value: String*): Self = StObject.set(x, "beforeGroupContaining", js.Array(value :_*))
    
    @scala.inline
    def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
    
    @scala.inline
    def setBeforeVarargs(value: String*): Self = StObject.set(x, "before", js.Array(value :_*))
    
    @scala.inline
    def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
    
    @scala.inline
    def setClick(
      value: (/* menuItem */ MenuItem, /* browserWindow */ js.UndefOr[BrowserWindow], /* event */ KeyboardEvent) => Unit
    ): Self = StObject.set(x, "click", js.Any.fromFunction3(value))
    
    @scala.inline
    def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setIcon(value: NativeImage_ | String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setRegisterAccelerator(value: Boolean): Self = StObject.set(x, "registerAccelerator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegisterAcceleratorUndefined: Self = StObject.set(x, "registerAccelerator", js.undefined)
    
    @scala.inline
    def setRole(
      value: undo | redo | cut | copy | paste | pasteAndMatchStyle | delete | selectAll | reload | forceReload | toggleDevTools | resetZoom | zoomIn | zoomOut | togglefullscreen | window | minimize | close | help | about | services | hide | hideOthers | unhide | quit | startSpeaking | stopSpeaking | zoom | front | appMenu | fileMenu | editMenu | viewMenu | recentDocuments | toggleTabBar | selectNextTab | selectPreviousTab | mergeAllWindows | clearRecentDocuments | moveTabToNewWindow | windowMenu
    ): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    @scala.inline
    def setSublabel(value: String): Self = StObject.set(x, "sublabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSublabelUndefined: Self = StObject.set(x, "sublabel", js.undefined)
    
    @scala.inline
    def setSubmenu(value: js.Array[MenuItemConstructorOptions] | Menu): Self = StObject.set(x, "submenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubmenuUndefined: Self = StObject.set(x, "submenu", js.undefined)
    
    @scala.inline
    def setSubmenuVarargs(value: MenuItemConstructorOptions*): Self = StObject.set(x, "submenu", js.Array(value :_*))
    
    @scala.inline
    def setToolTip(value: String): Self = StObject.set(x, "toolTip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolTipUndefined: Self = StObject.set(x, "toolTip", js.undefined)
    
    @scala.inline
    def setType(value: normal | separator | submenu | checkbox | radio): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
