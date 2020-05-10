package typingsSlinky.screeps

import typingsSlinky.screeps.screepsNumbers.`4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRangedAttackRangedMassAttack extends js.Object {
  var rangedAttack: `4` = js.native
  var rangedMassAttack: `4` = js.native
}

object AnonRangedAttackRangedMassAttack {
  @scala.inline
  def apply(rangedAttack: `4`, rangedMassAttack: `4`): AnonRangedAttackRangedMassAttack = {
    val __obj = js.Dynamic.literal(rangedAttack = rangedAttack.asInstanceOf[js.Any], rangedMassAttack = rangedMassAttack.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRangedAttackRangedMassAttack]
  }
  @scala.inline
  implicit class AnonRangedAttackRangedMassAttackOps[Self <: AnonRangedAttackRangedMassAttack] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRangedAttack(value: `4`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangedAttack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRangedMassAttack(value: `4`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangedMassAttack")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

