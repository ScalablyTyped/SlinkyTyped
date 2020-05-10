package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAppRequest extends js.Object {
  var CreateApplicationRequest: typingsSlinky.awsSdk.pinpointMod.CreateApplicationRequest = js.native
}

object CreateAppRequest {
  @scala.inline
  def apply(CreateApplicationRequest: CreateApplicationRequest): CreateAppRequest = {
    val __obj = js.Dynamic.literal(CreateApplicationRequest = CreateApplicationRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAppRequest]
  }
  @scala.inline
  implicit class CreateAppRequestOps[Self <: CreateAppRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateApplicationRequest(value: CreateApplicationRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreateApplicationRequest")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

