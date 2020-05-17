package typingsSlinky.baconjs.frombinderMod

import typingsSlinky.baconjs.observableMod.EventStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/frombinder", JSImport.Default)
@js.native
object default extends js.Object {
  def apply[V](binder: Binder[V]): EventStream[V] = js.native
  def apply[V](binder: Binder[V], eventTransformer: EventTransformer[V]): EventStream[V] = js.native
}

