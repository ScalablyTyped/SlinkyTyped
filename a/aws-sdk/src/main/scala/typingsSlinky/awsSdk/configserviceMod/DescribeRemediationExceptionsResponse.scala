package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeRemediationExceptionsResponse extends js.Object {
  /**
    * The nextToken string returned in a previous request that you use to request the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * Returns a list of remediation exception objects.
    */
  var RemediationExceptions: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.RemediationExceptions] = js.native
}

object DescribeRemediationExceptionsResponse {
  @scala.inline
  def apply(): DescribeRemediationExceptionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRemediationExceptionsResponse]
  }
  @scala.inline
  implicit class DescribeRemediationExceptionsResponseOps[Self <: DescribeRemediationExceptionsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: String): Self = {
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
    def withRemediationExceptions(value: RemediationExceptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemediationExceptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemediationExceptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemediationExceptions")(js.undefined)
        ret
    }
  }
  
}

