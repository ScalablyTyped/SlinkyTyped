package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeConformancePackStatusResponse extends js.Object {
  /**
    * A list of ConformancePackStatusDetail objects.
    */
  var ConformancePackStatusDetails: js.UndefOr[ConformancePackStatusDetailsList] = js.native
  /**
    * The nextToken string returned in a previous request that you use to request the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.NextToken] = js.native
}

object DescribeConformancePackStatusResponse {
  @scala.inline
  def apply(): DescribeConformancePackStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeConformancePackStatusResponse]
  }
  @scala.inline
  implicit class DescribeConformancePackStatusResponseOps[Self <: DescribeConformancePackStatusResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConformancePackStatusDetails(value: ConformancePackStatusDetailsList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConformancePackStatusDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConformancePackStatusDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConformancePackStatusDetails")(js.undefined)
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

