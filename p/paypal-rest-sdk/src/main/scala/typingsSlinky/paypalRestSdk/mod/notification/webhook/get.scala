package typingsSlinky.paypalRestSdk.mod.notification.webhook

import typingsSlinky.node.httpMod.RequestOptions
import typingsSlinky.paypalRestSdk.mod.CallbackFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("paypal-rest-sdk", "notification.webhook.get")
@js.native
object get extends js.Object {
  
  def apply(id: String, config: RequestOptions): Unit = js.native
  def apply(id: String, config: RequestOptions, cb: CallbackFunction[Webhook]): Unit = js.native
  def apply(id: String, config: CallbackFunction[Webhook]): Unit = js.native
  def apply(id: String, config: CallbackFunction[Webhook], cb: CallbackFunction[Webhook]): Unit = js.native
}
