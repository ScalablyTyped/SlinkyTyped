package typingsSlinky.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFindingsStatisticsRequest extends js.Object {
  /**
    * The ID of the detector that specifies the GuardDuty service whose findings' statistics you want to retrieve.
    */
  var DetectorId: typingsSlinky.awsSdk.guarddutyMod.DetectorId = js.native
  /**
    * Represents the criteria used for querying findings.
    */
  var FindingCriteria: js.UndefOr[typingsSlinky.awsSdk.guarddutyMod.FindingCriteria] = js.native
  /**
    * Types of finding statistics to retrieve.
    */
  var FindingStatisticTypes: typingsSlinky.awsSdk.guarddutyMod.FindingStatisticTypes = js.native
}

object GetFindingsStatisticsRequest {
  @scala.inline
  def apply(DetectorId: DetectorId, FindingStatisticTypes: FindingStatisticTypes): GetFindingsStatisticsRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId.asInstanceOf[js.Any], FindingStatisticTypes = FindingStatisticTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFindingsStatisticsRequest]
  }
  @scala.inline
  implicit class GetFindingsStatisticsRequestOps[Self <: GetFindingsStatisticsRequest] (val x: Self) extends AnyVal {
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
    def withFindingStatisticTypes(value: FindingStatisticTypes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FindingStatisticTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFindingCriteria(value: FindingCriteria): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FindingCriteria")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFindingCriteria: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FindingCriteria")(js.undefined)
        ret
    }
  }
  
}

