package typingsSlinky.pulumiAws.snsMixinsMod

import typingsSlinky.pulumiAws.lambdaMod.EventSubscription
import typingsSlinky.pulumiAws.topicMod.Topic
import typingsSlinky.pulumiAws.topicSubscriptionMod.TopicSubscription
import typingsSlinky.pulumiPulumi.resourceMod.ComponentResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/sns/snsMixins", "TopicEventSubscription")
@js.native
class TopicEventSubscription protected () extends EventSubscription {
  def this(name: String, topic: Topic, handler: TopicEventHandler) = this()
  def this(name: String, topic: Topic, handler: TopicEventHandler, args: TopicEventSubscriptionArgs) = this()
  def this(
    name: String,
    topic: Topic,
    handler: TopicEventHandler,
    args: js.UndefOr[scala.Nothing],
    opts: ComponentResourceOptions
  ) = this()
  def this(
    name: String,
    topic: Topic,
    handler: TopicEventHandler,
    args: TopicEventSubscriptionArgs,
    opts: ComponentResourceOptions
  ) = this()
  
  /**
    * The underlying sns object created for the subscription.
    */
  val subscription: TopicSubscription = js.native
  
  val topic: Topic = js.native
}
