package typingsSlinky.postmark.statsMod

import typingsSlinky.postmark.anon.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SentCounts extends js.Object {
  var Days: js.Array[Date] = js.native
  var Sent: Double = js.native
}

object SentCounts {
  @scala.inline
  def apply(Days: js.Array[Date], Sent: Double): SentCounts = {
    val __obj = js.Dynamic.literal(Days = Days.asInstanceOf[js.Any], Sent = Sent.asInstanceOf[js.Any])
    __obj.asInstanceOf[SentCounts]
  }
  @scala.inline
  implicit class SentCountsOps[Self <: SentCounts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDays(value: js.Array[Date]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Days")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sent")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

