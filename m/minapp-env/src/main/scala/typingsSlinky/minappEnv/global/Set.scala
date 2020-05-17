package typingsSlinky.minappEnv.global

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.minappEnv.Iterable
import typingsSlinky.minappEnv.SetConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Set")
@js.native
class Set[T] ()
  extends typingsSlinky.minappEnv.Set[T] {
  def this(iterable: Iterable[T]) = this()
  def this(values: typingsSlinky.minappEnv.Array[T]) = this()
}

@JSGlobal("Set")
@js.native
object Set extends TopLevel[SetConstructor]

