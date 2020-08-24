package typingsSlinky.pulumiAws.cloudwatchMod

import typingsSlinky.pulumiAws.eventRuleMixinsMod.EventRuleEventHandler
import typingsSlinky.pulumiAws.eventRuleMixinsMod.EventRuleEventSubscriptionArgs
import typingsSlinky.pulumiPulumi.resourceMod.ComponentResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cloudwatch", "onSchedule")
@js.native
object onSchedule extends js.Object {
  def apply(name: String, schedule: String, handler: EventRuleEventHandler): typingsSlinky.pulumiAws.eventRuleMixinsMod.EventRuleEventSubscription = js.native
  def apply(
    name: String,
    schedule: String,
    handler: EventRuleEventHandler,
    args: js.UndefOr[scala.Nothing],
    opts: ComponentResourceOptions
  ): typingsSlinky.pulumiAws.eventRuleMixinsMod.EventRuleEventSubscription = js.native
  def apply(
    name: String,
    schedule: String,
    handler: EventRuleEventHandler,
    args: EventRuleEventSubscriptionArgs
  ): typingsSlinky.pulumiAws.eventRuleMixinsMod.EventRuleEventSubscription = js.native
  def apply(
    name: String,
    schedule: String,
    handler: EventRuleEventHandler,
    args: EventRuleEventSubscriptionArgs,
    opts: ComponentResourceOptions
  ): typingsSlinky.pulumiAws.eventRuleMixinsMod.EventRuleEventSubscription = js.native
}

