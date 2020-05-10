package typingsSlinky.screeps

import typingsSlinky.screeps.screepsNumbers.`0`
import typingsSlinky.screeps.screepsNumbers.`14`
import typingsSlinky.screeps.screepsNumbers.`1`
import typingsSlinky.screeps.screepsNumbers.`22`
import typingsSlinky.screeps.screepsNumbers.`2`
import typingsSlinky.screeps.screepsNumbers.`4`
import typingsSlinky.screeps.screepsNumbers.`50`
import typingsSlinky.screeps.screepsNumbers.`6`
import typingsSlinky.screeps.screepsNumbers.`7`
import typingsSlinky.screeps.screepsNumbers.`8`
import typingsSlinky.screeps.screepsStrings.operator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCooldown extends js.Object {
  var className: operator = js.native
  var cooldown: `50` = js.native
  var effect: js.Tuple5[`1`, `2`, `4`, `6`, `8`] = js.native
  var level: js.Tuple5[`0`, `2`, `7`, `14`, `22`] = js.native
}

object AnonCooldown {
  @scala.inline
  def apply(
    className: operator,
    cooldown: `50`,
    effect: js.Tuple5[`1`, `2`, `4`, `6`, `8`],
    level: js.Tuple5[`0`, `2`, `7`, `14`, `22`]
  ): AnonCooldown = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], cooldown = cooldown.asInstanceOf[js.Any], effect = effect.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCooldown]
  }
  @scala.inline
  implicit class AnonCooldownOps[Self <: AnonCooldown] (val x: Self) extends AnyVal {
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
    def withCooldown(value: `50`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cooldown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEffect(value: js.Tuple5[`1`, `2`, `4`, `6`, `8`]): Self = {
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
  }
  
}

