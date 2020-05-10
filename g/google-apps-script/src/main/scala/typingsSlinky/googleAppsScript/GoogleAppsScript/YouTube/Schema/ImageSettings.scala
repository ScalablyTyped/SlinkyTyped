package typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageSettings extends js.Object {
  var backgroundImageUrl: js.UndefOr[LocalizedProperty] = js.native
  var bannerExternalUrl: js.UndefOr[String] = js.native
  var bannerImageUrl: js.UndefOr[String] = js.native
  var bannerMobileExtraHdImageUrl: js.UndefOr[String] = js.native
  var bannerMobileHdImageUrl: js.UndefOr[String] = js.native
  var bannerMobileImageUrl: js.UndefOr[String] = js.native
  var bannerMobileLowImageUrl: js.UndefOr[String] = js.native
  var bannerMobileMediumHdImageUrl: js.UndefOr[String] = js.native
  var bannerTabletExtraHdImageUrl: js.UndefOr[String] = js.native
  var bannerTabletHdImageUrl: js.UndefOr[String] = js.native
  var bannerTabletImageUrl: js.UndefOr[String] = js.native
  var bannerTabletLowImageUrl: js.UndefOr[String] = js.native
  var bannerTvHighImageUrl: js.UndefOr[String] = js.native
  var bannerTvImageUrl: js.UndefOr[String] = js.native
  var bannerTvLowImageUrl: js.UndefOr[String] = js.native
  var bannerTvMediumImageUrl: js.UndefOr[String] = js.native
  var largeBrandedBannerImageImapScript: js.UndefOr[LocalizedProperty] = js.native
  var largeBrandedBannerImageUrl: js.UndefOr[LocalizedProperty] = js.native
  var smallBrandedBannerImageImapScript: js.UndefOr[LocalizedProperty] = js.native
  var smallBrandedBannerImageUrl: js.UndefOr[LocalizedProperty] = js.native
  var trackingImageUrl: js.UndefOr[String] = js.native
  var watchIconImageUrl: js.UndefOr[String] = js.native
}

object ImageSettings {
  @scala.inline
  def apply(): ImageSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageSettings]
  }
  @scala.inline
  implicit class ImageSettingsOps[Self <: ImageSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackgroundImageUrl(value: LocalizedProperty): Self = {
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
    def withLargeBrandedBannerImageImapScript(value: LocalizedProperty): Self = {
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
    def withLargeBrandedBannerImageUrl(value: LocalizedProperty): Self = {
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
    def withSmallBrandedBannerImageImapScript(value: LocalizedProperty): Self = {
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
    def withSmallBrandedBannerImageUrl(value: LocalizedProperty): Self = {
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

