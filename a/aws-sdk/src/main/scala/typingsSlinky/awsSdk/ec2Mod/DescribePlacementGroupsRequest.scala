package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribePlacementGroupsRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The filters.    group-name - The name of the placement group.    state - The state of the placement group (pending | available | deleting | deleted).    strategy - The strategy of the placement group (cluster | spread | partition).  
    */
  var Filters: js.UndefOr[FilterList] = js.native
  /**
    * The IDs of the placement groups.
    */
  var GroupIds: js.UndefOr[PlacementGroupIdStringList] = js.native
  /**
    * The names of the placement groups. Default: Describes all your placement groups, or only those otherwise specified.
    */
  var GroupNames: js.UndefOr[PlacementGroupStringList] = js.native
}

object DescribePlacementGroupsRequest {
  @scala.inline
  def apply(): DescribePlacementGroupsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePlacementGroupsRequest]
  }
  @scala.inline
  implicit class DescribePlacementGroupsRequestOps[Self <: DescribePlacementGroupsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDryRun(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DryRun")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDryRun: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DryRun")(js.undefined)
        ret
    }
    @scala.inline
    def withFilters(value: FilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Filters")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupIds(value: PlacementGroupIdStringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupIds")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupNames(value: PlacementGroupStringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupNames")(js.undefined)
        ret
    }
  }
  
}

