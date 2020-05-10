package typingsSlinky.screeps

import typingsSlinky.screeps.screepsNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRangedAttack extends js.Object {
  var rangedAttack: `2` = js.native
  var rangedMassAttack: `2` = js.native
}

object AnonRangedAttack {
  @scala.inline
  def apply(rangedAttack: `2`, rangedMassAttack: `2`): AnonRangedAttack = {
    val __obj = js.Dynamic.literal(rangedAttack = rangedAttack.asInstanceOf[js.Any], rangedMassAttack = rangedMassAttack.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRangedAttack]
  }
  @scala.inline
  implicit class AnonRangedAttackOps[Self <: AnonRangedAttack] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRangedAttack(value: `2`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangedAttack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRangedMassAttack(value: `2`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangedMassAttack")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

