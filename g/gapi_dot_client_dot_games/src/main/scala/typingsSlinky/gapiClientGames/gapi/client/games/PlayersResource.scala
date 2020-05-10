package typingsSlinky.gapiClientGames.gapi.client.games

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientGames.AnonMaxResults
import typingsSlinky.gapiClientGames.AnonPlayerId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlayersResource extends js.Object {
  /** Retrieves the Player resource with the given ID. To retrieve the player for the currently authenticated user, set playerId to me. */
  def get(request: AnonPlayerId): Request_[Player] = js.native
  /** Get the collection of players for the currently authenticated user. */
  def list(request: AnonMaxResults): Request_[PlayerListResponse] = js.native
}

object PlayersResource {
  @scala.inline
  def apply(get: AnonPlayerId => Request_[Player], list: AnonMaxResults => Request_[PlayerListResponse]): PlayersResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[PlayersResource]
  }
  @scala.inline
  implicit class PlayersResourceOps[Self <: PlayersResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: AnonPlayerId => Request_[Player]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonMaxResults => Request_[PlayerListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

