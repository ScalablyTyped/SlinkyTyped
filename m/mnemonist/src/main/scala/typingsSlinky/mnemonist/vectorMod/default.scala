package typingsSlinky.mnemonist.vectorMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.mnemonist.typesMod.IArrayLikeConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mnemonist/vector", JSImport.Default)
@js.native
class default protected () extends Vector {
  // Constructor
  def this(ArrayClass: IArrayLikeConstructor, length: Double) = this()
  def this(ArrayClass: IArrayLikeConstructor, length: VectorOptions) = this()
}
/* static members */
@JSImport("mnemonist/vector", JSImport.Default)
@js.native
object default extends js.Object {
  
  def from[I](iterable: StringDictionary[I], ArrayClass: IArrayLikeConstructor): Vector = js.native
  def from[I](iterable: StringDictionary[I], ArrayClass: IArrayLikeConstructor, capacity: Double): Vector = js.native
  // Statics
  def from[I](iterable: js.Iterable[I], ArrayClass: IArrayLikeConstructor): Vector = js.native
  def from[I](iterable: js.Iterable[I], ArrayClass: IArrayLikeConstructor, capacity: Double): Vector = js.native
}
