package typingsSlinky.baconjs.observableMod

import typingsSlinky.baconjs.describeMod.Desc
import typingsSlinky.baconjs.typesMod.Subscribe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/observable", "newEventStream")
@js.native
object newEventStream extends js.Object {
  def apply[V](description: Desc, subscribe: Subscribe[V]): EventStream[V] = js.native
}

