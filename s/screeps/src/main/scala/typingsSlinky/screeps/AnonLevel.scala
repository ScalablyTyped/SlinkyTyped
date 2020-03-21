package typingsSlinky.screeps

import typingsSlinky.screeps.screepsNumbers.`0`
import typingsSlinky.screeps.screepsNumbers.`1000000`
import typingsSlinky.screeps.screepsNumbers.`1000`
import typingsSlinky.screeps.screepsNumbers.`100`
import typingsSlinky.screeps.screepsNumbers.`14`
import typingsSlinky.screeps.screepsNumbers.`2000000`
import typingsSlinky.screeps.screepsNumbers.`22`
import typingsSlinky.screeps.screepsNumbers.`2`
import typingsSlinky.screeps.screepsNumbers.`3`
import typingsSlinky.screeps.screepsNumbers.`4000000`
import typingsSlinky.screeps.screepsNumbers.`500000`
import typingsSlinky.screeps.screepsNumbers.`7000000`
import typingsSlinky.screeps.screepsNumbers.`7`
import typingsSlinky.screeps.screepsNumbers.`800`
import typingsSlinky.screeps.screepsStrings.operator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLevel extends js.Object {
  var className: operator
  var cooldown: `800`
  var duration: `1000`
  var effect: js.Tuple5[`500000`, `1000000`, `2000000`, `4000000`, `7000000`]
  var level: js.Tuple5[`0`, `2`, `7`, `14`, `22`]
  var ops: `100`
  var range: `3`
}

object AnonLevel {
  @scala.inline
  def apply(
    className: operator,
    cooldown: `800`,
    duration: `1000`,
    effect: js.Tuple5[`500000`, `1000000`, `2000000`, `4000000`, `7000000`],
    level: js.Tuple5[`0`, `2`, `7`, `14`, `22`],
    ops: `100`,
    range: `3`
  ): AnonLevel = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], cooldown = cooldown.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], effect = effect.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], ops = ops.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLevel]
  }
}

