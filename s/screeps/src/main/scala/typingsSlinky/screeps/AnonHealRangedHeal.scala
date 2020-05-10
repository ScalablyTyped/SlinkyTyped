package typingsSlinky.screeps

import typingsSlinky.screeps.screepsNumbers.`4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHealRangedHeal extends js.Object {
  var heal: `4` = js.native
  var rangedHeal: `4` = js.native
}

object AnonHealRangedHeal {
  @scala.inline
  def apply(heal: `4`, rangedHeal: `4`): AnonHealRangedHeal = {
    val __obj = js.Dynamic.literal(heal = heal.asInstanceOf[js.Any], rangedHeal = rangedHeal.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHealRangedHeal]
  }
  @scala.inline
  implicit class AnonHealRangedHealOps[Self <: AnonHealRangedHeal] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeal(value: `4`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRangedHeal(value: `4`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangedHeal")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

