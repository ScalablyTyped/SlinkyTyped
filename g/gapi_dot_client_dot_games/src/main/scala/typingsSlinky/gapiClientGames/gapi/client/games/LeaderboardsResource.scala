package typingsSlinky.gapiClientGames.gapi.client.games

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientGames.anon.Alt
import typingsSlinky.gapiClientGames.anon.LeaderboardId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeaderboardsResource extends js.Object {
  /** Retrieves the metadata of the leaderboard with the given ID. */
  def get(request: LeaderboardId): Request[Leaderboard]
  /** Lists all the leaderboard metadata for your application. */
  def list(request: Alt): Request[LeaderboardListResponse]
}

object LeaderboardsResource {
  @scala.inline
  def apply(get: LeaderboardId => Request[Leaderboard], list: Alt => Request[LeaderboardListResponse]): LeaderboardsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[LeaderboardsResource]
  }
}

