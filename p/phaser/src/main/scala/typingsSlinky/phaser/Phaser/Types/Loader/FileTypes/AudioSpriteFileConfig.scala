package typingsSlinky.phaser.Phaser.Types.Loader.FileTypes

import typingsSlinky.phaser.Phaser.Types.Loader.XHRSettingsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AudioSpriteFileConfig extends js.Object {
  /**
    * The audio configuration options.
    */
  var audioConfig: js.UndefOr[js.Any] = js.native
  /**
    * The absolute or relative URL to load the audio file from.
    */
  var audioURL: js.UndefOr[js.Object] = js.native
  /**
    * Extra XHR Settings specifically for the audio file.
    */
  var audioXhrSettings: js.UndefOr[XHRSettingsObject] = js.native
  /**
    * The absolute or relative URL to load the json file from. Or a well formed JSON object to use instead.
    */
  var jsonURL: String = js.native
  /**
    * Extra XHR Settings specifically for the json file.
    */
  var jsonXhrSettings: js.UndefOr[XHRSettingsObject] = js.native
  /**
    * The key of the file. Must be unique within both the Loader and the Audio Cache.
    */
  var key: String = js.native
}

object AudioSpriteFileConfig {
  @scala.inline
  def apply(jsonURL: String, key: String): AudioSpriteFileConfig = {
    val __obj = js.Dynamic.literal(jsonURL = jsonURL.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioSpriteFileConfig]
  }
  @scala.inline
  implicit class AudioSpriteFileConfigOps[Self <: AudioSpriteFileConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJsonURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAudioConfig(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudioConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withAudioURL(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudioURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioURL")(js.undefined)
        ret
    }
    @scala.inline
    def withAudioXhrSettings(value: XHRSettingsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioXhrSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudioXhrSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioXhrSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withJsonXhrSettings(value: XHRSettingsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonXhrSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJsonXhrSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonXhrSettings")(js.undefined)
        ret
    }
  }
  
}

