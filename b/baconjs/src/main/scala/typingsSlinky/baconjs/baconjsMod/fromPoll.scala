package typingsSlinky.baconjs.baconjsMod

import typingsSlinky.baconjs.typesFrompollMod.PollFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs", "fromPoll")
@js.native
object fromPoll extends js.Object {
  def apply[V](delay: Double, poll: PollFunction[V]): typingsSlinky.baconjs.typesObservableMod.EventStream[V] = js.native
}

