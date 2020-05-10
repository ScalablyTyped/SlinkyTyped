package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetOTAUpdateResponse extends js.Object {
  /**
    * The OTA update info.
    */
  var otaUpdateInfo: js.UndefOr[OTAUpdateInfo] = js.native
}

object GetOTAUpdateResponse {
  @scala.inline
  def apply(): GetOTAUpdateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOTAUpdateResponse]
  }
  @scala.inline
  implicit class GetOTAUpdateResponseOps[Self <: GetOTAUpdateResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOtaUpdateInfo(value: OTAUpdateInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("otaUpdateInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOtaUpdateInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("otaUpdateInfo")(js.undefined)
        ret
    }
  }
  
}

