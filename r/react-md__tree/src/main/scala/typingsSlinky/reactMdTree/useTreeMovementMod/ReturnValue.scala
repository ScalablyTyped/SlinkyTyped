package typingsSlinky.reactMdTree.useTreeMovementMod

import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticKeyboardEvent
import typingsSlinky.react.mod.FocusEventHandler
import typingsSlinky.react.mod.KeyboardEventHandler
import typingsSlinky.reactMdList.listMod.ListElement
import typingsSlinky.reactMdTree.anon.NestedTreeItemUnknownTree
import typingsSlinky.reactMdTree.typesMod.TreeItemId
import typingsSlinky.reactMdTree.useFlattenedTreeListMod.MetadataRecord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReturnValue extends js.Object {
  /**
    * The current treeitem's DOM id that is currently keyboard focused.
    */
  var activeId: String = js.native
  /**
    * A blur handler that should be passed to the tree list element that handles
    * removing the `aria-activedescendant` when the tree is no longer within
    * focus. This will also call the optional `onBlur` prop.
    */
  var handleBlur: FocusEventHandler[ListElement] = js.native
  /**
    * A focus handler that should be passed to the tree element that handles
    * conditionally setting the default `aria-activedescendant` id on first
    * focus. This will also call the optional `onFocus` prop.
    */
  var handleFocus: FocusEventHandler[ListElement] = js.native
  /**
    * The keydown handler that should be passed to the tree list element that
    * handles all the keyboard functionality and movement.
    *
    * This will also call the optional `onKeyDown` prop.
    */
  var handleKeyDown: KeyboardEventHandler[ListElement] = js.native
  /**
    * A record containing the DOM ids for each tree item along with a ref object
    * to provide to the itemRenderer for that item. This is just for a quick
    * lookup to help with all the tree traversal and keyboard movement.
    */
  var itemIdRefs: MetadataRecord = js.native
  /**
    * A nested list representation of the provided tree data. This is used for
    * rendering all the treeitem nodes.
    */
  var items: js.Array[NestedTreeItemUnknownTree] = js.native
  /**
    * A function that updates the `activeId` based on the provided `itemId`. This
    * should really only be used whenever an item is clicked with a mouse or
    * touch since the `activeId` will be updated automatically for all the other
    * flows.
    */
  def setActiveId(itemId: TreeItemId): Unit = js.native
}

object ReturnValue {
  @scala.inline
  def apply(
    activeId: String,
    handleBlur: SyntheticFocusEvent[ListElement] => Unit,
    handleFocus: SyntheticFocusEvent[ListElement] => Unit,
    handleKeyDown: SyntheticKeyboardEvent[ListElement] => Unit,
    itemIdRefs: MetadataRecord,
    items: js.Array[NestedTreeItemUnknownTree],
    setActiveId: TreeItemId => Unit
  ): ReturnValue = {
    val __obj = js.Dynamic.literal(activeId = activeId.asInstanceOf[js.Any], handleBlur = js.Any.fromFunction1(handleBlur), handleFocus = js.Any.fromFunction1(handleFocus), handleKeyDown = js.Any.fromFunction1(handleKeyDown), itemIdRefs = itemIdRefs.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], setActiveId = js.Any.fromFunction1(setActiveId))
    __obj.asInstanceOf[ReturnValue]
  }
  @scala.inline
  implicit class ReturnValueOps[Self <: ReturnValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActiveId(value: String): Self = this.set("activeId", value.asInstanceOf[js.Any])
    @scala.inline
    def setHandleBlur(value: SyntheticFocusEvent[ListElement] => Unit): Self = this.set("handleBlur", js.Any.fromFunction1(value))
    @scala.inline
    def setHandleFocus(value: SyntheticFocusEvent[ListElement] => Unit): Self = this.set("handleFocus", js.Any.fromFunction1(value))
    @scala.inline
    def setHandleKeyDown(value: SyntheticKeyboardEvent[ListElement] => Unit): Self = this.set("handleKeyDown", js.Any.fromFunction1(value))
    @scala.inline
    def setItemIdRefs(value: MetadataRecord): Self = this.set("itemIdRefs", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemsVarargs(value: NestedTreeItemUnknownTree*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[NestedTreeItemUnknownTree]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetActiveId(value: TreeItemId => Unit): Self = this.set("setActiveId", js.Any.fromFunction1(value))
  }
  
}

