package typingsSlinky.reactPlayer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config extends js.Object {
  var dailymotion: js.UndefOr[DailyMotionConfig] = js.native
  var facebook: js.UndefOr[FacebookConfig] = js.native
  var file: js.UndefOr[FileConfig] = js.native
  var mixcloud: js.UndefOr[MixcloudConfig] = js.native
  var soundcloud: js.UndefOr[SoundCloudConfig] = js.native
  var vimeo: js.UndefOr[VimeoConfig] = js.native
  var wistia: js.UndefOr[WistiaConfig] = js.native
  var youtube: js.UndefOr[YouTubeConfig] = js.native
}

object Config {
  @scala.inline
  def apply(): Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDailymotion(value: DailyMotionConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dailymotion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDailymotion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dailymotion")(js.undefined)
        ret
    }
    @scala.inline
    def withFacebook(value: FacebookConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facebook")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFacebook: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facebook")(js.undefined)
        ret
    }
    @scala.inline
    def withFile(value: FileConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(js.undefined)
        ret
    }
    @scala.inline
    def withMixcloud(value: MixcloudConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mixcloud")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMixcloud: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mixcloud")(js.undefined)
        ret
    }
    @scala.inline
    def withSoundcloud(value: SoundCloudConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("soundcloud")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSoundcloud: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("soundcloud")(js.undefined)
        ret
    }
    @scala.inline
    def withVimeo(value: VimeoConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vimeo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVimeo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vimeo")(js.undefined)
        ret
    }
    @scala.inline
    def withWistia(value: WistiaConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wistia")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWistia: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wistia")(js.undefined)
        ret
    }
    @scala.inline
    def withYoutube(value: YouTubeConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("youtube")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYoutube: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("youtube")(js.undefined)
        ret
    }
  }
  
}

