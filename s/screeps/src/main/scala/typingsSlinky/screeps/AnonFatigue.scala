package typingsSlinky.screeps

import typingsSlinky.screeps.screepsNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFatigue extends js.Object {
  var fatigue: `2` = js.native
}

object AnonFatigue {
  @scala.inline
  def apply(fatigue: `2`): AnonFatigue = {
    val __obj = js.Dynamic.literal(fatigue = fatigue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFatigue]
  }
  @scala.inline
  implicit class AnonFatigueOps[Self <: AnonFatigue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFatigue(value: `2`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fatigue")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

