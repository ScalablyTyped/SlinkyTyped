package typingsSlinky.gapiClientYoutube.gapi.client.youtube

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientYoutube.anon.Alt
import typingsSlinky.gapiClientYoutube.anon.QuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiveChatBansResource extends js.Object {
  /** Removes a chat ban. */
  def delete(request: QuotaUser): Request[Unit] = js.native
  /** Adds a new ban to the chat. */
  def insert(request: Alt): Request[LiveChatBan] = js.native
}

object LiveChatBansResource {
  @scala.inline
  def apply(delete: QuotaUser => Request[Unit], insert: Alt => Request[LiveChatBan]): LiveChatBansResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert))
    __obj.asInstanceOf[LiveChatBansResource]
  }
  @scala.inline
  implicit class LiveChatBansResourceOps[Self <: LiveChatBansResource] (val x: Self) extends AnyVal {
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
    def withInsert(value: Alt => Request[LiveChatBan]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

