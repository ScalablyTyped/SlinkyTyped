package typingsSlinky.awsSdk.resourcegroupstaggingapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetComplianceSummaryOutput extends js.Object {
  /**
    * A string that indicates that the response contains more data than can be returned in a single response. To receive additional data, specify this string for the PaginationToken value in a subsequent request.
    */
  var PaginationToken: js.UndefOr[typingsSlinky.awsSdk.resourcegroupstaggingapiMod.PaginationToken] = js.native
  /**
    * A table that shows counts of noncompliant resources.
    */
  var SummaryList: js.UndefOr[typingsSlinky.awsSdk.resourcegroupstaggingapiMod.SummaryList] = js.native
}

object GetComplianceSummaryOutput {
  @scala.inline
  def apply(): GetComplianceSummaryOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetComplianceSummaryOutput]
  }
  @scala.inline
  implicit class GetComplianceSummaryOutputOps[Self <: GetComplianceSummaryOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPaginationToken(value: PaginationToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PaginationToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaginationToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PaginationToken")(js.undefined)
        ret
    }
    @scala.inline
    def withSummaryList(value: SummaryList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SummaryList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSummaryList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SummaryList")(js.undefined)
        ret
    }
  }
  
}

