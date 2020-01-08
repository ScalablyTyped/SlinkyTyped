package typingsSlinky.fundamentalDashReact

import slinky.core.ReactComponentClass
import typingsSlinky.fundamentalDashReact.fundamentalDashReactStrings.Menu
import typingsSlinky.fundamentalDashReact.libMenuMenuMod.MenuGroupProps
import typingsSlinky.fundamentalDashReact.libMenuMenuMod.MenuItemProps
import typingsSlinky.fundamentalDashReact.libMenuMenuMod.MenuListProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DisplayNameGroup extends js.Object {
  var Group: ReactComponentClass[MenuGroupProps] with Anon_DisplayNameMenuGroup
  var Item: ReactComponentClass[MenuItemProps] with Anon_DisplayNameMenuItem
  var List: ReactComponentClass[MenuListProps] with Anon_DisplayNameMenuList
  var displayName: Menu
}

object Anon_DisplayNameGroup {
  @scala.inline
  def apply(
    Group: ReactComponentClass[MenuGroupProps] with Anon_DisplayNameMenuGroup,
    Item: ReactComponentClass[MenuItemProps] with Anon_DisplayNameMenuItem,
    List: ReactComponentClass[MenuListProps] with Anon_DisplayNameMenuList,
    displayName: Menu
  ): Anon_DisplayNameGroup = {
    val __obj = js.Dynamic.literal(Group = Group.asInstanceOf[js.Any], Item = Item.asInstanceOf[js.Any], List = List.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_DisplayNameGroup]
  }
}

