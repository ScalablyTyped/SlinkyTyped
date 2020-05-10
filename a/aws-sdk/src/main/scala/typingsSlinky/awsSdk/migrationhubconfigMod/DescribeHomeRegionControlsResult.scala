package typingsSlinky.awsSdk.migrationhubconfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeHomeRegionControlsResult extends js.Object {
  /**
    * An array that contains your HomeRegionControl objects.
    */
  var HomeRegionControls: js.UndefOr[typingsSlinky.awsSdk.migrationhubconfigMod.HomeRegionControls] = js.native
  /**
    * If a NextToken was returned by a previous call, more results are available. To retrieve the next page of results, make the call again using the returned token in NextToken.
    */
  var NextToken: js.UndefOr[Token] = js.native
}

object DescribeHomeRegionControlsResult {
  @scala.inline
  def apply(): DescribeHomeRegionControlsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeHomeRegionControlsResult]
  }
  @scala.inline
  implicit class DescribeHomeRegionControlsResultOps[Self <: DescribeHomeRegionControlsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHomeRegionControls(value: HomeRegionControls): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HomeRegionControls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHomeRegionControls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HomeRegionControls")(js.undefined)
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
  }
  
}

