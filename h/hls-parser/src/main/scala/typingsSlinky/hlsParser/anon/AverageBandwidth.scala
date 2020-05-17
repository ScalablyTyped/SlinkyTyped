package typingsSlinky.hlsParser.anon

import typingsSlinky.hlsParser.hlsParserStrings.AUDIO
import typingsSlinky.hlsParser.hlsParserStrings.SUBTITLES
import typingsSlinky.hlsParser.hlsParserStrings.VIDEO
import typingsSlinky.hlsParser.hlsParserStrings.`CLOSED-CAPTIONS`
import typingsSlinky.hlsParser.mod.types.Rendition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AverageBandwidth extends js.Object {
  var audio: js.UndefOr[js.Array[Rendition[AUDIO]]] = js.native
  var averageBandwidth: js.UndefOr[Double] = js.native
  var bandwidth: Double = js.native
  var closedCaptions: js.UndefOr[js.Array[Rendition[`CLOSED-CAPTIONS`]]] = js.native
  var codecs: js.UndefOr[String] = js.native
  var currentRenditions: js.UndefOr[Audio] = js.native
  var frameRate: js.UndefOr[Double] = js.native
  var hdcpLevel: js.UndefOr[String] = js.native
  var isIFrameOnly: js.UndefOr[Boolean] = js.native
  var resolution: js.UndefOr[Height] = js.native
  var subtitles: js.UndefOr[js.Array[Rendition[SUBTITLES]]] = js.native
  var uri: String = js.native
  var video: js.UndefOr[js.Array[Rendition[VIDEO]]] = js.native
}

object AverageBandwidth {
  @scala.inline
  def apply(bandwidth: Double, uri: String): AverageBandwidth = {
    val __obj = js.Dynamic.literal(bandwidth = bandwidth.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[AverageBandwidth]
  }
  @scala.inline
  implicit class AverageBandwidthOps[Self <: AverageBandwidth] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBandwidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bandwidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAudio(value: js.Array[Rendition[AUDIO]]): Self = {
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
    def withAverageBandwidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("averageBandwidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAverageBandwidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("averageBandwidth")(js.undefined)
        ret
    }
    @scala.inline
    def withClosedCaptions(value: js.Array[Rendition[`CLOSED-CAPTIONS`]]): Self = {
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
    def withCodecs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codecs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodecs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codecs")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentRenditions(value: Audio): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentRenditions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentRenditions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentRenditions")(js.undefined)
        ret
    }
    @scala.inline
    def withFrameRate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrameRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameRate")(js.undefined)
        ret
    }
    @scala.inline
    def withHdcpLevel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hdcpLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHdcpLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hdcpLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withIsIFrameOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isIFrameOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsIFrameOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isIFrameOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withResolution(value: Height): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolution")(js.undefined)
        ret
    }
    @scala.inline
    def withSubtitles(value: js.Array[Rendition[SUBTITLES]]): Self = {
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
    def withVideo(value: js.Array[Rendition[VIDEO]]): Self = {
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

