package typingsSlinky.gapiClientAppengine.gapi.client.appengine

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientAppengine.AnonCallback
import typingsSlinky.gapiClientAppengine.AnonMigrateTraffic
import typingsSlinky.gapiClientAppengine.AnonPp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServicesResource extends js.Object {
  var versions: VersionsResource = js.native
  /** Deletes the specified service and all enclosed versions. */
  def delete(request: AnonPp): Request_[Operation] = js.native
  /** Gets the current configuration of the specified service. */
  def get(request: AnonPp): Request_[Service] = js.native
  /** Lists all the services in the application. */
  def list(request: AnonCallback): Request_[ListServicesResponse] = js.native
  /** Updates the configuration of the specified service. */
  def patch(request: AnonMigrateTraffic): Request_[Operation] = js.native
}

object ServicesResource {
  @scala.inline
  def apply(
    delete: AnonPp => Request_[Operation],
    get: AnonPp => Request_[Service],
    list: AnonCallback => Request_[ListServicesResponse],
    patch: AnonMigrateTraffic => Request_[Operation],
    versions: VersionsResource
  ): ServicesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), versions = versions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServicesResource]
  }
  @scala.inline
  implicit class ServicesResourceOps[Self <: ServicesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: AnonPp => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonPp => Request_[Service]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonCallback => Request_[ListServicesResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: AnonMigrateTraffic => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withVersions(value: VersionsResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

