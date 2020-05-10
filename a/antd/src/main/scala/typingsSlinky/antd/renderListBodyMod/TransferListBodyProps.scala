package typingsSlinky.antd.renderListBodyMod

import typingsSlinky.antd.transferListMod.RenderedItem
import typingsSlinky.antd.transferMod.TransferItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof antd.antd/lib/transfer/list.TransferListProps, antd.antd/lib/transfer/renderListBody.OmitProp> ]: antd.antd/lib/transfer/list.TransferListProps[P]} */ @js.native
trait TransferListBodyProps extends js.Object {
  var filteredItems: js.Array[TransferItem] = js.native
  var filteredRenderItems: js.Array[RenderedItem] = js.native
  var selectedKeys: js.Array[String] = js.native
}

object TransferListBodyProps {
  @scala.inline
  def apply(
    filteredItems: js.Array[TransferItem],
    filteredRenderItems: js.Array[RenderedItem],
    selectedKeys: js.Array[String]
  ): TransferListBodyProps = {
    val __obj = js.Dynamic.literal(filteredItems = filteredItems.asInstanceOf[js.Any], filteredRenderItems = filteredRenderItems.asInstanceOf[js.Any], selectedKeys = selectedKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransferListBodyProps]
  }
  @scala.inline
  implicit class TransferListBodyPropsOps[Self <: TransferListBodyProps] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withSelectedKeys(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedKeys")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

