package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SegmentBehaviors extends js.Object {
  /**
    * The dimension settings that are based on how recently an endpoint was active.
    */
  var Recency: js.UndefOr[RecencyDimension] = js.native
}

object SegmentBehaviors {
  @scala.inline
  def apply(): SegmentBehaviors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SegmentBehaviors]
  }
  @scala.inline
  implicit class SegmentBehaviorsOps[Self <: SegmentBehaviors] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRecency(value: RecencyDimension): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Recency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Recency")(js.undefined)
        ret
    }
  }
  
}

