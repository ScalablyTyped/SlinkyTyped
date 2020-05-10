package typingsSlinky.phaser.Phaser.Types.Loader.FileTypes

import typingsSlinky.phaser.Phaser.Types.Loader.XHRSettingsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BitmapFontFileConfig extends js.Object {
  /**
    * The default file extension to use for the font data xml if no url is provided.
    */
  var fontDataExtension: js.UndefOr[String] = js.native
  /**
    * The absolute or relative URL to load the font data xml file from.
    */
  var fontDataURL: js.UndefOr[String] = js.native
  /**
    * Extra XHR Settings specifically for the font data xml file.
    */
  var fontDataXhrSettings: js.UndefOr[XHRSettingsObject] = js.native
  /**
    * The key of the file. Must be unique within both the Loader and the Texture Manager.
    */
  var key: String = js.native
  /**
    * The filename of an associated normal map. It uses the same path and url to load as the texture image.
    */
  var normalMap: js.UndefOr[String] = js.native
  /**
    * The default file extension to use for the image texture if no url is provided.
    */
  var textureExtension: js.UndefOr[String] = js.native
  /**
    * The absolute or relative URL to load the texture image file from.
    */
  var textureURL: js.UndefOr[String] = js.native
  /**
    * Extra XHR Settings specifically for the texture image file.
    */
  var textureXhrSettings: js.UndefOr[XHRSettingsObject] = js.native
}

object BitmapFontFileConfig {
  @scala.inline
  def apply(key: String): BitmapFontFileConfig = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[BitmapFontFileConfig]
  }
  @scala.inline
  implicit class BitmapFontFileConfigOps[Self <: BitmapFontFileConfig] (val x: Self) extends AnyVal {
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
    def withFontDataExtension(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontDataExtension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontDataExtension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontDataExtension")(js.undefined)
        ret
    }
    @scala.inline
    def withFontDataURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontDataURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontDataURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontDataURL")(js.undefined)
        ret
    }
    @scala.inline
    def withFontDataXhrSettings(value: XHRSettingsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontDataXhrSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontDataXhrSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontDataXhrSettings")(js.undefined)
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

