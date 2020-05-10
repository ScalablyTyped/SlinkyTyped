package typingsSlinky.awsSdkClientPinpointBrowser.typesSegmentBehaviorsMod

import typingsSlinky.awsSdkClientPinpointBrowser.typesRecencyDimensionMod.UnmarshalledRecencyDimension
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledSegmentBehaviors extends SegmentBehaviors {
  /**
    * The recency of use.
    */
  @JSName("Recency")
  var Recency_UnmarshalledSegmentBehaviors: js.UndefOr[UnmarshalledRecencyDimension] = js.native
}

object UnmarshalledSegmentBehaviors {
  @scala.inline
  def apply(): UnmarshalledSegmentBehaviors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledSegmentBehaviors]
  }
  @scala.inline
  implicit class UnmarshalledSegmentBehaviorsOps[Self <: UnmarshalledSegmentBehaviors] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRecency(value: UnmarshalledRecencyDimension): Self = {
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

