package typingsSlinky.pulumiAws.mod.sqs

import typingsSlinky.pulumiAws.sqsMixinsMod.QueueEventHandler
import typingsSlinky.pulumiAws.sqsMixinsMod.QueueEventSubscriptionArgs
import typingsSlinky.pulumiPulumi.resourceMod.ComponentResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "sqs.QueueEventSubscription")
@js.native
class QueueEventSubscription protected ()
  extends typingsSlinky.pulumiAws.sqsMod.QueueEventSubscription {
  def this(name: String, queue: typingsSlinky.pulumiAws.sqsQueueMod.Queue, handler: QueueEventHandler) = this()
  def this(
    name: String,
    queue: typingsSlinky.pulumiAws.sqsQueueMod.Queue,
    handler: QueueEventHandler,
    args: QueueEventSubscriptionArgs
  ) = this()
  def this(
    name: String,
    queue: typingsSlinky.pulumiAws.sqsQueueMod.Queue,
    handler: QueueEventHandler,
    args: QueueEventSubscriptionArgs,
    opts: ComponentResourceOptions
  ) = this()
}

