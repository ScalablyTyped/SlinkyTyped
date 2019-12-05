package typingsSlinky.baconjs.typesObservableMod

import typingsSlinky.baconjs.typesDescribeMod.Desc
import typingsSlinky.baconjs.typesTypesMod.Subscribe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/observable", "newEventStreamAllowSync")
@js.native
object newEventStreamAllowSync extends js.Object {
  def apply[V](description: Desc, subscribe: Subscribe[V]): EventStream[V] = js.native
}

