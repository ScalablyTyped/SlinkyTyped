package typingsSlinky.gapiDotClientDotMirror.gapi.client.mirror

import typingsSlinky.gapiDotClient.gapi.client.Request
import typingsSlinky.gapiDotClientDotMirror.Anon_Alt
import typingsSlinky.gapiDotClientDotMirror.Anon_AltFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationsResource extends js.Object {
  /** Gets a single location by ID. */
  def get(request: Anon_Alt): Request[Location]
  /** Retrieves a list of locations for the user. */
  def list(request: Anon_AltFields): Request[LocationsListResponse]
}

object LocationsResource {
  @scala.inline
  def apply(get: Anon_Alt => Request[Location], list: Anon_AltFields => Request[LocationsListResponse]): LocationsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[LocationsResource]
  }
}

