package typingsSlinky.gapiClientYoutube.gapi.client.youtube

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientYoutube.AnonAlt
import typingsSlinky.gapiClientYoutube.AnonLiveChatId
import typingsSlinky.gapiClientYoutube.AnonQuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiveChatMessagesResource extends js.Object {
  /** Deletes a chat message. */
  def delete(request: AnonQuotaUser): Request_[Unit] = js.native
  /** Adds a message to a live chat. */
  def insert(request: AnonAlt): Request_[LiveChatMessage] = js.native
  /** Lists live chat messages for a specific chat. */
  def list(request: AnonLiveChatId): Request_[LiveChatMessageListResponse] = js.native
}

object LiveChatMessagesResource {
  @scala.inline
  def apply(
    delete: AnonQuotaUser => Request_[Unit],
    insert: AnonAlt => Request_[LiveChatMessage],
    list: AnonLiveChatId => Request_[LiveChatMessageListResponse]
  ): LiveChatMessagesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[LiveChatMessagesResource]
  }
  @scala.inline
  implicit class LiveChatMessagesResourceOps[Self <: LiveChatMessagesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: AnonQuotaUser => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonAlt => Request_[LiveChatMessage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonLiveChatId => Request_[LiveChatMessageListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

