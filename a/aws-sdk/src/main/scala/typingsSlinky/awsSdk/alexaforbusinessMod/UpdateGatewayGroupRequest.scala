package typingsSlinky.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateGatewayGroupRequest extends js.Object {
  /**
    * The updated description of the gateway group.
    */
  var Description: js.UndefOr[GatewayGroupDescription] = js.native
  /**
    * The ARN of the gateway group to update.
    */
  var GatewayGroupArn: Arn = js.native
  /**
    * The updated name of the gateway group.
    */
  var Name: js.UndefOr[GatewayGroupName] = js.native
}

object UpdateGatewayGroupRequest {
  @scala.inline
  def apply(GatewayGroupArn: Arn): UpdateGatewayGroupRequest = {
    val __obj = js.Dynamic.literal(GatewayGroupArn = GatewayGroupArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateGatewayGroupRequest]
  }
  @scala.inline
  implicit class UpdateGatewayGroupRequestOps[Self <: UpdateGatewayGroupRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGatewayGroupArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GatewayGroupArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: GatewayGroupDescription): Self = {
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
    def withName(value: GatewayGroupName): Self = {
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
  }
  
}

