package typingsSlinky.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaOrdersCustomBatchRequestEntryUpdateLineItemShippingDetails extends StObject {
  
  /**
    * Updated delivery by date, in ISO 8601 format. If not specified only ship
    * by date is updated.  Provided date should be within 1 year timeframe and
    * can not be a date in the past.
    */
  var deliverByDate: js.UndefOr[String] = js.native
  
  /**
    * The ID of the line item to set metadata. Either lineItemId or productId
    * is required.
    */
  var lineItemId: js.UndefOr[String] = js.native
  
  /**
    * The ID of the product to set metadata. This is the REST ID used in the
    * products service. Either lineItemId or productId is required.
    */
  var productId: js.UndefOr[String] = js.native
  
  /**
    * Updated ship by date, in ISO 8601 format. If not specified only deliver
    * by date is updated.  Provided date should be within 1 year timeframe and
    * can not be a date in the past.
    */
  var shipByDate: js.UndefOr[String] = js.native
}
object SchemaOrdersCustomBatchRequestEntryUpdateLineItemShippingDetails {
  
  @scala.inline
  def apply(): SchemaOrdersCustomBatchRequestEntryUpdateLineItemShippingDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrdersCustomBatchRequestEntryUpdateLineItemShippingDetails]
  }
  
  @scala.inline
  implicit class SchemaOrdersCustomBatchRequestEntryUpdateLineItemShippingDetailsMutableBuilder[Self <: SchemaOrdersCustomBatchRequestEntryUpdateLineItemShippingDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeliverByDate(value: String): Self = StObject.set(x, "deliverByDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeliverByDateUndefined: Self = StObject.set(x, "deliverByDate", js.undefined)
    
    @scala.inline
    def setLineItemId(value: String): Self = StObject.set(x, "lineItemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineItemIdUndefined: Self = StObject.set(x, "lineItemId", js.undefined)
    
    @scala.inline
    def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
    
    @scala.inline
    def setShipByDate(value: String): Self = StObject.set(x, "shipByDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShipByDateUndefined: Self = StObject.set(x, "shipByDate", js.undefined)
  }
}
