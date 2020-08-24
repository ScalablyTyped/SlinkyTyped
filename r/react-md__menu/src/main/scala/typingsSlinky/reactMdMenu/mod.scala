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
import typingsSlinky.reactMdMenu.anon.MenuPropsPickMenuPropshid
import typingsSlinky.reactMdMenu.anon.MenuPropsPickMenuPropshidAbout
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@react-md/menu", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val DropdownMenu: ForwardRefExoticComponent[DropdownMenuProps with RefAttributes[HTMLButtonElement]] = js.native
  /**
    * The `DropdownMenuItem` component is used to be able to render nested dropdown menus.
    */
  val DropdownMenuItem: ForwardRefExoticComponent[DropdownMenuItemProps with RefAttributes[HTMLLIElement]] = js.native
  /**
    * The `Menu` component is a fully controlled component that will animate in and
    * out based on the `visible` prop as well as handle keyboard focus, closing
    * when needed, etc.
    */
  val Menu: ForwardRefExoticComponent[MenuPropsPickMenuPropshid | MenuPropsPickMenuPropshidAbout] = js.native
  /**
    * This component is an extension of the `Button` component that will:
    * - apply the required a11y prosp for a menu button
    * - dynamically add a dropdown icon after the button contents
    */
  val MenuButton: ForwardRefExoticComponent[MenuButtonProps with RefAttributes[HTMLButtonElement]] = js.native
  val MenuItem: ForwardRefExoticComponent[MenuItemProps with RefAttributes[HTMLLIElement]] = js.native
  val MenuItemLink: ForwardRefExoticComponent[
    (MenuItemLinkProps with RefAttributes[HTMLAnchorElement]) | (MenuItemLinkProps with ListItemLinkWithComponentProps with RefAttributes[HTMLAnchorElement])
  ] = js.native
  val MenuItemSeparator: ForwardRefExoticComponent[MenuItemSeparatorProps with RefAttributes[DividerElement]] = js.native
  def defaultMenuItemRenderer(item: ValidMenuItem, key: String): ReactElement = js.native
  def defaultMenuRenderer(hasHorizontalChildrenProps: LabelRequiredForA11y[AllInjectedMenuProps]): ReactElement = js.native
  def useContextMenu[CE /* <: HTMLElement */](): ReturnValue[CE] = js.native
  def useContextMenu[CE /* <: HTMLElement */](hasIdRefAnchorClassNamesDisableDeselect: Options): ReturnValue[CE] = js.native
}

