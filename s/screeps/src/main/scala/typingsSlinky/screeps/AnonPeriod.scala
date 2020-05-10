package typingsSlinky.screeps

import typingsSlinky.screeps.screepsNumbers.`100`
import typingsSlinky.screeps.screepsNumbers.`10`
import typingsSlinky.screeps.screepsNumbers.`11`
import typingsSlinky.screeps.screepsNumbers.`12`
import typingsSlinky.screeps.screepsNumbers.`14`
import typingsSlinky.screeps.screepsNumbers.`150`
import typingsSlinky.screeps.screepsNumbers.`15`
import typingsSlinky.screeps.screepsNumbers.`200`
import typingsSlinky.screeps.screepsNumbers.`22`
import typingsSlinky.screeps.screepsNumbers.`250`
import typingsSlinky.screeps.screepsNumbers.`300`
import typingsSlinky.screeps.screepsNumbers.`3`
import typingsSlinky.screeps.screepsNumbers.`50`
import typingsSlinky.screeps.screepsStrings.operator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPeriod extends js.Object {
  var className: operator = js.native
  var cooldown: `100` = js.native
  var duration: `300` = js.native
  var effect: js.Tuple5[`50`, `100`, `150`, `200`, `250`] = js.native
  var level: js.Tuple5[`10`, `11`, `12`, `14`, `22`] = js.native
  var period: `15` = js.native
  var range: `3` = js.native
}

object AnonPeriod {
  @scala.inline
  def apply(
    className: operator,
    cooldown: `100`,
    duration: `300`,
    effect: js.Tuple5[`50`, `100`, `150`, `200`, `250`],
    level: js.Tuple5[`10`, `11`, `12`, `14`, `22`],
    period: `15`,
    range: `3`
  ): AnonPeriod = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], cooldown = cooldown.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], effect = effect.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], period = period.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPeriod]
  }
  @scala.inline
  implicit class AnonPeriodOps[Self <: AnonPeriod] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassName(value: operator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCooldown(value: `100`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cooldown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDuration(value: `300`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEffect(value: js.Tuple5[`50`, `100`, `150`, `200`, `250`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLevel(value: js.Tuple5[`10`, `11`, `12`, `14`, `22`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPeriod(value: `15`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("period")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRange(value: `3`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

