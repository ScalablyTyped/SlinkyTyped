package typingsSlinky.postmark.statsMod

import typingsSlinky.postmark.AnonClicks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClickCounts extends js.Object {
  var Clicks: Double = js.native
  var Days: js.Array[AnonClicks] = js.native
  var Unique: Double = js.native
}

object ClickCounts {
  @scala.inline
  def apply(Clicks: Double, Days: js.Array[AnonClicks], Unique: Double): ClickCounts = {
    val __obj = js.Dynamic.literal(Clicks = Clicks.asInstanceOf[js.Any], Days = Days.asInstanceOf[js.Any], Unique = Unique.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClickCounts]
  }
  @scala.inline
  implicit class ClickCountsOps[Self <: ClickCounts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClicks(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clicks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDays(value: js.Array[AnonClicks]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Days")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnique(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Unique")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

