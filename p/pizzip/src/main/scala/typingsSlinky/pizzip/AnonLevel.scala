package typingsSlinky.pizzip

import typingsSlinky.pizzip.pizzipNumbers.`1`
import typingsSlinky.pizzip.pizzipNumbers.`2`
import typingsSlinky.pizzip.pizzipNumbers.`3`
import typingsSlinky.pizzip.pizzipNumbers.`4`
import typingsSlinky.pizzip.pizzipNumbers.`5`
import typingsSlinky.pizzip.pizzipNumbers.`6`
import typingsSlinky.pizzip.pizzipNumbers.`7`
import typingsSlinky.pizzip.pizzipNumbers.`8`
import typingsSlinky.pizzip.pizzipNumbers.`9`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLevel extends js.Object {
  var level: `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` = js.native
}

object AnonLevel {
  @scala.inline
  def apply(level: `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9`): AnonLevel = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLevel]
  }
  @scala.inline
  implicit class AnonLevelOps[Self <: AnonLevel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLevel(value: `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

