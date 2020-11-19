package typingsSlinky.mnemonist

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.mnemonist.anon.Evicted
import typingsSlinky.mnemonist.typesMod.IArrayLikeConstructor
import typingsSlinky.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mnemonist/lru-map", JSImport.Namespace)
@js.native
object lruMapMod extends js.Object {
  
  @js.native
  trait LRUMap[K, V]
    extends Iterable[js.Tuple2[K, V]] {
    
    // Members
    var capacity: Double = js.native
    
    // Methods
    def clear(): Unit = js.native
    
    def entries(): js.Iterator[js.Tuple2[K, V]] = js.native
    
    def forEach(callback: js.Function3[/* value */ V, /* key */ K, /* cache */ this.type, Unit]): Unit = js.native
    def forEach(callback: js.Function3[/* value */ V, /* key */ K, /* cache */ this.type, Unit], scope: js.Any): Unit = js.native
    
    def get(key: K): js.UndefOr[V] = js.native
    
    def has(key: K): Boolean = js.native
    
    def inspect(): js.Any = js.native
    
    def keys(): js.Iterator[K] = js.native
    
    def peek(key: K): js.UndefOr[V] = js.native
    
    def set(key: K, value: V): this.type = js.native
    
    def setpop(key: K, value: V): Evicted[K, V] = js.native
    
    var size: Double = js.native
    
    def values(): js.Iterator[V] = js.native
  }
  
  @js.native
  class default[K, V] protected () extends LRUMap[K, V] {
    // Constructor
    def this(capacity: Double) = this()
    def this(KeyArrayClass: IArrayLikeConstructor, ValueArrayClass: IArrayLikeConstructor, capacity: Double) = this()
  }
  /* static members */
  @js.native
  object default extends js.Object {
    
    def from[I, J](iterable: StringDictionary[J]): LRUMap[I, J] = js.native
    def from[I, J](
      iterable: StringDictionary[J],
      KeyArrayClass: IArrayLikeConstructor,
      ValueArrayClass: IArrayLikeConstructor
    ): LRUMap[I, J] = js.native
    def from[I, J](
      iterable: StringDictionary[J],
      KeyArrayClass: IArrayLikeConstructor,
      ValueArrayClass: IArrayLikeConstructor,
      capacity: Double
    ): LRUMap[I, J] = js.native
    def from[I, J](iterable: StringDictionary[J], capacity: Double): LRUMap[I, J] = js.native
    def from[I, J](iterable: js.Iterable[js.Tuple2[I, J]]): LRUMap[I, J] = js.native
    // Statics
    def from[I, J](
      iterable: js.Iterable[js.Tuple2[I, J]],
      KeyArrayClass: IArrayLikeConstructor,
      ValueArrayClass: IArrayLikeConstructor
    ): LRUMap[I, J] = js.native
    def from[I, J](
      iterable: js.Iterable[js.Tuple2[I, J]],
      KeyArrayClass: IArrayLikeConstructor,
      ValueArrayClass: IArrayLikeConstructor,
      capacity: Double
    ): LRUMap[I, J] = js.native
    def from[I, J](iterable: js.Iterable[js.Tuple2[I, J]], capacity: Double): LRUMap[I, J] = js.native
  }
}
