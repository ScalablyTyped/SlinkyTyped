package typingsSlinky.atPulumiAws

import typingsSlinky.atPulumiAws.cloudwatchEventRuleMixinsMod.EventRuleEventHandler
import typingsSlinky.atPulumiAws.cloudwatchEventRuleMixinsMod.EventRuleEventSubscription
import typingsSlinky.atPulumiAws.cloudwatchEventRuleMixinsMod.EventRuleEventSubscriptionArgs
import typingsSlinky.atPulumiPulumi.resourceMod.ComponentResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cloudwatch/cloudwatchMixins", JSImport.Namespace)
@js.native
object cloudwatchCloudwatchMixinsMod extends js.Object {
  def onSchedule(name: String, schedule: String, handler: EventRuleEventHandler): EventRuleEventSubscription = js.native
  def onSchedule(
    name: String,
    schedule: String,
    handler: EventRuleEventHandler,
    args: EventRuleEventSubscriptionArgs
  ): EventRuleEventSubscription = js.native
  def onSchedule(
    name: String,
    schedule: String,
    handler: EventRuleEventHandler,
    args: EventRuleEventSubscriptionArgs,
    opts: ComponentResourceOptions
  ): EventRuleEventSubscription = js.native
}

