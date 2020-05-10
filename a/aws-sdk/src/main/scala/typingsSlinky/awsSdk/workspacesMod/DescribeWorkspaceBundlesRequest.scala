package typingsSlinky.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeWorkspaceBundlesRequest extends js.Object {
  /**
    * The identifiers of the bundles. You cannot combine this parameter with any other filter.
    */
  var BundleIds: js.UndefOr[BundleIdList] = js.native
  /**
    * The token for the next set of results. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * The owner of the bundles. You cannot combine this parameter with any other filter. Specify AMAZON to describe the bundles provided by AWS or null to describe the bundles that belong to your account.
    */
  var Owner: js.UndefOr[BundleOwner] = js.native
}

object DescribeWorkspaceBundlesRequest {
  @scala.inline
  def apply(): DescribeWorkspaceBundlesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeWorkspaceBundlesRequest]
  }
  @scala.inline
  implicit class DescribeWorkspaceBundlesRequestOps[Self <: DescribeWorkspaceBundlesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBundleIds(value: BundleIdList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BundleIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBundleIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BundleIds")(js.undefined)
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
    @scala.inline
    def withOwner(value: BundleOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Owner")(js.undefined)
        ret
    }
  }
  
}

