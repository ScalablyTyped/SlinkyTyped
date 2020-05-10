package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeComplianceByResourceResponse extends js.Object {
  /**
    * Indicates whether the specified AWS resource complies with all of the AWS Config rules that evaluate it.
    */
  var ComplianceByResources: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.ComplianceByResources] = js.native
  /**
    * The string that you use in a subsequent request to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.NextToken] = js.native
}

object DescribeComplianceByResourceResponse {
  @scala.inline
  def apply(): DescribeComplianceByResourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeComplianceByResourceResponse]
  }
  @scala.inline
  implicit class DescribeComplianceByResourceResponseOps[Self <: DescribeComplianceByResourceResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComplianceByResources(value: ComplianceByResources): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComplianceByResources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComplianceByResources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComplianceByResources")(js.undefined)
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

