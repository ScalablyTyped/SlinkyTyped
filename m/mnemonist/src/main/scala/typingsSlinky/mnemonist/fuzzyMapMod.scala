package typingsSlinky.mnemonist

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mnemonist/fuzzy-map", JSImport.Namespace)
@js.native
object fuzzyMapMod extends js.Object {
  
  @js.native
  trait FuzzyMap[K, V] extends Iterable[V] {
    
    def add(key: V): this.type = js.native
    
    // Methods
    def clear(): Unit = js.native
    
    def forEach(callback: js.Function2[/* value */ V, /* key */ V, Unit]): Unit = js.native
    def forEach(callback: js.Function2[/* value */ V, /* key */ V, Unit], scope: this.type): Unit = js.native
    
    def get(key: js.Any): js.UndefOr[V] = js.native
    
    def has(key: js.Any): Boolean = js.native
    
    def inspect(): js.Any = js.native
    
    def set(key: K, value: V): this.type = js.native
    
    // Members
    var size: Double = js.native
    
    def values(): js.Iterator[V] = js.native
  }
  
  @js.native
  class default[K, V] protected () extends FuzzyMap[K, V] {
    def this(hashFunctionsTuple: HashFunctionsTuple[K]) = this()
    // Constructor
    def this(hashFunction: HashFunction[K]) = this()
  }
  /* static members */
  @js.native
  object default extends js.Object {
    
    def from[I, J](iterable: StringDictionary[J], hashFunction: HashFunction[I]): FuzzyMap[I, J] = js.native
    def from[I, J](iterable: StringDictionary[J], hashFunction: HashFunctionsTuple[I]): FuzzyMap[I, J] = js.native
    // Statics
    def from[I, J](iterable: js.Iterable[js.Tuple2[I, J]], hashFunction: HashFunction[I]): FuzzyMap[I, J] = js.native
    def from[I, J](iterable: js.Iterable[js.Tuple2[I, J]], hashFunction: HashFunctionsTuple[I]): FuzzyMap[I, J] = js.native
  }
  
  type HashFunction[K] = js.Function1[/* key */ js.Any, K]
  
  type HashFunctionsTuple[K] = js.Tuple2[HashFunction[K], HashFunction[K]]
}
