package typingsSlinky.matrixAppserviceBridge

import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object usersRemoteMod {
  
  @JSImport("matrix-appservice-bridge/lib/models/users/remote", "RemoteUser")
  @js.native
  class RemoteUser protected () extends StObject {
    /**
      * @param identifier The unique ID for this user.
      * @param data The serialized key-value data object to assign to this user.
      * @throws If identifier is not supplied.
      */
    def this(id: String) = this()
    def this(id: String, data: Record[String, _]) = this()
    
    val data: Record[String, _] = js.native
    
    /**
      * Get the data value for the given key.
      * @param key An arbitrary bridge-specific key.
      * @return Stored data for this key. May be undefined.
      */
    def get[T](key: String): T = js.native
    
    /**
      * Get the Remote user ID.
      * @return The id
      */
    def getId(): String = js.native
    
    val id: String = js.native
    
    /**
      * Serialize all the data about this room, excluding the room ID.
      * @return The serialised data
      */
    def serialize(): Record[String, _] = js.native
    
    /**
      * Set an arbitrary bridge-specific data value for this room.
      * @param key The key to store the data value under.
      * @param val The data value. This value should be serializable via
      * <code>JSON.stringify(data)</code>.
      */
    def set(key: String, `val`: js.Any): Unit = js.native
  }
}
