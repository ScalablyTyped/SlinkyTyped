package typingsSlinky.pulumiAws.snsMod

import typingsSlinky.pulumiAws.snsMixinsMod.TopicEventHandler
import typingsSlinky.pulumiAws.snsMixinsMod.TopicEventSubscriptionArgs
import typingsSlinky.pulumiPulumi.resourceMod.ComponentResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/sns", "TopicEventSubscription")
@js.native
class TopicEventSubscription protected ()
  extends typingsSlinky.pulumiAws.snsMixinsMod.TopicEventSubscription {
  def this(name: String, topic: typingsSlinky.pulumiAws.topicMod.Topic, handler: TopicEventHandler) = this()
  def this(
    name: String,
    topic: typingsSlinky.pulumiAws.topicMod.Topic,
    handler: TopicEventHandler,
    args: TopicEventSubscriptionArgs
  ) = this()
  def this(
    name: String,
    topic: typingsSlinky.pulumiAws.topicMod.Topic,
    handler: TopicEventHandler,
    args: js.UndefOr[scala.Nothing],
    opts: ComponentResourceOptions
  ) = this()
  def this(
    name: String,
    topic: typingsSlinky.pulumiAws.topicMod.Topic,
    handler: TopicEventHandler,
    args: TopicEventSubscriptionArgs,
    opts: ComponentResourceOptions
  ) = this()
}
