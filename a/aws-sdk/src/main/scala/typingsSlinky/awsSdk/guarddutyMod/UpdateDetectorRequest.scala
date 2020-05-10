package typingsSlinky.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDetectorRequest extends js.Object {
  /**
    * The unique ID of the detector to update.
    */
  var DetectorId: typingsSlinky.awsSdk.guarddutyMod.DetectorId = js.native
  /**
    * Specifies whether the detector is enabled or not enabled.
    */
  var Enable: js.UndefOr[Boolean] = js.native
  /**
    * A enum value that specifies how frequently findings are exported, such as to CloudWatch Events.
    */
  var FindingPublishingFrequency: js.UndefOr[typingsSlinky.awsSdk.guarddutyMod.FindingPublishingFrequency] = js.native
}

object UpdateDetectorRequest {
  @scala.inline
  def apply(DetectorId: DetectorId): UpdateDetectorRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDetectorRequest]
  }
  @scala.inline
  implicit class UpdateDetectorRequestOps[Self <: UpdateDetectorRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDetectorId(value: DetectorId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DetectorId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enable")(js.undefined)
        ret
    }
    @scala.inline
    def withFindingPublishingFrequency(value: FindingPublishingFrequency): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FindingPublishingFrequency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFindingPublishingFrequency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FindingPublishingFrequency")(js.undefined)
        ret
    }
  }
  
}

