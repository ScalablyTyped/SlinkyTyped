package typingsSlinky.paypalRestSdk.mod.notification.webhook

import typingsSlinky.node.httpMod.RequestOptions
import typingsSlinky.paypalRestSdk.mod.CallbackFunction
import typingsSlinky.paypalRestSdk.mod.notification.EventTypesResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("paypal-rest-sdk", "notification.webhook.eventTypes")
@js.native
object eventTypes extends js.Object {
  
  def apply(id: String, config: RequestOptions): Unit = js.native
  def apply(id: String, config: RequestOptions, cb: CallbackFunction[EventTypesResponse]): Unit = js.native
  def apply(id: String, config: CallbackFunction[EventTypesResponse]): Unit = js.native
  def apply(id: String, config: CallbackFunction[EventTypesResponse], cb: CallbackFunction[EventTypesResponse]): Unit = js.native
}
