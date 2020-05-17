package typingsSlinky.postmark.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpamComplaint extends js.Object {
  var Date: String = js.native
  var SpamComplaint: Double = js.native
}

object SpamComplaint {
  @scala.inline
  def apply(Date: String, SpamComplaint: Double): SpamComplaint = {
    val __obj = js.Dynamic.literal(Date = Date.asInstanceOf[js.Any], SpamComplaint = SpamComplaint.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpamComplaint]
  }
  @scala.inline
  implicit class SpamComplaintOps[Self <: SpamComplaint] (val x: Self) extends AnyVal {
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
    def withSpamComplaint(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpamComplaint")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

