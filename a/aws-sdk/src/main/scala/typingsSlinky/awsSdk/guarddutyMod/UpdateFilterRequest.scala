package typingsSlinky.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateFilterRequest extends js.Object {
  /**
    * Specifies the action that is to be applied to the findings that match the filter.
    */
  var Action: js.UndefOr[FilterAction] = js.native
  /**
    * The description of the filter.
    */
  var Description: js.UndefOr[FilterDescription] = js.native
  /**
    * The unique ID of the detector that specifies the GuardDuty service where you want to update a filter.
    */
  var DetectorId: typingsSlinky.awsSdk.guarddutyMod.DetectorId = js.native
  /**
    * The name of the filter.
    */
  var FilterName: String = js.native
  /**
    * Represents the criteria to be used in the filter for querying findings.
    */
  var FindingCriteria: js.UndefOr[typingsSlinky.awsSdk.guarddutyMod.FindingCriteria] = js.native
  /**
    * Specifies the position of the filter in the list of current filters. Also specifies the order in which this filter is applied to the findings.
    */
  var Rank: js.UndefOr[FilterRank] = js.native
}

object UpdateFilterRequest {
  @scala.inline
  def apply(DetectorId: DetectorId, FilterName: String): UpdateFilterRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId.asInstanceOf[js.Any], FilterName = FilterName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFilterRequest]
  }
  @scala.inline
  implicit class UpdateFilterRequestOps[Self <: UpdateFilterRequest] (val x: Self) extends AnyVal {
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
    def withFilterName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FilterName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAction(value: FilterAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Action")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: FilterDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
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
    @scala.inline
    def withRank(value: FilterRank): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Rank")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRank: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Rank")(js.undefined)
        ret
    }
  }
  
}

