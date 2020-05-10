package typingsSlinky.awsSdk.curMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeReportDefinitionsResponse extends js.Object {
  var NextToken: js.UndefOr[GenericString] = js.native
  /**
    * A list of AWS Cost and Usage reports owned by the account.
    */
  var ReportDefinitions: js.UndefOr[ReportDefinitionList] = js.native
}

object DescribeReportDefinitionsResponse {
  @scala.inline
  def apply(): DescribeReportDefinitionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeReportDefinitionsResponse]
  }
  @scala.inline
  implicit class DescribeReportDefinitionsResponseOps[Self <: DescribeReportDefinitionsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: GenericString): Self = {
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
    def withReportDefinitions(value: ReportDefinitionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReportDefinitions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportDefinitions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReportDefinitions")(js.undefined)
        ret
    }
  }
  
}

