package typingsSlinky.materialUi

import slinky.core.ReactComponentClass
import typingsSlinky.materialUi.MaterialUI.AutoCompleteProps
import typingsSlinky.materialUi.MaterialUI.DividerProps
import typingsSlinky.materialUi.MaterialUI.Menus.MenuItemProps
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object autoCompleteMod {
  
  @JSImport("material-ui/AutoComplete", JSImport.Default)
  @js.native
  class default () extends AutoComplete
  /* static members */
  object default {
    
    @JSImport("material-ui/AutoComplete", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("material-ui/AutoComplete", "default.Divider")
    @js.native
    def Divider: ReactComponentClass[DividerProps] = js.native
    @scala.inline
    def Divider_=(x: ReactComponentClass[DividerProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Divider")(x.asInstanceOf[js.Any])
    
    @JSImport("material-ui/AutoComplete", "default.Item")
    @js.native
    def Item: ReactComponentClass[MenuItemProps] = js.native
    @scala.inline
    def Item_=(x: ReactComponentClass[MenuItemProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
    
    @JSImport("material-ui/AutoComplete", "default.caseInsensitiveFilter")
    @js.native
    def caseInsensitiveFilter(searchText: String, key: String): Boolean = js.native
    
    @JSImport("material-ui/AutoComplete", "default.caseSensitiveFilter")
    @js.native
    def caseSensitiveFilter(searchText: String, key: String): Boolean = js.native
    
    @JSImport("material-ui/AutoComplete", "default.defaultFilter")
    @js.native
    def defaultFilter(searchText: String, key: String): Boolean = js.native
    
    @JSImport("material-ui/AutoComplete", "default.fuzzyFilter")
    @js.native
    def fuzzyFilter(searchText: String, key: String): Boolean = js.native
    
    @JSImport("material-ui/AutoComplete", "default.levenshteinDistanceFilter")
    @js.native
    def levenshteinDistanceFilter(distanceLessThan: Double): js.Function2[/* searchText */ String, /* key */ String, Boolean] = js.native
    
    @JSImport("material-ui/AutoComplete", "default.noFilter")
    @js.native
    def noFilter(): Boolean = js.native
  }
  
  @JSImport("material-ui/AutoComplete", "AutoComplete")
  @js.native
  class AutoComplete ()
    extends Component[AutoCompleteProps[js.Any], js.Object, js.Any]
  /* static members */
  object AutoComplete {
    
    @JSImport("material-ui/AutoComplete", "AutoComplete")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("material-ui/AutoComplete", "AutoComplete.Divider")
    @js.native
    def Divider: ReactComponentClass[DividerProps] = js.native
    @scala.inline
    def Divider_=(x: ReactComponentClass[DividerProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Divider")(x.asInstanceOf[js.Any])
    
    @JSImport("material-ui/AutoComplete", "AutoComplete.Item")
    @js.native
    def Item: ReactComponentClass[MenuItemProps] = js.native
    @scala.inline
    def Item_=(x: ReactComponentClass[MenuItemProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
    
    @JSImport("material-ui/AutoComplete", "AutoComplete.caseInsensitiveFilter")
    @js.native
    def caseInsensitiveFilter(searchText: String, key: String): Boolean = js.native
    
    @JSImport("material-ui/AutoComplete", "AutoComplete.caseSensitiveFilter")
    @js.native
    def caseSensitiveFilter(searchText: String, key: String): Boolean = js.native
    
    @JSImport("material-ui/AutoComplete", "AutoComplete.defaultFilter")
    @js.native
    def defaultFilter(searchText: String, key: String): Boolean = js.native
    
    @JSImport("material-ui/AutoComplete", "AutoComplete.fuzzyFilter")
    @js.native
    def fuzzyFilter(searchText: String, key: String): Boolean = js.native
    
    @JSImport("material-ui/AutoComplete", "AutoComplete.levenshteinDistanceFilter")
    @js.native
    def levenshteinDistanceFilter(distanceLessThan: Double): js.Function2[/* searchText */ String, /* key */ String, Boolean] = js.native
    
    @JSImport("material-ui/AutoComplete", "AutoComplete.noFilter")
    @js.native
    def noFilter(): Boolean = js.native
  }
}
