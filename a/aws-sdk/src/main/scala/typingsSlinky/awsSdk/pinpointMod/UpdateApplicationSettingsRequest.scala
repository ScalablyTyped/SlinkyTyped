package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateApplicationSettingsRequest extends js.Object {
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: string = js.native
  var WriteApplicationSettingsRequest: typingsSlinky.awsSdk.pinpointMod.WriteApplicationSettingsRequest = js.native
}

object UpdateApplicationSettingsRequest {
  @scala.inline
  def apply(ApplicationId: string, WriteApplicationSettingsRequest: WriteApplicationSettingsRequest): UpdateApplicationSettingsRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], WriteApplicationSettingsRequest = WriteApplicationSettingsRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApplicationSettingsRequest]
  }
  @scala.inline
  implicit class UpdateApplicationSettingsRequestOps[Self <: UpdateApplicationSettingsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWriteApplicationSettingsRequest(value: WriteApplicationSettingsRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WriteApplicationSettingsRequest")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

