package typingsSlinky.awsSdk.migrationhubconfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeHomeRegionControlsRequest extends js.Object {
  /**
    * The ControlID is a unique identifier string of your HomeRegionControl object.
    */
  var ControlId: js.UndefOr[typingsSlinky.awsSdk.migrationhubconfigMod.ControlId] = js.native
  /**
    * The name of the home region you'd like to view.
    */
  var HomeRegion: js.UndefOr[typingsSlinky.awsSdk.migrationhubconfigMod.HomeRegion] = js.native
  /**
    * The maximum number of filtering results to display per page. 
    */
  var MaxResults: js.UndefOr[DescribeHomeRegionControlsMaxResults] = js.native
  /**
    * If a NextToken was returned by a previous call, more results are available. To retrieve the next page of results, make the call again using the returned token in NextToken.
    */
  var NextToken: js.UndefOr[Token] = js.native
  /**
    * The target parameter specifies the identifier to which the home region is applied, which is always of type ACCOUNT. It applies the home region to the current ACCOUNT.
    */
  var Target: js.UndefOr[typingsSlinky.awsSdk.migrationhubconfigMod.Target] = js.native
}

object DescribeHomeRegionControlsRequest {
  @scala.inline
  def apply(): DescribeHomeRegionControlsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeHomeRegionControlsRequest]
  }
  @scala.inline
  implicit class DescribeHomeRegionControlsRequestOps[Self <: DescribeHomeRegionControlsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withControlId(value: ControlId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ControlId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControlId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ControlId")(js.undefined)
        ret
    }
    @scala.inline
    def withHomeRegion(value: HomeRegion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HomeRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHomeRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HomeRegion")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxResults(value: DescribeHomeRegionControlsMaxResults): Self = {
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
    def withNextToken(value: Token): Self = {
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
    def withTarget(value: Target): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Target")(js.undefined)
        ret
    }
  }
  
}

