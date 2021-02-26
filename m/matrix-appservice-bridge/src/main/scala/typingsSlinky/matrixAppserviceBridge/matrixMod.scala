package typingsSlinky.matrixAppserviceBridge

import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object matrixMod {
  
  @JSImport("matrix-appservice-bridge/lib/models/rooms/matrix", "MatrixRoom")
  @js.native
  class MatrixRoom protected () extends StObject {
    /**
      * Create a matrix room.
      * @param roomId The room ID
      * @param data The room ID
      */
    def this(roomId: String) = this()
    def this(roomId: String, data: MatrixRoomData) = this()
    
    var _extras: js.Any = js.native
    
    /**
      * Set data about this room from a serialized data object.
      * @param data The serialized data
      */
    def deserialize(data: MatrixRoomData): Unit = js.native
    
    def extras: Record[String, _] = js.native
    
    /**
      * Get the data value for the given key.
      * @param key An arbitrary bridge-specific key.
      * @return Stored data for this key. May be undefined.
      */
    def get[T](key: String): T = js.native
    
    /**
      * Get the room ID.
      * @return The room ID
      */
    def getId(): String = js.native
    
    var name: js.UndefOr[String] = js.native
    
    val roomId: String = js.native
    
    /**
      * Serialize data about this room into a JSON object.
      * @return The serialised data
      */
    def serialize(): MatrixRoomData = js.native
    
    /**
      * Set an arbitrary bridge-specific data value for this room. This will be serailized
      * under an 'extras' key.
      * @param key The key to store the data value under.
      * @param val The data value. This value should be serializable via
      * <code>JSON.stringify(data)</code>.
      */
    def set(key: String, `val`: js.Any): Unit = js.native
    
    var topic: js.UndefOr[String] = js.native
  }
  
  @js.native
  trait MatrixRoomData extends StObject {
    
    var extras: Record[String, _] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var topic: js.UndefOr[String] = js.native
  }
  object MatrixRoomData {
    
    @scala.inline
    def apply(extras: Record[String, _]): MatrixRoomData = {
      val __obj = js.Dynamic.literal(extras = extras.asInstanceOf[js.Any])
      __obj.asInstanceOf[MatrixRoomData]
    }
    
    @scala.inline
    implicit class MatrixRoomDataMutableBuilder[Self <: MatrixRoomData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtras(value: Record[String, _]): Self = StObject.set(x, "extras", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
    }
  }
}
