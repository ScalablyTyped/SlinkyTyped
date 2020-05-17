package typingsSlinky.pulumiAws.sqsMod

import typingsSlinky.pulumiAws.sqsMixinsMod.QueueEventHandler
import typingsSlinky.pulumiAws.sqsMixinsMod.QueueEventSubscriptionArgs
import typingsSlinky.pulumiPulumi.resourceMod.ComponentResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* augmented module */
@JSImport("@pulumi/aws/sqs", "@pulumi/aws/sqs/queue")
@js.native
object pulumiAwsSqsQueueAugmentingMod extends js.Object {
  @js.native
  trait Queue extends js.Object {
    /**
      * Creates a new subscription to events fired from this Queue to the handler provided, along
      * with options to control the behavior of the subscription.
      */
    def onEvent(name: String, handler: QueueEventHandler): typingsSlinky.pulumiAws.sqsMixinsMod.QueueEventSubscription = js.native
    def onEvent(name: String, handler: QueueEventHandler, args: QueueEventSubscriptionArgs): typingsSlinky.pulumiAws.sqsMixinsMod.QueueEventSubscription = js.native
    def onEvent(
      name: String,
      handler: QueueEventHandler,
      args: QueueEventSubscriptionArgs,
      opts: ComponentResourceOptions
    ): typingsSlinky.pulumiAws.sqsMixinsMod.QueueEventSubscription = js.native
  }
  
}

