package typingsSlinky.baconjs

import typingsSlinky.baconjs.typesEventMod.Event
import typingsSlinky.baconjs.typesObservableMod.EventStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/once", JSImport.Namespace)
@js.native
object typesOnceMod extends js.Object {
  def default[V](value: V): EventStream[V] = js.native
  def default[V](value: Event[V]): EventStream[V] = js.native
}

