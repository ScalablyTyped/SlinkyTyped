package typingsSlinky.gapiClientPartners.gapi.client.partners

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientPartners.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientMessagesResource extends js.Object {
  /**
    * Logs a generic message from the client, such as
    * `Failed to render component`, `Profile page is running slow`,
    * `More than 500 users have accessed this result.`, etc.
    */
  def log(request: AnonAlt): Request_[LogMessageResponse] = js.native
}

object ClientMessagesResource {
  @scala.inline
  def apply(log: AnonAlt => Request_[LogMessageResponse]): ClientMessagesResource = {
    val __obj = js.Dynamic.literal(log = js.Any.fromFunction1(log))
    __obj.asInstanceOf[ClientMessagesResource]
  }
  @scala.inline
  implicit class ClientMessagesResourceOps[Self <: ClientMessagesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLog(value: AnonAlt => Request_[LogMessageResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

