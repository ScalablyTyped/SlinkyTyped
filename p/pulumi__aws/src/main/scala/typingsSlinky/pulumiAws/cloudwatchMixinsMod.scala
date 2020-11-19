package typingsSlinky.pulumiAws

import typingsSlinky.pulumiAws.eventRuleMixinsMod.EventRuleEventHandler
import typingsSlinky.pulumiAws.eventRuleMixinsMod.EventRuleEventSubscription
import typingsSlinky.pulumiAws.eventRuleMixinsMod.EventRuleEventSubscriptionArgs
import typingsSlinky.pulumiPulumi.resourceMod.ComponentResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/cloudwatch/cloudwatchMixins", JSImport.Namespace)
@js.native
object cloudwatchMixinsMod extends js.Object {
  
  def onSchedule(name: String, schedule: String, handler: EventRuleEventHandler): EventRuleEventSubscription = js.native
  def onSchedule(
    name: String,
    schedule: String,
    handler: EventRuleEventHandler,
    args: js.UndefOr[scala.Nothing],
    opts: ComponentResourceOptions
  ): EventRuleEventSubscription = js.native
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
