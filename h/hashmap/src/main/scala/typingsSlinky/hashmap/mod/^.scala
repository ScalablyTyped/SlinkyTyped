package typingsSlinky.hashmap.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hashmap", JSImport.Namespace)
@js.native
/**
  * Creates an empty hashmap.
  */
class ^[TKey, TValue] () extends HashMap[TKey, TValue] {
  def this(data: js.Array[js.Tuple2[TKey, TValue]]) = this()
  /**
    * Creates a hashmap with the key-value pairs of map or from an array of key-values.
    *
    * @param data A hashmap to copy from or a set or key-value pairs for the initialization.
    */
  def this(data: HashMap[TKey, TValue]) = this()
  /**
    * Creates a hashmap with several key-value pairs.
    *
    * @param keysAndValues key1, value1, key2, value2...
    */
  def this(keysAndValues: (TKey | TValue)*) = this()
}
