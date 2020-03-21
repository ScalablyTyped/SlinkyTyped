package typingsSlinky.baconjs.mod

import typingsSlinky.baconjs.frompollMod.PollFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs", "fromPoll")
@js.native
object fromPoll extends js.Object {
  def apply[V](delay: Double, poll: PollFunction[V]): typingsSlinky.baconjs.observableMod.EventStream[V] = js.native
}

