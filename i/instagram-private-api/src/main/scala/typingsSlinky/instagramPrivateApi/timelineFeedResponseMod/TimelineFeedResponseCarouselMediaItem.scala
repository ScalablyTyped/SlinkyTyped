package typingsSlinky.instagramPrivateApi.timelineFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimelineFeedResponseCarouselMediaItem extends js.Object {
  var ad_action: js.UndefOr[String] = js.native
  var ad_link_type: js.UndefOr[Double] = js.native
  var ad_metadata: js.UndefOr[js.Array[TimelineFeedResponseAdMetadataItem]] = js.native
  var android_links: js.UndefOr[js.Array[TimelineFeedResponseAndroidLinksItem]] = js.native
  var carousel_parent_id: String = js.native
  var dominant_color: js.UndefOr[String] = js.native
  var force_overlay: js.UndefOr[Boolean] = js.native
  var headline: js.UndefOr[TimelineFeedResponseHeadline] = js.native
  var hide_nux_text: js.UndefOr[Boolean] = js.native
  var id: String = js.native
  var image_versions2: TimelineFeedResponseImageVersions2 = js.native
  var link: js.UndefOr[String] = js.native
  var link_hint_text: js.UndefOr[String] = js.native
  var link_text: js.UndefOr[String] = js.native
  var media_type: Double = js.native
  var original_height: Double = js.native
  var original_width: Double = js.native
  var overlay_subtitle: js.UndefOr[String] = js.native
  var overlay_text: js.UndefOr[String] = js.native
  var overlay_title: js.UndefOr[String] = js.native
  var pk: String = js.native
  var usertags: js.UndefOr[TimelineFeedResponseUsertags] = js.native
  var video_subtitles_uri: js.UndefOr[Null] = js.native
}

object TimelineFeedResponseCarouselMediaItem {
  @scala.inline
  def apply(
    carousel_parent_id: String,
    id: String,
    image_versions2: TimelineFeedResponseImageVersions2,
    media_type: Double,
    original_height: Double,
    original_width: Double,
    pk: String
  ): TimelineFeedResponseCarouselMediaItem = {
    val __obj = js.Dynamic.literal(carousel_parent_id = carousel_parent_id.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image_versions2 = image_versions2.asInstanceOf[js.Any], media_type = media_type.asInstanceOf[js.Any], original_height = original_height.asInstanceOf[js.Any], original_width = original_width.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineFeedResponseCarouselMediaItem]
  }
  @scala.inline
  implicit class TimelineFeedResponseCarouselMediaItemOps[Self <: TimelineFeedResponseCarouselMediaItem] (val x: Self) extends AnyVal {
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
    def withImage_versions2(value: TimelineFeedResponseImageVersions2): Self = {
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
    def withAd_action(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ad_action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAd_action: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ad_action")(js.undefined)
        ret
    }
    @scala.inline
    def withAd_link_type(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ad_link_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAd_link_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ad_link_type")(js.undefined)
        ret
    }
    @scala.inline
    def withAd_metadata(value: js.Array[TimelineFeedResponseAdMetadataItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ad_metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAd_metadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ad_metadata")(js.undefined)
        ret
    }
    @scala.inline
    def withAndroid_links(value: js.Array[TimelineFeedResponseAndroidLinksItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("android_links")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAndroid_links: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("android_links")(js.undefined)
        ret
    }
    @scala.inline
    def withDominant_color(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dominant_color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDominant_color: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dominant_color")(js.undefined)
        ret
    }
    @scala.inline
    def withForce_overlay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("force_overlay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForce_overlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("force_overlay")(js.undefined)
        ret
    }
    @scala.inline
    def withHeadline(value: TimelineFeedResponseHeadline): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeadline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headline")(js.undefined)
        ret
    }
    @scala.inline
    def withHide_nux_text(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide_nux_text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHide_nux_text: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide_nux_text")(js.undefined)
        ret
    }
    @scala.inline
    def withLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(js.undefined)
        ret
    }
    @scala.inline
    def withLink_hint_text(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link_hint_text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLink_hint_text: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link_hint_text")(js.undefined)
        ret
    }
    @scala.inline
    def withLink_text(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link_text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLink_text: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link_text")(js.undefined)
        ret
    }
    @scala.inline
    def withOverlay_subtitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlay_subtitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverlay_subtitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlay_subtitle")(js.undefined)
        ret
    }
    @scala.inline
    def withOverlay_text(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlay_text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverlay_text: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlay_text")(js.undefined)
        ret
    }
    @scala.inline
    def withOverlay_title(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlay_title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverlay_title: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlay_title")(js.undefined)
        ret
    }
    @scala.inline
    def withUsertags(value: TimelineFeedResponseUsertags): Self = {
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
  }
  
}

