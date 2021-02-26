package typingsSlinky.devtoolsProtocol.mod.Protocol.HeapProfiler

import typingsSlinky.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LastSeenObjectIdEvent extends StObject {
  
  var lastSeenObjectId: integer = js.native
  
  var timestamp: Double = js.native
}
object LastSeenObjectIdEvent {
  
  @scala.inline
  def apply(lastSeenObjectId: integer, timestamp: Double): LastSeenObjectIdEvent = {
    val __obj = js.Dynamic.literal(lastSeenObjectId = lastSeenObjectId.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[LastSeenObjectIdEvent]
  }
  
  @scala.inline
  implicit class LastSeenObjectIdEventMutableBuilder[Self <: LastSeenObjectIdEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLastSeenObjectId(value: integer): Self = StObject.set(x, "lastSeenObjectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
