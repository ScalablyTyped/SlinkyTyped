package typingsSlinky.openfin.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubscriberAdded extends StObject {
  
  var subscriberAdded: String = js.native
  
  var subscriberRemoved: String = js.native
}
object SubscriberAdded {
  
  @scala.inline
  def apply(subscriberAdded: String, subscriberRemoved: String): SubscriberAdded = {
    val __obj = js.Dynamic.literal(subscriberAdded = subscriberAdded.asInstanceOf[js.Any], subscriberRemoved = subscriberRemoved.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriberAdded]
  }
  
  @scala.inline
  implicit class SubscriberAddedMutableBuilder[Self <: SubscriberAdded] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSubscriberAdded(value: String): Self = StObject.set(x, "subscriberAdded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriberRemoved(value: String): Self = StObject.set(x, "subscriberRemoved", value.asInstanceOf[js.Any])
  }
}
