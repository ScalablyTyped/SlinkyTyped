package typingsSlinky.gapiClientGames.gapi.client.games

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientGames.AnonPageToken
import typingsSlinky.gapiClientGames.AnonQuestId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QuestsResource extends js.Object {
  /** Indicates that the currently authorized user will participate in the quest. */
  def accept(request: AnonQuestId): Request_[Quest] = js.native
  /** Get a list of quests for your application and the currently authenticated player. */
  def list(request: AnonPageToken): Request_[QuestListResponse] = js.native
}

object QuestsResource {
  @scala.inline
  def apply(accept: AnonQuestId => Request_[Quest], list: AnonPageToken => Request_[QuestListResponse]): QuestsResource = {
    val __obj = js.Dynamic.literal(accept = js.Any.fromFunction1(accept), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[QuestsResource]
  }
  @scala.inline
  implicit class QuestsResourceOps[Self <: QuestsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccept(value: AnonQuestId => Request_[Quest]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accept")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonPageToken => Request_[QuestListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

