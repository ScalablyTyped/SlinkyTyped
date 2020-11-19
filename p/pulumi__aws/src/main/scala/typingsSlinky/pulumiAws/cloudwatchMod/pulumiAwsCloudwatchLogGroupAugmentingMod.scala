package typingsSlinky.pulumiAws.cloudwatchMod

import typingsSlinky.pulumiAws.lambdaMixinsMod.Callback
import typingsSlinky.pulumiAws.logGroupMixinsMod.DecodedLogGroupEvent
import typingsSlinky.pulumiAws.logGroupMixinsMod.LogGroupEventHandler
import typingsSlinky.pulumiAws.logGroupMixinsMod.LogGroupEventSubscriptionArgs
import typingsSlinky.pulumiPulumi.resourceMod.ComponentResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
@JSImport("@pulumi/aws/cloudwatch", "@pulumi/aws/cloudwatch/logGroup")
@js.native
object pulumiAwsCloudwatchLogGroupAugmentingMod extends js.Object {
  
  @js.native
  trait LogGroup extends js.Object {
    
    /**
      * Creates a new subscription to events fired from this LogGroup to the callback provided,
      * along with options to control the behavior of the subscription.
      *
      * The events will be provided in their decoded form.  Because this event hookup needs to
      * execute code to convert the raw messages, it can only be passed an [EntryPoint] callback,
      * not a [lambda.Function] instance.
      */
    def onDecodedEvent(name: String, callback: Callback[DecodedLogGroupEvent, Unit]): typingsSlinky.pulumiAws.logGroupMixinsMod.LogGroupEventSubscription = js.native
    def onDecodedEvent(
      name: String,
      callback: Callback[DecodedLogGroupEvent, Unit],
      args: js.UndefOr[scala.Nothing],
      opts: ComponentResourceOptions
    ): typingsSlinky.pulumiAws.logGroupMixinsMod.LogGroupEventSubscription = js.native
    def onDecodedEvent(name: String, callback: Callback[DecodedLogGroupEvent, Unit], args: LogGroupEventSubscriptionArgs): typingsSlinky.pulumiAws.logGroupMixinsMod.LogGroupEventSubscription = js.native
    def onDecodedEvent(
      name: String,
      callback: Callback[DecodedLogGroupEvent, Unit],
      args: LogGroupEventSubscriptionArgs,
      opts: ComponentResourceOptions
    ): typingsSlinky.pulumiAws.logGroupMixinsMod.LogGroupEventSubscription = js.native
    
    /**
      * Creates a new subscription to events fired from this LogGroup to the handler provided,
      * along with options to control the behavior of the subscription.
      *
      * The events will be produced in raw (gzipped + base64 encoded) form.
      */
    def onEvent(name: String, handler: LogGroupEventHandler): typingsSlinky.pulumiAws.logGroupMixinsMod.LogGroupEventSubscription = js.native
    def onEvent(
      name: String,
      handler: LogGroupEventHandler,
      args: js.UndefOr[scala.Nothing],
      opts: ComponentResourceOptions
    ): typingsSlinky.pulumiAws.logGroupMixinsMod.LogGroupEventSubscription = js.native
    def onEvent(name: String, handler: LogGroupEventHandler, args: LogGroupEventSubscriptionArgs): typingsSlinky.pulumiAws.logGroupMixinsMod.LogGroupEventSubscription = js.native
    def onEvent(
      name: String,
      handler: LogGroupEventHandler,
      args: LogGroupEventSubscriptionArgs,
      opts: ComponentResourceOptions
    ): typingsSlinky.pulumiAws.logGroupMixinsMod.LogGroupEventSubscription = js.native
  }
}
