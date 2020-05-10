package typingsSlinky.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAmountEnergySpent extends js.Object {
  var amount: Double = js.native
  var energySpent: Double = js.native
}

object AnonAmountEnergySpent {
  @scala.inline
  def apply(amount: Double, energySpent: Double): AnonAmountEnergySpent = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], energySpent = energySpent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAmountEnergySpent]
  }
  @scala.inline
  implicit class AnonAmountEnergySpentOps[Self <: AnonAmountEnergySpent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAmount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnergySpent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("energySpent")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

