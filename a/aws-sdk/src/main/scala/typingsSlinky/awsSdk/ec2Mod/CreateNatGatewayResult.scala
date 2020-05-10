package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateNatGatewayResult extends js.Object {
  /**
    * Unique, case-sensitive identifier to ensure the idempotency of the request. Only returned if a client token was provided in the request.
    */
  var ClientToken: js.UndefOr[String] = js.native
  /**
    * Information about the NAT gateway.
    */
  var NatGateway: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.NatGateway] = js.native
}

object CreateNatGatewayResult {
  @scala.inline
  def apply(): CreateNatGatewayResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateNatGatewayResult]
  }
  @scala.inline
  implicit class CreateNatGatewayResultOps[Self <: CreateNatGatewayResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientToken")(js.undefined)
        ret
    }
    @scala.inline
    def withNatGateway(value: NatGateway): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NatGateway")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNatGateway: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NatGateway")(js.undefined)
        ret
    }
  }
  
}

