package typingsSlinky.downshift.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UseSelectState[Item] extends js.Object {
  var highlightedIndex: Double = js.native
  var isOpen: Boolean = js.native
  var keySoFar: String = js.native
  var selectedItem: Item = js.native
}

object UseSelectState {
  @scala.inline
  def apply[Item](highlightedIndex: Double, isOpen: Boolean, keySoFar: String, selectedItem: Item): UseSelectState[Item] = {
    val __obj = js.Dynamic.literal(highlightedIndex = highlightedIndex.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], keySoFar = keySoFar.asInstanceOf[js.Any], selectedItem = selectedItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseSelectState[Item]]
  }
  @scala.inline
  implicit class UseSelectStateOps[Self[item] <: UseSelectState[item], Item] (val x: Self[Item]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Item] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Item]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Item] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Item] with Other]
    @scala.inline
    def withHighlightedIndex(value: Double): Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightedIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsOpen(value: Boolean): Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeySoFar(value: String): Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keySoFar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectedItem(value: Item): Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedItem")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

