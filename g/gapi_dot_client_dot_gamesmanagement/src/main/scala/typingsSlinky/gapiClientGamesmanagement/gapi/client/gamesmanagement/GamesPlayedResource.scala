package typingsSlinky.gapiClientGamesmanagement.gapi.client.gamesmanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GamesPlayedResource extends js.Object {
  /** True if the player was auto-matched with the currently authenticated user. */
  var autoMatched: js.UndefOr[Boolean] = js.native
  /** The last time the player played the game in milliseconds since the epoch in UTC. */
  var timeMillis: js.UndefOr[String] = js.native
}

object GamesPlayedResource {
  @scala.inline
  def apply(): GamesPlayedResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GamesPlayedResource]
  }
  @scala.inline
  implicit class GamesPlayedResourceOps[Self <: GamesPlayedResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoMatched(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoMatched")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoMatched: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoMatched")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeMillis(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeMillis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeMillis")(js.undefined)
        ret
    }
  }
  
}

