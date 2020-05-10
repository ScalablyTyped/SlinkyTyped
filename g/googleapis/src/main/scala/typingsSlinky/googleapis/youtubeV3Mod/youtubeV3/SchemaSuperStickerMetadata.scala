package typingsSlinky.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaSuperStickerMetadata extends js.Object {
  /**
    * Internationalized alt text that describes the sticker image and any
    * animation associated with it.
    */
  var altText: js.UndefOr[String] = js.native
  /**
    * Specifies the localization language in which the alt text is returned.
    */
  var altTextLanguage: js.UndefOr[String] = js.native
  /**
    * Unique identifier of the Super Sticker. This is a shorter form of the
    * alt_text that includes pack name and a recognizable characteristic of the
    * sticker.
    */
  var stickerId: js.UndefOr[String] = js.native
}

object SchemaSuperStickerMetadata {
  @scala.inline
  def apply(): SchemaSuperStickerMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSuperStickerMetadata]
  }
  @scala.inline
  implicit class SchemaSuperStickerMetadataOps[Self <: SchemaSuperStickerMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAltText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAltText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altText")(js.undefined)
        ret
    }
    @scala.inline
    def withAltTextLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altTextLanguage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAltTextLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altTextLanguage")(js.undefined)
        ret
    }
    @scala.inline
    def withStickerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stickerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStickerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stickerId")(js.undefined)
        ret
    }
  }
  
}

