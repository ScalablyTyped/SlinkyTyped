package typingsSlinky.gapiClientGames.gapi.client.games

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientGames.AnonAlt
import typingsSlinky.gapiClientGames.AnonLeaderboardId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LeaderboardsResource extends js.Object {
  /** Retrieves the metadata of the leaderboard with the given ID. */
  def get(request: AnonLeaderboardId): Request_[Leaderboard] = js.native
  /** Lists all the leaderboard metadata for your application. */
  def list(request: AnonAlt): Request_[LeaderboardListResponse] = js.native
}

object LeaderboardsResource {
  @scala.inline
  def apply(
    get: AnonLeaderboardId => Request_[Leaderboard],
    list: AnonAlt => Request_[LeaderboardListResponse]
  ): LeaderboardsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[LeaderboardsResource]
  }
  @scala.inline
  implicit class LeaderboardsResourceOps[Self <: LeaderboardsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: AnonLeaderboardId => Request_[Leaderboard]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonAlt => Request_[LeaderboardListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

