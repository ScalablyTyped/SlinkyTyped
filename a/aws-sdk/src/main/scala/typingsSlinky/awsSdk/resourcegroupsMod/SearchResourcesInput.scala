package typingsSlinky.awsSdk.resourcegroupsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchResourcesInput extends js.Object {
  /**
    * The maximum number of group member ARNs returned by SearchResources in paginated output. By default, this number is 50.
    */
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.resourcegroupsMod.MaxResults] = js.native
  /**
    * The NextToken value that is returned in a paginated SearchResources request. To get the next page of results, run the call again, add the NextToken parameter, and specify the NextToken value.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.resourcegroupsMod.NextToken] = js.native
  /**
    * The search query, using the same formats that are supported for resource group definition.
    */
  var ResourceQuery: typingsSlinky.awsSdk.resourcegroupsMod.ResourceQuery = js.native
}

object SearchResourcesInput {
  @scala.inline
  def apply(ResourceQuery: ResourceQuery): SearchResourcesInput = {
    val __obj = js.Dynamic.literal(ResourceQuery = ResourceQuery.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResourcesInput]
  }
  @scala.inline
  implicit class SearchResourcesInputOps[Self <: SearchResourcesInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResourceQuery(value: ResourceQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceQuery")(value.asInstanceOf[js.Any])
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
  }
  
}

