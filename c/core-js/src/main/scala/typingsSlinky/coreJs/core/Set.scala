package typingsSlinky.coreJs.core

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.std.SetConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("core.Set")
@js.native
class Set[T] ()
  extends typingsSlinky.std.Set[T] {
  def this(values: js.Array[T]) = this()
}

@JSGlobal("core.Set")
@js.native
object Set extends TopLevel[SetConstructor]

