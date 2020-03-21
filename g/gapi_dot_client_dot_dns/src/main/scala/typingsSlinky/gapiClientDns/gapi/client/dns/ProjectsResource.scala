package typingsSlinky.gapiClientDns.gapi.client.dns

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientDns.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsResource extends js.Object {
  /** Fetch the representation of an existing Project. */
  def get(request: AnonKey): Request_[Project]
}

object ProjectsResource {
  @scala.inline
  def apply(get: AnonKey => Request_[Project]): ProjectsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[ProjectsResource]
  }
}

