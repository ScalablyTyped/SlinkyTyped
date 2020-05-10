package typingsSlinky.screeps

import typingsSlinky.screeps.screepsNumbers.`0.5`
import typingsSlinky.screeps.screepsNumbers.`0.6`
import typingsSlinky.screeps.screepsNumbers.`0.7`
import typingsSlinky.screeps.screepsNumbers.`0.8`
import typingsSlinky.screeps.screepsNumbers.`0.9`
import typingsSlinky.screeps.screepsNumbers.`0`
import typingsSlinky.screeps.screepsNumbers.`10`
import typingsSlinky.screeps.screepsNumbers.`14`
import typingsSlinky.screeps.screepsNumbers.`22`
import typingsSlinky.screeps.screepsNumbers.`2`
import typingsSlinky.screeps.screepsNumbers.`50`
import typingsSlinky.screeps.screepsNumbers.`5`
import typingsSlinky.screeps.screepsNumbers.`7`
import typingsSlinky.screeps.screepsStrings.operator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDurationEffect extends js.Object {
  var className: operator = js.native
  var cooldown: `0` = js.native
  var duration: `5` = js.native
  var effect: js.Tuple5[`0.9`, `0.8`, `0.7`, `0.6`, `0.5`] = js.native
  var level: js.Tuple5[`0`, `2`, `7`, `14`, `22`] = js.native
  var ops: `10` = js.native
  var range: `50` = js.native
}

object AnonDurationEffect {
  @scala.inline
  def apply(
    className: operator,
    cooldown: `0`,
    duration: `5`,
    effect: js.Tuple5[`0.9`, `0.8`, `0.7`, `0.6`, `0.5`],
    level: js.Tuple5[`0`, `2`, `7`, `14`, `22`],
    ops: `10`,
    range: `50`
  ): AnonDurationEffect = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], cooldown = cooldown.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], effect = effect.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], ops = ops.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDurationEffect]
  }
  @scala.inline
  implicit class AnonDurationEffectOps[Self <: AnonDurationEffect] (val x: Self) extends AnyVal {
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
    def withCooldown(value: `0`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cooldown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDuration(value: `5`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEffect(value: js.Tuple5[`0.9`, `0.8`, `0.7`, `0.6`, `0.5`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLevel(value: js.Tuple5[`0`, `2`, `7`, `14`, `22`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOps(value: `10`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ops")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRange(value: `50`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

