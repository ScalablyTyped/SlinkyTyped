package typingsSlinky.downshift.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DownshiftState[Item] extends js.Object {
  var highlightedIndex: Double | Null = js.native
  var inputValue: String | Null = js.native
  var isOpen: Boolean = js.native
  var selectedItem: Item | Null = js.native
}

object DownshiftState {
  @scala.inline
  def apply[Item](isOpen: Boolean): DownshiftState[Item] = {
    val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownshiftState[Item]]
  }
  @scala.inline
  implicit class DownshiftStateOps[Self[item] <: DownshiftState[item], Item] (val x: Self[Item]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Item] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Item]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Item] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Item] with Other]
    @scala.inline
    def withIsOpen(value: Boolean): Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOpen")(value.asInstanceOf[js.Any])
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
    @scala.inline
    def withInputValue(value: String): Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputValueNull: Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputValue")(null)
        ret
    }
    @scala.inline
    def withSelectedItem(value: Item): Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectedItemNull: Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedItem")(null)
        ret
    }
  }
  
}

