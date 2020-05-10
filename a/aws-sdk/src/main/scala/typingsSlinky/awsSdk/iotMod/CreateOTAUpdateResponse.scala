package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateOTAUpdateResponse extends js.Object {
  /**
    * The AWS IoT job ARN associated with the OTA update.
    */
  var awsIotJobArn: js.UndefOr[AwsIotJobArn] = js.native
  /**
    * The AWS IoT job ID associated with the OTA update.
    */
  var awsIotJobId: js.UndefOr[AwsIotJobId] = js.native
  /**
    * The OTA update ARN.
    */
  var otaUpdateArn: js.UndefOr[OTAUpdateArn] = js.native
  /**
    * The OTA update ID.
    */
  var otaUpdateId: js.UndefOr[OTAUpdateId] = js.native
  /**
    * The OTA update status.
    */
  var otaUpdateStatus: js.UndefOr[OTAUpdateStatus] = js.native
}

object CreateOTAUpdateResponse {
  @scala.inline
  def apply(): CreateOTAUpdateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateOTAUpdateResponse]
  }
  @scala.inline
  implicit class CreateOTAUpdateResponseOps[Self <: CreateOTAUpdateResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAwsIotJobArn(value: AwsIotJobArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awsIotJobArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAwsIotJobArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awsIotJobArn")(js.undefined)
        ret
    }
    @scala.inline
    def withAwsIotJobId(value: AwsIotJobId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awsIotJobId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAwsIotJobId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awsIotJobId")(js.undefined)
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
    @scala.inline
    def withOtaUpdateStatus(value: OTAUpdateStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("otaUpdateStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOtaUpdateStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("otaUpdateStatus")(js.undefined)
        ret
    }
  }
  
}

