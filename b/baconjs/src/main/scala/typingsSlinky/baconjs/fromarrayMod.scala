package typingsSlinky.baconjs

import typingsSlinky.baconjs.eventMod.Event
import typingsSlinky.baconjs.observableMod.EventStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/fromarray", JSImport.Namespace)
@js.native
object fromarrayMod extends js.Object {
  def default[T](values: js.Array[T | Event[T]]): EventStream[T] = js.native
}

