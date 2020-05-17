package typingsSlinky.gapiYoutube.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackgroundImageUrl extends js.Object {
  /**
    * The backgroundImageUrl object encapsulates settings for the background image shown on the video watch page. The image is 1200px by 615px, with a maximum file size of 128k.
    */
  var backgroundImageUrl: Default = js.native
  /**
    * This property specifies the location of the banner image that YouTube will use to generate the various banner image sizes for a channel. To obtain the URL banner images external URL, you must first upload the channel banner image that you want to use by calling the channelBanners.insert method.
    */
  var bannerExternalUrl: String = js.native
  /**
    * The URL for the banner image shown on the channel page on the YouTube website. The image is 1060px by 175px.
    */
  var bannerImageUrl: String = js.native
  /**
    * The URL for a very high-resolution banner image that displays on the channel page in mobile applications. The image is 1440px by 395px.
    */
  var bannerMobileExtraHdImageUrl: String = js.native
  /**
    * The URL for a high-resolution banner image that displays on the channel page in mobile applications. The image is 1280px by 360px.
    */
  var bannerMobileHdImageUrl: String = js.native
  /**
    * The URL for the banner image shown on the channel page in mobile applications. The image is 640px by 175px.
    */
  var bannerMobileImageUrl: String = js.native
  /**
    * The URL for a low-resolution banner image that displays on the channel page in mobile applications. The image is 320px by 88px.
    */
  var bannerMobileLowImageUrl: String = js.native
  /**
    * The URL for a medium-resolution banner image that displays on the channel page in mobile applications. The image is 960px by 263px.
    */
  var bannerMobileMediumImageUrl: String = js.native
  /**
    * The URL for an insanely high-resolution banner image that displays on the channel page in tablet applications. The image is 2560px by 424px.
    */
  var bannerTabletExtraHdImageUrl: String = js.native
  /**
    * The URL for a high-resolution banner image that displays on the channel page in tablet applications. The image is 2276px by 377px.
    */
  var bannerTabletHdImageUrl: String = js.native
  /**
    * The URL for a banner image that displays on the channel page in tablet applications. The image is 1707px by 283px.
    */
  var bannerTabletImageUrl: String = js.native
  /**
    * The URL for a low-resolution banner image that displays on the channel page in tablet applications. The image is 1138px by 188px.
    */
  var bannerTabletLowImageUrl: String = js.native
  /**
    * The URL for a banner image that displays on the channel page in television applications. The image is 2120px by 1192px.
    */
  var bannerTvImageUrl: String = js.native
  /**
    * The largeBrandedBannerImageImapScript object encapsulates information about the image map script for the banner image shown on the channel page.
    */
  var largeBrandedBannerImageImapScript: Default = js.native
  /**
    * The URL for the 854px by 70px image that appears below the video player in the expanded video view of the video watch page.
    */
  var largeBrandedBannerImageUrl: Default = js.native
  /**
    * The image map script for the small banner image. The largeBrandedBannerImageImapScript object encapsulates information about the image map script for the banner image shown on the channel page in mobile applications.
    */
  var smallBrandedBannerImageImapScript: Default = js.native
  /**
    * The URL for the 640px by 70px banner image that appears below the video player in the default view of the video watch page.
    */
  var smallBrandedBannerImageUrl: Default = js.native
  /**
    * The URL for a 1px by 1px tracking pixel that can be used to collect statistics for views of the channel or video pages.
    */
  var trackingImageUrl: String = js.native
  /**
    * The URL for the image that appears above the video player. This is a 25-pixel-high image with a flexible width that cannot exceed 170 pixels. If you do not provide this image, your channel name will appear instead of an image.
    */
  var watchIconImageUrl: String = js.native
}

object BackgroundImageUrl {
  @scala.inline
  def apply(
    backgroundImageUrl: Default,
    bannerExternalUrl: String,
    bannerImageUrl: String,
    bannerMobileExtraHdImageUrl: String,
    bannerMobileHdImageUrl: String,
    bannerMobileImageUrl: String,
    bannerMobileLowImageUrl: String,
    bannerMobileMediumImageUrl: String,
    bannerTabletExtraHdImageUrl: String,
    bannerTabletHdImageUrl: String,
    bannerTabletImageUrl: String,
    bannerTabletLowImageUrl: String,
    bannerTvImageUrl: String,
    largeBrandedBannerImageImapScript: Default,
    largeBrandedBannerImageUrl: Default,
    smallBrandedBannerImageImapScript: Default,
    smallBrandedBannerImageUrl: Default,
    trackingImageUrl: String,
    watchIconImageUrl: String
  ): BackgroundImageUrl = {
    val __obj = js.Dynamic.literal(backgroundImageUrl = backgroundImageUrl.asInstanceOf[js.Any], bannerExternalUrl = bannerExternalUrl.asInstanceOf[js.Any], bannerImageUrl = bannerImageUrl.asInstanceOf[js.Any], bannerMobileExtraHdImageUrl = bannerMobileExtraHdImageUrl.asInstanceOf[js.Any], bannerMobileHdImageUrl = bannerMobileHdImageUrl.asInstanceOf[js.Any], bannerMobileImageUrl = bannerMobileImageUrl.asInstanceOf[js.Any], bannerMobileLowImageUrl = bannerMobileLowImageUrl.asInstanceOf[js.Any], bannerMobileMediumImageUrl = bannerMobileMediumImageUrl.asInstanceOf[js.Any], bannerTabletExtraHdImageUrl = bannerTabletExtraHdImageUrl.asInstanceOf[js.Any], bannerTabletHdImageUrl = bannerTabletHdImageUrl.asInstanceOf[js.Any], bannerTabletImageUrl = bannerTabletImageUrl.asInstanceOf[js.Any], bannerTabletLowImageUrl = bannerTabletLowImageUrl.asInstanceOf[js.Any], bannerTvImageUrl = bannerTvImageUrl.asInstanceOf[js.Any], largeBrandedBannerImageImapScript = largeBrandedBannerImageImapScript.asInstanceOf[js.Any], largeBrandedBannerImageUrl = largeBrandedBannerImageUrl.asInstanceOf[js.Any], smallBrandedBannerImageImapScript = smallBrandedBannerImageImapScript.asInstanceOf[js.Any], smallBrandedBannerImageUrl = smallBrandedBannerImageUrl.asInstanceOf[js.Any], trackingImageUrl = trackingImageUrl.asInstanceOf[js.Any], watchIconImageUrl = watchIconImageUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundImageUrl]
  }
  @scala.inline
  implicit class BackgroundImageUrlOps[Self <: BackgroundImageUrl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackgroundImageUrl(value: Default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundImageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBannerExternalUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bannerExternalUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBannerImageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bannerImageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBannerMobileExtraHdImageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bannerMobileExtraHdImageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBannerMobileHdImageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bannerMobileHdImageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBannerMobileImageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bannerMobileImageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBannerMobileLowImageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bannerMobileLowImageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBannerMobileMediumImageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bannerMobileMediumImageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBannerTabletExtraHdImageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bannerTabletExtraHdImageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBannerTabletHdImageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bannerTabletHdImageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBannerTabletImageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bannerTabletImageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBannerTabletLowImageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bannerTabletLowImageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBannerTvImageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bannerTvImageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLargeBrandedBannerImageImapScript(value: Default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("largeBrandedBannerImageImapScript")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLargeBrandedBannerImageUrl(value: Default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("largeBrandedBannerImageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSmallBrandedBannerImageImapScript(value: Default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smallBrandedBannerImageImapScript")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSmallBrandedBannerImageUrl(value: Default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smallBrandedBannerImageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrackingImageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackingImageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWatchIconImageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchIconImageUrl")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

