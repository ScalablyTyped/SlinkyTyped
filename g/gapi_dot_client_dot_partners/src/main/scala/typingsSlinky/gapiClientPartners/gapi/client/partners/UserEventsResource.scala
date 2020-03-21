package typingsSlinky.gapiClientPartners.gapi.client.partners

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientPartners.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserEventsResource extends js.Object {
  /** Logs a user event. */
  def log(request: AnonAlt): Request_[LogUserEventResponse]
}

object UserEventsResource {
  @scala.inline
  def apply(log: AnonAlt => Request_[LogUserEventResponse]): UserEventsResource = {
    val __obj = js.Dynamic.literal(log = js.Any.fromFunction1(log))
  
    __obj.asInstanceOf[UserEventsResource]
  }
}

