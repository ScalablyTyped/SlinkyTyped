package typingsSlinky.gapiClientDrive.gapi.client.drive

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientDrive.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AboutResource extends js.Object {
  /** Gets information about the user, the user's Drive, and system capabilities. */
  def get(request: AnonAlt): Request_[About_]
}

object AboutResource {
  @scala.inline
  def apply(get: AnonAlt => Request_[About_]): AboutResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[AboutResource]
  }
}

