package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListThingGroupsRequest extends js.Object {
  /**
    * The maximum number of results to return at one time.
    */
  var maxResults: js.UndefOr[RegistryMaxResults] = js.native
  /**
    * A filter that limits the results to those with the specified name prefix.
    */
  var namePrefixFilter: js.UndefOr[ThingGroupName] = js.native
  /**
    * The token to retrieve the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * A filter that limits the results to those with the specified parent group.
    */
  var parentGroup: js.UndefOr[ThingGroupName] = js.native
  /**
    * If true, return child groups as well.
    */
  var recursive: js.UndefOr[RecursiveWithoutDefault] = js.native
}

object ListThingGroupsRequest {
  @scala.inline
  def apply(): ListThingGroupsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListThingGroupsRequest]
  }
  @scala.inline
  implicit class ListThingGroupsRequestOps[Self <: ListThingGroupsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxResults(value: RegistryMaxResults): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResults")(js.undefined)
        ret
    }
    @scala.inline
    def withNamePrefixFilter(value: ThingGroupName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namePrefixFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamePrefixFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namePrefixFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: NextToken): Self = {
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
    @scala.inline
    def withParentGroup(value: ThingGroupName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withRecursive(value: RecursiveWithoutDefault): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recursive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecursive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recursive")(js.undefined)
        ret
    }
  }
  
}

