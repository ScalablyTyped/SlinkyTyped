package typingsSlinky.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAvailableManagementCidrRangesResult extends js.Object {
  /**
    * The list of available IP address ranges, specified as IPv4 CIDR blocks.
    */
  var ManagementCidrRanges: js.UndefOr[DedicatedTenancyCidrRangeList] = js.native
  /**
    * The token to use to retrieve the next set of results, or null if no more results are available.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
}

object ListAvailableManagementCidrRangesResult {
  @scala.inline
  def apply(): ListAvailableManagementCidrRangesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAvailableManagementCidrRangesResult]
  }
  @scala.inline
  implicit class ListAvailableManagementCidrRangesResultOps[Self <: ListAvailableManagementCidrRangesResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withManagementCidrRanges(value: DedicatedTenancyCidrRangeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ManagementCidrRanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManagementCidrRanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ManagementCidrRanges")(js.undefined)
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

