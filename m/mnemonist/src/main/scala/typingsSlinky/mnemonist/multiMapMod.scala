package typingsSlinky.mnemonist

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.ArrayConstructor
import typingsSlinky.std.Iterable
import typingsSlinky.std.Set
import typingsSlinky.std.SetConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mnemonist/multi-map", JSImport.Namespace)
@js.native
object multiMapMod extends js.Object {
  
  @js.native
  trait MultiMap[K, V]
    extends Iterable[js.Tuple2[K, V]] {
    
    def associations(): js.Iterator[js.Tuple2[K, js.Array[V] | Set[V]]] = js.native
    
    // Methods
    def clear(): Unit = js.native
    
    def containers(): js.Iterator[js.Array[V] | Set[V]] = js.native
    
    def delete(key: K): Boolean = js.native
    
    // Members
    var dimension: Double = js.native
    
    def entries(): js.Iterator[js.Tuple2[K, V]] = js.native
    
    def forEach(callback: js.Function3[/* value */ V, /* key */ K, /* map */ this.type, Unit]): Unit = js.native
    def forEach(callback: js.Function3[/* value */ V, /* key */ K, /* map */ this.type, Unit], scope: js.Any): Unit = js.native
    
    def forEachAssociation(callback: js.Function3[/* value */ js.Array[V] | Set[V], /* key */ K, /* map */ this.type, Unit]): Unit = js.native
    def forEachAssociation(
      callback: js.Function3[/* value */ js.Array[V] | Set[V], /* key */ K, /* map */ this.type, Unit],
      scope: js.Any
    ): Unit = js.native
    
    def get(key: K): js.UndefOr[js.Array[V] | Set[V]] = js.native
    
    def has(key: K): Boolean = js.native
    
    def inspect(): js.Any = js.native
    
    def keys(): js.Iterator[K] = js.native
    
    def multiplicity(key: K): Double = js.native
    
    def remove(key: K, value: V): Boolean = js.native
    
    def set(key: K, value: V): this.type = js.native
    
    var size: Double = js.native
    
    def toJSON(): js.Any = js.native
    
    def values(): js.Iterator[V] = js.native
  }
  
  @js.native
  // Constructor
  class default[K, V] () extends MultiMap[K, V] {
    def this(Container: ArrayConstructor) = this()
    def this(Container: SetConstructor) = this()
  }
  /* static members */
  @js.native
  object default extends js.Object {
    
    def from[I, J](iterable: StringDictionary[J]): MultiMap[I, J] = js.native
    def from[I, J](iterable: StringDictionary[J], Container: ArrayConstructor): MultiMap[I, J] = js.native
    def from[I, J](iterable: StringDictionary[J], Container: SetConstructor): MultiMap[I, J] = js.native
    // Statics
    def from[I, J](iterable: js.Iterable[js.Tuple2[I, J]]): MultiMap[I, J] = js.native
    def from[I, J](iterable: js.Iterable[js.Tuple2[I, J]], Container: ArrayConstructor): MultiMap[I, J] = js.native
    def from[I, J](iterable: js.Iterable[js.Tuple2[I, J]], Container: SetConstructor): MultiMap[I, J] = js.native
  }
}
