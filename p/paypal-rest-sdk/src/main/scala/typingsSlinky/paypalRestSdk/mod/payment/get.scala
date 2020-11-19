package typingsSlinky.paypalRestSdk.mod.payment

import typingsSlinky.node.httpMod.RequestOptions
import typingsSlinky.paypalRestSdk.mod.CallbackFunction
import typingsSlinky.paypalRestSdk.mod.PaymentResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("paypal-rest-sdk", "payment.get")
@js.native
object get extends js.Object {
  
  def apply(id: String, config: RequestOptions): Unit = js.native
  def apply(id: String, config: RequestOptions, cb: CallbackFunction[PaymentResponse]): Unit = js.native
  def apply(id: String, config: CallbackFunction[PaymentResponse]): Unit = js.native
  def apply(id: String, config: CallbackFunction[PaymentResponse], cb: CallbackFunction[PaymentResponse]): Unit = js.native
}
