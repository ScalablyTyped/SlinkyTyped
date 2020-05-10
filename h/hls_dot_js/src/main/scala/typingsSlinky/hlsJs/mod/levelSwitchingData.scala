package typingsSlinky.hlsJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait levelSwitchingData extends js.Object {
  var attrs: js.Any = js.native
  var audioCodec: String = js.native
  var bitrate: Double = js.native
  var fragmentError: Boolean = js.native
  var height: Double = js.native
  var level: Double = js.native
  var loadError: Double = js.native
  var name: String = js.native
  var unknownCodecs: js.Array[String] = js.native
  var url: js.Array[String] = js.native
  var urlId: Double = js.native
  var videoCodec: String = js.native
  var width: Double = js.native
}

object levelSwitchingData {
  @scala.inline
  def apply(
    attrs: js.Any,
    audioCodec: String,
    bitrate: Double,
    fragmentError: Boolean,
    height: Double,
    level: Double,
    loadError: Double,
    name: String,
    unknownCodecs: js.Array[String],
    url: js.Array[String],
    urlId: Double,
    videoCodec: String,
    width: Double
  ): levelSwitchingData = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], audioCodec = audioCodec.asInstanceOf[js.Any], bitrate = bitrate.asInstanceOf[js.Any], fragmentError = fragmentError.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], loadError = loadError.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], unknownCodecs = unknownCodecs.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], urlId = urlId.asInstanceOf[js.Any], videoCodec = videoCodec.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[levelSwitchingData]
  }
  @scala.inline
  implicit class levelSwitchingDataOps[Self <: levelSwitchingData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttrs(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attrs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAudioCodec(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioCodec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBitrate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitrate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFragmentError(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragmentError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoadError(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnknownCodecs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unknownCodecs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrlId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVideoCodec(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoCodec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

