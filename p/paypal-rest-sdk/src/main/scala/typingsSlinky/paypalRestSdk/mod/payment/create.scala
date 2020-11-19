package typingsSlinky.paypalRestSdk.mod.payment

import typingsSlinky.node.httpMod.RequestOptions
import typingsSlinky.paypalRestSdk.mod.CallbackFunction
import typingsSlinky.paypalRestSdk.mod.PaymentResponse
import typingsSlinky.paypalRestSdk.mod.Payment_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("paypal-rest-sdk", "payment.create")
@js.native
object create extends js.Object {
  
  def apply(data: Payment_, config: RequestOptions): Unit = js.native
  def apply(data: Payment_, config: RequestOptions, cb: CallbackFunction[PaymentResponse]): Unit = js.native
  def apply(data: Payment_, config: CallbackFunction[PaymentResponse]): Unit = js.native
  def apply(data: Payment_, config: CallbackFunction[PaymentResponse], cb: CallbackFunction[PaymentResponse]): Unit = js.native
}
