package typingsSlinky.baconjs

import typingsSlinky.baconjs.typesEventMod.Event
import typingsSlinky.baconjs.typesObservableMod.default
import typingsSlinky.baconjs.typesPredicateMod.Predicate
import typingsSlinky.baconjs.typesPredicateMod.PredicateOrProperty
import typingsSlinky.baconjs.typesReplyMod.Reply
import typingsSlinky.baconjs.typesTypesMod.EventSink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/filter", JSImport.Namespace)
@js.native
object typesFilterMod extends js.Object {
  def filter[V](src: default[V], f: PredicateOrProperty[V]): default[V] = js.native
  def filterT[V](f: Predicate[V]): js.Function2[/* e */ Event[V], /* sink */ EventSink[V], Reply] = js.native
}

