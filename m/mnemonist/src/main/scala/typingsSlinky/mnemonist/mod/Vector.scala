package typingsSlinky.mnemonist.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.mnemonist.typesMod.IArrayLikeConstructor
import typingsSlinky.mnemonist.vectorMod.VectorOptions
import typingsSlinky.mnemonist.vectorMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mnemonist", "Vector")
@js.native
class Vector protected () extends default {
  // Constructor
  def this(ArrayClass: IArrayLikeConstructor, length: Double) = this()
  def this(ArrayClass: IArrayLikeConstructor, length: VectorOptions) = this()
}

/* static members */
@JSImport("mnemonist", "Vector")
@js.native
object Vector extends js.Object {
  def from[I](iterable: StringDictionary[I], ArrayClass: IArrayLikeConstructor): typingsSlinky.mnemonist.vectorMod.Vector = js.native
  def from[I](iterable: StringDictionary[I], ArrayClass: IArrayLikeConstructor, capacity: Double): typingsSlinky.mnemonist.vectorMod.Vector = js.native
  // Statics
  def from[I](iterable: js.Iterable[I], ArrayClass: IArrayLikeConstructor): typingsSlinky.mnemonist.vectorMod.Vector = js.native
  def from[I](iterable: js.Iterable[I], ArrayClass: IArrayLikeConstructor, capacity: Double): typingsSlinky.mnemonist.vectorMod.Vector = js.native
}

