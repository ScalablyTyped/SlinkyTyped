package typingsSlinky.paypalRestSdk.mod.invoice

import typingsSlinky.node.httpMod.RequestOptions
import typingsSlinky.paypalRestSdk.mod.CallbackFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("paypal-rest-sdk", "invoice.recordRefund")
@js.native
object recordRefund extends js.Object {
  
  def apply(id: String, data: RefundRequest, config: RequestOptions): Unit = js.native
  def apply(id: String, data: RefundRequest, config: RequestOptions, cb: CallbackFunction[Null]): Unit = js.native
  def apply(id: String, data: RefundRequest, config: CallbackFunction[Null]): Unit = js.native
  def apply(id: String, data: RefundRequest, config: CallbackFunction[Null], cb: CallbackFunction[Null]): Unit = js.native
}
