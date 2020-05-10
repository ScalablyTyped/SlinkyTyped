package typingsSlinky.instagramPrivateApi.mediaRepositoryConfigureSidecarResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaRepositoryConfigureSidecarResponseCarouselMediaItem extends js.Object {
  var carousel_parent_id: String = js.native
  var fb_user_tags: js.UndefOr[MediaRepositoryConfigureSidecarResponseFbUserTags] = js.native
  var id: String = js.native
  var image_versions2: MediaRepositoryConfigureSidecarResponseImageVersions2 = js.native
  var media_type: Double = js.native
  var original_height: Double = js.native
  var original_width: Double = js.native
  var pk: String = js.native
  var usertags: js.UndefOr[MediaRepositoryConfigureSidecarResponseUsertags] = js.native
  var video_duration: js.UndefOr[Double] = js.native
  var video_versions: js.UndefOr[js.Array[MediaRepositoryConfigureSidecarResponseVideoVersionsItem]] = js.native
}

object MediaRepositoryConfigureSidecarResponseCarouselMediaItem {
  @scala.inline
  def apply(
    carousel_parent_id: String,
    id: String,
    image_versions2: MediaRepositoryConfigureSidecarResponseImageVersions2,
    media_type: Double,
    original_height: Double,
    original_width: Double,
    pk: String
  ): MediaRepositoryConfigureSidecarResponseCarouselMediaItem = {
    val __obj = js.Dynamic.literal(carousel_parent_id = carousel_parent_id.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image_versions2 = image_versions2.asInstanceOf[js.Any], media_type = media_type.asInstanceOf[js.Any], original_height = original_height.asInstanceOf[js.Any], original_width = original_width.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaRepositoryConfigureSidecarResponseCarouselMediaItem]
  }
  @scala.inline
  implicit class MediaRepositoryConfigureSidecarResponseCarouselMediaItemOps[Self <: MediaRepositoryConfigureSidecarResponseCarouselMediaItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCarousel_parent_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("carousel_parent_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImage_versions2(value: MediaRepositoryConfigureSidecarResponseImageVersions2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image_versions2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMedia_type(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginal_height(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("original_height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginal_width(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("original_width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPk(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFb_user_tags(value: MediaRepositoryConfigureSidecarResponseFbUserTags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fb_user_tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFb_user_tags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fb_user_tags")(js.undefined)
        ret
    }
    @scala.inline
    def withUsertags(value: MediaRepositoryConfigureSidecarResponseUsertags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usertags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsertags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usertags")(js.undefined)
        ret
    }
    @scala.inline
    def withVideo_duration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("video_duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideo_duration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("video_duration")(js.undefined)
        ret
    }
    @scala.inline
    def withVideo_versions(value: js.Array[MediaRepositoryConfigureSidecarResponseVideoVersionsItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("video_versions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideo_versions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("video_versions")(js.undefined)
        ret
    }
  }
  
}

