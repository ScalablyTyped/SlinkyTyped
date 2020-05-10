package typingsSlinky.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdatePublishingDestinationRequest extends js.Object {
  /**
    * The ID of the detector associated with the publishing destinations to update.
    */
  var DestinationId: String = js.native
  /**
    * A DestinationProperties object that includes the DestinationArn and KmsKeyArn of the publishing destination.
    */
  var DestinationProperties: js.UndefOr[typingsSlinky.awsSdk.guarddutyMod.DestinationProperties] = js.native
  /**
    * The ID of the 
    */
  var DetectorId: typingsSlinky.awsSdk.guarddutyMod.DetectorId = js.native
}

object UpdatePublishingDestinationRequest {
  @scala.inline
  def apply(DestinationId: String, DetectorId: DetectorId): UpdatePublishingDestinationRequest = {
    val __obj = js.Dynamic.literal(DestinationId = DestinationId.asInstanceOf[js.Any], DetectorId = DetectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePublishingDestinationRequest]
  }
  @scala.inline
  implicit class UpdatePublishingDestinationRequestOps[Self <: UpdatePublishingDestinationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestinationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDetectorId(value: DetectorId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DetectorId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestinationProperties(value: DestinationProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationProperties")(js.undefined)
        ret
    }
  }
  
}

