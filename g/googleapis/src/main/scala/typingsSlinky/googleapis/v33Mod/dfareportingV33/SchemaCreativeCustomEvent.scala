package typingsSlinky.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creative Custom Event.
  */
@js.native
trait SchemaCreativeCustomEvent extends js.Object {
  /**
    * Unique ID of this event used by Reporting and Data Transfer. This is a
    * read-only field.
    */
  var advertiserCustomEventId: js.UndefOr[String] = js.native
  /**
    * User-entered name for the event.
    */
  var advertiserCustomEventName: js.UndefOr[String] = js.native
  /**
    * Type of the event. This is a read-only field.
    */
  var advertiserCustomEventType: js.UndefOr[String] = js.native
  /**
    * Artwork label column, used to link events in Campaign Manager back to
    * events in Studio. This is a required field and should not be modified
    * after insertion.
    */
  var artworkLabel: js.UndefOr[String] = js.native
  /**
    * Artwork type used by the creative.This is a read-only field.
    */
  var artworkType: js.UndefOr[String] = js.native
  /**
    * Exit click-through URL for the event. This field is used only for exit
    * events.
    */
  var exitClickThroughUrl: js.UndefOr[SchemaCreativeClickThroughUrl] = js.native
  /**
    * ID of this event. This is a required field and should not be modified
    * after insertion.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Properties for rich media popup windows. This field is used only for exit
    * events.
    */
  var popupWindowProperties: js.UndefOr[SchemaPopupWindowProperties] = js.native
  /**
    * Target type used by the event.
    */
  var targetType: js.UndefOr[String] = js.native
  /**
    * Video reporting ID, used to differentiate multiple videos in a single
    * creative. This is a read-only field.
    */
  var videoReportingId: js.UndefOr[String] = js.native
}

object SchemaCreativeCustomEvent {
  @scala.inline
  def apply(): SchemaCreativeCustomEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreativeCustomEvent]
  }
  @scala.inline
  implicit class SchemaCreativeCustomEventOps[Self <: SchemaCreativeCustomEvent] (val x: Self) extends AnyVal {
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
    def withExitClickThroughUrl(value: SchemaCreativeClickThroughUrl): Self = {
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
    def withPopupWindowProperties(value: SchemaPopupWindowProperties): Self = {
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

