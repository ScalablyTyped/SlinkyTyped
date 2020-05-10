package typingsSlinky.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDetectorVersionStatusRequest extends js.Object {
  /**
    * The detector ID. 
    */
  var detectorId: identifier = js.native
  /**
    * The detector version ID. 
    */
  var detectorVersionId: nonEmptyString = js.native
  /**
    * The new status.
    */
  var status: DetectorVersionStatus = js.native
}

object UpdateDetectorVersionStatusRequest {
  @scala.inline
  def apply(detectorId: identifier, detectorVersionId: nonEmptyString, status: DetectorVersionStatus): UpdateDetectorVersionStatusRequest = {
    val __obj = js.Dynamic.literal(detectorId = detectorId.asInstanceOf[js.Any], detectorVersionId = detectorVersionId.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDetectorVersionStatusRequest]
  }
  @scala.inline
  implicit class UpdateDetectorVersionStatusRequestOps[Self <: UpdateDetectorVersionStatusRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDetectorId(value: identifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectorId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDetectorVersionId(value: nonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectorVersionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: DetectorVersionStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

