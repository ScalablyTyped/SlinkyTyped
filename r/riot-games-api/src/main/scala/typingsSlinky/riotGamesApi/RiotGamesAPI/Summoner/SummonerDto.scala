package typingsSlinky.riotGamesApi.RiotGamesAPI.Summoner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SummonerDto extends js.Object {
  var id: Double = js.native
  var name: String = js.native
  var profileIconId: Double = js.native
  var revisionDate: Double = js.native
  var summonerLevel: Double = js.native
}

object SummonerDto {
  @scala.inline
  def apply(id: Double, name: String, profileIconId: Double, revisionDate: Double, summonerLevel: Double): SummonerDto = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], profileIconId = profileIconId.asInstanceOf[js.Any], revisionDate = revisionDate.asInstanceOf[js.Any], summonerLevel = summonerLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[SummonerDto]
  }
  @scala.inline
  implicit class SummonerDtoOps[Self <: SummonerDto] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProfileIconId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileIconId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRevisionDate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revisionDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSummonerLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summonerLevel")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

