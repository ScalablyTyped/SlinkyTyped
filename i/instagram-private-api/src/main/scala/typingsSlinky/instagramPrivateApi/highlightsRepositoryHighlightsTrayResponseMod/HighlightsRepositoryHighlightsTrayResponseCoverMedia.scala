package typingsSlinky.instagramPrivateApi.highlightsRepositoryHighlightsTrayResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HighlightsRepositoryHighlightsTrayResponseCoverMedia extends js.Object {
  var crop_rect: js.Array[Double | String] = js.native
  var cropped_image_version: HighlightsRepositoryHighlightsTrayResponseCroppedImageVersion = js.native
  var media_id: String = js.native
}

object HighlightsRepositoryHighlightsTrayResponseCoverMedia {
  @scala.inline
  def apply(
    crop_rect: js.Array[Double | String],
    cropped_image_version: HighlightsRepositoryHighlightsTrayResponseCroppedImageVersion,
    media_id: String
  ): HighlightsRepositoryHighlightsTrayResponseCoverMedia = {
    val __obj = js.Dynamic.literal(crop_rect = crop_rect.asInstanceOf[js.Any], cropped_image_version = cropped_image_version.asInstanceOf[js.Any], media_id = media_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightsRepositoryHighlightsTrayResponseCoverMedia]
  }
  @scala.inline
  implicit class HighlightsRepositoryHighlightsTrayResponseCoverMediaOps[Self <: HighlightsRepositoryHighlightsTrayResponseCoverMedia] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCrop_rect(value: js.Array[Double | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crop_rect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCropped_image_version(value: HighlightsRepositoryHighlightsTrayResponseCroppedImageVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cropped_image_version")(value.asInstanceOf[js.Any])
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

