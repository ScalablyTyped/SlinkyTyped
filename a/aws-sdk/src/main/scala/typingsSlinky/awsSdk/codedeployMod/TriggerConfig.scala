package typingsSlinky.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TriggerConfig extends js.Object {
  /**
    * The event type or types for which notifications are triggered.
    */
  var triggerEvents: js.UndefOr[TriggerEventTypeList] = js.native
  /**
    * The name of the notification trigger.
    */
  var triggerName: js.UndefOr[TriggerName] = js.native
  /**
    * The ARN of the Amazon Simple Notification Service topic through which notifications about deployment or instance events are sent.
    */
  var triggerTargetArn: js.UndefOr[TriggerTargetArn] = js.native
}

object TriggerConfig {
  @scala.inline
  def apply(): TriggerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TriggerConfig]
  }
  @scala.inline
  implicit class TriggerConfigOps[Self <: TriggerConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTriggerEvents(value: TriggerEventTypeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTriggerEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withTriggerName(value: TriggerName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTriggerName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerName")(js.undefined)
        ret
    }
    @scala.inline
    def withTriggerTargetArn(value: TriggerTargetArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerTargetArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTriggerTargetArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerTargetArn")(js.undefined)
        ret
    }
  }
  
}

