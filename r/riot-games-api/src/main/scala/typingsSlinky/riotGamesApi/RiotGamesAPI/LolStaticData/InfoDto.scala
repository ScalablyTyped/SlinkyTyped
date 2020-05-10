package typingsSlinky.riotGamesApi.RiotGamesAPI.LolStaticData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InfoDto extends js.Object {
  var attack: Double = js.native
  var defense: Double = js.native
  var difficulty: Double = js.native
  var magic: Double = js.native
}

object InfoDto {
  @scala.inline
  def apply(attack: Double, defense: Double, difficulty: Double, magic: Double): InfoDto = {
    val __obj = js.Dynamic.literal(attack = attack.asInstanceOf[js.Any], defense = defense.asInstanceOf[js.Any], difficulty = difficulty.asInstanceOf[js.Any], magic = magic.asInstanceOf[js.Any])
    __obj.asInstanceOf[InfoDto]
  }
  @scala.inline
  implicit class InfoDtoOps[Self <: InfoDto] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttack(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefense(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defense")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDifficulty(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("difficulty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMagic(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("magic")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

