package typingsSlinky.atPulumiAws.atPulumiAwsMod.cloudwatch

import typingsSlinky.atPulumiAws.cloudwatchEventRuleMixinsMod.EventRuleEventHandler
import typingsSlinky.atPulumiAws.cloudwatchEventRuleMixinsMod.EventRuleEventSubscriptionArgs
import typingsSlinky.atPulumiPulumi.resourceMod.ComponentResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "cloudwatch.onSchedule")
@js.native
object onSchedule extends js.Object {
  def apply(name: String, schedule: String, handler: EventRuleEventHandler): typingsSlinky.atPulumiAws.cloudwatchEventRuleMixinsMod.EventRuleEventSubscription = js.native
  def apply(
    name: String,
    schedule: String,
    handler: EventRuleEventHandler,
    args: EventRuleEventSubscriptionArgs
  ): typingsSlinky.atPulumiAws.cloudwatchEventRuleMixinsMod.EventRuleEventSubscription = js.native
  def apply(
    name: String,
    schedule: String,
    handler: EventRuleEventHandler,
    args: EventRuleEventSubscriptionArgs,
    opts: ComponentResourceOptions
  ): typingsSlinky.atPulumiAws.cloudwatchEventRuleMixinsMod.EventRuleEventSubscription = js.native
}

