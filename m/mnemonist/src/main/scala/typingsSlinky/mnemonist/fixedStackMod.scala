package typingsSlinky.mnemonist

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.mnemonist.typesMod.IArrayLikeConstructor
import typingsSlinky.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mnemonist/fixed-stack", JSImport.Namespace)
@js.native
object fixedStackMod extends js.Object {
  
  @js.native
  trait FixedStack[T] extends Iterable[T] {
    
    // Members
    var capacity: Double = js.native
    
    // Methods
    def clear(): Unit = js.native
    
    def entries(): js.Iterator[js.Tuple2[Double, T]] = js.native
    
    def forEach(callback: js.Function3[/* item */ T, /* index */ Double, /* stack */ this.type, Unit]): Unit = js.native
    def forEach(
      callback: js.Function3[/* item */ T, /* index */ Double, /* stack */ this.type, Unit],
      scope: js.Any
    ): Unit = js.native
    
    def inspect(): js.Any = js.native
    
    def peek(): js.UndefOr[T] = js.native
    
    def pop(): js.UndefOr[T] = js.native
    
    def push(item: T): Double = js.native
    
    var size: Double = js.native
    
    def toArray(): js.Iterable[T] = js.native
    
    def toJSON(): js.Iterable[T] = js.native
    
    def values(): js.Iterator[T] = js.native
  }
  
  @js.native
  class default[T] protected () extends FixedStack[T] {
    // Constructor
    def this(ArrayClass: IArrayLikeConstructor, capacity: Double) = this()
  }
  /* static members */
  @js.native
  object default extends js.Object {
    
    def from[I](iterable: StringDictionary[I], ArrayClass: IArrayLikeConstructor): FixedStack[I] = js.native
    def from[I](iterable: StringDictionary[I], ArrayClass: IArrayLikeConstructor, capacity: Double): FixedStack[I] = js.native
    // Statics
    def from[I](iterable: js.Iterable[I], ArrayClass: IArrayLikeConstructor): FixedStack[I] = js.native
    def from[I](iterable: js.Iterable[I], ArrayClass: IArrayLikeConstructor, capacity: Double): FixedStack[I] = js.native
  }
}
