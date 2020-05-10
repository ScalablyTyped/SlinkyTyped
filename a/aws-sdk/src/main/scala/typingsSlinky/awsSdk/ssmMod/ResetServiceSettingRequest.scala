package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResetServiceSettingRequest extends js.Object {
  /**
    * The ID of the service setting to reset.
    */
  var SettingId: ServiceSettingId = js.native
}

object ResetServiceSettingRequest {
  @scala.inline
  def apply(SettingId: ServiceSettingId): ResetServiceSettingRequest = {
    val __obj = js.Dynamic.literal(SettingId = SettingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResetServiceSettingRequest]
  }
  @scala.inline
  implicit class ResetServiceSettingRequestOps[Self <: ResetServiceSettingRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSettingId(value: ServiceSettingId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SettingId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

