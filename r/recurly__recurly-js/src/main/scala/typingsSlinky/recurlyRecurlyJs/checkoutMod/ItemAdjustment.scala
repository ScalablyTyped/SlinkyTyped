package typingsSlinky.recurlyRecurlyJs.checkoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemAdjustment extends Adjustment {
  
  /**
    * Currency code
    */
  var currency: js.UndefOr[String] = js.native
  
  /**
    * Unique identifier. Use this value to modify an adjustment in-place.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Item code reference. If provided, the amount and tax properties will be populated from the given item. An itemCode
    * may not be used to modify an adjustment in-place.
    */
  var itemCode: String = js.native
  
  /**
    * Number of units
    */
  var quantity: Double = js.native
}
object ItemAdjustment {
  
  @scala.inline
  def apply(itemCode: String, quantity: Double): ItemAdjustment = {
    val __obj = js.Dynamic.literal(itemCode = itemCode.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemAdjustment]
  }
  
  @scala.inline
  implicit class ItemAdjustmentOps[Self <: ItemAdjustment] (val x: Self) extends AnyVal {
    
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
    def setItemCode(value: String): Self = this.set("itemCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuantity(value: Double): Self = this.set("quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrency: Self = this.set("currency", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
  }
}
