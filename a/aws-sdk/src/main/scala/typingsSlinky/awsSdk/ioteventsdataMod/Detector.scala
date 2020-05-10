package typingsSlinky.awsSdk.ioteventsdataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Detector extends js.Object {
  /**
    * The time the detector (instance) was created.
    */
  var creationTime: js.UndefOr[js.Date] = js.native
  /**
    * The name of the detector model that created this detector (instance).
    */
  var detectorModelName: js.UndefOr[DetectorModelName] = js.native
  /**
    * The version of the detector model that created this detector (instance).
    */
  var detectorModelVersion: js.UndefOr[DetectorModelVersion] = js.native
  /**
    * The value of the key (identifying the device or system) that caused the creation of this detector (instance).
    */
  var keyValue: js.UndefOr[KeyValue] = js.native
  /**
    * The time the detector (instance) was last updated.
    */
  var lastUpdateTime: js.UndefOr[js.Date] = js.native
  /**
    * The current state of the detector (instance).
    */
  var state: js.UndefOr[DetectorState] = js.native
}

object Detector {
  @scala.inline
  def apply(): Detector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Detector]
  }
  @scala.inline
  implicit class DetectorOps[Self <: Detector] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreationTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationTime")(js.undefined)
        ret
    }
    @scala.inline
    def withDetectorModelName(value: DetectorModelName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectorModelName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetectorModelName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectorModelName")(js.undefined)
        ret
    }
    @scala.inline
    def withDetectorModelVersion(value: DetectorModelVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectorModelVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetectorModelVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectorModelVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyValue(value: KeyValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyValue")(js.undefined)
        ret
    }
    @scala.inline
    def withLastUpdateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastUpdateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: DetectorState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
  }
  
}

