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

trait AnonCooldown extends js.Object {
  var className: operator
  var cooldown: `50`
  var effect: js.Tuple5[`1`, `2`, `4`, `6`, `8`]
  var level: js.Tuple5[`0`, `2`, `7`, `14`, `22`]
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
}

