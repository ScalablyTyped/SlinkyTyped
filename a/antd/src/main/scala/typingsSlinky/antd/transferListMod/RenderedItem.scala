package typingsSlinky.antd.transferListMod

import slinky.core.TagMod
import typingsSlinky.antd.transferMod.TransferItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderedItem extends js.Object {
  var item: TransferItem = js.native
  var renderedEl: TagMod[Any] = js.native
  var renderedText: String = js.native
}

object RenderedItem {
  @scala.inline
  def apply(item: TransferItem, renderedText: String): RenderedItem = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], renderedText = renderedText.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderedItem]
  }
  @scala.inline
  implicit class RenderedItemOps[Self <: RenderedItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItem(value: TransferItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderedText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderedText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderedEl(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderedEl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderedEl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderedEl")(js.undefined)
        ret
    }
  }
  
}

