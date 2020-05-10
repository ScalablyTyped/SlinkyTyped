package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResetServiceSettingResult extends js.Object {
  /**
    * The current, effective service setting after calling the ResetServiceSetting API action.
    */
  var ServiceSetting: js.UndefOr[typingsSlinky.awsSdk.ssmMod.ServiceSetting] = js.native
}

object ResetServiceSettingResult {
  @scala.inline
  def apply(): ResetServiceSettingResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResetServiceSettingResult]
  }
  @scala.inline
  implicit class ResetServiceSettingResultOps[Self <: ResetServiceSettingResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withServiceSetting(value: ServiceSetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceSetting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceSetting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceSetting")(js.undefined)
        ret
    }
  }
  
}

