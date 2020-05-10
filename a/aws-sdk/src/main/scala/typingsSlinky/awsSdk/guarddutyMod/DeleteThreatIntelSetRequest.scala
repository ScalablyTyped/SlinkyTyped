package typingsSlinky.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteThreatIntelSetRequest extends js.Object {
  /**
    * The unique ID of the detector the threatIntelSet is associated with.
    */
  var DetectorId: typingsSlinky.awsSdk.guarddutyMod.DetectorId = js.native
  /**
    * The unique ID of the threatIntelSet you want to delete.
    */
  var ThreatIntelSetId: String = js.native
}

object DeleteThreatIntelSetRequest {
  @scala.inline
  def apply(DetectorId: DetectorId, ThreatIntelSetId: String): DeleteThreatIntelSetRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId.asInstanceOf[js.Any], ThreatIntelSetId = ThreatIntelSetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteThreatIntelSetRequest]
  }
  @scala.inline
  implicit class DeleteThreatIntelSetRequestOps[Self <: DeleteThreatIntelSetRequest] (val x: Self) extends AnyVal {
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
    def withThreatIntelSetId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThreatIntelSetId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

