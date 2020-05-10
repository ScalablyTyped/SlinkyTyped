package typingsSlinky.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateBusinessReportScheduleResponse extends js.Object {
  /**
    * The ARN of the business report schedule.
    */
  var ScheduleArn: js.UndefOr[Arn] = js.native
}

object CreateBusinessReportScheduleResponse {
  @scala.inline
  def apply(): CreateBusinessReportScheduleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateBusinessReportScheduleResponse]
  }
  @scala.inline
  implicit class CreateBusinessReportScheduleResponseOps[Self <: CreateBusinessReportScheduleResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScheduleArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScheduleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScheduleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScheduleArn")(js.undefined)
        ret
    }
  }
  
}

