package typingsSlinky.gapiClientPartners.gapi.client.partners

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientPartners.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientMessagesResource extends js.Object {
  /**
    * Logs a generic message from the client, such as
    * `Failed to render component`, `Profile page is running slow`,
    * `More than 500 users have accessed this result.`, etc.
    */
  def log(request: AnonAlt): Request_[LogMessageResponse]
}

object ClientMessagesResource {
  @scala.inline
  def apply(log: AnonAlt => Request_[LogMessageResponse]): ClientMessagesResource = {
    val __obj = js.Dynamic.literal(log = js.Any.fromFunction1(log))
  
    __obj.asInstanceOf[ClientMessagesResource]
  }
}

