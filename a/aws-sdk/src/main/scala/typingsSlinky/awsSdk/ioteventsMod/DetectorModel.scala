package typingsSlinky.awsSdk.ioteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetectorModel extends js.Object {
  /**
    * Information about how the detector is configured.
    */
  var detectorModelConfiguration: js.UndefOr[DetectorModelConfiguration] = js.native
  /**
    * Information that defines how a detector operates.
    */
  var detectorModelDefinition: js.UndefOr[DetectorModelDefinition] = js.native
}

object DetectorModel {
  @scala.inline
  def apply(): DetectorModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectorModel]
  }
  @scala.inline
  implicit class DetectorModelOps[Self <: DetectorModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDetectorModelConfiguration(value: DetectorModelConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectorModelConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetectorModelConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectorModelConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withDetectorModelDefinition(value: DetectorModelDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectorModelDefinition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetectorModelDefinition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectorModelDefinition")(js.undefined)
        ret
    }
  }
  
}

