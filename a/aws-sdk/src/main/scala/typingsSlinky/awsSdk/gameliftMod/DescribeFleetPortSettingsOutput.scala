package typingsSlinky.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeFleetPortSettingsOutput extends js.Object {
  /**
    * The port settings for the requested fleet ID.
    */
  var InboundPermissions: js.UndefOr[IpPermissionsList] = js.native
}

object DescribeFleetPortSettingsOutput {
  @scala.inline
  def apply(): DescribeFleetPortSettingsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFleetPortSettingsOutput]
  }
  @scala.inline
  implicit class DescribeFleetPortSettingsOutputOps[Self <: DescribeFleetPortSettingsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInboundPermissions(value: IpPermissionsList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InboundPermissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInboundPermissions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InboundPermissions")(js.undefined)
        ret
    }
  }
  
}

