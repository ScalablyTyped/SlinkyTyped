package typingsSlinky.googleapis.v14Mod.adexchangebuyerV14

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaDeliveryControl extends js.Object {
  
  var creativeBlockingLevel: js.UndefOr[String] = js.native
  
  var deliveryRateType: js.UndefOr[String] = js.native
  
  var frequencyCaps: js.UndefOr[js.Array[SchemaDeliveryControlFrequencyCap]] = js.native
}
object SchemaDeliveryControl {
  
  @scala.inline
  def apply(): SchemaDeliveryControl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeliveryControl]
  }
  
  @scala.inline
  implicit class SchemaDeliveryControlOps[Self <: SchemaDeliveryControl] (val x: Self) extends AnyVal {
    
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
    def setCreativeBlockingLevel(value: String): Self = this.set("creativeBlockingLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreativeBlockingLevel: Self = this.set("creativeBlockingLevel", js.undefined)
    
    @scala.inline
    def setDeliveryRateType(value: String): Self = this.set("deliveryRateType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeliveryRateType: Self = this.set("deliveryRateType", js.undefined)
    
    @scala.inline
    def setFrequencyCapsVarargs(value: SchemaDeliveryControlFrequencyCap*): Self = this.set("frequencyCaps", js.Array(value :_*))
    
    @scala.inline
    def setFrequencyCaps(value: js.Array[SchemaDeliveryControlFrequencyCap]): Self = this.set("frequencyCaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrequencyCaps: Self = this.set("frequencyCaps", js.undefined)
  }
}
