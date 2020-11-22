package typingsSlinky.maximMazurokGapiClientContent.gapi.client.content

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientContent.anon.MerchantIdOauthtokenPrettyPrint
import typingsSlinky.maximMazurokGapiClientContent.anon.UploadType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrdertrackingsignalsResource extends js.Object {
  
  /** Creates new order tracking signal. */
  def create(request: MerchantIdOauthtokenPrettyPrint): Request[OrderTrackingSignal] = js.native
  def create(request: UploadType, body: OrderTrackingSignal): Request[OrderTrackingSignal] = js.native
}
