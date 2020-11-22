package typingsSlinky.antd.listBodyMod

import typingsSlinky.antd.transferListMod.RenderedItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof antd.antd/lib/transfer/list.TransferListProps<RecordType>, antd.antd/lib/transfer/ListBody.OmitProp> ]: antd.antd/lib/transfer/list.TransferListProps<RecordType>[P]} */ @js.native
trait TransferListBodyProps[RecordType] extends js.Object {
  
  var filteredItems: js.Array[RecordType] = js.native
  
  var filteredRenderItems: js.Array[RenderedItem[RecordType]] = js.native
  
  var selectedKeys: js.Array[String] = js.native
}
object TransferListBodyProps {
  
  @scala.inline
  def apply[RecordType](
    filteredItems: js.Array[RecordType],
    filteredRenderItems: js.Array[RenderedItem[RecordType]],
    selectedKeys: js.Array[String]
  ): TransferListBodyProps[RecordType] = {
    val __obj = js.Dynamic.literal(filteredItems = filteredItems.asInstanceOf[js.Any], filteredRenderItems = filteredRenderItems.asInstanceOf[js.Any], selectedKeys = selectedKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransferListBodyProps[RecordType]]
  }
  
  @scala.inline
  implicit class TransferListBodyPropsOps[Self <: TransferListBodyProps[_], RecordType] (val x: Self with TransferListBodyProps[RecordType]) extends AnyVal {
    
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
    def setFilteredItemsVarargs(value: RecordType*): Self = this.set("filteredItems", js.Array(value :_*))
    
    @scala.inline
    def setFilteredItems(value: js.Array[RecordType]): Self = this.set("filteredItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilteredRenderItemsVarargs(value: RenderedItem[RecordType]*): Self = this.set("filteredRenderItems", js.Array(value :_*))
    
    @scala.inline
    def setFilteredRenderItems(value: js.Array[RenderedItem[RecordType]]): Self = this.set("filteredRenderItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedKeysVarargs(value: String*): Self = this.set("selectedKeys", js.Array(value :_*))
    
    @scala.inline
    def setSelectedKeys(value: js.Array[String]): Self = this.set("selectedKeys", value.asInstanceOf[js.Any])
  }
}
