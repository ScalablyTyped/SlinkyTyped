package typingsSlinky.gapiClientCloudkms.gapi.client.cloudkms

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientCloudkms.anon.Alt
import typingsSlinky.gapiClientCloudkms.anon.Filter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocationsResource extends js.Object {
  var keyRings: KeyRingsResource = js.native
  /** Get information about a location. */
  def get(request: Alt): Request[Location] = js.native
  /** Lists information about the supported locations for this service. */
  def list(request: Filter): Request[ListLocationsResponse] = js.native
}

object LocationsResource {
  @scala.inline
  def apply(
    get: Alt => Request[Location],
    keyRings: KeyRingsResource,
    list: Filter => Request[ListLocationsResponse]
  ): LocationsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), keyRings = keyRings.asInstanceOf[js.Any], list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[LocationsResource]
  }
  @scala.inline
  implicit class LocationsResourceOps[Self <: LocationsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: Alt => Request[Location]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withKeyRings(value: KeyRingsResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyRings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withList(value: Filter => Request[ListLocationsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

