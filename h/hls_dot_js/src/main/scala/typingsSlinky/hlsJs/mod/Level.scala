package typingsSlinky.hlsJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * a Level object represents a given quality level and contains quality level related info
  */
@js.native
trait Level extends js.Object {
  /**
    * attribute list
    */
  var attrs: js.Array[LevelAttr] = js.native
  /**
    * audio codec
    */
  var audioCodec: String = js.native
  /**
    * level bitrate
    */
  var bitrate: Double = js.native
  /**
    * level details
    */
  var details: js.UndefOr[LevelDetails] = js.native
  /**
    * whether there is any error on the fragment
    */
  var fragmentError: js.UndefOr[Boolean] = js.native
  /**
    * video height
    */
  var height: Double = js.native
  /**
    * index of the level
    */
  var level: js.UndefOr[Double] = js.native
  /**
    * error code
    */
  var loadError: Double = js.native
  /**
    * level name
    */
  var name: String = js.native
  /**
    * array of unrecognized codecs
    */
  var unkownCodecs: js.Array[String] = js.native
  /**
    * level url. might contain several items if failover/redundant streams are found in the manifest
    */
  var url: js.Array[String] = js.native
  /**
    * index of current url from url[] array
    */
  var urlId: Double = js.native
  /**
    * video codec
    */
  var videoCodec: String = js.native
  /**
    * video width
    */
  var width: Double = js.native
}

object Level {
  @scala.inline
  def apply(
    attrs: js.Array[LevelAttr],
    audioCodec: String,
    bitrate: Double,
    height: Double,
    loadError: Double,
    name: String,
    unkownCodecs: js.Array[String],
    url: js.Array[String],
    urlId: Double,
    videoCodec: String,
    width: Double
  ): Level = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], audioCodec = audioCodec.asInstanceOf[js.Any], bitrate = bitrate.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], loadError = loadError.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], unkownCodecs = unkownCodecs.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], urlId = urlId.asInstanceOf[js.Any], videoCodec = videoCodec.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Level]
  }
  @scala.inline
  implicit class LevelOps[Self <: Level] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttrs(value: js.Array[LevelAttr]): Self = {
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
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
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
    def withUnkownCodecs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unkownCodecs")(value.asInstanceOf[js.Any])
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
    @scala.inline
    def withDetails(value: LevelDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("details")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("details")(js.undefined)
        ret
    }
    @scala.inline
    def withFragmentError(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragmentError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFragmentError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragmentError")(js.undefined)
        ret
    }
    @scala.inline
    def withLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(js.undefined)
        ret
    }
  }
  
}

