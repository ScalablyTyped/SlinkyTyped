package typingsSlinky.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientDisplayvideo.anon.FirstAndThirdPartyAudienceId
import typingsSlinky.maximMazurokGapiClientDisplayvideo.anon.PartnerIdPrettyPrint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirstAndThirdPartyAudiencesResource extends StObject {
  
  /** Gets a first and third party audience. */
  def get(): Request[FirstAndThirdPartyAudience] = js.native
  def get(request: FirstAndThirdPartyAudienceId): Request[FirstAndThirdPartyAudience] = js.native
  
  /** Lists first and third party audiences. The order is defined by the order_by parameter. */
  def list(): Request[ListFirstAndThirdPartyAudiencesResponse] = js.native
  def list(request: PartnerIdPrettyPrint): Request[ListFirstAndThirdPartyAudiencesResponse] = js.native
}
