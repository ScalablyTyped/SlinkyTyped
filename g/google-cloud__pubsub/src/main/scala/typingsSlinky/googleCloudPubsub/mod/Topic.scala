package typingsSlinky.googleCloudPubsub.mod

import typingsSlinky.googleCloudPubsub.publisherMod.PublishOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@google-cloud/pubsub", "Topic")
@js.native
class Topic protected ()
  extends typingsSlinky.googleCloudPubsub.topicMod.Topic {
  def this(pubsub: typingsSlinky.googleCloudPubsub.srcPubsubMod.PubSub, name: String) = this()
  def this(pubsub: typingsSlinky.googleCloudPubsub.srcPubsubMod.PubSub, name: String, options: PublishOptions) = this()
}

/* static members */
@JSImport("@google-cloud/pubsub", "Topic")
@js.native
object Topic extends js.Object {
  /**
    * Format the name of a topic. A Topic's full name is in the format of
    * 'projects/{projectId}/topics/{topicName}'.
    *
    * @private
    *
    * @return {string}
    */
  def formatName_(projectId: String, name: String): String = js.native
}

