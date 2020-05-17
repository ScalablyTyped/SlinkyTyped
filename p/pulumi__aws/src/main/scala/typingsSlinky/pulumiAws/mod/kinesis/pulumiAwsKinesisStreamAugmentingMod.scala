package typingsSlinky.pulumiAws.mod.kinesis

import typingsSlinky.pulumiAws.kinesisMixinsMod.StreamEventHandler
import typingsSlinky.pulumiAws.kinesisMixinsMod.StreamEventSubscriptionArgs
import typingsSlinky.pulumiPulumi.resourceMod.ComponentResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* augmented module */
@JSImport("@pulumi/aws/kinesis/stream", JSImport.Namespace)
@js.native
object pulumiAwsKinesisStreamAugmentingMod extends js.Object {
  @js.native
  trait Stream extends js.Object {
    /**
      * Creates a new subscription to events fired from this Stream to the handler provided, along
      * with options to control the behavior of the subscription.
      */
    def onEvent(name: String, handler: StreamEventHandler, args: StreamEventSubscriptionArgs): typingsSlinky.pulumiAws.kinesisMixinsMod.StreamEventSubscription = js.native
    def onEvent(
      name: String,
      handler: StreamEventHandler,
      args: StreamEventSubscriptionArgs,
      opts: ComponentResourceOptions
    ): typingsSlinky.pulumiAws.kinesisMixinsMod.StreamEventSubscription = js.native
  }
  
}

