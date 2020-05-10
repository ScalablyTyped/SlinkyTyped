package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeScheduleResponse extends js.Object {
  /**
    * The next token; for use in pagination.
    */
  var NextToken: js.UndefOr[string] = js.native
  /**
    * The list of actions in the schedule.
    */
  var ScheduleActions: js.UndefOr[listOfScheduleAction] = js.native
}

object DescribeScheduleResponse {
  @scala.inline
  def apply(): DescribeScheduleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeScheduleResponse]
  }
  @scala.inline
  implicit class DescribeScheduleResponseOps[Self <: DescribeScheduleResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: string): Self = {
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
    @scala.inline
    def withScheduleActions(value: listOfScheduleAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScheduleActions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScheduleActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScheduleActions")(js.undefined)
        ret
    }
  }
  
}

