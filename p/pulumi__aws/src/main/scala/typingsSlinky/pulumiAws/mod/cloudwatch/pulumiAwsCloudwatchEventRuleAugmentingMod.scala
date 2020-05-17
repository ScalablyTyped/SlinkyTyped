package typingsSlinky.pulumiAws.mod.cloudwatch

import typingsSlinky.pulumiAws.eventRuleMixinsMod.EventRuleEventHandler
import typingsSlinky.pulumiAws.eventRuleMixinsMod.EventRuleEventSubscriptionArgs
import typingsSlinky.pulumiPulumi.resourceMod.ComponentResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* augmented module */
@JSImport("@pulumi/aws/cloudwatch/eventRule", JSImport.Namespace)
@js.native
object pulumiAwsCloudwatchEventRuleAugmentingMod extends js.Object {
  @js.native
  trait EventRule extends js.Object {
    /**
      * Creates a new subscription to events fired from this EventRule to the handler provided, along
      * with options to control the behavior of the subscription.
      */
    def onEvent(name: String, handler: EventRuleEventHandler): typingsSlinky.pulumiAws.eventRuleMixinsMod.EventRuleEventSubscription = js.native
    def onEvent(name: String, handler: EventRuleEventHandler, args: EventRuleEventSubscriptionArgs): typingsSlinky.pulumiAws.eventRuleMixinsMod.EventRuleEventSubscription = js.native
    def onEvent(
      name: String,
      handler: EventRuleEventHandler,
      args: EventRuleEventSubscriptionArgs,
      opts: ComponentResourceOptions
    ): typingsSlinky.pulumiAws.eventRuleMixinsMod.EventRuleEventSubscription = js.native
  }
  
}

