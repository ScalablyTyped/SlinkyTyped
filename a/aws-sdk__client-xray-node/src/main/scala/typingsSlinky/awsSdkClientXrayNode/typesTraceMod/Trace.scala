package typingsSlinky.awsSdkClientXrayNode.typesTraceMod

import typingsSlinky.awsSdkClientXrayNode.typesSegmentMod.Segment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Trace extends js.Object {
  /**
    * <p>The length of time in seconds between the start time of the root segment and the end time of the last segment that completed.</p>
    */
  var Duration: js.UndefOr[Double] = js.native
  /**
    * <p>The unique identifier for the request that generated the trace's segments and subsegments.</p>
    */
  var Id: js.UndefOr[String] = js.native
  /**
    * <p>Segment documents for the segments and subsegments that comprise the trace.</p>
    */
  var Segments: js.UndefOr[js.Array[Segment] | js.Iterable[Segment]] = js.native
}

object Trace {
  @scala.inline
  def apply(): Trace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Trace]
  }
  @scala.inline
  implicit class TraceOps[Self <: Trace] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Duration")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(js.undefined)
        ret
    }
    @scala.inline
    def withSegmentsIterable(value: js.Iterable[Segment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Segments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSegments(value: js.Array[Segment] | js.Iterable[Segment]): Self = {
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

