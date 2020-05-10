package typingsSlinky.riotGamesApi.RiotGamesAPI.FeaturedGames

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeaturedGames extends js.Object {
  var clientRefreshInterval: Double = js.native
  var gameList: js.Array[FeaturedGameInfo] = js.native
}

object FeaturedGames {
  @scala.inline
  def apply(clientRefreshInterval: Double, gameList: js.Array[FeaturedGameInfo]): FeaturedGames = {
    val __obj = js.Dynamic.literal(clientRefreshInterval = clientRefreshInterval.asInstanceOf[js.Any], gameList = gameList.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeaturedGames]
  }
  @scala.inline
  implicit class FeaturedGamesOps[Self <: typingsSlinky.riotGamesApi.RiotGamesAPI.FeaturedGames.FeaturedGames] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientRefreshInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientRefreshInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGameList(value: js.Array[FeaturedGameInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gameList")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

