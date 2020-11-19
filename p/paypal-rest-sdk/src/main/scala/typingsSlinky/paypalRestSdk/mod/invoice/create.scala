package typingsSlinky.paypalRestSdk.mod.invoice

import typingsSlinky.node.httpMod.RequestOptions
import typingsSlinky.paypalRestSdk.mod.CallbackFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("paypal-rest-sdk", "invoice.create")
@js.native
object create extends js.Object {
  
  def apply(data: Invoice, config: RequestOptions): Unit = js.native
  def apply(data: Invoice, config: RequestOptions, cb: CallbackFunction[InvoiceResponse]): Unit = js.native
  def apply(data: Invoice, config: CallbackFunction[InvoiceResponse]): Unit = js.native
  def apply(data: Invoice, config: CallbackFunction[InvoiceResponse], cb: CallbackFunction[InvoiceResponse]): Unit = js.native
}
