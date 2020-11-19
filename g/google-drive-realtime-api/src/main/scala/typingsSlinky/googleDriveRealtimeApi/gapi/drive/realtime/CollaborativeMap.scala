package typingsSlinky.googleDriveRealtimeApi.gapi.drive.realtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CollaborativeMap[V] extends CollaborativeObject {
  
  // Removes all entries.
  def clear(): Unit = js.native
  
  // Removes the entry for the given key (if such an entry exists).
  // @return the value that was mapped to this key, or null if there was no existing value.
  def delete(key: String): V = js.native
  
  // Returns the value mapped to the given key.
  def get(key: String): V = js.native
  
  // Checks if this map contains an entry for the given key.
  def has(key: String): Boolean = js.native
  
  // Returns whether this map is empty.
  def isEmpty(): Boolean = js.native
  
  // Returns an array containing a copy of the items in this map. Modifications to the returned array do
  // not modify this collaborative map.
  // @return non-null Array of Arrays, where the inner arrays are tupples [string, V]
  def items(): js.Array[js.Tuple2[String, V]] = js.native
  
  // Returns an array containing a copy of the keys in this map. Modifications to the returned array
  // do not modify this collaborative map.
  def keys(): js.Array[String] = js.native
  
  // Put the value into the map with the given key, overwriting an existing value for that key.
  // @return the old map value, if any, that used to be mapped to the given key.
  def set(key: String, value: V): V = js.native
  
  var size: Double = js.native
  
  // Returns an array containing a copy of the values in this map. Modifications to the returned array
  // do not modify this collaborative map.
  def values(): js.Array[V] = js.native
}
