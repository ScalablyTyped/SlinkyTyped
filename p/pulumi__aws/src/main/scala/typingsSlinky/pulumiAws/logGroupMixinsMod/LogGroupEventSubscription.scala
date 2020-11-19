package typingsSlinky.pulumiAws.logGroupMixinsMod

import typingsSlinky.pulumiAws.lambdaMod.EventSubscription
import typingsSlinky.pulumiAws.logGroupMod.LogGroup
import typingsSlinky.pulumiAws.logSubscriptionFilterMod.LogSubscriptionFilter
import typingsSlinky.pulumiPulumi.resourceMod.ComponentResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/cloudwatch/logGroupMixins", "LogGroupEventSubscription")
@js.native
class LogGroupEventSubscription protected () extends EventSubscription {
  def this(name: String, logGroup: LogGroup, handler: LogGroupEventHandler) = this()
  def this(
    name: String,
    logGroup: LogGroup,
    handler: LogGroupEventHandler,
    args: LogGroupEventSubscriptionArgs
  ) = this()
  def this(
    name: String,
    logGroup: LogGroup,
    handler: LogGroupEventHandler,
    args: js.UndefOr[scala.Nothing],
    opts: ComponentResourceOptions
  ) = this()
  def this(
    name: String,
    logGroup: LogGroup,
    handler: LogGroupEventHandler,
    args: LogGroupEventSubscriptionArgs,
    opts: ComponentResourceOptions
  ) = this()
  
  val logGroup: LogGroup = js.native
  
  val logSubscriptionFilter: LogSubscriptionFilter = js.native
}
