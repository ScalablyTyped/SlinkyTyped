package typingsSlinky.gapiClientCloudfunctions.gapi.client.cloudfunctions

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientCloudfunctions.anon.Bearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationsResource extends js.Object {
  /** Lists information about the supported locations for this service. */
  def list(request: Bearertoken): Request[ListLocationsResponse]
}

object LocationsResource {
  @scala.inline
  def apply(list: Bearertoken => Request[ListLocationsResponse]): LocationsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[LocationsResource]
  }
}

