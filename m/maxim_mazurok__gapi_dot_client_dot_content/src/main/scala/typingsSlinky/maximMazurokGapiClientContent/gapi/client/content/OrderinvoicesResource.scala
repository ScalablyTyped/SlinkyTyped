package typingsSlinky.maximMazurokGapiClientContent.gapi.client.content

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientContent.anon.OauthtokenOrderId
import typingsSlinky.maximMazurokGapiClientContent.anon.OrderId
import typingsSlinky.maximMazurokGapiClientContent.anon.OrderIdPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrderinvoicesResource extends js.Object {
  
  def createchargeinvoice(request: OauthtokenOrderId, body: OrderinvoicesCreateChargeInvoiceRequest): Request[OrderinvoicesCreateChargeInvoiceResponse] = js.native
  /** Creates a charge invoice for a shipment group, and triggers a charge capture for orderinvoice enabled orders. */
  def createchargeinvoice(request: OrderId): Request[OrderinvoicesCreateChargeInvoiceResponse] = js.native
  
  def createrefundinvoice(request: OauthtokenOrderId, body: OrderinvoicesCreateRefundInvoiceRequest): Request[OrderinvoicesCreateRefundInvoiceResponse] = js.native
  /**
    * Creates a refund invoice for one or more shipment groups, and triggers a refund for orderinvoice enabled orders. This can only be used for line items that have previously been
    * charged using `createChargeInvoice`. All amounts (except for the summary) are incremental with respect to the previous invoice.
    */
  def createrefundinvoice(request: OrderIdPrettyPrint): Request[OrderinvoicesCreateRefundInvoiceResponse] = js.native
}
