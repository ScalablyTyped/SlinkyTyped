package typingsSlinky.gapiClientClouduseraccounts.gapi.client.clouduseraccounts

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientClouduseraccounts.AnonFilter
import typingsSlinky.gapiClientClouduseraccounts.AnonInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinuxResource extends js.Object {
  /** Returns a list of authorized public keys for a specific user account. */
  def getAuthorizedKeysView(request: AnonInstance): Request_[LinuxGetAuthorizedKeysViewResponse] = js.native
  /** Retrieves a list of user accounts for an instance within a specific project. */
  def getLinuxAccountViews(request: AnonFilter): Request_[LinuxGetLinuxAccountViewsResponse] = js.native
}

object LinuxResource {
  @scala.inline
  def apply(
    getAuthorizedKeysView: AnonInstance => Request_[LinuxGetAuthorizedKeysViewResponse],
    getLinuxAccountViews: AnonFilter => Request_[LinuxGetLinuxAccountViewsResponse]
  ): LinuxResource = {
    val __obj = js.Dynamic.literal(getAuthorizedKeysView = js.Any.fromFunction1(getAuthorizedKeysView), getLinuxAccountViews = js.Any.fromFunction1(getLinuxAccountViews))
    __obj.asInstanceOf[LinuxResource]
  }
  @scala.inline
  implicit class LinuxResourceOps[Self <: LinuxResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetAuthorizedKeysView(value: AnonInstance => Request_[LinuxGetAuthorizedKeysViewResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAuthorizedKeysView")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetLinuxAccountViews(value: AnonFilter => Request_[LinuxGetLinuxAccountViewsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLinuxAccountViews")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

