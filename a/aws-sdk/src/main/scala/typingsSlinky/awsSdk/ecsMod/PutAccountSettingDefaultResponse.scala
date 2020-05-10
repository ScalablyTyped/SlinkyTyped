package typingsSlinky.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutAccountSettingDefaultResponse extends js.Object {
  var setting: js.UndefOr[Setting] = js.native
}

object PutAccountSettingDefaultResponse {
  @scala.inline
  def apply(): PutAccountSettingDefaultResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutAccountSettingDefaultResponse]
  }
  @scala.inline
  implicit class PutAccountSettingDefaultResponseOps[Self <: PutAccountSettingDefaultResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSetting(value: Setting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setting")(js.undefined)
        ret
    }
  }
  
}

