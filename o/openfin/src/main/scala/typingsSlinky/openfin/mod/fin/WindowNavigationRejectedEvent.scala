package typingsSlinky.openfin.mod.fin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowNavigationRejectedEvent extends WindowEvent {
  
  var sourceName: String = js.native
  
  var url: String = js.native
}
object WindowNavigationRejectedEvent {
  
  @scala.inline
  def apply(
    name: String,
    sourceName: String,
    topic: String,
    `type`: OpenFinApplicationEventType,
    url: String,
    uuid: String
  ): WindowNavigationRejectedEvent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], sourceName = sourceName.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowNavigationRejectedEvent]
  }
  
  @scala.inline
  implicit class WindowNavigationRejectedEventMutableBuilder[Self <: WindowNavigationRejectedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSourceName(value: String): Self = StObject.set(x, "sourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
