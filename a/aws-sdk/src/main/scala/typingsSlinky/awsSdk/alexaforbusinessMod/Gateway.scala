package typingsSlinky.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Gateway extends js.Object {
  /**
    * The ARN of the gateway.
    */
  var Arn: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.Arn] = js.native
  /**
    * The description of the gateway.
    */
  var Description: js.UndefOr[GatewayDescription] = js.native
  /**
    * The ARN of the gateway group that the gateway is associated to.
    */
  var GatewayGroupArn: js.UndefOr[Arn] = js.native
  /**
    * The name of the gateway.
    */
  var Name: js.UndefOr[GatewayName] = js.native
  /**
    * The software version of the gateway. The gateway automatically updates its software version during normal operation.
    */
  var SoftwareVersion: js.UndefOr[GatewayVersion] = js.native
}

object Gateway {
  @scala.inline
  def apply(): Gateway = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Gateway]
  }
  @scala.inline
  implicit class GatewayOps[Self <: Gateway] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: GatewayDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withGatewayGroupArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GatewayGroupArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGatewayGroupArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GatewayGroupArn")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: GatewayName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withSoftwareVersion(value: GatewayVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SoftwareVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSoftwareVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SoftwareVersion")(js.undefined)
        ret
    }
  }
  
}

