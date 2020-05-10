package typingsSlinky.phaser.Phaser.Loader.FileTypes

import typingsSlinky.phaser.Phaser.Types.Loader.XHRSettingsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpineFileConfig extends js.Object {
  var atlasExtension: js.UndefOr[String] = js.native
  var atlasURL: js.UndefOr[String] = js.native
  var atlasXhrSettings: js.UndefOr[XHRSettingsObject] = js.native
  var key: String = js.native
  var normalMap: js.UndefOr[String] = js.native
  var textureExtension: js.UndefOr[String] = js.native
  var textureURL: js.UndefOr[String] = js.native
  var textureXhrSettings: js.UndefOr[XHRSettingsObject] = js.native
}

object SpineFileConfig {
  @scala.inline
  def apply(key: String): SpineFileConfig = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpineFileConfig]
  }
  @scala.inline
  implicit class SpineFileConfigOps[Self <: SpineFileConfig] (val x: Self) extends AnyVal {
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
    def withNormalMap(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNormalMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalMap")(js.undefined)
        ret
    }
    @scala.inline
    def withTextureExtension(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textureExtension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextureExtension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textureExtension")(js.undefined)
        ret
    }
    @scala.inline
    def withTextureURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textureURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextureURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textureURL")(js.undefined)
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
  }
  
}

