package typingsSlinky.gapiClientClouduseraccounts.gapi.client.clouduseraccounts

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientClouduseraccounts.AnonFilter
import typingsSlinky.gapiClientClouduseraccounts.AnonInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinuxResource extends js.Object {
  /** Returns a list of authorized public keys for a specific user account. */
  def getAuthorizedKeysView(request: AnonInstance): Request_[LinuxGetAuthorizedKeysViewResponse]
  /** Retrieves a list of user accounts for an instance within a specific project. */
  def getLinuxAccountViews(request: AnonFilter): Request_[LinuxGetLinuxAccountViewsResponse]
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
}

