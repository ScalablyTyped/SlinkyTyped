package typingsSlinky.paypalDashRestDashSdk.paypalDashRestDashSdkMod.invoice

import typingsSlinky.node.httpMod.RequestOptions
import typingsSlinky.paypalDashRestDashSdk.paypalDashRestDashSdkMod.CallbackFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("paypal-rest-sdk", "invoice.recordRefund")
@js.native
object recordRefund extends js.Object {
  def apply(
    id: String,
    data: typingsSlinky.paypalDashRestDashSdk.paypalDashRestDashSdkMod.invoice.RefundRequest,
    config: RequestOptions
  ): Unit = js.native
  def apply(
    id: String,
    data: typingsSlinky.paypalDashRestDashSdk.paypalDashRestDashSdkMod.invoice.RefundRequest,
    config: RequestOptions,
    cb: CallbackFunction[Null]
  ): Unit = js.native
  def apply(
    id: String,
    data: typingsSlinky.paypalDashRestDashSdk.paypalDashRestDashSdkMod.invoice.RefundRequest,
    config: CallbackFunction[Null]
  ): Unit = js.native
  def apply(
    id: String,
    data: typingsSlinky.paypalDashRestDashSdk.paypalDashRestDashSdkMod.invoice.RefundRequest,
    config: CallbackFunction[Null],
    cb: CallbackFunction[Null]
  ): Unit = js.native
}

