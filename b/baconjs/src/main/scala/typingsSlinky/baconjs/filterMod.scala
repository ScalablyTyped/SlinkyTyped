package typingsSlinky.baconjs

import typingsSlinky.baconjs.eventMod.Event
import typingsSlinky.baconjs.observableMod.default
import typingsSlinky.baconjs.predicateMod.Predicate
import typingsSlinky.baconjs.predicateMod.PredicateOrProperty
import typingsSlinky.baconjs.replyMod.Reply
import typingsSlinky.baconjs.typesMod.EventSink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/filter", JSImport.Namespace)
@js.native
object filterMod extends js.Object {
  def filter[V](src: default[V], f: PredicateOrProperty[V]): default[V] = js.native
  def filterT[V](f: Predicate[V]): js.Function2[/* e */ Event[V], /* sink */ EventSink[V], Reply] = js.native
}

