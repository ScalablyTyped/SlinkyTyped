package typingsSlinky.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientAndroidpublisher.anon.EndTime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VoidedpurchasesResource extends js.Object {
  
  /** Lists the purchases that were canceled, refunded or charged-back. */
  def list(): Request[VoidedPurchasesListResponse] = js.native
  def list(request: EndTime): Request[VoidedPurchasesListResponse] = js.native
}
