package typingsSlinky.mnemonist.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.mnemonist.staticIntervalTreeMod.StaticIntervalTreeGettersTuple
import typingsSlinky.mnemonist.staticIntervalTreeMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mnemonist", "StaticIntervalTree")
@js.native
class StaticIntervalTree[T] protected () extends default[T] {
  // Constructor
  def this(intervals: js.Array[T]) = this()
  def this(intervals: js.Array[T], getters: StaticIntervalTreeGettersTuple[T]) = this()
}
/* static members */
@JSImport("mnemonist", "StaticIntervalTree")
@js.native
object StaticIntervalTree extends js.Object {
  
  def from[I](iterable: StringDictionary[I]): typingsSlinky.mnemonist.staticIntervalTreeMod.StaticIntervalTree[I] = js.native
  // Statics
  def from[I](iterable: js.Iterable[I]): typingsSlinky.mnemonist.staticIntervalTreeMod.StaticIntervalTree[I] = js.native
}
