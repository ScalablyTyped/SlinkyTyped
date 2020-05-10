package typingsSlinky.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateVpcPeeringAuthorizationOutput extends js.Object {
  /**
    * Details on the requested VPC peering authorization, including expiration.
    */
  var VpcPeeringAuthorization: js.UndefOr[typingsSlinky.awsSdk.gameliftMod.VpcPeeringAuthorization] = js.native
}

object CreateVpcPeeringAuthorizationOutput {
  @scala.inline
  def apply(): CreateVpcPeeringAuthorizationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateVpcPeeringAuthorizationOutput]
  }
  @scala.inline
  implicit class CreateVpcPeeringAuthorizationOutputOps[Self <: CreateVpcPeeringAuthorizationOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVpcPeeringAuthorization(value: VpcPeeringAuthorization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcPeeringAuthorization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcPeeringAuthorization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcPeeringAuthorization")(js.undefined)
        ret
    }
  }
  
}

