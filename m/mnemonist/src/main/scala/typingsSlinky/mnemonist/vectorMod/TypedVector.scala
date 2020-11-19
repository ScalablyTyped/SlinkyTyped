package typingsSlinky.mnemonist.vectorMod

import typingsSlinky.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypedVector extends Iterable[Double] {
  
  // Members
  var capacity: Double = js.native
  
  // Methods
  def clear(): Unit = js.native
  
  def entries(): js.Iterator[js.Tuple2[Double, Double]] = js.native
  
  def forEach(callback: js.Function3[/* index */ Double, /* value */ Double, /* set */ this.type, Unit]): Unit = js.native
  def forEach(
    callback: js.Function3[/* index */ Double, /* value */ Double, /* set */ this.type, Unit],
    scope: js.Any
  ): Unit = js.native
  
  def get(index: Double): Double = js.native
  
  def grow(): this.type = js.native
  def grow(capacity: Double): this.type = js.native
  
  def inspect(): js.Any = js.native
  
  var length: Double = js.native
  
  def pop(): js.UndefOr[Double] = js.native
  
  def push(value: Double): Double = js.native
  
  def reallocate(capacity: Double): this.type = js.native
  
  def resize(length: Double): this.type = js.native
  
  def set(index: Double, value: Double): this.type = js.native
  
  var size: Double = js.native
  
  def toJSON(): js.Any = js.native
  
  def values(): js.Iterator[Double] = js.native
}
