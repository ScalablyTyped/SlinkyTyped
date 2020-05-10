package typingsSlinky.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutAccountSettingResponse extends js.Object {
  /**
    * The current account setting for a resource.
    */
  var setting: js.UndefOr[Setting] = js.native
}

object PutAccountSettingResponse {
  @scala.inline
  def apply(): PutAccountSettingResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutAccountSettingResponse]
  }
  @scala.inline
  implicit class PutAccountSettingResponseOps[Self <: PutAccountSettingResponse] (val x: Self) extends AnyVal {
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

