package typingsSlinky.mnemonist.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.mnemonist.stackMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mnemonist", "Stack")
@js.native
class Stack[T] () extends default[T]

/* static members */
@JSImport("mnemonist", "Stack")
@js.native
object Stack extends js.Object {
  def from[I](iterable: StringDictionary[I]): typingsSlinky.mnemonist.stackMod.Stack[I] = js.native
  // Statics
  def from[I](iterable: js.Iterable[I]): typingsSlinky.mnemonist.stackMod.Stack[I] = js.native
  def of[I](items: I*): typingsSlinky.mnemonist.stackMod.Stack[I] = js.native
}

