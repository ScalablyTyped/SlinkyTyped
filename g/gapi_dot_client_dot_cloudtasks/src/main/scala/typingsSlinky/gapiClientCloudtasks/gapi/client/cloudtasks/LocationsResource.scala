package typingsSlinky.gapiClientCloudtasks.gapi.client.cloudtasks

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientCloudtasks.anon.Accesstoken
import typingsSlinky.gapiClientCloudtasks.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocationsResource extends js.Object {
  var queues: QueuesResource = js.native
  /** Get information about a location. */
  def get(request: Accesstoken): Request[Location] = js.native
  /** Lists information about the supported locations for this service. */
  def list(request: Name): Request[ListLocationsResponse] = js.native
}

object LocationsResource {
  @scala.inline
  def apply(
    get: Accesstoken => Request[Location],
    list: Name => Request[ListLocationsResponse],
    queues: QueuesResource
  ): LocationsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), queues = queues.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationsResource]
  }
  @scala.inline
  implicit class LocationsResourceOps[Self <: LocationsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: Accesstoken => Request[Location]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: Name => Request[ListLocationsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withQueues(value: QueuesResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queues")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

