package typingsSlinky.quickLru.mod

import typingsSlinky.std.Iterable
import typingsSlinky.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QuickLRU[KeyType, ValueType]
  extends Iterable[js.Tuple2[KeyType, ValueType]] {
  
  /**
  	Delete all items.
  	*/
  def clear(): Unit = js.native
  
  /**
  	Delete an item.
  	@returns `true` if the item is removed or `false` if the item doesn't exist.
  	*/
  def delete(key: KeyType): Boolean = js.native
  
  /**
  	Get an item.
  	@returns The stored item or `undefined`.
  	*/
  def get(key: KeyType): js.UndefOr[ValueType] = js.native
  
  /**
  	Check if an item exists.
  	*/
  def has(key: KeyType): Boolean = js.native
  
  @JSName(js.Symbol.iterator)
  var iterator_QuickLRU: js.Function0[IterableIterator[js.Tuple2[KeyType, ValueType]]] = js.native
  
  /**
  	Iterable for all the keys.
  	*/
  def keys(): IterableIterator[KeyType] = js.native
  
  /**
  	Get an item without marking it as recently used.
  	@returns The stored item or `undefined`.
  	*/
  def peek(key: KeyType): js.UndefOr[ValueType] = js.native
  
  /**
  	Set an item.
  	@returns The list instance.
  	*/
  def set(key: KeyType, value: ValueType): this.type = js.native
  
  /**
  	The stored item count.
  	*/
  val size: Double = js.native
  
  /**
  	Iterable for all the values.
  	*/
  def values(): IterableIterator[ValueType] = js.native
}
