package typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MatchSegment extends js.Object {
  var channel: js.UndefOr[String] = js.native
  var reference_segment: js.UndefOr[Segment] = js.native
  var video_segment: js.UndefOr[Segment] = js.native
}

object MatchSegment {
  @scala.inline
  def apply(): MatchSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatchSegment]
  }
  @scala.inline
  implicit class MatchSegmentOps[Self <: MatchSegment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChannel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel")(js.undefined)
        ret
    }
    @scala.inline
    def withReference_segment(value: Segment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reference_segment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReference_segment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reference_segment")(js.undefined)
        ret
    }
    @scala.inline
    def withVideo_segment(value: Segment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("video_segment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideo_segment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("video_segment")(js.undefined)
        ret
    }
  }
  
}

