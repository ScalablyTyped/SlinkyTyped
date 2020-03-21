package typingsSlinky.gapiClientAppengine.gapi.client.appengine

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientAppengine.AnonCallback
import typingsSlinky.gapiClientAppengine.AnonMigrateTraffic
import typingsSlinky.gapiClientAppengine.AnonPp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServicesResource extends js.Object {
  var versions: VersionsResource
  /** Deletes the specified service and all enclosed versions. */
  def delete(request: AnonPp): Request_[Operation]
  /** Gets the current configuration of the specified service. */
  def get(request: AnonPp): Request_[Service]
  /** Lists all the services in the application. */
  def list(request: AnonCallback): Request_[ListServicesResponse]
  /** Updates the configuration of the specified service. */
  def patch(request: AnonMigrateTraffic): Request_[Operation]
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
}

