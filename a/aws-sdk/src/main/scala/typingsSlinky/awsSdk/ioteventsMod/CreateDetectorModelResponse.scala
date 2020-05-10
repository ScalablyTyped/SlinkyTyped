package typingsSlinky.awsSdk.ioteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDetectorModelResponse extends js.Object {
  /**
    * Information about how the detector model is configured.
    */
  var detectorModelConfiguration: js.UndefOr[DetectorModelConfiguration] = js.native
}

object CreateDetectorModelResponse {
  @scala.inline
  def apply(): CreateDetectorModelResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDetectorModelResponse]
  }
  @scala.inline
  implicit class CreateDetectorModelResponseOps[Self <: CreateDetectorModelResponse] (val x: Self) extends AnyVal {
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
  }
  
}

