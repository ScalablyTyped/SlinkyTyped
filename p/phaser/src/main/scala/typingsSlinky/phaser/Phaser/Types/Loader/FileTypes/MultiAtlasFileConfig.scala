package typingsSlinky.phaser.Phaser.Types.Loader.FileTypes

import typingsSlinky.phaser.Phaser.Types.Loader.XHRSettingsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiAtlasFileConfig extends js.Object {
  /**
    * The default file extension to use for the atlas json if no url is provided.
    */
  var atlasExtension: js.UndefOr[String] = js.native
  /**
    * The absolute or relative URL to load the multi atlas json file from. Or, a well formed JSON object.
    */
  var atlasURL: js.UndefOr[String] = js.native
  /**
    * Extra XHR Settings specifically for the atlas json file.
    */
  var atlasXhrSettings: js.UndefOr[XHRSettingsObject] = js.native
  /**
    * Optional Base URL to use when loading the textures defined in the atlas data.
    */
  var baseURL: js.UndefOr[String] = js.native
  /**
    * The key of the file. Must be unique within both the Loader and the Texture Manager.
    */
  var key: String = js.native
  /**
    * Optional path to use when loading the textures defined in the atlas data.
    */
  var path: js.UndefOr[String] = js.native
  /**
    * Extra XHR Settings specifically for the texture files.
    */
  var textureXhrSettings: js.UndefOr[XHRSettingsObject] = js.native
  /**
    * An alias for 'atlasURL'. If given, it overrides anything set in 'atlasURL'.
    */
  var url: js.UndefOr[String] = js.native
}

object MultiAtlasFileConfig {
  @scala.inline
  def apply(key: String): MultiAtlasFileConfig = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiAtlasFileConfig]
  }
  @scala.inline
  implicit class MultiAtlasFileConfigOps[Self <: MultiAtlasFileConfig] (val x: Self) extends AnyVal {
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
    def withAtlasExtension(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("atlasExtension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAtlasExtension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("atlasExtension")(js.undefined)
        ret
    }
    @scala.inline
    def withAtlasURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("atlasURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAtlasURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("atlasURL")(js.undefined)
        ret
    }
    @scala.inline
    def withAtlasXhrSettings(value: XHRSettingsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("atlasXhrSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAtlasXhrSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("atlasXhrSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withBaseURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseURL")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
    @scala.inline
    def withTextureXhrSettings(value: XHRSettingsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textureXhrSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextureXhrSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textureXhrSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

