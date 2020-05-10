package typingsSlinky.gapiClientGamesconfiguration.gapi.client.gamesconfiguration

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientGamesconfiguration.AnonAlt
import typingsSlinky.gapiClientGamesconfiguration.AnonApplicationId
import typingsSlinky.gapiClientGamesconfiguration.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LeaderboardConfigurationsResource extends js.Object {
  /** Delete the leaderboard configuration with the given ID. */
  def delete(request: AnonKey): Request_[Unit] = js.native
  /** Retrieves the metadata of the leaderboard configuration with the given ID. */
  def get(request: AnonKey): Request_[LeaderboardConfiguration] = js.native
  /** Insert a new leaderboard configuration in this application. */
  def insert(request: AnonAlt): Request_[LeaderboardConfiguration] = js.native
  /** Returns a list of the leaderboard configurations in this application. */
  def list(request: AnonApplicationId): Request_[LeaderboardConfigurationListResponse] = js.native
  /** Update the metadata of the leaderboard configuration with the given ID. This method supports patch semantics. */
  def patch(request: AnonKey): Request_[LeaderboardConfiguration] = js.native
  /** Update the metadata of the leaderboard configuration with the given ID. */
  def update(request: AnonKey): Request_[LeaderboardConfiguration] = js.native
}

object LeaderboardConfigurationsResource {
  @scala.inline
  def apply(
    delete: AnonKey => Request_[Unit],
    get: AnonKey => Request_[LeaderboardConfiguration],
    insert: AnonAlt => Request_[LeaderboardConfiguration],
    list: AnonApplicationId => Request_[LeaderboardConfigurationListResponse],
    patch: AnonKey => Request_[LeaderboardConfiguration],
    update: AnonKey => Request_[LeaderboardConfiguration]
  ): LeaderboardConfigurationsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[LeaderboardConfigurationsResource]
  }
  @scala.inline
  implicit class LeaderboardConfigurationsResourceOps[Self <: LeaderboardConfigurationsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: AnonKey => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonKey => Request_[LeaderboardConfiguration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonAlt => Request_[LeaderboardConfiguration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonApplicationId => Request_[LeaderboardConfigurationListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: AnonKey => Request_[LeaderboardConfiguration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonKey => Request_[LeaderboardConfiguration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

