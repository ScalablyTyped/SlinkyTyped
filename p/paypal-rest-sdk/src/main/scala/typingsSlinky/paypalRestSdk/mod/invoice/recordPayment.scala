package typingsSlinky.paypalRestSdk.mod.invoice

import typingsSlinky.node.httpMod.RequestOptions
import typingsSlinky.paypalRestSdk.mod.CallbackFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("paypal-rest-sdk", "invoice.recordPayment")
@js.native
object recordPayment extends js.Object {
  def apply(id: String, data: PayRequest, config: RequestOptions): Unit = js.native
  def apply(id: String, data: PayRequest, config: RequestOptions, cb: CallbackFunction[Null]): Unit = js.native
  def apply(id: String, data: PayRequest, config: CallbackFunction[Null]): Unit = js.native
  def apply(id: String, data: PayRequest, config: CallbackFunction[Null], cb: CallbackFunction[Null]): Unit = js.native
}

