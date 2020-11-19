package typingsSlinky.pulumiAws.sqsMixinsMod

import typingsSlinky.pulumiAws.lambdaMod.EventSourceMapping
import typingsSlinky.pulumiAws.lambdaMod.EventSubscription
import typingsSlinky.pulumiAws.sqsQueueMod.Queue
import typingsSlinky.pulumiPulumi.resourceMod.ComponentResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/sqs/sqsMixins", "QueueEventSubscription")
@js.native
class QueueEventSubscription protected () extends EventSubscription {
  def this(name: String, queue: Queue, handler: QueueEventHandler) = this()
  def this(name: String, queue: Queue, handler: QueueEventHandler, args: QueueEventSubscriptionArgs) = this()
  def this(
    name: String,
    queue: Queue,
    handler: QueueEventHandler,
    args: js.UndefOr[scala.Nothing],
    opts: ComponentResourceOptions
  ) = this()
  def this(
    name: String,
    queue: Queue,
    handler: QueueEventHandler,
    args: QueueEventSubscriptionArgs,
    opts: ComponentResourceOptions
  ) = this()
  
  /**
    * The underlying sns object created for the subscription.
    */
  val eventSourceMapping: EventSourceMapping = js.native
  
  val queue: Queue = js.native
}
