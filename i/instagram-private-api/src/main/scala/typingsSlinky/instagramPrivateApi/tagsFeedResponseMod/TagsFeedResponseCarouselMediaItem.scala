package typingsSlinky.instagramPrivateApi.tagsFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagsFeedResponseCarouselMediaItem extends js.Object {
  var carousel_parent_id: String = js.native
  var id: String = js.native
  var image_versions2: TagsFeedResponseImageVersions2 = js.native
  var is_dash_eligible: js.UndefOr[Double] = js.native
  var media_type: Double = js.native
  var number_of_qualities: js.UndefOr[Double] = js.native
  var original_height: Double = js.native
  var original_width: Double = js.native
  var pk: String = js.native
  var usertags: js.UndefOr[TagsFeedResponseUsertags] = js.native
  var video_codec: js.UndefOr[String] = js.native
  var video_dash_manifest: js.UndefOr[String] = js.native
  var video_duration: js.UndefOr[Double] = js.native
  var video_versions: js.UndefOr[js.Array[TagsFeedResponseVideoVersionsItem]] = js.native
}

object TagsFeedResponseCarouselMediaItem {
  @scala.inline
  def apply(
    carousel_parent_id: String,
    id: String,
    image_versions2: TagsFeedResponseImageVersions2,
    media_type: Double,
    original_height: Double,
    original_width: Double,
    pk: String
  ): TagsFeedResponseCarouselMediaItem = {
    val __obj = js.Dynamic.literal(carousel_parent_id = carousel_parent_id.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image_versions2 = image_versions2.asInstanceOf[js.Any], media_type = media_type.asInstanceOf[js.Any], original_height = original_height.asInstanceOf[js.Any], original_width = original_width.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagsFeedResponseCarouselMediaItem]
  }
  @scala.inline
  implicit class TagsFeedResponseCarouselMediaItemOps[Self <: TagsFeedResponseCarouselMediaItem] (val x: Self) extends AnyVal {
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
    def withImage_versions2(value: TagsFeedResponseImageVersions2): Self = {
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
    def withIs_dash_eligible(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_dash_eligible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIs_dash_eligible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_dash_eligible")(js.undefined)
        ret
    }
    @scala.inline
    def withNumber_of_qualities(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number_of_qualities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumber_of_qualities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number_of_qualities")(js.undefined)
        ret
    }
    @scala.inline
    def withUsertags(value: TagsFeedResponseUsertags): Self = {
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
    def withVideo_codec(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("video_codec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideo_codec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("video_codec")(js.undefined)
        ret
    }
    @scala.inline
    def withVideo_dash_manifest(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("video_dash_manifest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideo_dash_manifest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("video_dash_manifest")(js.undefined)
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
    def withVideo_versions(value: js.Array[TagsFeedResponseVideoVersionsItem]): Self = {
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

