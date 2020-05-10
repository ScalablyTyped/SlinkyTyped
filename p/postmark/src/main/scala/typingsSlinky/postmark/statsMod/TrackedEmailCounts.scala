package typingsSlinky.postmark.statsMod

import typingsSlinky.postmark.AnonTracked
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrackedEmailCounts extends js.Object {
  var Days: js.Array[AnonTracked] = js.native
  var Tracked: Double = js.native
}

object TrackedEmailCounts {
  @scala.inline
  def apply(Days: js.Array[AnonTracked], Tracked: Double): TrackedEmailCounts = {
    val __obj = js.Dynamic.literal(Days = Days.asInstanceOf[js.Any], Tracked = Tracked.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrackedEmailCounts]
  }
  @scala.inline
  implicit class TrackedEmailCountsOps[Self <: TrackedEmailCounts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDays(value: js.Array[AnonTracked]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Days")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTracked(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tracked")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

