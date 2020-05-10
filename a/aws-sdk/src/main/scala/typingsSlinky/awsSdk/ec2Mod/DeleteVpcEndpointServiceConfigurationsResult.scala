package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteVpcEndpointServiceConfigurationsResult extends js.Object {
  /**
    * Information about the service configurations that were not deleted, if applicable.
    */
  var Unsuccessful: js.UndefOr[UnsuccessfulItemSet] = js.native
}

object DeleteVpcEndpointServiceConfigurationsResult {
  @scala.inline
  def apply(): DeleteVpcEndpointServiceConfigurationsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteVpcEndpointServiceConfigurationsResult]
  }
  @scala.inline
  implicit class DeleteVpcEndpointServiceConfigurationsResultOps[Self <: DeleteVpcEndpointServiceConfigurationsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUnsuccessful(value: UnsuccessfulItemSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Unsuccessful")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnsuccessful: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Unsuccessful")(js.undefined)
        ret
    }
  }
  
}

