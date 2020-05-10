package typingsSlinky.screeps

import typingsSlinky.screeps.screepsNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRangedHeal extends js.Object {
  var heal: `3` = js.native
  var rangedHeal: `3` = js.native
}

object AnonRangedHeal {
  @scala.inline
  def apply(heal: `3`, rangedHeal: `3`): AnonRangedHeal = {
    val __obj = js.Dynamic.literal(heal = heal.asInstanceOf[js.Any], rangedHeal = rangedHeal.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRangedHeal]
  }
  @scala.inline
  implicit class AnonRangedHealOps[Self <: AnonRangedHeal] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeal(value: `3`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRangedHeal(value: `3`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangedHeal")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

