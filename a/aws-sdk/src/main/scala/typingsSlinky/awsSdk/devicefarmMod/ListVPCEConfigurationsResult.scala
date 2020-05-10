package typingsSlinky.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListVPCEConfigurationsResult extends js.Object {
  /**
    * An identifier that was returned from the previous call to this operation, which can be used to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * An array of VPCEConfiguration objects that contain information about your VPC endpoint configuration.
    */
  var vpceConfigurations: js.UndefOr[VPCEConfigurations] = js.native
}

object ListVPCEConfigurationsResult {
  @scala.inline
  def apply(): ListVPCEConfigurationsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListVPCEConfigurationsResult]
  }
  @scala.inline
  implicit class ListVPCEConfigurationsResultOps[Self <: ListVPCEConfigurationsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: PaginationToken): Self = {
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
    def withVpceConfigurations(value: VPCEConfigurations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpceConfigurations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpceConfigurations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpceConfigurations")(js.undefined)
        ret
    }
  }
  
}

