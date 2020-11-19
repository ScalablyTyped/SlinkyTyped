package typingsSlinky.mnemonist

import typingsSlinky.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mnemonist/default-map", JSImport.Namespace)
@js.native
object defaultMapMod extends js.Object {
  
  @js.native
  trait DefaultMap[K, V]
    extends Iterable[js.Tuple2[K, V]] {
    
    // Methods
    def clear(): Unit = js.native
    
    def delete(key: K): Boolean = js.native
    
    def entries(): js.Iterator[js.Tuple2[K, V]] = js.native
    
    def forEach(callback: js.Function3[/* value */ V, /* key */ K, /* map */ this.type, Unit]): Unit = js.native
    def forEach(callback: js.Function3[/* value */ V, /* key */ K, /* map */ this.type, Unit], scope: js.Any): Unit = js.native
    
    def get(key: K): js.UndefOr[V] = js.native
    
    def has(key: K): Boolean = js.native
    
    def inspect(): js.Any = js.native
    
    def keys(): js.Iterator[K] = js.native
    
    def peek(key: K): js.UndefOr[V] = js.native
    
    def set(key: K, value: V): this.type = js.native
    
    // Members
    var size: Double = js.native
    
    def values(): js.Iterator[V] = js.native
  }
  
  @js.native
  class default[K, V] protected () extends DefaultMap[K, V] {
    // Constructor
    def this(factory: js.Function2[/* key */ js.UndefOr[K], /* index */ js.UndefOr[Double], V]) = this()
  }
  /* static members */
  @js.native
  object default extends js.Object {
    
    // Statics
    def autoIncrement(): Double = js.native
  }
}
