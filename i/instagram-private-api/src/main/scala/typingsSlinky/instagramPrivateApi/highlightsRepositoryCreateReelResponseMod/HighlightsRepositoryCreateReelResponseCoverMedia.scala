package typingsSlinky.instagramPrivateApi.highlightsRepositoryCreateReelResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HighlightsRepositoryCreateReelResponseCoverMedia extends js.Object {
  var crop_rect: Null = js.native
  var cropped_image_version: HighlightsRepositoryCreateReelResponseCroppedImageVersion = js.native
  var full_image_version: HighlightsRepositoryCreateReelResponseFullImageVersion = js.native
  var media_id: String = js.native
}

object HighlightsRepositoryCreateReelResponseCoverMedia {
  @scala.inline
  def apply(
    crop_rect: Null,
    cropped_image_version: HighlightsRepositoryCreateReelResponseCroppedImageVersion,
    full_image_version: HighlightsRepositoryCreateReelResponseFullImageVersion,
    media_id: String
  ): HighlightsRepositoryCreateReelResponseCoverMedia = {
    val __obj = js.Dynamic.literal(crop_rect = crop_rect.asInstanceOf[js.Any], cropped_image_version = cropped_image_version.asInstanceOf[js.Any], full_image_version = full_image_version.asInstanceOf[js.Any], media_id = media_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightsRepositoryCreateReelResponseCoverMedia]
  }
  @scala.inline
  implicit class HighlightsRepositoryCreateReelResponseCoverMediaOps[Self <: HighlightsRepositoryCreateReelResponseCoverMedia] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCrop_rect(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crop_rect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCropped_image_version(value: HighlightsRepositoryCreateReelResponseCroppedImageVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cropped_image_version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFull_image_version(value: HighlightsRepositoryCreateReelResponseFullImageVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("full_image_version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMedia_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media_id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

