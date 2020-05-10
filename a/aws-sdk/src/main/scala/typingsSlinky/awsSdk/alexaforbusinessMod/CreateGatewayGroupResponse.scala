package typingsSlinky.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateGatewayGroupResponse extends js.Object {
  /**
    * The ARN of the created gateway group.
    */
  var GatewayGroupArn: js.UndefOr[Arn] = js.native
}

object CreateGatewayGroupResponse {
  @scala.inline
  def apply(): CreateGatewayGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateGatewayGroupResponse]
  }
  @scala.inline
  implicit class CreateGatewayGroupResponseOps[Self <: CreateGatewayGroupResponse] (val x: Self) extends AnyVal {
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
    def withoutGatewayGroupArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GatewayGroupArn")(js.undefined)
        ret
    }
  }
  
}

