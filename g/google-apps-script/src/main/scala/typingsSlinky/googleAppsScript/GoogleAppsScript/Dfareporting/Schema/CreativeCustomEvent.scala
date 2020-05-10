package typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreativeCustomEvent extends js.Object {
  var advertiserCustomEventId: js.UndefOr[String] = js.native
  var advertiserCustomEventName: js.UndefOr[String] = js.native
  var advertiserCustomEventType: js.UndefOr[String] = js.native
  var artworkLabel: js.UndefOr[String] = js.native
  var artworkType: js.UndefOr[String] = js.native
  var exitClickThroughUrl: js.UndefOr[CreativeClickThroughUrl] = js.native
  var id: js.UndefOr[String] = js.native
  var popupWindowProperties: js.UndefOr[PopupWindowProperties] = js.native
  var targetType: js.UndefOr[String] = js.native
  var videoReportingId: js.UndefOr[String] = js.native
}

object CreativeCustomEvent {
  @scala.inline
  def apply(): CreativeCustomEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreativeCustomEvent]
  }
  @scala.inline
  implicit class CreativeCustomEventOps[Self <: CreativeCustomEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdvertiserCustomEventId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advertiserCustomEventId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdvertiserCustomEventId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advertiserCustomEventId")(js.undefined)
        ret
    }
    @scala.inline
    def withAdvertiserCustomEventName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advertiserCustomEventName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdvertiserCustomEventName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advertiserCustomEventName")(js.undefined)
        ret
    }
    @scala.inline
    def withAdvertiserCustomEventType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advertiserCustomEventType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdvertiserCustomEventType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advertiserCustomEventType")(js.undefined)
        ret
    }
    @scala.inline
    def withArtworkLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artworkLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArtworkLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artworkLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withArtworkType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artworkType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArtworkType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artworkType")(js.undefined)
        ret
    }
    @scala.inline
    def withExitClickThroughUrl(value: CreativeClickThroughUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exitClickThroughUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExitClickThroughUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exitClickThroughUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withPopupWindowProperties(value: PopupWindowProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupWindowProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopupWindowProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupWindowProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetType")(js.undefined)
        ret
    }
    @scala.inline
    def withVideoReportingId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoReportingId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideoReportingId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoReportingId")(js.undefined)
        ret
    }
  }
  
}

