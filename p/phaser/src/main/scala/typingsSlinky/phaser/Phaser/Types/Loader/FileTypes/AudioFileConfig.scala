package typingsSlinky.phaser.Phaser.Types.Loader.FileTypes

import org.scalajs.dom.raw.AudioContext
import typingsSlinky.phaser.Phaser.Types.Loader.XHRSettingsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AudioFileConfig extends js.Object {
  /**
    * The AudioContext this file will use to process itself.
    */
  var audioContext: js.UndefOr[AudioContext] = js.native
  /**
    * The key of the file. Must be unique within the Loader and Audio Cache.
    */
  var key: String = js.native
  /**
    * The absolute or relative URL to load the file from.
    */
  var urlConfig: js.UndefOr[String] = js.native
  /**
    * Extra XHR Settings specifically for this file.
    */
  var xhrSettings: js.UndefOr[XHRSettingsObject] = js.native
}

object AudioFileConfig {
  @scala.inline
  def apply(key: String): AudioFileConfig = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioFileConfig]
  }
  @scala.inline
  implicit class AudioFileConfigOps[Self <: AudioFileConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAudioContext(value: AudioContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudioContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioContext")(js.undefined)
        ret
    }
    @scala.inline
    def withUrlConfig(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrlConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withXhrSettings(value: XHRSettingsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xhrSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXhrSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xhrSettings")(js.undefined)
        ret
    }
  }
  
}

