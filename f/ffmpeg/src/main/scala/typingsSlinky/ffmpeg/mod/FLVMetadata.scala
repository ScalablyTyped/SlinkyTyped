package typingsSlinky.ffmpeg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  duration  :number,   filesize  :string,   encoder  :string,   width  :number,   height  :number,   videodatarate  :number,   videocodecid  :string,   audiodatarate  :number,   audiosamplerate  :number,   stereo  :boolean,   audiocodecid  :string}> */
@js.native
trait FLVMetadata extends js.Object {
  var audiocodecid: js.UndefOr[String] = js.native
  var audiodatarate: js.UndefOr[Double] = js.native
  var audiosamplerate: js.UndefOr[Double] = js.native
  var duration: js.UndefOr[Double] = js.native
  var encoder: js.UndefOr[String] = js.native
  var filesize: js.UndefOr[String] = js.native
  var height: js.UndefOr[Double] = js.native
  var stereo: js.UndefOr[Boolean] = js.native
  var videocodecid: js.UndefOr[String] = js.native
  var videodatarate: js.UndefOr[Double] = js.native
  var width: js.UndefOr[Double] = js.native
}

object FLVMetadata {
  @scala.inline
  def apply(): FLVMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FLVMetadata]
  }
  @scala.inline
  implicit class FLVMetadataOps[Self <: FLVMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAudiocodecid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audiocodecid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudiocodecid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audiocodecid")(js.undefined)
        ret
    }
    @scala.inline
    def withAudiodatarate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audiodatarate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudiodatarate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audiodatarate")(js.undefined)
        ret
    }
    @scala.inline
    def withAudiosamplerate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audiosamplerate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudiosamplerate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audiosamplerate")(js.undefined)
        ret
    }
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
    def withEncoder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncoder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoder")(js.undefined)
        ret
    }
    @scala.inline
    def withFilesize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filesize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilesize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filesize")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withStereo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stereo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStereo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stereo")(js.undefined)
        ret
    }
    @scala.inline
    def withVideocodecid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videocodecid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideocodecid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videocodecid")(js.undefined)
        ret
    }
    @scala.inline
    def withVideodatarate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videodatarate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideodatarate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videodatarate")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

