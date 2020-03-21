package typingsSlinky.baconjs.mod

import typingsSlinky.baconjs.observableMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs", "combineAsArray")
@js.native
object combineAsArray extends js.Object {
  def apply[V](streams: (default[V] | js.Array[default[V]])*): typingsSlinky.baconjs.observableMod.Property[js.Array[V]] = js.native
}

