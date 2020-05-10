package typingsSlinky.plugapi.mod.Event

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BoothCycle extends js.Object {
  var cycle: Boolean = js.native
  var moderator: String = js.native
}

object BoothCycle {
  @scala.inline
  def apply(cycle: Boolean, moderator: String): BoothCycle = {
    val __obj = js.Dynamic.literal(cycle = cycle.asInstanceOf[js.Any], moderator = moderator.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoothCycle]
  }
  @scala.inline
  implicit class BoothCycleOps[Self <: BoothCycle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCycle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cycle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModerator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moderator")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

