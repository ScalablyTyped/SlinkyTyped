package typingsSlinky.screeps

import typingsSlinky.screeps.screepsNumbers.`0`
import typingsSlinky.screeps.screepsNumbers.`10`
import typingsSlinky.screeps.screepsNumbers.`14`
import typingsSlinky.screeps.screepsNumbers.`1`
import typingsSlinky.screeps.screepsNumbers.`20`
import typingsSlinky.screeps.screepsNumbers.`22`
import typingsSlinky.screeps.screepsNumbers.`2`
import typingsSlinky.screeps.screepsNumbers.`3`
import typingsSlinky.screeps.screepsNumbers.`4`
import typingsSlinky.screeps.screepsNumbers.`5`
import typingsSlinky.screeps.screepsNumbers.`7`
import typingsSlinky.screeps.screepsStrings.operator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDurationLevel extends js.Object {
  var className: operator
  var cooldown: `5`
  var duration: js.Tuple5[`1`, `2`, `3`, `4`, `5`]
  var level: js.Tuple5[`0`, `2`, `7`, `14`, `22`]
  var ops: `10`
  var range: `20`
}

object AnonDurationLevel {
  @scala.inline
  def apply(
    className: operator,
    cooldown: `5`,
    duration: js.Tuple5[`1`, `2`, `3`, `4`, `5`],
    level: js.Tuple5[`0`, `2`, `7`, `14`, `22`],
    ops: `10`,
    range: `20`
  ): AnonDurationLevel = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], cooldown = cooldown.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], ops = ops.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDurationLevel]
  }
}

