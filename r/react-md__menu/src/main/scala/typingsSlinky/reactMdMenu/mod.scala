package typingsSlinky.reactMdMenu

import org.scalajs.dom.raw.HTMLAnchorElement
import org.scalajs.dom.raw.HTMLButtonElement
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLLIElement
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.reactMdDivider.dividerMod.DividerElement
import typingsSlinky.reactMdList.listItemLinkMod.ListItemLinkWithComponentProps
import typingsSlinky.reactMdMenu.anon.PickBaseMenuPropshiddenvi
import typingsSlinky.reactMdMenu.anon.PickBaseMenuPropshiddenviAbout
import typingsSlinky.reactMdMenu.defaultMenuItemRendererMod.ValidMenuItem
import typingsSlinky.reactMdMenu.defaultMenuRendererMod.AllInjectedMenuProps
import typingsSlinky.reactMdMenu.dropdownMenuItemMod.DropdownMenuItemProps
import typingsSlinky.reactMdMenu.dropdownMenuMod.DropdownMenuProps
import typingsSlinky.reactMdMenu.menuButtonMod.MenuButtonProps
import typingsSlinky.reactMdMenu.menuItemLinkMod.MenuItemLinkProps
import typingsSlinky.reactMdMenu.menuItemMod.MenuItemProps
import typingsSlinky.reactMdMenu.menuItemSeparatorMod.MenuItemSeparatorProps
import typingsSlinky.reactMdMenu.useContextMenuMod.Options
import typingsSlinky.reactMdMenu.useContextMenuMod.ReturnValue
import typingsSlinky.reactMdUtils.typesTypesMod.LabelRequiredForA11y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-md/menu", "DropdownMenu")
  @js.native
  val DropdownMenu: ForwardRefExoticComponent[DropdownMenuProps with RefAttributes[HTMLButtonElement]] = js.native
  
  @JSImport("@react-md/menu", "DropdownMenuItem")
  @js.native
  val DropdownMenuItem: ForwardRefExoticComponent[DropdownMenuItemProps with RefAttributes[HTMLLIElement]] = js.native
  
  @JSImport("@react-md/menu", "Menu")
  @js.native
  val Menu: ForwardRefExoticComponent[PickBaseMenuPropshiddenvi | PickBaseMenuPropshiddenviAbout] = js.native
  
  @JSImport("@react-md/menu", "MenuButton")
  @js.native
  val MenuButton: ForwardRefExoticComponent[MenuButtonProps with RefAttributes[HTMLButtonElement]] = js.native
  
  @JSImport("@react-md/menu", "MenuItem")
  @js.native
  val MenuItem: ForwardRefExoticComponent[MenuItemProps with RefAttributes[HTMLLIElement]] = js.native
  
  @JSImport("@react-md/menu", "MenuItemLink")
  @js.native
  val MenuItemLink: ForwardRefExoticComponent[
    (MenuItemLinkProps with RefAttributes[HTMLAnchorElement]) | (MenuItemLinkProps with ListItemLinkWithComponentProps with RefAttributes[HTMLAnchorElement])
  ] = js.native
  
  @JSImport("@react-md/menu", "MenuItemSeparator")
  @js.native
  val MenuItemSeparator: ForwardRefExoticComponent[MenuItemSeparatorProps with RefAttributes[DividerElement]] = js.native
  
  @JSImport("@react-md/menu", "defaultMenuItemRenderer")
  @js.native
  def defaultMenuItemRenderer(item: ValidMenuItem, key: String): ReactElement = js.native
  
  @JSImport("@react-md/menu", "defaultMenuRenderer")
  @js.native
  def defaultMenuRenderer(hasHorizontalChildrenProps: LabelRequiredForA11y[AllInjectedMenuProps]): ReactElement = js.native
  
  @JSImport("@react-md/menu", "useContextMenu")
  @js.native
  def useContextMenu[CE /* <: HTMLElement */](): ReturnValue[CE] = js.native
  @JSImport("@react-md/menu", "useContextMenu")
  @js.native
  def useContextMenu[CE /* <: HTMLElement */](hasIdRefAnchorClassNamesDisableDeselect: Options): ReturnValue[CE] = js.native
}
