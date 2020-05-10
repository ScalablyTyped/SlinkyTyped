package typingsSlinky.pulumiAws.outputMod.cfg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RuleSourceSourceDetail extends js.Object {
  /**
    * The source of the event, such as an AWS service, that triggers AWS Config
    * to evaluate your AWS resources. This defaults to `aws.config` and is the only valid value.
    */
  var eventSource: js.UndefOr[String] = js.native
  /**
    * The frequency that you want AWS Config to run evaluations for a rule that
    * is triggered periodically. If specified, requires `messageType` to be `ScheduledNotification`.
    */
  var maximumExecutionFrequency: js.UndefOr[String] = js.native
  /**
    * The type of notification that triggers AWS Config to run an evaluation for a rule. You can specify the following notification types:
    */
  var messageType: js.UndefOr[String] = js.native
}

object RuleSourceSourceDetail {
  @scala.inline
  def apply(): RuleSourceSourceDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuleSourceSourceDetail]
  }
  @scala.inline
  implicit class RuleSourceSourceDetailOps[Self <: RuleSourceSourceDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEventSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventSource")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumExecutionFrequency(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumExecutionFrequency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumExecutionFrequency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumExecutionFrequency")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageType")(js.undefined)
        ret
    }
  }
  
}

