package typingsSlinky.gapiClientYoutube.gapi.client.youtube

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientYoutube.anon.Alt
import typingsSlinky.gapiClientYoutube.anon.LiveChatId
import typingsSlinky.gapiClientYoutube.anon.QuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiveChatMessagesResource extends js.Object {
  /** Deletes a chat message. */
  def delete(request: QuotaUser): Request[Unit] = js.native
  /** Adds a message to a live chat. */
  def insert(request: Alt): Request[LiveChatMessage] = js.native
  /** Lists live chat messages for a specific chat. */
  def list(request: LiveChatId): Request[LiveChatMessageListResponse] = js.native
}

object LiveChatMessagesResource {
  @scala.inline
  def apply(
    delete: QuotaUser => Request[Unit],
    insert: Alt => Request[LiveChatMessage],
    list: LiveChatId => Request[LiveChatMessageListResponse]
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
    def withDelete(value: QuotaUser => Request[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: Alt => Request[LiveChatMessage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: LiveChatId => Request[LiveChatMessageListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

