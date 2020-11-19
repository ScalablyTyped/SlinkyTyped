package typingsSlinky.mnemonist.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.mnemonist.queueMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mnemonist", "Queue")
@js.native
class Queue[T] () extends default[T]
/* static members */
@JSImport("mnemonist", "Queue")
@js.native
object Queue extends js.Object {
  
  def from[I](iterable: StringDictionary[I]): typingsSlinky.mnemonist.queueMod.Queue[I] = js.native
  // Statics
  def from[I](iterable: js.Iterable[I]): typingsSlinky.mnemonist.queueMod.Queue[I] = js.native
  
  def of[I](items: I*): typingsSlinky.mnemonist.queueMod.Queue[I] = js.native
}
