package typingsSlinky.postmark.statsMod

import typingsSlinky.postmark.AnonSpamComplaint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpamCounts extends js.Object {
  var Days: js.Array[AnonSpamComplaint] = js.native
  var SpamComplaint: Double = js.native
}

object SpamCounts {
  @scala.inline
  def apply(Days: js.Array[AnonSpamComplaint], SpamComplaint: Double): SpamCounts = {
    val __obj = js.Dynamic.literal(Days = Days.asInstanceOf[js.Any], SpamComplaint = SpamComplaint.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpamCounts]
  }
  @scala.inline
  implicit class SpamCountsOps[Self <: SpamCounts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDays(value: js.Array[AnonSpamComplaint]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Days")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpamComplaint(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpamComplaint")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

