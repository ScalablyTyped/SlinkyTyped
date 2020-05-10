package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Event extends js.Object {
  /**
    * The package name of the app that's recording the event.
    */
  var AppPackageName: js.UndefOr[string] = js.native
  /**
    * The title of the app that's recording the event.
    */
  var AppTitle: js.UndefOr[string] = js.native
  /**
    * The version number of the app that's recording the event.
    */
  var AppVersionCode: js.UndefOr[string] = js.native
  /**
    * One or more custom attributes that are associated with the event.
    */
  var Attributes: js.UndefOr[MapOfString] = js.native
  /**
    * The version of the SDK that's running on the client device.
    */
  var ClientSdkVersion: js.UndefOr[string] = js.native
  /**
    * The name of the event.
    */
  var EventType: string = js.native
  /**
    * One or more custom metrics that are associated with the event.
    */
  var Metrics: js.UndefOr[MapOfDouble] = js.native
  /**
    * The name of the SDK that's being used to record the event.
    */
  var SdkName: js.UndefOr[string] = js.native
  /**
    * Information about the session in which the event occurred.
    */
  var Session: js.UndefOr[typingsSlinky.awsSdk.pinpointMod.Session] = js.native
  /**
    * The date and time, in ISO 8601 format, when the event occurred.
    */
  var Timestamp: string = js.native
}

object Event {
  @scala.inline
  def apply(EventType: string, Timestamp: string): Event = {
    val __obj = js.Dynamic.literal(EventType = EventType.asInstanceOf[js.Any], Timestamp = Timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  @scala.inline
  implicit class EventOps[Self <: Event] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEventType(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimestamp(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppPackageName(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AppPackageName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppPackageName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AppPackageName")(js.undefined)
        ret
    }
    @scala.inline
    def withAppTitle(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AppTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AppTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withAppVersionCode(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AppVersionCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppVersionCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AppVersionCode")(js.undefined)
        ret
    }
    @scala.inline
    def withAttributes(value: MapOfString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attributes")(js.undefined)
        ret
    }
    @scala.inline
    def withClientSdkVersion(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientSdkVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientSdkVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientSdkVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withMetrics(value: MapOfDouble): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Metrics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetrics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Metrics")(js.undefined)
        ret
    }
    @scala.inline
    def withSdkName(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SdkName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSdkName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SdkName")(js.undefined)
        ret
    }
    @scala.inline
    def withSession(value: Session): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Session")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSession: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Session")(js.undefined)
        ret
    }
  }
  
}

