package typingsSlinky.mnemonist

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mnemonist/linked-list", JSImport.Namespace)
@js.native
object linkedListMod extends js.Object {
  
  @js.native
  trait LinkedList[T] extends Iterable[T] {
    
    // Methods
    def clear(): Unit = js.native
    
    def entries(): js.Iterator[js.Tuple2[Double, T]] = js.native
    
    def first(): js.UndefOr[T] = js.native
    
    def forEach(callback: js.Function3[/* value */ T, /* index */ Double, /* list */ this.type, Unit]): Unit = js.native
    def forEach(
      callback: js.Function3[/* value */ T, /* index */ Double, /* list */ this.type, Unit],
      scope: js.Any
    ): Unit = js.native
    
    def inspect(): js.Any = js.native
    
    def last(): js.UndefOr[T] = js.native
    
    def peek(): js.UndefOr[T] = js.native
    
    def push(value: T): Double = js.native
    
    def shift(): js.UndefOr[T] = js.native
    
    // Members
    var size: Double = js.native
    
    def toArray(): js.Array[T] = js.native
    
    def toJSON(): js.Array[T] = js.native
    
    def unshift(value: T): Double = js.native
    
    def values(): js.Iterator[T] = js.native
  }
  
  @js.native
  class default[T] () extends LinkedList[T]
  /* static members */
  @js.native
  object default extends js.Object {
    
    def from[I](iterable: StringDictionary[I]): LinkedList[I] = js.native
    // Statics
    def from[I](iterable: js.Iterable[I]): LinkedList[I] = js.native
  }
}
