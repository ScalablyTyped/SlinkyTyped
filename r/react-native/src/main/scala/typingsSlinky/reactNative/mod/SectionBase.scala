package typingsSlinky.reactNative.mod

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SectionBase[ItemT, SectionT] extends js.Object {
  
  var ItemSeparatorComponent: js.UndefOr[ReactComponentClass[_] | Null] = js.native
  
  var data: js.Array[ItemT] = js.native
  
  var key: js.UndefOr[String] = js.native
  
  var keyExtractor: js.UndefOr[js.Function2[/* item */ ItemT, /* index */ Double, String]] = js.native
  
  var renderItem: js.UndefOr[SectionListRenderItem[ItemT, SectionT]] = js.native
}
object SectionBase {
  
  @scala.inline
  def apply[ItemT, SectionT](data: js.Array[ItemT]): SectionBase[ItemT, SectionT] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[SectionBase[ItemT, SectionT]]
  }
  
  @scala.inline
  implicit class SectionBaseOps[Self <: SectionBase[_, _], ItemT, SectionT] (val x: Self with (SectionBase[ItemT, SectionT])) extends AnyVal {
    
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
    def setDataVarargs(value: ItemT*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Array[ItemT]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemSeparatorComponentFunctionComponent(value: ReactComponentClass[_]): Self = this.set("ItemSeparatorComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemSeparatorComponentComponentClass(value: ReactComponentClass[_]): Self = this.set("ItemSeparatorComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemSeparatorComponent(value: ReactComponentClass[_]): Self = this.set("ItemSeparatorComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemSeparatorComponent: Self = this.set("ItemSeparatorComponent", js.undefined)
    
    @scala.inline
    def setItemSeparatorComponentNull: Self = this.set("ItemSeparatorComponent", null)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setKeyExtractor(value: (/* item */ ItemT, /* index */ Double) => String): Self = this.set("keyExtractor", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteKeyExtractor: Self = this.set("keyExtractor", js.undefined)
    
    @scala.inline
    def setRenderItem(value: /* info */ SectionListRenderItemInfo[ItemT, SectionT] => ReactElement | Null): Self = this.set("renderItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRenderItem: Self = this.set("renderItem", js.undefined)
  }
}
