package typingsSlinky.googleCloudPubsub.mod

import typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.IReceivedMessage
import typingsSlinky.googleCloudPubsub.subscriberMod.Subscriber
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@google-cloud/pubsub", "Message")
@js.native
class Message protected ()
  extends typingsSlinky.googleCloudPubsub.subscriberMod.Message {
  /**
    * @hideconstructor
    *
    * @param {Subscriber} sub The parent subscriber.
    * @param {object} message The raw message response.
    */
  def this(sub: Subscriber, hasAckIdMessageDeliveryAttempt: IReceivedMessage) = this()
}
