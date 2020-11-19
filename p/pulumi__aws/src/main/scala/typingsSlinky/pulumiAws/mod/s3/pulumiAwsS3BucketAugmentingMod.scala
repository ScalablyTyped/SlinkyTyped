package typingsSlinky.pulumiAws.mod.s3

import typingsSlinky.pulumiAws.s3MixinsMod.BucketEventHandler
import typingsSlinky.pulumiAws.s3MixinsMod.BucketEventSubscriptionArgs
import typingsSlinky.pulumiAws.s3MixinsMod.ObjectCreatedSubscriptionArgs
import typingsSlinky.pulumiAws.s3MixinsMod.ObjectRemovedSubscriptionArgs
import typingsSlinky.pulumiPulumi.resourceMod.ComponentResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
@JSImport("@pulumi/aws/s3/bucket", JSImport.Namespace)
@js.native
object pulumiAwsS3BucketAugmentingMod extends js.Object {
  
  @js.native
  trait Bucket extends js.Object {
    
    /**
      * Creates a new subscription to events fired from this Bucket to the handler provided,
      * along with options to control the behavior of the subscription.  This function should be
      * used when full control over the subscription is wanted, and other helpers (like
      * onObjectCreated/onObjectRemoved) are not sufficient.
      */
    def onEvent(name: String, handler: BucketEventHandler, args: BucketEventSubscriptionArgs): typingsSlinky.pulumiAws.s3MixinsMod.BucketEventSubscription = js.native
    def onEvent(
      name: String,
      handler: BucketEventHandler,
      args: BucketEventSubscriptionArgs,
      opts: ComponentResourceOptions
    ): typingsSlinky.pulumiAws.s3MixinsMod.BucketEventSubscription = js.native
    
    /**
      * Creates a new subscription to events fired from this Bucket to the handler provided,
      * along with options to control the behavior of the subscription.  The handler will be
      * called whenever a matching [s3.Object] is created.
      */
    def onObjectCreated(name: String, handler: BucketEventHandler): typingsSlinky.pulumiAws.s3MixinsMod.BucketEventSubscription = js.native
    def onObjectCreated(
      name: String,
      handler: BucketEventHandler,
      args: js.UndefOr[scala.Nothing],
      opts: ComponentResourceOptions
    ): typingsSlinky.pulumiAws.s3MixinsMod.BucketEventSubscription = js.native
    def onObjectCreated(name: String, handler: BucketEventHandler, args: ObjectCreatedSubscriptionArgs): typingsSlinky.pulumiAws.s3MixinsMod.BucketEventSubscription = js.native
    def onObjectCreated(
      name: String,
      handler: BucketEventHandler,
      args: ObjectCreatedSubscriptionArgs,
      opts: ComponentResourceOptions
    ): typingsSlinky.pulumiAws.s3MixinsMod.BucketEventSubscription = js.native
    
    /**
      * Creates a new subscription to events fired from this Bucket to the handler provided,
      * along with options to control the behavior of the subscription.  The handler will be
      * called whenever an matching [s3.Object] is removed.
      */
    def onObjectRemoved(name: String, handler: BucketEventHandler): typingsSlinky.pulumiAws.s3MixinsMod.BucketEventSubscription = js.native
    def onObjectRemoved(
      name: String,
      handler: BucketEventHandler,
      args: js.UndefOr[scala.Nothing],
      opts: ComponentResourceOptions
    ): typingsSlinky.pulumiAws.s3MixinsMod.BucketEventSubscription = js.native
    def onObjectRemoved(name: String, handler: BucketEventHandler, args: ObjectRemovedSubscriptionArgs): typingsSlinky.pulumiAws.s3MixinsMod.BucketEventSubscription = js.native
    def onObjectRemoved(
      name: String,
      handler: BucketEventHandler,
      args: ObjectRemovedSubscriptionArgs,
      opts: ComponentResourceOptions
    ): typingsSlinky.pulumiAws.s3MixinsMod.BucketEventSubscription = js.native
  }
}
