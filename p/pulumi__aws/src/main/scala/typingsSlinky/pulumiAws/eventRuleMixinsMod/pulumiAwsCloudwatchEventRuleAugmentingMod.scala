package typingsSlinky.pulumiAws.eventRuleMixinsMod

import typingsSlinky.pulumiPulumi.resourceMod.ComponentResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def onEvent(name: String, handler: EventRuleEventHandler): EventRuleEventSubscription = js.native
    def onEvent(
      name: String,
      handler: EventRuleEventHandler,
      args: js.UndefOr[scala.Nothing],
      opts: ComponentResourceOptions
    ): EventRuleEventSubscription = js.native
    def onEvent(name: String, handler: EventRuleEventHandler, args: EventRuleEventSubscriptionArgs): EventRuleEventSubscription = js.native
    def onEvent(
      name: String,
      handler: EventRuleEventHandler,
      args: EventRuleEventSubscriptionArgs,
      opts: ComponentResourceOptions
    ): EventRuleEventSubscription = js.native
  }
}
