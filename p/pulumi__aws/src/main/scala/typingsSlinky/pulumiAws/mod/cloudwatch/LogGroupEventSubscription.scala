package typingsSlinky.pulumiAws.mod.cloudwatch

import typingsSlinky.pulumiAws.logGroupMixinsMod.LogGroupEventHandler
import typingsSlinky.pulumiAws.logGroupMixinsMod.LogGroupEventSubscriptionArgs
import typingsSlinky.pulumiPulumi.resourceMod.ComponentResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "cloudwatch.LogGroupEventSubscription")
@js.native
class LogGroupEventSubscription protected ()
  extends typingsSlinky.pulumiAws.cloudwatchMod.LogGroupEventSubscription {
  def this(
    name: String,
    logGroup: typingsSlinky.pulumiAws.logGroupMod.LogGroup,
    handler: LogGroupEventHandler
  ) = this()
  def this(
    name: String,
    logGroup: typingsSlinky.pulumiAws.logGroupMod.LogGroup,
    handler: LogGroupEventHandler,
    args: LogGroupEventSubscriptionArgs
  ) = this()
  def this(
    name: String,
    logGroup: typingsSlinky.pulumiAws.logGroupMod.LogGroup,
    handler: LogGroupEventHandler,
    args: js.UndefOr[scala.Nothing],
    opts: ComponentResourceOptions
  ) = this()
  def this(
    name: String,
    logGroup: typingsSlinky.pulumiAws.logGroupMod.LogGroup,
    handler: LogGroupEventHandler,
    args: LogGroupEventSubscriptionArgs,
    opts: ComponentResourceOptions
  ) = this()
}

