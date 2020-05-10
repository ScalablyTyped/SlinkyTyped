package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateServiceSettingRequest extends js.Object {
  /**
    * The ID of the service setting to update.
    */
  var SettingId: ServiceSettingId = js.native
  /**
    * The new value to specify for the service setting.
    */
  var SettingValue: ServiceSettingValue = js.native
}

object UpdateServiceSettingRequest {
  @scala.inline
  def apply(SettingId: ServiceSettingId, SettingValue: ServiceSettingValue): UpdateServiceSettingRequest = {
    val __obj = js.Dynamic.literal(SettingId = SettingId.asInstanceOf[js.Any], SettingValue = SettingValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateServiceSettingRequest]
  }
  @scala.inline
  implicit class UpdateServiceSettingRequestOps[Self <: UpdateServiceSettingRequest] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withSettingValue(value: ServiceSettingValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SettingValue")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

