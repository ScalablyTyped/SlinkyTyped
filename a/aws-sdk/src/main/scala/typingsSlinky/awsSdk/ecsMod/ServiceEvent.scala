package typingsSlinky.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceEvent extends StObject {
  
  /**
    * The Unix timestamp for when the event was triggered.
    */
  var createdAt: js.UndefOr[js.Date] = js.native
  
  /**
    * The ID string of the event.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * The event message.
    */
  var message: js.UndefOr[String] = js.native
}
object ServiceEvent {
  
  @scala.inline
  def apply(): ServiceEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceEvent]
  }
  
  @scala.inline
  implicit class ServiceEventMutableBuilder[Self <: ServiceEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
