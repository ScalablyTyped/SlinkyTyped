package typingsSlinky.gapiClientCloudfunctions.gapi.client.cloudfunctions

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientCloudfunctions.AnonBearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocationsResource extends js.Object {
  /** Lists information about the supported locations for this service. */
  def list(request: AnonBearertoken): Request_[ListLocationsResponse] = js.native
}

object LocationsResource {
  @scala.inline
  def apply(list: AnonBearertoken => Request_[ListLocationsResponse]): LocationsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[LocationsResource]
  }
  @scala.inline
  implicit class LocationsResourceOps[Self <: LocationsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withList(value: AnonBearertoken => Request_[ListLocationsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

