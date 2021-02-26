package typingsSlinky.amazonConnectStreams.connect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectionState extends StObject {
  
  /** A `Date` object that indicates when the the connection was put in that state. */
  val timestamp: js.Date = js.native
  
  /** The connection state type, as per the `ConnectionStateType` enumeration. */
  val `type`: ConnectionStateType = js.native
}
object ConnectionState {
  
  @scala.inline
  def apply(timestamp: js.Date, `type`: ConnectionStateType): ConnectionState = {
    val __obj = js.Dynamic.literal(timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionState]
  }
  
  @scala.inline
  implicit class ConnectionStateMutableBuilder[Self <: ConnectionState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTimestamp(value: js.Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ConnectionStateType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
