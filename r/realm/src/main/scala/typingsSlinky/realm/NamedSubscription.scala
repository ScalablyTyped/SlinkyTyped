package typingsSlinky.realm

import typingsSlinky.realm.Realm.Sync.SubscriptionState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NamedSubscription extends js.Object {
  
  val createdAt: js.Date = js.native
  
  val error: String = js.native
  
  val expiresAt: js.Date = js.native
  
  val name: String = js.native
  
  val objectType: String = js.native
  
  var query: String = js.native
  
  val state: SubscriptionState = js.native
  
  var timeToLive: Double = js.native
  
  val updatedAt: js.Date = js.native
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
  
  @scala.inline
  implicit class NamedSubscriptionOps[Self <: NamedSubscription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreatedAt(value: js.Date): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiresAt(value: js.Date): Self = this.set("expiresAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectType(value: String): Self = this.set("objectType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: SubscriptionState): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeToLive(value: Double): Self = this.set("timeToLive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedAt(value: js.Date): Self = this.set("updatedAt", value.asInstanceOf[js.Any])
  }
}
