package typingsSlinky.postmark

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTracked extends js.Object {
  var Date: String = js.native
  var Tracked: Double = js.native
}

object AnonTracked {
  @scala.inline
  def apply(Date: String, Tracked: Double): AnonTracked = {
    val __obj = js.Dynamic.literal(Date = Date.asInstanceOf[js.Any], Tracked = Tracked.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTracked]
  }
  @scala.inline
  implicit class AnonTrackedOps[Self <: AnonTracked] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Date")(value.asInstanceOf[js.Any])
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

