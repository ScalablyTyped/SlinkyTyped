package typingsSlinky.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLHO2 extends js.Object {
  var LHO2: AnonRangedHeal = js.native
  var LO: AnonHeal = js.native
  var XLHO2: AnonHealRangedHeal = js.native
}

object AnonLHO2 {
  @scala.inline
  def apply(LHO2: AnonRangedHeal, LO: AnonHeal, XLHO2: AnonHealRangedHeal): AnonLHO2 = {
    val __obj = js.Dynamic.literal(LHO2 = LHO2.asInstanceOf[js.Any], LO = LO.asInstanceOf[js.Any], XLHO2 = XLHO2.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLHO2]
  }
  @scala.inline
  implicit class AnonLHO2Ops[Self <: AnonLHO2] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLHO2(value: AnonRangedHeal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LHO2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLO(value: AnonHeal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LO")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXLHO2(value: AnonHealRangedHeal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("XLHO2")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

