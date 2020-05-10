package typingsSlinky.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Branding properties for images associated with the channel.
  */
@js.native
trait SchemaImageSettings extends js.Object {
  /**
    * The URL for the background image shown on the video watch page. The image
    * should be 1200px by 615px, with a maximum file size of 128k.
    */
  var backgroundImageUrl: js.UndefOr[SchemaLocalizedProperty] = js.native
  /**
    * This is used only in update requests; if it&#39;s set, we use this URL to
    * generate all of the above banner URLs.
    */
  var bannerExternalUrl: js.UndefOr[String] = js.native
  /**
    * Banner image. Desktop size (1060x175).
    */
  var bannerImageUrl: js.UndefOr[String] = js.native
  /**
    * Banner image. Mobile size high resolution (1440x395).
    */
  var bannerMobileExtraHdImageUrl: js.UndefOr[String] = js.native
  /**
    * Banner image. Mobile size high resolution (1280x360).
    */
  var bannerMobileHdImageUrl: js.UndefOr[String] = js.native
  /**
    * Banner image. Mobile size (640x175).
    */
  var bannerMobileImageUrl: js.UndefOr[String] = js.native
  /**
    * Banner image. Mobile size low resolution (320x88).
    */
  var bannerMobileLowImageUrl: js.UndefOr[String] = js.native
  /**
    * Banner image. Mobile size medium/high resolution (960x263).
    */
  var bannerMobileMediumHdImageUrl: js.UndefOr[String] = js.native
  /**
    * Banner image. Tablet size extra high resolution (2560x424).
    */
  var bannerTabletExtraHdImageUrl: js.UndefOr[String] = js.native
  /**
    * Banner image. Tablet size high resolution (2276x377).
    */
  var bannerTabletHdImageUrl: js.UndefOr[String] = js.native
  /**
    * Banner image. Tablet size (1707x283).
    */
  var bannerTabletImageUrl: js.UndefOr[String] = js.native
  /**
    * Banner image. Tablet size low resolution (1138x188).
    */
  var bannerTabletLowImageUrl: js.UndefOr[String] = js.native
  /**
    * Banner image. TV size high resolution (1920x1080).
    */
  var bannerTvHighImageUrl: js.UndefOr[String] = js.native
  /**
    * Banner image. TV size extra high resolution (2120x1192).
    */
  var bannerTvImageUrl: js.UndefOr[String] = js.native
  /**
    * Banner image. TV size low resolution (854x480).
    */
  var bannerTvLowImageUrl: js.UndefOr[String] = js.native
  /**
    * Banner image. TV size medium resolution (1280x720).
    */
  var bannerTvMediumImageUrl: js.UndefOr[String] = js.native
  /**
    * The image map script for the large banner image.
    */
  var largeBrandedBannerImageImapScript: js.UndefOr[SchemaLocalizedProperty] = js.native
  /**
    * The URL for the 854px by 70px image that appears below the video player
    * in the expanded video view of the video watch page.
    */
  var largeBrandedBannerImageUrl: js.UndefOr[SchemaLocalizedProperty] = js.native
  /**
    * The image map script for the small banner image.
    */
  var smallBrandedBannerImageImapScript: js.UndefOr[SchemaLocalizedProperty] = js.native
  /**
    * The URL for the 640px by 70px banner image that appears below the video
    * player in the default view of the video watch page.
    */
  var smallBrandedBannerImageUrl: js.UndefOr[SchemaLocalizedProperty] = js.native
  /**
    * The URL for a 1px by 1px tracking pixel that can be used to collect
    * statistics for views of the channel or video pages.
    */
  var trackingImageUrl: js.UndefOr[String] = js.native
  /**
    * The URL for the image that appears above the top-left corner of the video
    * player. This is a 25-pixel-high image with a flexible width that cannot
    * exceed 170 pixels.
    */
  var watchIconImageUrl: js.UndefOr[String] = js.native
}

object SchemaImageSettings {
  @scala.inline
  def apply(): SchemaImageSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImageSettings]
  }
  @scala.inline
  implicit class SchemaImageSettingsOps[Self <: SchemaImageSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackgroundImageUrl(value: SchemaLocalizedProperty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundImageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundImageUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundImageUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withBannerExternalUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bannerExternalUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBannerExternalUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bannerExternalUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withBannerImageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bannerImageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBannerImageUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bannerImageUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withBannerMobileExtraHdImageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bannerMobileExtraHdImageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBannerMobileExtraHdImageUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bannerMobileExtraHdImageUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withBannerMobileHdImageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bannerMobileHdImageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBannerMobileHdImageUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bannerMobileHdImageUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withBannerMobileImageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bannerMobileImageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBannerMobileImageUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bannerMobileImageUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withBannerMobileLowImageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bannerMobileLowImageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBannerMobileLowImageUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bannerMobileLowImageUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withBannerMobileMediumHdImageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bannerMobileMediumHdImageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBannerMobileMediumHdImageUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bannerMobileMediumHdImageUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withBannerTabletExtraHdImageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bannerTabletExtraHdImageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBannerTabletExtraHdImageUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bannerTabletExtraHdImageUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withBannerTabletHdImageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bannerTabletHdImageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBannerTabletHdImageUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bannerTabletHdImageUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withBannerTabletImageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bannerTabletImageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBannerTabletImageUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bannerTabletImageUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withBannerTabletLowImageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bannerTabletLowImageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBannerTabletLowImageUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bannerTabletLowImageUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withBannerTvHighImageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bannerTvHighImageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBannerTvHighImageUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bannerTvHighImageUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withBannerTvImageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bannerTvImageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBannerTvImageUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bannerTvImageUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withBannerTvLowImageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bannerTvLowImageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBannerTvLowImageUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bannerTvLowImageUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withBannerTvMediumImageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bannerTvMediumImageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBannerTvMediumImageUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bannerTvMediumImageUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withLargeBrandedBannerImageImapScript(value: SchemaLocalizedProperty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("largeBrandedBannerImageImapScript")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLargeBrandedBannerImageImapScript: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("largeBrandedBannerImageImapScript")(js.undefined)
        ret
    }
    @scala.inline
    def withLargeBrandedBannerImageUrl(value: SchemaLocalizedProperty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("largeBrandedBannerImageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLargeBrandedBannerImageUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("largeBrandedBannerImageUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withSmallBrandedBannerImageImapScript(value: SchemaLocalizedProperty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smallBrandedBannerImageImapScript")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmallBrandedBannerImageImapScript: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smallBrandedBannerImageImapScript")(js.undefined)
        ret
    }
    @scala.inline
    def withSmallBrandedBannerImageUrl(value: SchemaLocalizedProperty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smallBrandedBannerImageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmallBrandedBannerImageUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smallBrandedBannerImageUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackingImageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackingImageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackingImageUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackingImageUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withWatchIconImageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchIconImageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWatchIconImageUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchIconImageUrl")(js.undefined)
        ret
    }
  }
  
}

