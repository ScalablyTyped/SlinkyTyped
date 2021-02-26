package typingsSlinky.maximMazurokGapiClientYoutube.gapi.client.youtube

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientYoutube.anon.Filter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SponsorsResource extends StObject {
  
  /** Retrieves a list of sponsors that match the request criteria for a channel. */
  def list(): Request[SponsorListResponse] = js.native
  def list(request: Filter): Request[SponsorListResponse] = js.native
}
