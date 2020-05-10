package typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuperStickerMetadata extends js.Object {
  var altText: js.UndefOr[String] = js.native
  var altTextLanguage: js.UndefOr[String] = js.native
  var stickerId: js.UndefOr[String] = js.native
}

object SuperStickerMetadata {
  @scala.inline
  def apply(): SuperStickerMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuperStickerMetadata]
  }
  @scala.inline
  implicit class SuperStickerMetadataOps[Self <: SuperStickerMetadata] (val x: Self) extends AnyVal {
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

