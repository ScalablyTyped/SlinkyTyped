package typingsSlinky.paypalDashRestDashSdk.paypalDashRestDashSdkMod.notification.webhook

import typingsSlinky.node.httpMod.RequestOptions
import typingsSlinky.paypalDashRestDashSdk.paypalDashRestDashSdkMod.CallbackFunction
import typingsSlinky.paypalDashRestDashSdk.paypalDashRestDashSdkMod.UpdateRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("paypal-rest-sdk", "notification.webhook.replace")
@js.native
object replace extends js.Object {
  def apply(id: String, data: js.Array[UpdateRequest], config: RequestOptions): Unit = js.native
  def apply(id: String, data: js.Array[UpdateRequest], config: RequestOptions, cb: CallbackFunction[Webhook]): Unit = js.native
  def apply(id: String, data: js.Array[UpdateRequest], config: CallbackFunction[Webhook]): Unit = js.native
  def apply(
    id: String,
    data: js.Array[UpdateRequest],
    config: CallbackFunction[Webhook],
    cb: CallbackFunction[Webhook]
  ): Unit = js.native
}

