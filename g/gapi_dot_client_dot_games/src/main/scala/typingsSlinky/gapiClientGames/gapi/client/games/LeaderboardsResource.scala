package typingsSlinky.gapiClientGames.gapi.client.games

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientGames.AnonAlt
import typingsSlinky.gapiClientGames.AnonLeaderboardId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeaderboardsResource extends js.Object {
  /** Retrieves the metadata of the leaderboard with the given ID. */
  def get(request: AnonLeaderboardId): Request_[Leaderboard]
  /** Lists all the leaderboard metadata for your application. */
  def list(request: AnonAlt): Request_[LeaderboardListResponse]
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
}

