package typingsSlinky.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDetectorVersionResult extends js.Object {
  /**
    * The ID for the created version's parent detector.
    */
  var detectorId: js.UndefOr[identifier] = js.native
  /**
    * The ID for the created detector. 
    */
  var detectorVersionId: js.UndefOr[nonEmptyString] = js.native
  /**
    * The status of the detector version.
    */
  var status: js.UndefOr[DetectorVersionStatus] = js.native
}

object CreateDetectorVersionResult {
  @scala.inline
  def apply(): CreateDetectorVersionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDetectorVersionResult]
  }
  @scala.inline
  implicit class CreateDetectorVersionResultOps[Self <: CreateDetectorVersionResult] (val x: Self) extends AnyVal {
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
    def withoutDetectorId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectorId")(js.undefined)
        ret
    }
    @scala.inline
    def withDetectorVersionId(value: nonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectorVersionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetectorVersionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectorVersionId")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: DetectorVersionStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
  }
  
}

