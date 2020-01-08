package typingsSlinky.atPulumiAws.atPulumiAwsMod.sqs

import typingsSlinky.atPulumiAws.sqsSqsMixinsMod.QueueEventHandler
import typingsSlinky.atPulumiAws.sqsSqsMixinsMod.QueueEventSubscriptionArgs
import typingsSlinky.atPulumiPulumi.resourceMod.ComponentResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "sqs.QueueEventSubscription")
@js.native
class QueueEventSubscription protected ()
  extends typingsSlinky.atPulumiAws.sqsMod.QueueEventSubscription {
  def this(name: String, queue: typingsSlinky.atPulumiAws.sqsQueueMod.Queue, handler: QueueEventHandler) = this()
  def this(
    name: String,
    queue: typingsSlinky.atPulumiAws.sqsQueueMod.Queue,
    handler: QueueEventHandler,
    args: QueueEventSubscriptionArgs
  ) = this()
  def this(
    name: String,
    queue: typingsSlinky.atPulumiAws.sqsQueueMod.Queue,
    handler: QueueEventHandler,
    args: QueueEventSubscriptionArgs,
    opts: ComponentResourceOptions
  ) = this()
}

