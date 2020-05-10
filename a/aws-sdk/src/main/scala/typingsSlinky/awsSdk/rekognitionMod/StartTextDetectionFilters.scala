package typingsSlinky.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartTextDetectionFilters extends js.Object {
  /**
    * Filter focusing on a certain area of the frame. Uses a BoundingBox object to set the region of the screen.
    */
  var RegionsOfInterest: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.RegionsOfInterest] = js.native
  /**
    * Filters focusing on qualities of the text, such as confidence or size.
    */
  var WordFilter: js.UndefOr[DetectionFilter] = js.native
}

object StartTextDetectionFilters {
  @scala.inline
  def apply(): StartTextDetectionFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartTextDetectionFilters]
  }
  @scala.inline
  implicit class StartTextDetectionFiltersOps[Self <: StartTextDetectionFilters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRegionsOfInterest(value: RegionsOfInterest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegionsOfInterest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegionsOfInterest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegionsOfInterest")(js.undefined)
        ret
    }
    @scala.inline
    def withWordFilter(value: DetectionFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WordFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWordFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WordFilter")(js.undefined)
        ret
    }
  }
  
}

