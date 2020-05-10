package typingsSlinky.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AgentOperatorInfo extends js.Object {
  var categoryName: String = js.native
  var emailAddress: String = js.native
  var enabled: Boolean = js.native
  var id: Double = js.native
  var lastEmailDate: String = js.native
  var lastNetSendDate: String = js.native
  var lastPagerDate: String = js.native
  var name: String = js.native
  var netSendAddress: String = js.native
  var pagerAddress: String = js.native
  var pagerDays: WeekDays = js.native
  var saturdayPagerEndTime: String = js.native
  var saturdayPagerStartTime: String = js.native
  var sundayPagerEndTime: String = js.native
  var sundayPagerStartTime: String = js.native
  var weekdayPagerEndTime: String = js.native
  var weekdayPagerStartTime: String = js.native
}

object AgentOperatorInfo {
  @scala.inline
  def apply(
    categoryName: String,
    emailAddress: String,
    enabled: Boolean,
    id: Double,
    lastEmailDate: String,
    lastNetSendDate: String,
    lastPagerDate: String,
    name: String,
    netSendAddress: String,
    pagerAddress: String,
    pagerDays: WeekDays,
    saturdayPagerEndTime: String,
    saturdayPagerStartTime: String,
    sundayPagerEndTime: String,
    sundayPagerStartTime: String,
    weekdayPagerEndTime: String,
    weekdayPagerStartTime: String
  ): AgentOperatorInfo = {
    val __obj = js.Dynamic.literal(categoryName = categoryName.asInstanceOf[js.Any], emailAddress = emailAddress.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastEmailDate = lastEmailDate.asInstanceOf[js.Any], lastNetSendDate = lastNetSendDate.asInstanceOf[js.Any], lastPagerDate = lastPagerDate.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], netSendAddress = netSendAddress.asInstanceOf[js.Any], pagerAddress = pagerAddress.asInstanceOf[js.Any], pagerDays = pagerDays.asInstanceOf[js.Any], saturdayPagerEndTime = saturdayPagerEndTime.asInstanceOf[js.Any], saturdayPagerStartTime = saturdayPagerStartTime.asInstanceOf[js.Any], sundayPagerEndTime = sundayPagerEndTime.asInstanceOf[js.Any], sundayPagerStartTime = sundayPagerStartTime.asInstanceOf[js.Any], weekdayPagerEndTime = weekdayPagerEndTime.asInstanceOf[js.Any], weekdayPagerStartTime = weekdayPagerStartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentOperatorInfo]
  }
  @scala.inline
  implicit class AgentOperatorInfoOps[Self <: AgentOperatorInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCategoryName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categoryName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmailAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastEmailDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastEmailDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastNetSendDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastNetSendDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastPagerDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastPagerDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNetSendAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("netSendAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPagerAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagerAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPagerDays(value: WeekDays): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagerDays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSaturdayPagerEndTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saturdayPagerEndTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSaturdayPagerStartTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saturdayPagerStartTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSundayPagerEndTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sundayPagerEndTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSundayPagerStartTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sundayPagerStartTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWeekdayPagerEndTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekdayPagerEndTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWeekdayPagerStartTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekdayPagerStartTime")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

