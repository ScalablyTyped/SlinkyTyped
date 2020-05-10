package typingsSlinky.gapiClientAndroidenterprise.gapi.client.androidenterprise

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientAndroidenterprise.AnonAlt
import typingsSlinky.gapiClientAndroidenterprise.AnonDeviceId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstallsResource extends js.Object {
  /** Requests to remove an app from a device. A call to get or list will still show the app as installed on the device until it is actually removed. */
  def delete(request: AnonDeviceId): Request_[Unit] = js.native
  /** Retrieves details of an installation of an app on a device. */
  def get(request: AnonDeviceId): Request_[Install] = js.native
  /** Retrieves the details of all apps installed on the specified device. */
  def list(request: AnonAlt): Request_[InstallsListResponse] = js.native
  /**
    * Requests to install the latest version of an app to a device. If the app is already installed, then it is updated to the latest version if necessary.
    * This method supports patch semantics.
    */
  def patch(request: AnonDeviceId): Request_[Install] = js.native
  /** Requests to install the latest version of an app to a device. If the app is already installed, then it is updated to the latest version if necessary. */
  def update(request: AnonDeviceId): Request_[Install] = js.native
}

object InstallsResource {
  @scala.inline
  def apply(
    delete: AnonDeviceId => Request_[Unit],
    get: AnonDeviceId => Request_[Install],
    list: AnonAlt => Request_[InstallsListResponse],
    patch: AnonDeviceId => Request_[Install],
    update: AnonDeviceId => Request_[Install]
  ): InstallsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[InstallsResource]
  }
  @scala.inline
  implicit class InstallsResourceOps[Self <: InstallsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: AnonDeviceId => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonDeviceId => Request_[Install]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonAlt => Request_[InstallsListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: AnonDeviceId => Request_[Install]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonDeviceId => Request_[Install]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

