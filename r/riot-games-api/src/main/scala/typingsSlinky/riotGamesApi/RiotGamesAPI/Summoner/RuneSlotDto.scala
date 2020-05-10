package typingsSlinky.riotGamesApi.RiotGamesAPI.Summoner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RuneSlotDto extends js.Object {
  var runeId: Double = js.native
  var runeSlotId: Double = js.native
}

object RuneSlotDto {
  @scala.inline
  def apply(runeId: Double, runeSlotId: Double): RuneSlotDto = {
    val __obj = js.Dynamic.literal(runeId = runeId.asInstanceOf[js.Any], runeSlotId = runeSlotId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuneSlotDto]
  }
  @scala.inline
  implicit class RuneSlotDtoOps[Self <: RuneSlotDto] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRuneId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRuneSlotId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runeSlotId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

