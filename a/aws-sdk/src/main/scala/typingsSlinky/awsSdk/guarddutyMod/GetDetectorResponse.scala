package typingsSlinky.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDetectorResponse extends js.Object {
  /**
    * Detector creation timestamp.
    */
  var CreatedAt: js.UndefOr[String] = js.native
  /**
    * Finding publishing frequency.
    */
  var FindingPublishingFrequency: js.UndefOr[typingsSlinky.awsSdk.guarddutyMod.FindingPublishingFrequency] = js.native
  /**
    * The GuardDuty service role.
    */
  var ServiceRole: String = js.native
  /**
    * The detector status.
    */
  var Status: DetectorStatus = js.native
  /**
    * The tags of the detector resource.
    */
  var Tags: js.UndefOr[TagMap] = js.native
  /**
    * Detector last update timestamp.
    */
  var UpdatedAt: js.UndefOr[String] = js.native
}

object GetDetectorResponse {
  @scala.inline
  def apply(ServiceRole: String, Status: DetectorStatus): GetDetectorResponse = {
    val __obj = js.Dynamic.literal(ServiceRole = ServiceRole.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDetectorResponse]
  }
  @scala.inline
  implicit class GetDetectorResponseOps[Self <: GetDetectorResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withServiceRole(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceRole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: DetectorStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreatedAt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedAt")(js.undefined)
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
    @scala.inline
    def withTags(value: TagMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdatedAt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdatedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdatedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdatedAt")(js.undefined)
        ret
    }
  }
  
}

