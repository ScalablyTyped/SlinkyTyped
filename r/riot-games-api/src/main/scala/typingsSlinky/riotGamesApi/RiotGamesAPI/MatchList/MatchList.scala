package typingsSlinky.riotGamesApi.RiotGamesAPI.MatchList

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MatchList extends js.Object {
  var endIndex: Double = js.native
  var matches: js.Array[MatchReference] = js.native
  var startIndex: Double = js.native
  var totalGames: Double = js.native
}

object MatchList {
  @scala.inline
  def apply(endIndex: Double, matches: js.Array[MatchReference], startIndex: Double, totalGames: Double): MatchList = {
    val __obj = js.Dynamic.literal(endIndex = endIndex.asInstanceOf[js.Any], matches = matches.asInstanceOf[js.Any], startIndex = startIndex.asInstanceOf[js.Any], totalGames = totalGames.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchList]
  }
  @scala.inline
  implicit class MatchListOps[Self <: typingsSlinky.riotGamesApi.RiotGamesAPI.MatchList.MatchList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatches(value: js.Array[MatchReference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalGames(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalGames")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

