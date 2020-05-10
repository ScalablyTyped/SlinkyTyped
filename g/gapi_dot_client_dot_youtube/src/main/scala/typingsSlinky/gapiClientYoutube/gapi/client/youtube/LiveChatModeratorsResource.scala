package typingsSlinky.gapiClientYoutube.gapi.client.youtube

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientYoutube.AnonAlt
import typingsSlinky.gapiClientYoutube.AnonFieldsKey
import typingsSlinky.gapiClientYoutube.AnonQuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiveChatModeratorsResource extends js.Object {
  /** Removes a chat moderator. */
  def delete(request: AnonQuotaUser): Request_[Unit] = js.native
  /** Adds a new moderator for the chat. */
  def insert(request: AnonAlt): Request_[LiveChatModerator] = js.native
  /** Lists moderators for a live chat. */
  def list(request: AnonFieldsKey): Request_[LiveChatModeratorListResponse] = js.native
}

object LiveChatModeratorsResource {
  @scala.inline
  def apply(
    delete: AnonQuotaUser => Request_[Unit],
    insert: AnonAlt => Request_[LiveChatModerator],
    list: AnonFieldsKey => Request_[LiveChatModeratorListResponse]
  ): LiveChatModeratorsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[LiveChatModeratorsResource]
  }
  @scala.inline
  implicit class LiveChatModeratorsResourceOps[Self <: LiveChatModeratorsResource] (val x: Self) extends AnyVal {
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
    def withInsert(value: AnonAlt => Request_[LiveChatModerator]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonFieldsKey => Request_[LiveChatModeratorListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

