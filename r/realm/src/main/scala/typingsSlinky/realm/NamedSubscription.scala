package typingsSlinky.realm

import typingsSlinky.realm.Realm.Sync.SubscriptionState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NamedSubscription extends js.Object {
  val createdAt: js.Date
  val error: String
  val expiresAt: js.Date
  val name: String
  val objectType: String
  var query: String
  val state: SubscriptionState
  var timeToLive: Double
  val updatedAt: js.Date
}

object NamedSubscription {
  @scala.inline
  def apply(
    createdAt: js.Date,
    error: String,
    expiresAt: js.Date,
    name: String,
    objectType: String,
    query: String,
    state: SubscriptionState,
    timeToLive: Double,
    updatedAt: js.Date
  ): NamedSubscription = {
    val __obj = js.Dynamic.literal(createdAt = createdAt.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], expiresAt = expiresAt.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], timeToLive = timeToLive.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NamedSubscription]
  }
}

