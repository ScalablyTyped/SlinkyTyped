package typingsSlinky.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAvailableManagementCidrRangesRequest extends js.Object {
  /**
    * The IP address range to search. Specify an IP address range that is compatible with your network and in CIDR notation (that is, specify the range as an IPv4 CIDR block).
    */
  var ManagementCidrRangeConstraint: typingsSlinky.awsSdk.workspacesMod.ManagementCidrRangeConstraint = js.native
  /**
    * The maximum number of items to return.
    */
  var MaxResults: js.UndefOr[ManagementCidrRangeMaxResults] = js.native
  /**
    * If you received a NextToken from a previous call that was paginated, provide this token to receive the next set of results.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
}

object ListAvailableManagementCidrRangesRequest {
  @scala.inline
  def apply(ManagementCidrRangeConstraint: ManagementCidrRangeConstraint): ListAvailableManagementCidrRangesRequest = {
    val __obj = js.Dynamic.literal(ManagementCidrRangeConstraint = ManagementCidrRangeConstraint.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAvailableManagementCidrRangesRequest]
  }
  @scala.inline
  implicit class ListAvailableManagementCidrRangesRequestOps[Self <: ListAvailableManagementCidrRangesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withManagementCidrRangeConstraint(value: ManagementCidrRangeConstraint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ManagementCidrRangeConstraint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxResults(value: ManagementCidrRangeMaxResults): Self = {
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
    def withNextToken(value: PaginationToken): Self = {
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

