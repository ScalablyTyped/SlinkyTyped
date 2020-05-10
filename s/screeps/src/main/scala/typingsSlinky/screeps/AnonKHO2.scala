package typingsSlinky.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonKHO2 extends js.Object {
  var KHO2: AnonRangedMassAttack = js.native
  var KO: AnonRangedAttack = js.native
  var XKHO2: AnonRangedAttackRangedMassAttack = js.native
}

object AnonKHO2 {
  @scala.inline
  def apply(KHO2: AnonRangedMassAttack, KO: AnonRangedAttack, XKHO2: AnonRangedAttackRangedMassAttack): AnonKHO2 = {
    val __obj = js.Dynamic.literal(KHO2 = KHO2.asInstanceOf[js.Any], KO = KO.asInstanceOf[js.Any], XKHO2 = XKHO2.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonKHO2]
  }
  @scala.inline
  implicit class AnonKHO2Ops[Self <: AnonKHO2] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKHO2(value: AnonRangedMassAttack): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KHO2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKO(value: AnonRangedAttack): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KO")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXKHO2(value: AnonRangedAttackRangedMassAttack): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("XKHO2")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

