package typingsSlinky.reactPlayer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileConfig extends js.Object {
  var attributes: js.UndefOr[js.Object] = js.native
  var dashVersion: js.UndefOr[String] = js.native
  var forceAudio: js.UndefOr[Boolean] = js.native
  var forceDASH: js.UndefOr[Boolean] = js.native
  var forceHLS: js.UndefOr[Boolean] = js.native
  var forceVideo: js.UndefOr[Boolean] = js.native
  var hlsOptions: js.UndefOr[js.Object] = js.native
  var hlsVersion: js.UndefOr[String] = js.native
  var tracks: js.UndefOr[js.Array[TrackProps]] = js.native
}

object FileConfig {
  @scala.inline
  def apply(): FileConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileConfig]
  }
  @scala.inline
  implicit class FileConfigOps[Self <: FileConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributes(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(js.undefined)
        ret
    }
    @scala.inline
    def withDashVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dashVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDashVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dashVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withForceAudio(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceAudio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceAudio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceAudio")(js.undefined)
        ret
    }
    @scala.inline
    def withForceDASH(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceDASH")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceDASH: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceDASH")(js.undefined)
        ret
    }
    @scala.inline
    def withForceHLS(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceHLS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceHLS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceHLS")(js.undefined)
        ret
    }
    @scala.inline
    def withForceVideo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceVideo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceVideo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceVideo")(js.undefined)
        ret
    }
    @scala.inline
    def withHlsOptions(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hlsOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHlsOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hlsOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withHlsVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hlsVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHlsVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hlsVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withTracks(value: js.Array[TrackProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tracks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTracks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tracks")(js.undefined)
        ret
    }
  }
  
}

