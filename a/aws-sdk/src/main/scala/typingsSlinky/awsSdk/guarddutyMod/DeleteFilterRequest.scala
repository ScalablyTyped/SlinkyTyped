package typingsSlinky.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteFilterRequest extends js.Object {
  /**
    * The unique ID of the detector the filter is associated with.
    */
  var DetectorId: typingsSlinky.awsSdk.guarddutyMod.DetectorId = js.native
  /**
    * The name of the filter you want to delete.
    */
  var FilterName: String = js.native
}

object DeleteFilterRequest {
  @scala.inline
  def apply(DetectorId: DetectorId, FilterName: String): DeleteFilterRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId.asInstanceOf[js.Any], FilterName = FilterName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFilterRequest]
  }
  @scala.inline
  implicit class DeleteFilterRequestOps[Self <: DeleteFilterRequest] (val x: Self) extends AnyVal {
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
  }
  
}

