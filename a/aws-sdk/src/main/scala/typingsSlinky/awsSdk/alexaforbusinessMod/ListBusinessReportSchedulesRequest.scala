package typingsSlinky.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListBusinessReportSchedulesRequest extends js.Object {
  /**
    * The maximum number of schedules listed in the call.
    */
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.MaxResults] = js.native
  /**
    * The token used to list the remaining schedules from the previous API call.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.NextToken] = js.native
}

object ListBusinessReportSchedulesRequest {
  @scala.inline
  def apply(): ListBusinessReportSchedulesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBusinessReportSchedulesRequest]
  }
  @scala.inline
  implicit class ListBusinessReportSchedulesRequestOps[Self <: ListBusinessReportSchedulesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxResults(value: MaxResults): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxResults")(js.undefined)
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

