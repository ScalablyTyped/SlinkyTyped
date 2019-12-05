package typingsSlinky.gapiDotClientDotAppengine.gapi.client.appengine

import typingsSlinky.gapiDotClient.gapi.client.Request
import typingsSlinky.gapiDotClientDotAppengine.Anon_AccesstokenAltAppsIdBearertokenCallback
import typingsSlinky.gapiDotClientDotAppengine.Anon_AccesstokenAltAppsIdBearertokenCallbackFieldsKeyMigrateTraffic
import typingsSlinky.gapiDotClientDotAppengine.Anon_AccesstokenAltAppsIdBearertokenCallbackFieldsKeyOauthtokenPp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServicesResource extends js.Object {
  var versions: VersionsResource
  /** Deletes the specified service and all enclosed versions. */
  def delete(request: Anon_AccesstokenAltAppsIdBearertokenCallbackFieldsKeyOauthtokenPp): Request[Operation]
  /** Gets the current configuration of the specified service. */
  def get(request: Anon_AccesstokenAltAppsIdBearertokenCallbackFieldsKeyOauthtokenPp): Request[Service]
  /** Lists all the services in the application. */
  def list(request: Anon_AccesstokenAltAppsIdBearertokenCallback): Request[ListServicesResponse]
  /** Updates the configuration of the specified service. */
  def patch(request: Anon_AccesstokenAltAppsIdBearertokenCallbackFieldsKeyMigrateTraffic): Request[Operation]
}

object ServicesResource {
  @scala.inline
  def apply(
    delete: Anon_AccesstokenAltAppsIdBearertokenCallbackFieldsKeyOauthtokenPp => Request[Operation],
    get: Anon_AccesstokenAltAppsIdBearertokenCallbackFieldsKeyOauthtokenPp => Request[Service],
    list: Anon_AccesstokenAltAppsIdBearertokenCallback => Request[ListServicesResponse],
    patch: Anon_AccesstokenAltAppsIdBearertokenCallbackFieldsKeyMigrateTraffic => Request[Operation],
    versions: VersionsResource
  ): ServicesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), versions = versions.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ServicesResource]
  }
}

