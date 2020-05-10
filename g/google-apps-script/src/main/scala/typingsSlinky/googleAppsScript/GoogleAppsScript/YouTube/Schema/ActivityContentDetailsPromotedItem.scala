package typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActivityContentDetailsPromotedItem extends js.Object {
  var adTag: js.UndefOr[String] = js.native
  var clickTrackingUrl: js.UndefOr[String] = js.native
  var creativeViewUrl: js.UndefOr[String] = js.native
  var ctaType: js.UndefOr[String] = js.native
  var customCtaButtonText: js.UndefOr[String] = js.native
  var descriptionText: js.UndefOr[String] = js.native
  var destinationUrl: js.UndefOr[String] = js.native
  var forecastingUrl: js.UndefOr[js.Array[String]] = js.native
  var impressionUrl: js.UndefOr[js.Array[String]] = js.native
  var videoId: js.UndefOr[String] = js.native
}

object ActivityContentDetailsPromotedItem {
  @scala.inline
  def apply(): ActivityContentDetailsPromotedItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActivityContentDetailsPromotedItem]
  }
  @scala.inline
  implicit class ActivityContentDetailsPromotedItemOps[Self <: ActivityContentDetailsPromotedItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adTag")(js.undefined)
        ret
    }
    @scala.inline
    def withClickTrackingUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickTrackingUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClickTrackingUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickTrackingUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withCreativeViewUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creativeViewUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreativeViewUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creativeViewUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withCtaType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ctaType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCtaType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ctaType")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomCtaButtonText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customCtaButtonText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomCtaButtonText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customCtaButtonText")(js.undefined)
        ret
    }
    @scala.inline
    def withDescriptionText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descriptionText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescriptionText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descriptionText")(js.undefined)
        ret
    }
    @scala.inline
    def withDestinationUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withForecastingUrl(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forecastingUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForecastingUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forecastingUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withImpressionUrl(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("impressionUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImpressionUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("impressionUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withVideoId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideoId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoId")(js.undefined)
        ret
    }
  }
  
}

