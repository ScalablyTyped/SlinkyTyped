package typingsSlinky.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetectorVersionSummary extends js.Object {
  /**
    * The detector version description. 
    */
  var description: js.UndefOr[typingsSlinky.awsSdk.frauddetectorMod.description] = js.native
  /**
    * The detector version ID. 
    */
  var detectorVersionId: js.UndefOr[nonEmptyString] = js.native
  /**
    * Timestamp of when the detector version was last updated.
    */
  var lastUpdatedTime: js.UndefOr[time] = js.native
  /**
    * The detector version status. 
    */
  var status: js.UndefOr[DetectorVersionStatus] = js.native
}

object DetectorVersionSummary {
  @scala.inline
  def apply(): DetectorVersionSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectorVersionSummary]
  }
  @scala.inline
  implicit class DetectorVersionSummaryOps[Self <: DetectorVersionSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: description): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
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
    def withLastUpdatedTime(value: time): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdatedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastUpdatedTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdatedTime")(js.undefined)
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

