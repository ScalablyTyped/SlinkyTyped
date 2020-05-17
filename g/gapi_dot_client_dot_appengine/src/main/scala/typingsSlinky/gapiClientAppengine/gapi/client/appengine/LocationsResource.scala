package typingsSlinky.gapiClientAppengine.gapi.client.appengine

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientAppengine.anon.Filter
import typingsSlinky.gapiClientAppengine.anon.LocationsId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocationsResource extends js.Object {
  /** Get information about a location. */
  def get(request: LocationsId): Request[Location] = js.native
  /** Lists information about the supported locations for this service. */
  def list(request: Filter): Request[ListLocationsResponse] = js.native
}

object LocationsResource {
  @scala.inline
  def apply(get: LocationsId => Request[Location], list: Filter => Request[ListLocationsResponse]): LocationsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[LocationsResource]
  }
  @scala.inline
  implicit class LocationsResourceOps[Self <: LocationsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: LocationsId => Request[Location]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
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

