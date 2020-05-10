package typingsSlinky.downshift.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UseSelectA11yMessageOptions[Item] extends js.Object {
  var isOpen: Boolean = js.native
  var items: js.Array[Item] = js.native
  var selectedItem: Item = js.native
  def itemToString(item: Item): String = js.native
}

object UseSelectA11yMessageOptions {
  @scala.inline
  def apply[Item](isOpen: Boolean, itemToString: Item => String, items: js.Array[Item], selectedItem: Item): UseSelectA11yMessageOptions[Item] = {
    val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any], itemToString = js.Any.fromFunction1(itemToString), items = items.asInstanceOf[js.Any], selectedItem = selectedItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseSelectA11yMessageOptions[Item]]
  }
  @scala.inline
  implicit class UseSelectA11yMessageOptionsOps[Self[item] <: UseSelectA11yMessageOptions[item], Item] (val x: Self[Item]) extends AnyVal {
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
    def withItemToString(value: Item => String): Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemToString")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withItems(value: js.Array[Item]): Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
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

