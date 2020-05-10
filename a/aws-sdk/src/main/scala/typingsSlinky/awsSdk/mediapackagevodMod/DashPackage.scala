package typingsSlinky.awsSdk.mediapackagevodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DashPackage extends js.Object {
  /**
    * A list of DASH manifest configurations.
    */
  var DashManifests: listOfDashManifest = js.native
  var Encryption: js.UndefOr[DashEncryption] = js.native
  /**
    * A list of triggers that controls when the outgoing Dynamic Adaptive Streaming over HTTP (DASH)
  Media Presentation Description (MPD) will be partitioned into multiple periods. If empty, the content will not
  be partitioned into more than one period. If the list contains "ADS", new periods will be created where
  the Asset contains SCTE-35 ad markers.
    */
  var PeriodTriggers: js.UndefOr[listOfPeriodTriggersElement] = js.native
  /**
    * Duration (in seconds) of each segment. Actual segments will be
  rounded to the nearest multiple of the source segment duration.
    */
  var SegmentDurationSeconds: js.UndefOr[integer] = js.native
  /**
    * Determines the type of SegmentTemplate included in the Media Presentation Description (MPD).  When set to NUMBER_WITH_TIMELINE, a full timeline is presented in each SegmentTemplate, with $Number$ media URLs.  When set to TIME_WITH_TIMELINE, a full timeline is presented in each SegmentTemplate, with $Time$ media URLs. When set to NUMBER_WITH_DURATION, only a duration is included in each SegmentTemplate, with $Number$ media URLs.
    */
  var SegmentTemplateFormat: js.UndefOr[typingsSlinky.awsSdk.mediapackagevodMod.SegmentTemplateFormat] = js.native
}

object DashPackage {
  @scala.inline
  def apply(DashManifests: listOfDashManifest): DashPackage = {
    val __obj = js.Dynamic.literal(DashManifests = DashManifests.asInstanceOf[js.Any])
    __obj.asInstanceOf[DashPackage]
  }
  @scala.inline
  implicit class DashPackageOps[Self <: DashPackage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDashManifests(value: listOfDashManifest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DashManifests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEncryption(value: DashEncryption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Encryption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncryption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Encryption")(js.undefined)
        ret
    }
    @scala.inline
    def withPeriodTriggers(value: listOfPeriodTriggersElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PeriodTriggers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeriodTriggers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PeriodTriggers")(js.undefined)
        ret
    }
    @scala.inline
    def withSegmentDurationSeconds(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SegmentDurationSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSegmentDurationSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SegmentDurationSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withSegmentTemplateFormat(value: SegmentTemplateFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SegmentTemplateFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSegmentTemplateFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SegmentTemplateFormat")(js.undefined)
        ret
    }
  }
  
}

