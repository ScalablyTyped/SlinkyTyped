package typingsSlinky.pulumiAws.notificationRuleMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.codestarnotifications.NotificationRuleTarget
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationRuleArgs extends js.Object {
  /**
    * The level of detail to include in the notifications for this resource. Possible values are `BASIC` and `FULL`.
    */
  val detailType: Input[String] = js.native
  /**
    * A list of event types associated with this notification rule.
    * For list of allowed events see [here](https://docs.aws.amazon.com/codestar-notifications/latest/userguide/concepts.html#concepts-api).
    */
  val eventTypeIds: Input[js.Array[Input[String]]] = js.native
  /**
    * The name of notification rule.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The ARN of the resource to associate with the notification rule.
    */
  val resource: Input[String] = js.native
  /**
    * The status of the notification rule. Possible values are `ENABLED` and `DISABLED`, default is `ENABLED`.
    */
  val status: js.UndefOr[Input[String]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * Configuration blocks containing notification target information. Can be specified multiple times. At least one target must be specified on creation.
    */
  val targets: js.UndefOr[Input[js.Array[Input[NotificationRuleTarget]]]] = js.native
}

object NotificationRuleArgs {
  @scala.inline
  def apply(detailType: Input[String], eventTypeIds: Input[js.Array[Input[String]]], resource: Input[String]): NotificationRuleArgs = {
    val __obj = js.Dynamic.literal(detailType = detailType.asInstanceOf[js.Any], eventTypeIds = eventTypeIds.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationRuleArgs]
  }
  @scala.inline
  implicit class NotificationRuleArgsOps[Self <: NotificationRuleArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDetailType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detailType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventTypeIds(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventTypeIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResource(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Input[StringDictionary[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
    @scala.inline
    def withTargets(value: Input[js.Array[Input[NotificationRuleTarget]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targets")(js.undefined)
        ret
    }
  }
  
}

