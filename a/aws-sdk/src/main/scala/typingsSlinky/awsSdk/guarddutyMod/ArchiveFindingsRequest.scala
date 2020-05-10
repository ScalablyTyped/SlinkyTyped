package typingsSlinky.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArchiveFindingsRequest extends js.Object {
  /**
    * The ID of the detector that specifies the GuardDuty service whose findings you want to archive.
    */
  var DetectorId: typingsSlinky.awsSdk.guarddutyMod.DetectorId = js.native
  /**
    * IDs of the findings that you want to archive.
    */
  var FindingIds: typingsSlinky.awsSdk.guarddutyMod.FindingIds = js.native
}

object ArchiveFindingsRequest {
  @scala.inline
  def apply(DetectorId: DetectorId, FindingIds: FindingIds): ArchiveFindingsRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId.asInstanceOf[js.Any], FindingIds = FindingIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArchiveFindingsRequest]
  }
  @scala.inline
  implicit class ArchiveFindingsRequestOps[Self <: ArchiveFindingsRequest] (val x: Self) extends AnyVal {
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
    def withFindingIds(value: FindingIds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FindingIds")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

