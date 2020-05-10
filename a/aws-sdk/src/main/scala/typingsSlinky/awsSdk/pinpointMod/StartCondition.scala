package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartCondition extends js.Object {
  /**
    * The custom description of the condition.
    */
  var Description: js.UndefOr[string] = js.native
  /**
    * The segment that's associated with the first activity in the journey. This segment determines which users are participants in the journey.
    */
  var SegmentStartCondition: js.UndefOr[SegmentCondition] = js.native
}

object StartCondition {
  @scala.inline
  def apply(): StartCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartCondition]
  }
  @scala.inline
  implicit class StartConditionOps[Self <: StartCondition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withSegmentStartCondition(value: SegmentCondition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SegmentStartCondition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSegmentStartCondition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SegmentStartCondition")(js.undefined)
        ret
    }
  }
  
}

