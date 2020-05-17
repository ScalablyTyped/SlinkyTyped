package typingsSlinky.hlsParser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Audio extends js.Object {
  var audio: js.UndefOr[Double] = js.native
  var closedCaptions: js.UndefOr[Double] = js.native
  var subtitles: js.UndefOr[Double] = js.native
  var video: js.UndefOr[Double] = js.native
}

object Audio {
  @scala.inline
  def apply(): Audio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Audio]
  }
  @scala.inline
  implicit class AudioOps[Self <: Audio] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAudio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audio")(js.undefined)
        ret
    }
    @scala.inline
    def withClosedCaptions(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closedCaptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClosedCaptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closedCaptions")(js.undefined)
        ret
    }
    @scala.inline
    def withSubtitles(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubtitles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitles")(js.undefined)
        ret
    }
    @scala.inline
    def withVideo(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("video")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("video")(js.undefined)
        ret
    }
  }
  
}

