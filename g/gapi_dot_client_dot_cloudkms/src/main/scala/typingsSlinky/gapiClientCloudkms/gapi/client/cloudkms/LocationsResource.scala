package typingsSlinky.gapiClientCloudkms.gapi.client.cloudkms

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientCloudkms.AnonAlt
import typingsSlinky.gapiClientCloudkms.AnonFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationsResource extends js.Object {
  var keyRings: KeyRingsResource
  /** Get information about a location. */
  def get(request: AnonAlt): Request_[Location]
  /** Lists information about the supported locations for this service. */
  def list(request: AnonFilter): Request_[ListLocationsResponse]
}

object LocationsResource {
  @scala.inline
  def apply(
    get: AnonAlt => Request_[Location],
    keyRings: KeyRingsResource,
    list: AnonFilter => Request_[ListLocationsResponse]
  ): LocationsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), keyRings = keyRings.asInstanceOf[js.Any], list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[LocationsResource]
  }
}

