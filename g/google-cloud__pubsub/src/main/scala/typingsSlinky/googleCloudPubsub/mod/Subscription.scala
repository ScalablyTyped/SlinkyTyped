package typingsSlinky.googleCloudPubsub.mod

import typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.ISubscription
import typingsSlinky.googleCloudPubsub.subscriptionMod.SubscriptionMetadata
import typingsSlinky.googleCloudPubsub.subscriptionMod.SubscriptionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@google-cloud/pubsub", "Subscription")
@js.native
class Subscription protected ()
  extends typingsSlinky.googleCloudPubsub.subscriptionMod.Subscription {
  def this(pubsub: typingsSlinky.googleCloudPubsub.pubsubMod.PubSub, name: String) = this()
  def this(
    pubsub: typingsSlinky.googleCloudPubsub.pubsubMod.PubSub,
    name: String,
    options: SubscriptionOptions
  ) = this()
}
/* static members */
object Subscription {
  
  /*!
    * Formats Subscription metadata.
    *
    * @private
    */
  @JSImport("@google-cloud/pubsub", "Subscription.formatMetadata_")
  @js.native
  def formatMetadata_(metadata: SubscriptionMetadata): ISubscription = js.native
  
  /*!
    * Format the name of a subscription. A subscription's full name is in the
    * format of projects/{projectId}/subscriptions/{subName}.
    *
    * @private
    */
  @JSImport("@google-cloud/pubsub", "Subscription.formatName_")
  @js.native
  def formatName_(projectId: String, name: String): String = js.native
}
