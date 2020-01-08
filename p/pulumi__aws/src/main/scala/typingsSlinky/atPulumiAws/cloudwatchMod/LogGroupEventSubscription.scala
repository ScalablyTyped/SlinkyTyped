package typingsSlinky.atPulumiAws.cloudwatchMod

import typingsSlinky.atPulumiAws.cloudwatchLogGroupMixinsMod.LogGroupEventHandler
import typingsSlinky.atPulumiAws.cloudwatchLogGroupMixinsMod.LogGroupEventSubscriptionArgs
import typingsSlinky.atPulumiPulumi.resourceMod.ComponentResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cloudwatch", "LogGroupEventSubscription")
@js.native
class LogGroupEventSubscription protected ()
  extends typingsSlinky.atPulumiAws.cloudwatchLogGroupMixinsMod.LogGroupEventSubscription {
  def this(
    name: String,
    logGroup: typingsSlinky.atPulumiAws.cloudwatchLogGroupMod.LogGroup,
    handler: LogGroupEventHandler
  ) = this()
  def this(
    name: String,
    logGroup: typingsSlinky.atPulumiAws.cloudwatchLogGroupMod.LogGroup,
    handler: LogGroupEventHandler,
    args: LogGroupEventSubscriptionArgs
  ) = this()
  def this(
    name: String,
    logGroup: typingsSlinky.atPulumiAws.cloudwatchLogGroupMod.LogGroup,
    handler: LogGroupEventHandler,
    args: LogGroupEventSubscriptionArgs,
    opts: ComponentResourceOptions
  ) = this()
}

