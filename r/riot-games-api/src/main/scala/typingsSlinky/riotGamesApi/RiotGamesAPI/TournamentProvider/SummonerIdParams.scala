package typingsSlinky.riotGamesApi.RiotGamesAPI.TournamentProvider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SummonerIdParams extends js.Object {
  var participants: js.Array[Double] = js.native
}

object SummonerIdParams {
  @scala.inline
  def apply(participants: js.Array[Double]): SummonerIdParams = {
    val __obj = js.Dynamic.literal(participants = participants.asInstanceOf[js.Any])
    __obj.asInstanceOf[SummonerIdParams]
  }
  @scala.inline
  implicit class SummonerIdParamsOps[Self <: SummonerIdParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParticipants(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("participants")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

