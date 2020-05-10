package typingsSlinky.phaser.Phaser.Types.Loader.FileTypes

import typingsSlinky.phaser.Phaser.Types.Loader.XHRSettingsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoFileConfig extends js.Object {
  /**
    * Load the video as a data blob, or via the Video element?
    */
  var asBlob: js.UndefOr[Boolean] = js.native
  /**
    * The key to use for this file, or a file configuration object.
    */
  var key: String | VideoFileConfig = js.native
  /**
    * The load event to listen for when _not_ loading as a blob. Either 'loadeddata', 'canplay' or 'canplaythrough'.
    */
  var loadEvent: js.UndefOr[String] = js.native
  /**
    * Does the video have an audio track? If not you can enable auto-playing on it.
    */
  var noAudio: js.UndefOr[Boolean] = js.native
  /**
    * The absolute or relative URL to load this file from in a config object.
    */
  var urlConfig: js.UndefOr[js.Any] = js.native
  /**
    * Extra XHR Settings specifically for this file.
    */
  var xhrSettings: js.UndefOr[XHRSettingsObject] = js.native
}

object VideoFileConfig {
  @scala.inline
  def apply(key: String | VideoFileConfig): VideoFileConfig = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoFileConfig]
  }
  @scala.inline
  implicit class VideoFileConfigOps[Self <: VideoFileConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKey(value: String | VideoFileConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAsBlob(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asBlob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsBlob: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asBlob")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadEvent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withNoAudio(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noAudio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoAudio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noAudio")(js.undefined)
        ret
    }
    @scala.inline
    def withUrlConfig(value: js.Any): Self = {
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

