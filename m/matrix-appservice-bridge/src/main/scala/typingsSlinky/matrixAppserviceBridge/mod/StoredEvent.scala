package typingsSlinky.matrixAppserviceBridge.mod

import typingsSlinky.matrixAppserviceBridge.eventMod.StoredEventDoc
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matrix-appservice-bridge", "StoredEvent")
@js.native
class StoredEvent protected ()
  extends typingsSlinky.matrixAppserviceBridge.eventMod.StoredEvent {
  /**
    * Create a store event.
    * @param roomId The matrix room ID
    * @param eventId The matrix event ID
    * @param remoteRoomId The remote room ID
    * @param remoteEventId The remote event ID
    * @param _extras Any extra data that may be included with the event.
    */
  def this(roomId: String, eventId: String, remoteRoomId: String, remoteEventId: String) = this()
  def this(
    roomId: String,
    eventId: String,
    remoteRoomId: String,
    remoteEventId: String,
    _extras: Record[String, _]
  ) = this()
}
/* static members */
object StoredEvent {
  
  /**
    * Set data about this event from a serialized data object.
    * @param data The serialized data
    */
  @JSImport("matrix-appservice-bridge", "StoredEvent.deserialize")
  @js.native
  def deserialize(data: StoredEventDoc): typingsSlinky.matrixAppserviceBridge.eventMod.StoredEvent = js.native
}
