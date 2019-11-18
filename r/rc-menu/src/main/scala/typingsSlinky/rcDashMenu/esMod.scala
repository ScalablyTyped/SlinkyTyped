package typingsSlinky.rcDashMenu

import slinky.core.ReactComponentClass
import typingsSlinky.rcDashMenu.esDividerMod.DividerProps
import typingsSlinky.rcDashMenu.esMenuMod.MenuProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-menu/es", JSImport.Namespace)
@js.native
object esMod extends js.Object {
  @js.native
  class ItemGroup ()
    extends typingsSlinky.rcDashMenu.esMenuItemGroupMod.default
  
  @js.native
  class MenuItemGroup ()
    extends typingsSlinky.rcDashMenu.esMenuItemGroupMod.default
  
  @js.native
  class default protected ()
    extends typingsSlinky.rcDashMenu.esMenuMod.default {
    def this(props: MenuProps) = this()
  }
  
  val Divider: ReactComponentClass[DividerProps] = js.native
  val Item: js.Any = js.native
  val MenuItem: js.Any = js.native
  val SubMenu: js.Any = js.native
  /* static members */
  @js.native
  object ItemGroup extends js.Object {
    var defaultProps: Anon_Disabled = js.native
    var isMenuItemGroup: Boolean = js.native
  }
  
  /* static members */
  @js.native
  object MenuItemGroup extends js.Object {
    var defaultProps: Anon_Disabled = js.native
    var isMenuItemGroup: Boolean = js.native
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: Anon_BuiltinPlacements = js.native
  }
  
}

