package typingsSlinky.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSampleFindingsRequest extends js.Object {
  /**
    * The ID of the detector to create sample findings for.
    */
  var DetectorId: typingsSlinky.awsSdk.guarddutyMod.DetectorId = js.native
  /**
    * Types of sample findings to generate.
    */
  var FindingTypes: js.UndefOr[typingsSlinky.awsSdk.guarddutyMod.FindingTypes] = js.native
}

object CreateSampleFindingsRequest {
  @scala.inline
  def apply(DetectorId: DetectorId): CreateSampleFindingsRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSampleFindingsRequest]
  }
  @scala.inline
  implicit class CreateSampleFindingsRequestOps[Self <: CreateSampleFindingsRequest] (val x: Self) extends AnyVal {
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
    def withFindingTypes(value: FindingTypes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FindingTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFindingTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FindingTypes")(js.undefined)
        ret
    }
  }
  
}

