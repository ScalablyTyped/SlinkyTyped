package typingsSlinky.atPulumiAws.atPulumiAwsMod.sns

import typingsSlinky.atPulumiAws.snsSnsMixinsMod.TopicEventHandler
import typingsSlinky.atPulumiAws.snsSnsMixinsMod.TopicEventSubscriptionArgs
import typingsSlinky.atPulumiPulumi.resourceMod.ComponentResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "sns.TopicEventSubscription")
@js.native
class TopicEventSubscription protected ()
  extends typingsSlinky.atPulumiAws.snsMod.TopicEventSubscription {
  def this(name: String, topic: typingsSlinky.atPulumiAws.snsTopicMod.Topic, handler: TopicEventHandler) = this()
  def this(
    name: String,
    topic: typingsSlinky.atPulumiAws.snsTopicMod.Topic,
    handler: TopicEventHandler,
    args: TopicEventSubscriptionArgs
  ) = this()
  def this(
    name: String,
    topic: typingsSlinky.atPulumiAws.snsTopicMod.Topic,
    handler: TopicEventHandler,
    args: TopicEventSubscriptionArgs,
    opts: ComponentResourceOptions
  ) = this()
}

