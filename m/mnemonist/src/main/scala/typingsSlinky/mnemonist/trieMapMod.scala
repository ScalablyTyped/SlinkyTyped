package typingsSlinky.mnemonist

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mnemonist/trie-map", JSImport.Namespace)
@js.native
object trieMapMod extends js.Object {
  
  @js.native
  trait TrieMap[K, V]
    extends Iterable[js.Tuple2[K, V]] {
    
    // Methods
    def clear(): Unit = js.native
    
    def delete(prefix: K): Boolean = js.native
    
    def entries(): js.Iterator[js.Tuple2[K, V]] = js.native
    
    def find(prefix: K): js.Array[js.Tuple2[K, V]] = js.native
    
    def get(prefix: K): V = js.native
    
    def has(prefix: K): Boolean = js.native
    
    def inspect(): js.Any = js.native
    
    def keys(): js.Iterator[K] = js.native
    
    def prefixes(): js.Iterator[K] = js.native
    
    def set(prefix: K, value: V): this.type = js.native
    
    // Members
    var size: Double = js.native
    
    def values(): js.Iterator[V] = js.native
  }
  
  @js.native
  // Constructor
  class default[K, V] () extends TrieMap[K, V] {
    def this(Token: Instantiable0[K]) = this()
  }
  /* static members */
  @js.native
  object default extends js.Object {
    
    def from[I, J](iterable: StringDictionary[J]): TrieMap[I, J] = js.native
    // Statics
    def from[I, J](iterable: js.Iterable[js.Tuple2[I, J]]): TrieMap[I, J] = js.native
  }
}
