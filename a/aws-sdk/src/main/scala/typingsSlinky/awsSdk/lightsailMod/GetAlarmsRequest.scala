package typingsSlinky.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAlarmsRequest extends js.Object {
  /**
    * The name of the alarm. Specify an alarm name to return information about a specific alarm.
    */
  var alarmName: js.UndefOr[ResourceName] = js.native
  /**
    * The name of the Lightsail resource being monitored by the alarm. Specify a monitored resource name to return information about all alarms for a specific resource.
    */
  var monitoredResourceName: js.UndefOr[ResourceName] = js.native
  /**
    * The token to advance to the next page of results from your request. To get a page token, perform an initial GetAlarms request. If your results are paginated, the response will return a next page token that you can specify as the page token in a subsequent request.
    */
  var pageToken: js.UndefOr[String] = js.native
}

object GetAlarmsRequest {
  @scala.inline
  def apply(): GetAlarmsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAlarmsRequest]
  }
  @scala.inline
  implicit class GetAlarmsRequestOps[Self <: GetAlarmsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlarmName(value: ResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alarmName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlarmName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alarmName")(js.undefined)
        ret
    }
    @scala.inline
    def withMonitoredResourceName(value: ResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monitoredResourceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonitoredResourceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monitoredResourceName")(js.undefined)
        ret
    }
    @scala.inline
    def withPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageToken")(js.undefined)
        ret
    }
  }
  
}

