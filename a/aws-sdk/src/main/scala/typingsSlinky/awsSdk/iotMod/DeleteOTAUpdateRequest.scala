package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteOTAUpdateRequest extends js.Object {
  /**
    * Specifies if the stream associated with an OTA update should be deleted when the OTA update is deleted.
    */
  var deleteStream: js.UndefOr[DeleteStream] = js.native
  /**
    * Specifies if the AWS Job associated with the OTA update should be deleted with the OTA update is deleted.
    */
  var forceDeleteAWSJob: js.UndefOr[ForceDeleteAWSJob] = js.native
  /**
    * The OTA update ID to delete.
    */
  var otaUpdateId: OTAUpdateId = js.native
}

object DeleteOTAUpdateRequest {
  @scala.inline
  def apply(otaUpdateId: OTAUpdateId): DeleteOTAUpdateRequest = {
    val __obj = js.Dynamic.literal(otaUpdateId = otaUpdateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteOTAUpdateRequest]
  }
  @scala.inline
  implicit class DeleteOTAUpdateRequestOps[Self <: DeleteOTAUpdateRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOtaUpdateId(value: OTAUpdateId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("otaUpdateId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteStream(value: DeleteStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteStream")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteStream: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteStream")(js.undefined)
        ret
    }
    @scala.inline
    def withForceDeleteAWSJob(value: ForceDeleteAWSJob): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceDeleteAWSJob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceDeleteAWSJob: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceDeleteAWSJob")(js.undefined)
        ret
    }
  }
  
}

