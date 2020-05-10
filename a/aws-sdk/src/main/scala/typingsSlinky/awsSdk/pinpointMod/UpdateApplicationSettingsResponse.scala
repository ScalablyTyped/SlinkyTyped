package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateApplicationSettingsResponse extends js.Object {
  var ApplicationSettingsResource: typingsSlinky.awsSdk.pinpointMod.ApplicationSettingsResource = js.native
}

object UpdateApplicationSettingsResponse {
  @scala.inline
  def apply(ApplicationSettingsResource: ApplicationSettingsResource): UpdateApplicationSettingsResponse = {
    val __obj = js.Dynamic.literal(ApplicationSettingsResource = ApplicationSettingsResource.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApplicationSettingsResponse]
  }
  @scala.inline
  implicit class UpdateApplicationSettingsResponseOps[Self <: UpdateApplicationSettingsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationSettingsResource(value: ApplicationSettingsResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationSettingsResource")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

