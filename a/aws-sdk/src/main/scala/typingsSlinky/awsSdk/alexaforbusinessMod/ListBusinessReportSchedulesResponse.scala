package typingsSlinky.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListBusinessReportSchedulesResponse extends js.Object {
  /**
    * The schedule of the reports.
    */
  var BusinessReportSchedules: js.UndefOr[BusinessReportScheduleList] = js.native
  /**
    * The token used to list the remaining schedules from the previous API call.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.NextToken] = js.native
}

object ListBusinessReportSchedulesResponse {
  @scala.inline
  def apply(): ListBusinessReportSchedulesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBusinessReportSchedulesResponse]
  }
  @scala.inline
  implicit class ListBusinessReportSchedulesResponseOps[Self <: ListBusinessReportSchedulesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBusinessReportSchedules(value: BusinessReportScheduleList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BusinessReportSchedules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBusinessReportSchedules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BusinessReportSchedules")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
  }
  
}

