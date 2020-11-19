package typingsSlinky.pulumiAws.mod.kinesis

import typingsSlinky.pulumiAws.kinesisMixinsMod.StreamEventHandler
import typingsSlinky.pulumiAws.kinesisMixinsMod.StreamEventSubscriptionArgs
import typingsSlinky.pulumiPulumi.resourceMod.ComponentResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws", "kinesis.StreamEventSubscription")
@js.native
class StreamEventSubscription protected ()
  extends typingsSlinky.pulumiAws.kinesisMod.StreamEventSubscription {
  def this(
    name: String,
    stream: typingsSlinky.pulumiAws.streamMod.Stream,
    handler: StreamEventHandler,
    args: StreamEventSubscriptionArgs
  ) = this()
  def this(
    name: String,
    stream: typingsSlinky.pulumiAws.streamMod.Stream,
    handler: StreamEventHandler,
    args: StreamEventSubscriptionArgs,
    opts: ComponentResourceOptions
  ) = this()
}
