package typingsSlinky.gapiClientQpxexpress.gapi.client.qpxexpress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SliceInfo extends js.Object {
  /** The duration of the slice in minutes. */
  var duration: js.UndefOr[Double] = js.native
  /**
    * Identifies this as a slice object. A slice represents a traveller's intent, the portion of a low-fare search corresponding to a traveler's request to
    * get between two points. One-way journeys are generally expressed using 1 slice, round-trips using 2. Value: the fixed string qpxexpress#sliceInfo.
    */
  var kind: js.UndefOr[String] = js.native
  /** The segment(s) constituting the slice. */
  var segment: js.UndefOr[js.Array[SegmentInfo]] = js.native
}

object SliceInfo {
  @scala.inline
  def apply(): SliceInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SliceInfo]
  }
  @scala.inline
  implicit class SliceInfoOps[Self <: SliceInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withSegment(value: js.Array[SegmentInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSegment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segment")(js.undefined)
        ret
    }
  }
  
}

