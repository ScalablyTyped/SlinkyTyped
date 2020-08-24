package typingsSlinky.rx.global

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.rx.Iterable
import typingsSlinky.rx.WeakSetConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WeakSet")
@js.native
class WeakSet[T] ()
  extends typingsSlinky.rx.WeakSet[T] {
  def this(iterable: Iterable[T]) = this()
}

@JSGlobal("WeakSet")
@js.native
object WeakSet extends TopLevel[WeakSetConstructor]

