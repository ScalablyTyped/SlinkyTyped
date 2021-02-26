package typingsSlinky.antd.mod

import org.scalablytyped.runtime.Instantiable0
import slinky.core.ReactComponentClass
import typingsSlinky.antd.anon.TypeofItem
import typingsSlinky.antd.anon.TypeofItemGroup
import typingsSlinky.antd.anon.TypeofSubMenu
import typingsSlinky.antd.menuMod.default
import typingsSlinky.rcMenu.dividerMod.DividerProps
import typingsSlinky.rcMenu.mod.ItemGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antd", "Menu")
@js.native
class Menu () extends default
/* static members */
object Menu {
  
  @JSImport("antd", "Menu")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("antd", "Menu.Divider")
  @js.native
  def Divider: ReactComponentClass[DividerProps] = js.native
  @scala.inline
  def Divider_=(x: ReactComponentClass[DividerProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Divider")(x.asInstanceOf[js.Any])
  
  @JSImport("antd", "Menu.Item")
  @js.native
  def Item: TypeofItem = js.native
  
  @JSImport("antd", "Menu.ItemGroup")
  @js.native
  def ItemGroup: TypeofItemGroup with Instantiable0[typingsSlinky.rcMenu.mod.ItemGroup] = js.native
  @scala.inline
  def ItemGroup_=(x: TypeofItemGroup with Instantiable0[ItemGroup]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ItemGroup")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def Item_=(x: TypeofItem): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
  
  @JSImport("antd", "Menu.SubMenu")
  @js.native
  def SubMenu: Instantiable0[typingsSlinky.antd.subMenuMod.default] with TypeofSubMenu = js.native
  @scala.inline
  def SubMenu_=(x: Instantiable0[typingsSlinky.antd.subMenuMod.default] with TypeofSubMenu): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SubMenu")(x.asInstanceOf[js.Any])
}
