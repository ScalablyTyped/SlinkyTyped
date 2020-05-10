package typingsSlinky.awsSdkClientXrayNode.typesTraceMod

import typingsSlinky.awsSdkClientXrayNode.typesSegmentMod.UnmarshalledSegment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledTrace extends Trace {
  /**
    * <p>Segment documents for the segments and subsegments that comprise the trace.</p>
    */
  @JSName("Segments")
  var Segments_UnmarshalledTrace: js.UndefOr[js.Array[UnmarshalledSegment]] = js.native
}

object UnmarshalledTrace {
  @scala.inline
  def apply(): UnmarshalledTrace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledTrace]
  }
  @scala.inline
  implicit class UnmarshalledTraceOps[Self <: UnmarshalledTrace] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSegments(value: js.Array[UnmarshalledSegment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Segments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSegments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Segments")(js.undefined)
        ret
    }
  }
  
}

