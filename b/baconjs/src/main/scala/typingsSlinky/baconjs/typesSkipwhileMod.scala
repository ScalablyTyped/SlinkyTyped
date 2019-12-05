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

@JSImport("baconjs/types/skipwhile", JSImport.Namespace)
@js.native
object typesSkipwhileMod extends js.Object {
  def default[V](src: typingsSlinky.baconjs.typesObservableMod.default[V], f: PredicateOrProperty[V]): typingsSlinky.baconjs.typesObservableMod.default[V] = js.native
  def skipWhile[V](src: default[V], f: PredicateOrProperty[V]): default[V] = js.native
  def skipWhileT[V](f: Predicate[V]): js.Function2[/* event */ Event[V], /* sink */ EventSink[V], Reply] = js.native
}

