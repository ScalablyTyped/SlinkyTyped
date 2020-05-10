package typingsSlinky.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DurationRange extends js.Object {
  /**
    * The maximum value of the duration range. Must be less than or equal to 604800 seconds (1 week).
    */
  var maxSeconds: js.UndefOr[AssessmentRunDuration] = js.native
  /**
    * The minimum value of the duration range. Must be greater than zero.
    */
  var minSeconds: js.UndefOr[AssessmentRunDuration] = js.native
}

object DurationRange {
  @scala.inline
  def apply(): DurationRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DurationRange]
  }
  @scala.inline
  implicit class DurationRangeOps[Self <: DurationRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxSeconds(value: AssessmentRunDuration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withMinSeconds(value: AssessmentRunDuration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSeconds")(js.undefined)
        ret
    }
  }
  
}

