package typingsSlinky.fundamentalDashReact

import slinky.core.ReactComponentClass
import typingsSlinky.fundamentalDashReact.fundamentalDashReactStrings.ListGroup
import typingsSlinky.fundamentalDashReact.libListGroupListGroupMod.ListGroupItemActionsProps
import typingsSlinky.fundamentalDashReact.libListGroupListGroupMod.ListGroupItemCheckboxProps
import typingsSlinky.fundamentalDashReact.libListGroupListGroupMod.ListGroupItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DisplayNameItem extends js.Object {
  var Item: ReactComponentClass[ListGroupItemProps] with Anon_DisplayNameListGroupItem
  var ItemActions: ReactComponentClass[ListGroupItemActionsProps] with Anon_DisplayNameListGroupItemActions
  var ItemCheckbox: ReactComponentClass[ListGroupItemCheckboxProps] with Anon_DisplayNameListGroupItemCheckbox
  var displayName: ListGroup
}

object Anon_DisplayNameItem {
  @scala.inline
  def apply(
    Item: ReactComponentClass[ListGroupItemProps] with Anon_DisplayNameListGroupItem,
    ItemActions: ReactComponentClass[ListGroupItemActionsProps] with Anon_DisplayNameListGroupItemActions,
    ItemCheckbox: ReactComponentClass[ListGroupItemCheckboxProps] with Anon_DisplayNameListGroupItemCheckbox,
    displayName: ListGroup
  ): Anon_DisplayNameItem = {
    val __obj = js.Dynamic.literal(Item = Item.asInstanceOf[js.Any], ItemActions = ItemActions.asInstanceOf[js.Any], ItemCheckbox = ItemCheckbox.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_DisplayNameItem]
  }
}

