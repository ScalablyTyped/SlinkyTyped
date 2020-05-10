package typingsSlinky.downshift.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait A11yStatusMessageOptions[Item] extends js.Object {
  var highlightedIndex: Double | Null = js.native
  var highlightedItem: Item = js.native
  var inputValue: String = js.native
  var isOpen: Boolean = js.native
  var previousResultCount: Double = js.native
  var resultCount: Double = js.native
  var selectedItem: Item = js.native
  def itemToString(item: Item): String = js.native
}

object A11yStatusMessageOptions {
  @scala.inline
  def apply[Item](
    highlightedItem: Item,
    inputValue: String,
    isOpen: Boolean,
    itemToString: Item => String,
    previousResultCount: Double,
    resultCount: Double,
    selectedItem: Item
  ): A11yStatusMessageOptions[Item] = {
    val __obj = js.Dynamic.literal(highlightedItem = highlightedItem.asInstanceOf[js.Any], inputValue = inputValue.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], itemToString = js.Any.fromFunction1(itemToString), previousResultCount = previousResultCount.asInstanceOf[js.Any], resultCount = resultCount.asInstanceOf[js.Any], selectedItem = selectedItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[A11yStatusMessageOptions[Item]]
  }
  @scala.inline
  implicit class A11yStatusMessageOptionsOps[Self[item] <: A11yStatusMessageOptions[item], Item] (val x: Self[Item]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Item] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Item]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Item] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Item] with Other]
    @scala.inline
    def withHighlightedItem(value: Item): Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightedItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputValue(value: String): Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsOpen(value: Boolean): Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemToString(value: Item => String): Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemToString")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPreviousResultCount(value: Double): Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousResultCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResultCount(value: Double): Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectedItem(value: Item): Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHighlightedIndex(value: Double): Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightedIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHighlightedIndexNull: Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightedIndex")(null)
        ret
    }
  }
  
}

