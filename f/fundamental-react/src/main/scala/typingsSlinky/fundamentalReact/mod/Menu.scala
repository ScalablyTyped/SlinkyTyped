package typingsSlinky.fundamentalReact.mod

import slinky.core.facade.ReactElement
import typingsSlinky.fundamentalReact.anon.FunctionComponentMenuGrou
import typingsSlinky.fundamentalReact.anon.FunctionComponentMenuItem
import typingsSlinky.fundamentalReact.anon.FunctionComponentMenuList
import typingsSlinky.fundamentalReact.anon.PartialMenuProps
import typingsSlinky.fundamentalReact.anon.WeakValidationMapMenuProp
import typingsSlinky.fundamentalReact.menuMod.MenuProps
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/Menu/Menu.MenuProps> & {  displayName :'Menu',   Group :react.react.FunctionComponent<fundamental-react.fundamental-react/lib/Menu/Menu.MenuGroupProps> & {  displayName :'Menu.Group'},   Item :react.react.FunctionComponent<fundamental-react.fundamental-react/lib/Menu/Menu.MenuItemProps> & {  displayName :'Menu.Item'},   List :react.react.FunctionComponent<fundamental-react.fundamental-react/lib/Menu/Menu.MenuListProps> & {  displayName :'Menu.List'}} */
object Menu {
  
  @JSImport("fundamental-react", "Menu")
  @js.native
  def apply(props: PropsWithChildren[MenuProps]): ReactElement | Null = js.native
  @JSImport("fundamental-react", "Menu")
  @js.native
  def apply(props: PropsWithChildren[MenuProps], context: js.Any): ReactElement | Null = js.native
  @JSImport("fundamental-react", "Menu")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fundamental-react", "Menu.Group")
  @js.native
  def Group: FunctionComponentMenuGrou = js.native
  @scala.inline
  def Group_=(x: FunctionComponentMenuGrou): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Group")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "Menu.Item")
  @js.native
  def Item: FunctionComponentMenuItem = js.native
  @scala.inline
  def Item_=(x: FunctionComponentMenuItem): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "Menu.List")
  @js.native
  def List: FunctionComponentMenuList = js.native
  @scala.inline
  def List_=(x: FunctionComponentMenuList): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("List")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "Menu.contextTypes")
  @js.native
  def contextTypes: js.UndefOr[ValidationMap[js.Any]] = js.native
  @scala.inline
  def contextTypes_=(x: js.UndefOr[ValidationMap[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "Menu.defaultProps")
  @js.native
  def defaultProps: js.UndefOr[PartialMenuProps] = js.native
  @scala.inline
  def defaultProps_=(x: js.UndefOr[PartialMenuProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "Menu.displayName")
  @js.native
  def displayName: js.UndefOr[typingsSlinky.fundamentalReact.fundamentalReactStrings.Menu | String] = js.native
  @scala.inline
  def displayName_=(x: js.UndefOr[typingsSlinky.fundamentalReact.fundamentalReactStrings.Menu | String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "Menu.propTypes")
  @js.native
  def propTypes: js.UndefOr[WeakValidationMapMenuProp] = js.native
  @scala.inline
  def propTypes_=(x: js.UndefOr[WeakValidationMapMenuProp]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
