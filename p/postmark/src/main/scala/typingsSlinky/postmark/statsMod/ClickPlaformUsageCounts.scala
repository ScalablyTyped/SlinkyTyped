package typingsSlinky.postmark.statsMod

import typingsSlinky.postmark.AnonMobile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClickPlaformUsageCounts extends js.Object {
  var Days: js.Array[AnonMobile] = js.native
  var Desktop: Double = js.native
  var Mobile: Double = js.native
  var Unknown: Double = js.native
}

object ClickPlaformUsageCounts {
  @scala.inline
  def apply(Days: js.Array[AnonMobile], Desktop: Double, Mobile: Double, Unknown: Double): ClickPlaformUsageCounts = {
    val __obj = js.Dynamic.literal(Days = Days.asInstanceOf[js.Any], Desktop = Desktop.asInstanceOf[js.Any], Mobile = Mobile.asInstanceOf[js.Any], Unknown = Unknown.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClickPlaformUsageCounts]
  }
  @scala.inline
  implicit class ClickPlaformUsageCountsOps[Self <: ClickPlaformUsageCounts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDays(value: js.Array[AnonMobile]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Days")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDesktop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Desktop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMobile(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Mobile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnknown(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Unknown")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

