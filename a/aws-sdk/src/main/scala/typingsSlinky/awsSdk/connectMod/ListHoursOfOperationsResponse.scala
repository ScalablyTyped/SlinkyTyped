package typingsSlinky.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListHoursOfOperationsResponse extends js.Object {
  /**
    * Information about the hours of operation.
    */
  var HoursOfOperationSummaryList: js.UndefOr[typingsSlinky.awsSdk.connectMod.HoursOfOperationSummaryList] = js.native
  /**
    * If there are additional results, this is the token for the next set of results.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.connectMod.NextToken] = js.native
}

object ListHoursOfOperationsResponse {
  @scala.inline
  def apply(): ListHoursOfOperationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListHoursOfOperationsResponse]
  }
  @scala.inline
  implicit class ListHoursOfOperationsResponseOps[Self <: ListHoursOfOperationsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHoursOfOperationSummaryList(value: HoursOfOperationSummaryList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HoursOfOperationSummaryList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoursOfOperationSummaryList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HoursOfOperationSummaryList")(js.undefined)
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

