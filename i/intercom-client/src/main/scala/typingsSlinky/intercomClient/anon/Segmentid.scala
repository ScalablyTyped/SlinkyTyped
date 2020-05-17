package typingsSlinky.intercomClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Segmentid extends js.Object {
  var segment_id: js.UndefOr[String] = js.native
  var tag_id: js.UndefOr[String] = js.native
}

object Segmentid {
  @scala.inline
  def apply(): Segmentid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Segmentid]
  }
  @scala.inline
  implicit class SegmentidOps[Self <: Segmentid] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSegment_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segment_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSegment_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segment_id")(js.undefined)
        ret
    }
    @scala.inline
    def withTag_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTag_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag_id")(js.undefined)
        ret
    }
  }
  
}

