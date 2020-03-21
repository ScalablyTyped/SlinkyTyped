package typingsSlinky.baconjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs", "fromArray")
@js.native
object fromArray extends js.Object {
  def apply[T](values: js.Array[T | typingsSlinky.baconjs.eventMod.Event[T]]): typingsSlinky.baconjs.observableMod.EventStream[T] = js.native
}

