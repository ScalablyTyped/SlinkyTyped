package typingsSlinky.antd.anon

import typingsSlinky.antd.transferListMod.RenderedItem
import typingsSlinky.antd.transferMod.TransferItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilteredItems extends js.Object {
  var filteredItems: js.Array[TransferItem] = js.native
  var filteredRenderItems: js.Array[RenderedItem] = js.native
}

object FilteredItems {
  @scala.inline
  def apply(filteredItems: js.Array[TransferItem], filteredRenderItems: js.Array[RenderedItem]): FilteredItems = {
    val __obj = js.Dynamic.literal(filteredItems = filteredItems.asInstanceOf[js.Any], filteredRenderItems = filteredRenderItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilteredItems]
  }
  @scala.inline
  implicit class FilteredItemsOps[Self <: FilteredItems] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilteredItems(value: js.Array[TransferItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filteredItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilteredRenderItems(value: js.Array[RenderedItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filteredRenderItems")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

