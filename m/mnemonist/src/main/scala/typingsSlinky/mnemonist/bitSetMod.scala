package typingsSlinky.mnemonist

import typingsSlinky.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mnemonist/bit-set", JSImport.Namespace)
@js.native
object bitSetMod extends js.Object {
  
  @js.native
  trait BitSet extends Iterable[Double] {
    
    // Methods
    def clear(): Unit = js.native
    
    def entries(): js.Iterator[js.Tuple2[Double, Double]] = js.native
    
    def flip(index: Double, value: Boolean): Unit = js.native
    def flip(index: Double, value: Double): Unit = js.native
    
    def forEach(callback: js.Function3[/* index */ Double, /* value */ Double, /* set */ this.type, Unit]): Unit = js.native
    def forEach(
      callback: js.Function3[/* index */ Double, /* value */ Double, /* set */ this.type, Unit],
      scope: js.Any
    ): Unit = js.native
    
    def get(index: Double): Double = js.native
    
    def inspect(): js.Any = js.native
    
    // Members
    var length: Double = js.native
    
    def rank(r: Double): Double = js.native
    
    def reset(index: Double, value: Boolean): Unit = js.native
    def reset(index: Double, value: Double): Unit = js.native
    
    def select(r: Double): Double = js.native
    
    def set(index: Double): Unit = js.native
    def set(index: Double, value: Boolean): Unit = js.native
    def set(index: Double, value: Double): Unit = js.native
    
    var size: Double = js.native
    
    def test(index: Double): Boolean = js.native
    
    def toJSON(): js.Array[Double] = js.native
    
    def values(): js.Iterator[Double] = js.native
  }
  
  @js.native
  class default protected () extends BitSet {
    // Constructor
    def this(length: Double) = this()
  }
}
