package typingsSlinky.atPulumiAws.atPulumiAwsMod.kinesis

import typingsSlinky.atPulumiAws.kinesisKinesisMixinsMod.StreamEventHandler
import typingsSlinky.atPulumiAws.kinesisKinesisMixinsMod.StreamEventSubscriptionArgs
import typingsSlinky.atPulumiPulumi.resourceMod.ComponentResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "kinesis.StreamEventSubscription")
@js.native
class StreamEventSubscription protected ()
  extends typingsSlinky.atPulumiAws.kinesisMod.StreamEventSubscription {
  def this(
    name: String,
    stream: typingsSlinky.atPulumiAws.kinesisStreamMod.Stream,
    handler: StreamEventHandler,
    args: StreamEventSubscriptionArgs
  ) = this()
  def this(
    name: String,
    stream: typingsSlinky.atPulumiAws.kinesisStreamMod.Stream,
    handler: StreamEventHandler,
    args: StreamEventSubscriptionArgs,
    opts: ComponentResourceOptions
  ) = this()
}

