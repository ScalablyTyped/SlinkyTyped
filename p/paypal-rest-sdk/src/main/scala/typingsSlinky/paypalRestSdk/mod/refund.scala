package typingsSlinky.paypalRestSdk.mod

import typingsSlinky.node.httpMod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("paypal-rest-sdk", "refund")
@js.native
object refund extends js.Object {
  
  def get(id: String, config: RequestOptions): Unit = js.native
  def get(id: String, config: RequestOptions, cb: CallbackFunction[RefundResource]): Unit = js.native
  def get(id: String, config: CallbackFunction[RefundResource]): Unit = js.native
  def get(id: String, config: CallbackFunction[RefundResource], cb: CallbackFunction[RefundResource]): Unit = js.native
}
