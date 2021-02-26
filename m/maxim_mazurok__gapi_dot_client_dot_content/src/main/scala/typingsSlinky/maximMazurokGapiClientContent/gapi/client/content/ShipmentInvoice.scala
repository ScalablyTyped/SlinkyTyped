package typingsSlinky.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShipmentInvoice extends StObject {
  
  /** [required] Invoice summary. */
  var invoiceSummary: js.UndefOr[InvoiceSummary] = js.native
  
  /** [required] Invoice details per line item. */
  var lineItemInvoices: js.UndefOr[js.Array[ShipmentInvoiceLineItemInvoice]] = js.native
  
  /**
    * [required] ID of the shipment group. It is assigned by the merchant in the `shipLineItems` method and is used to group multiple line items that have the same kind of shipping
    * charges.
    */
  var shipmentGroupId: js.UndefOr[String] = js.native
}
object ShipmentInvoice {
  
  @scala.inline
  def apply(): ShipmentInvoice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShipmentInvoice]
  }
  
  @scala.inline
  implicit class ShipmentInvoiceMutableBuilder[Self <: ShipmentInvoice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInvoiceSummary(value: InvoiceSummary): Self = StObject.set(x, "invoiceSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvoiceSummaryUndefined: Self = StObject.set(x, "invoiceSummary", js.undefined)
    
    @scala.inline
    def setLineItemInvoices(value: js.Array[ShipmentInvoiceLineItemInvoice]): Self = StObject.set(x, "lineItemInvoices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineItemInvoicesUndefined: Self = StObject.set(x, "lineItemInvoices", js.undefined)
    
    @scala.inline
    def setLineItemInvoicesVarargs(value: ShipmentInvoiceLineItemInvoice*): Self = StObject.set(x, "lineItemInvoices", js.Array(value :_*))
    
    @scala.inline
    def setShipmentGroupId(value: String): Self = StObject.set(x, "shipmentGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShipmentGroupIdUndefined: Self = StObject.set(x, "shipmentGroupId", js.undefined)
  }
}
