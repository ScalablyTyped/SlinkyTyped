package typingsSlinky.navermaps.anon

import typingsSlinky.navermaps.naver.maps.Service.AddressItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Items extends js.Object {
  
  var items: js.Array[AddressItem] = js.native
  
  var total: Double = js.native
  
  var userquery: js.Any = js.native
}
object Items {
  
  @scala.inline
  def apply(items: js.Array[AddressItem], total: Double, userquery: js.Any): Items = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], userquery = userquery.asInstanceOf[js.Any])
    __obj.asInstanceOf[Items]
  }
  
  @scala.inline
  implicit class ItemsOps[Self <: Items] (val x: Self) extends AnyVal {
    
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
    def setItemsVarargs(value: AddressItem*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[AddressItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal(value: Double): Self = this.set("total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserquery(value: js.Any): Self = this.set("userquery", value.asInstanceOf[js.Any])
  }
}
