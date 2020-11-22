package typingsSlinky.rcMenu

import slinky.core.ReactComponentClass
import typingsSlinky.rcMenu.anon.BuiltinPlacements
import typingsSlinky.rcMenu.anon.Disabled
import typingsSlinky.rcMenu.anon.PartialMenuState
import typingsSlinky.rcMenu.dividerMod.DividerProps
import typingsSlinky.rcMenu.menuMod.MenuProps
import typingsSlinky.rcMenu.menuMod.MenuState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-menu", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val Divider: ReactComponentClass[DividerProps] = js.native
  
  val Item: js.Any = js.native
  
  val MenuItem: js.Any = js.native
  
  val SubMenu: js.Any = js.native
  
  @js.native
  class ItemGroup ()
    extends typingsSlinky.rcMenu.menuItemGroupMod.default
  /* static members */
  @js.native
  object ItemGroup extends js.Object {
    
    var defaultProps: Disabled = js.native
    
    var isMenuItemGroup: Boolean = js.native
  }
  
  @js.native
  class MenuItemGroup ()
    extends typingsSlinky.rcMenu.menuItemGroupMod.default
  /* static members */
  @js.native
  object MenuItemGroup extends js.Object {
    
    var defaultProps: Disabled = js.native
    
    var isMenuItemGroup: Boolean = js.native
  }
  
  @js.native
  class default protected ()
    extends typingsSlinky.rcMenu.menuMod.default {
    def this(props: MenuProps) = this()
  }
  /* static members */
  @js.native
  object default extends js.Object {
    
    var defaultProps: BuiltinPlacements = js.native
    
    def getDerivedStateFromProps(nextProps: MenuProps, prevState: MenuState): PartialMenuState = js.native
  }
}
