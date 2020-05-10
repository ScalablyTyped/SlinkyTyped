package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OTAUpdateSummary extends js.Object {
  /**
    * The date when the OTA update was created.
    */
  var creationDate: js.UndefOr[js.Date] = js.native
  /**
    * The OTA update ARN.
    */
  var otaUpdateArn: js.UndefOr[OTAUpdateArn] = js.native
  /**
    * The OTA update ID.
    */
  var otaUpdateId: js.UndefOr[OTAUpdateId] = js.native
}

object OTAUpdateSummary {
  @scala.inline
  def apply(): OTAUpdateSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OTAUpdateSummary]
  }
  @scala.inline
  implicit class OTAUpdateSummaryOps[Self <: OTAUpdateSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreationDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationDate")(js.undefined)
        ret
    }
    @scala.inline
    def withOtaUpdateArn(value: OTAUpdateArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("otaUpdateArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOtaUpdateArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("otaUpdateArn")(js.undefined)
        ret
    }
    @scala.inline
    def withOtaUpdateId(value: OTAUpdateId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("otaUpdateId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOtaUpdateId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("otaUpdateId")(js.undefined)
        ret
    }
  }
  
}

