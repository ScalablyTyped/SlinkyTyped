package typingsSlinky.gapiClientGmail.gapi.client.gmail

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientGmail.AnonHistoryTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistoryResource extends js.Object {
  /** Lists the history of all changes to the given mailbox. History results are returned in chronological order (increasing historyId). */
  def list(request: AnonHistoryTypes): Request_[ListHistoryResponse]
}

object HistoryResource {
  @scala.inline
  def apply(list: AnonHistoryTypes => Request_[ListHistoryResponse]): HistoryResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[HistoryResource]
  }
}

