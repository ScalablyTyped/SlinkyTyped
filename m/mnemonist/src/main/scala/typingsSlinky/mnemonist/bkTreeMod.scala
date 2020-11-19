package typingsSlinky.mnemonist

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.mnemonist.anon.Distance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mnemonist/bk-tree", JSImport.Namespace)
@js.native
object bkTreeMod extends js.Object {
  
  @js.native
  trait BKTree[T] extends js.Object {
    
    // Methods
    def add(item: T): this.type = js.native
    
    // Members
    def distance(a: T, b: T): Double = js.native
    // Members
    @JSName("distance")
    var distance_Original: DistanceFunction[T] = js.native
    
    def inspect(): js.Any = js.native
    
    def search(n: Double, query: T): js.Array[Distance[T]] = js.native
    
    var size: Double = js.native
    
    def toJSON(): js.Object = js.native
  }
  
  @js.native
  class default[T] protected () extends BKTree[T] {
    // Constructor
    def this(distance: DistanceFunction[T]) = this()
  }
  /* static members */
  @js.native
  object default extends js.Object {
    
    def from[I](iterable: StringDictionary[I], distance: DistanceFunction[I]): BKTree[I] = js.native
    // Statics
    def from[I](iterable: js.Iterable[I], distance: DistanceFunction[I]): BKTree[I] = js.native
  }
  
  type DistanceFunction[T] = js.Function2[/* a */ T, /* b */ T, Double]
}
