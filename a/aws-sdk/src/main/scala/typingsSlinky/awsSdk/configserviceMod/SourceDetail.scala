package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceDetail extends js.Object {
  /**
    * The source of the event, such as an AWS service, that triggers AWS Config to evaluate your AWS resources.
    */
  var EventSource: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.EventSource] = js.native
  /**
    * The frequency at which you want AWS Config to run evaluations for a custom rule with a periodic trigger. If you specify a value for MaximumExecutionFrequency, then MessageType must use the ScheduledNotification value.  By default, rules with a periodic trigger are evaluated every 24 hours. To change the frequency, specify a valid value for the MaximumExecutionFrequency parameter. Based on the valid value you choose, AWS Config runs evaluations once for each valid value. For example, if you choose Three_Hours, AWS Config runs evaluations once every three hours. In this case, Three_Hours is the frequency of this rule.  
    */
  var MaximumExecutionFrequency: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.MaximumExecutionFrequency] = js.native
  /**
    * The type of notification that triggers AWS Config to run an evaluation for a rule. You can specify the following notification types:    ConfigurationItemChangeNotification - Triggers an evaluation when AWS Config delivers a configuration item as a result of a resource change.    OversizedConfigurationItemChangeNotification - Triggers an evaluation when AWS Config delivers an oversized configuration item. AWS Config may generate this notification type when a resource changes and the notification exceeds the maximum size allowed by Amazon SNS.    ScheduledNotification - Triggers a periodic evaluation at the frequency specified for MaximumExecutionFrequency.    ConfigurationSnapshotDeliveryCompleted - Triggers a periodic evaluation when AWS Config delivers a configuration snapshot.   If you want your custom rule to be triggered by configuration changes, specify two SourceDetail objects, one for ConfigurationItemChangeNotification and one for OversizedConfigurationItemChangeNotification.
    */
  var MessageType: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.MessageType] = js.native
}

object SourceDetail {
  @scala.inline
  def apply(): SourceDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceDetail]
  }
  @scala.inline
  implicit class SourceDetailOps[Self <: SourceDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEventSource(value: EventSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventSource")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumExecutionFrequency(value: MaximumExecutionFrequency): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaximumExecutionFrequency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumExecutionFrequency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaximumExecutionFrequency")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageType(value: MessageType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MessageType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MessageType")(js.undefined)
        ret
    }
  }
  
}

