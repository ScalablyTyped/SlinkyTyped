package typingsSlinky.awsSdk.applicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigurationEvent extends js.Object {
  /**
    *  The details of the event in plain text. 
    */
  var EventDetail: js.UndefOr[ConfigurationEventDetail] = js.native
  /**
    *  The name of the resource Application Insights attempted to configure. 
    */
  var EventResourceName: js.UndefOr[ConfigurationEventResourceName] = js.native
  /**
    *  The resource type that Application Insights attempted to configure, for example, CLOUDWATCH_ALARM. 
    */
  var EventResourceType: js.UndefOr[ConfigurationEventResourceType] = js.native
  /**
    *  The status of the configuration update event. Possible values include INFO, WARN, and ERROR. 
    */
  var EventStatus: js.UndefOr[ConfigurationEventStatus] = js.native
  /**
    *  The timestamp of the event. 
    */
  var EventTime: js.UndefOr[js.Date] = js.native
  /**
    *  The resource monitored by Application Insights. 
    */
  var MonitoredResourceARN: js.UndefOr[ConfigurationEventMonitoredResourceARN] = js.native
}

object ConfigurationEvent {
  @scala.inline
  def apply(): ConfigurationEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigurationEvent]
  }
  @scala.inline
  implicit class ConfigurationEventOps[Self <: ConfigurationEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEventDetail(value: ConfigurationEventDetail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventDetail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventDetail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventDetail")(js.undefined)
        ret
    }
    @scala.inline
    def withEventResourceName(value: ConfigurationEventResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventResourceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventResourceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventResourceName")(js.undefined)
        ret
    }
    @scala.inline
    def withEventResourceType(value: ConfigurationEventResourceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventResourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventResourceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventResourceType")(js.undefined)
        ret
    }
    @scala.inline
    def withEventStatus(value: ConfigurationEventStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withEventTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventTime")(js.undefined)
        ret
    }
    @scala.inline
    def withMonitoredResourceARN(value: ConfigurationEventMonitoredResourceARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MonitoredResourceARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonitoredResourceARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MonitoredResourceARN")(js.undefined)
        ret
    }
  }
  
}

