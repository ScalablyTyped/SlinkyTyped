package typingsSlinky.activexLibreoffice.com_.sun.star.script

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventListener extends StObject {
  
  var AddListenerParam: String = js.native
  
  var AllListener: XAllListener = js.native
  
  var EventMethod: String = js.native
  
  var Helper: js.Any = js.native
  
  var ListenerType: String = js.native
}
object EventListener {
  
  @scala.inline
  def apply(
    AddListenerParam: String,
    AllListener: XAllListener,
    EventMethod: String,
    Helper: js.Any,
    ListenerType: String
  ): EventListener = {
    val __obj = js.Dynamic.literal(AddListenerParam = AddListenerParam.asInstanceOf[js.Any], AllListener = AllListener.asInstanceOf[js.Any], EventMethod = EventMethod.asInstanceOf[js.Any], Helper = Helper.asInstanceOf[js.Any], ListenerType = ListenerType.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventListener]
  }
  
  @scala.inline
  implicit class EventListenerMutableBuilder[Self <: EventListener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddListenerParam(value: String): Self = StObject.set(x, "AddListenerParam", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllListener(value: XAllListener): Self = StObject.set(x, "AllListener", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventMethod(value: String): Self = StObject.set(x, "EventMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelper(value: js.Any): Self = StObject.set(x, "Helper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListenerType(value: String): Self = StObject.set(x, "ListenerType", value.asInstanceOf[js.Any])
  }
}
