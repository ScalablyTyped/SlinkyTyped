package typingsSlinky.mnemonist

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mnemonist/multi-set", JSImport.Namespace)
@js.native
object multiSetMod extends js.Object {
  
  @js.native
  trait MultiSet[K] extends Iterable[K] {
    
    def add(key: K): this.type = js.native
    def add(key: K, count: Double): this.type = js.native
    
    // Methods
    def clear(): Unit = js.native
    
    def count(key: K): Double = js.native
    
    def delete(key: K): Boolean = js.native
    
    // Members
    var dimension: Double = js.native
    
    def edit(a: K, b: K): this.type = js.native
    
    def forEach(callback: js.Function3[/* value */ K, /* key */ K, /* set */ this.type, Unit]): Unit = js.native
    def forEach(callback: js.Function3[/* value */ K, /* key */ K, /* set */ this.type, Unit], scope: js.Any): Unit = js.native
    
    def forEachMultiplicity(callback: js.Function3[/* value */ Double, /* key */ K, /* set */ this.type, Unit]): Unit = js.native
    def forEachMultiplicity(callback: js.Function3[/* value */ Double, /* key */ K, /* set */ this.type, Unit], scope: js.Any): Unit = js.native
    
    def frequency(key: K): Double = js.native
    
    def get(key: K): Double = js.native
    
    def has(key: K): Boolean = js.native
    
    def inspect(): js.Any = js.native
    
    def keys(): js.Iterator[K] = js.native
    
    def multiplicities(): js.Iterator[js.Tuple2[K, Double]] = js.native
    
    def multiplicity(key: K): Double = js.native
    
    def remove(key: K): Unit = js.native
    def remove(key: K, count: Double): Unit = js.native
    
    def set(key: K, count: Double): this.type = js.native
    
    var size: Double = js.native
    
    def toJSON(): js.Any = js.native
    
    def top(n: Double): js.Array[js.Tuple2[K, Double]] = js.native
    
    def values(): js.Iterator[Double] = js.native
  }
  
  @js.native
  class default[K] () extends MultiSet[K]
  /* static members */
  @js.native
  object default extends js.Object {
    
    def from[I](iterable: StringDictionary[I]): MultiSet[I] = js.native
    // Statics
    def from[I](iterable: js.Iterable[I]): MultiSet[I] = js.native
    
    def isSubset[T](a: MultiSet[T], b: MultiSet[T]): Boolean = js.native
    
    def isSuperset[T](a: MultiSet[T], b: MultiSet[T]): Boolean = js.native
  }
}
