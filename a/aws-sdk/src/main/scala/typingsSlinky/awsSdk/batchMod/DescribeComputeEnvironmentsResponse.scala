package typingsSlinky.awsSdk.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeComputeEnvironmentsResponse extends js.Object {
  /**
    * The list of compute environments.
    */
  var computeEnvironments: js.UndefOr[ComputeEnvironmentDetailList] = js.native
  /**
    * The nextToken value to include in a future DescribeComputeEnvironments request. When the results of a DescribeJobDefinitions request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.native
}

object DescribeComputeEnvironmentsResponse {
  @scala.inline
  def apply(): DescribeComputeEnvironmentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeComputeEnvironmentsResponse]
  }
  @scala.inline
  implicit class DescribeComputeEnvironmentsResponseOps[Self <: DescribeComputeEnvironmentsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComputeEnvironments(value: ComputeEnvironmentDetailList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computeEnvironments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComputeEnvironments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computeEnvironments")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(js.undefined)
        ret
    }
  }
  
}

