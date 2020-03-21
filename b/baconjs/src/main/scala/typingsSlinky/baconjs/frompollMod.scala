package typingsSlinky.baconjs

import typingsSlinky.baconjs.frombinderMod.EventLike
import typingsSlinky.baconjs.observableMod.EventStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/frompoll", JSImport.Namespace)
@js.native
object frompollMod extends js.Object {
  def default[V](delay: Double, poll: PollFunction[V]): EventStream[V] = js.native
  type PollFunction[V] = js.Function0[EventLike[V]]
}

