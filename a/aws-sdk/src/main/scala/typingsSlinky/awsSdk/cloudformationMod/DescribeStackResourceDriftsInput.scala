package typingsSlinky.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeStackResourceDriftsInput extends js.Object {
  /**
    * The maximum number of results to be returned with a single call. If the number of available results exceeds this maximum, the response includes a NextToken value that you can assign to the NextToken request parameter to get the next set of results.
    */
  var MaxResults: js.UndefOr[BoxedMaxResults] = js.native
  /**
    * A string that identifies the next page of stack resource drift results.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.NextToken] = js.native
  /**
    * The name of the stack for which you want drift information.
    */
  var StackName: StackNameOrId = js.native
  /**
    * The resource drift status values to use as filters for the resource drift results returned.    DELETED: The resource differs from its expected template configuration in that the resource has been deleted.    MODIFIED: One or more resource properties differ from their expected template values.    IN_SYNC: The resources's actual configuration matches its expected template configuration.    NOT_CHECKED: AWS CloudFormation does not currently return this value.  
    */
  var StackResourceDriftStatusFilters: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.StackResourceDriftStatusFilters] = js.native
}

object DescribeStackResourceDriftsInput {
  @scala.inline
  def apply(StackName: StackNameOrId): DescribeStackResourceDriftsInput = {
    val __obj = js.Dynamic.literal(StackName = StackName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStackResourceDriftsInput]
  }
  @scala.inline
  implicit class DescribeStackResourceDriftsInputOps[Self <: DescribeStackResourceDriftsInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStackName(value: StackNameOrId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxResults(value: BoxedMaxResults): Self = {
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
    @scala.inline
    def withStackResourceDriftStatusFilters(value: StackResourceDriftStatusFilters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackResourceDriftStatusFilters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackResourceDriftStatusFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackResourceDriftStatusFilters")(js.undefined)
        ret
    }
  }
  
}

