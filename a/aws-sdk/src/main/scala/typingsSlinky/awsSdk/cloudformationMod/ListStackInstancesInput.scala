package typingsSlinky.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListStackInstancesInput extends js.Object {
  /**
    * The maximum number of results to be returned with a single call. If the number of available results exceeds this maximum, the response includes a NextToken value that you can assign to the NextToken request parameter to get the next set of results.
    */
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.MaxResults] = js.native
  /**
    * If the previous request didn't return all of the remaining results, the response's NextToken parameter value is set to a token. To retrieve the next set of results, call ListStackInstances again and assign that token to the request object's NextToken parameter. If there are no remaining results, the previous response object's NextToken parameter is set to null.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.NextToken] = js.native
  /**
    * The name of the AWS account that you want to list stack instances for.
    */
  var StackInstanceAccount: js.UndefOr[Account] = js.native
  /**
    * The name of the region where you want to list stack instances. 
    */
  var StackInstanceRegion: js.UndefOr[Region] = js.native
  /**
    * The name or unique ID of the stack set that you want to list stack instances for.
    */
  var StackSetName: typingsSlinky.awsSdk.cloudformationMod.StackSetName = js.native
}

object ListStackInstancesInput {
  @scala.inline
  def apply(StackSetName: StackSetName): ListStackInstancesInput = {
    val __obj = js.Dynamic.literal(StackSetName = StackSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListStackInstancesInput]
  }
  @scala.inline
  implicit class ListStackInstancesInputOps[Self <: ListStackInstancesInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStackSetName(value: StackSetName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackSetName")(value.asInstanceOf[js.Any])
        ret
    }
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
    @scala.inline
    def withStackInstanceAccount(value: Account): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackInstanceAccount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackInstanceAccount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackInstanceAccount")(js.undefined)
        ret
    }
    @scala.inline
    def withStackInstanceRegion(value: Region): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackInstanceRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackInstanceRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackInstanceRegion")(js.undefined)
        ret
    }
  }
  
}

