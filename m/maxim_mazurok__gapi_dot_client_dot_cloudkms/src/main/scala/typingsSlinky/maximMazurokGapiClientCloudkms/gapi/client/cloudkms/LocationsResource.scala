package typingsSlinky.maximMazurokGapiClientCloudkms.gapi.client.cloudkms

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientCloudkms.anon.Alt
import typingsSlinky.maximMazurokGapiClientCloudkms.anon.PageToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationsResource extends StObject {
  
  /** Gets information about a location. */
  def get(): Request[Location] = js.native
  def get(request: Alt): Request[Location] = js.native
  
  var keyRings: KeyRingsResource = js.native
  
  /** Lists information about the supported locations for this service. */
  def list(): Request[ListLocationsResponse] = js.native
  def list(request: PageToken): Request[ListLocationsResponse] = js.native
}
