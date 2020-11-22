package typingsSlinky.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientDisplayvideo.anon.GoogleAudienceId
import typingsSlinky.maximMazurokGapiClientDisplayvideo.anon.PartnerIdPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleAudiencesResource extends js.Object {
  
  /** Gets a Google audience. */
  def get(): Request[GoogleAudience] = js.native
  def get(request: GoogleAudienceId): Request[GoogleAudience] = js.native
  
  /** Lists Google audiences. The order is defined by the order_by parameter. */
  def list(): Request[ListGoogleAudiencesResponse] = js.native
  def list(request: PartnerIdPrettyPrint): Request[ListGoogleAudiencesResponse] = js.native
}
