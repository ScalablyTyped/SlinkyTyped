package typingsSlinky.riotGamesApi.RiotGamesAPI.MatchList

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MatchReference extends js.Object {
  var champion: Double = js.native
  var lane: String = js.native
  var matchId: Double = js.native
  var plateformId: String = js.native
  var queue: String = js.native
  var region: String = js.native
  var role: String = js.native
  var season: String = js.native
  var timestamp: Double = js.native
}

object MatchReference {
  @scala.inline
  def apply(
    champion: Double,
    lane: String,
    matchId: Double,
    plateformId: String,
    queue: String,
    region: String,
    role: String,
    season: String,
    timestamp: Double
  ): MatchReference = {
    val __obj = js.Dynamic.literal(champion = champion.asInstanceOf[js.Any], lane = lane.asInstanceOf[js.Any], matchId = matchId.asInstanceOf[js.Any], plateformId = plateformId.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], season = season.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchReference]
  }
  @scala.inline
  implicit class MatchReferenceOps[Self <: MatchReference] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChampion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("champion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLane(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lane")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatchId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlateformId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plateformId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRole(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("season")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimestamp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

