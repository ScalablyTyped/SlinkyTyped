package typingsSlinky.baconjs

import typingsSlinky.baconjs.eventMod.Event
import typingsSlinky.baconjs.observableMod.default
import typingsSlinky.baconjs.predicateMod.Predicate
import typingsSlinky.baconjs.predicateMod.PredicateOrProperty
import typingsSlinky.baconjs.replyMod.Reply
import typingsSlinky.baconjs.typesMod.EventSink
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filterMod {
  
  @JSImport("baconjs/types/filter", "filter")
  @js.native
  def filter[V](src: default[V], f: PredicateOrProperty[V]): default[V] = js.native
  
  @JSImport("baconjs/types/filter", "filterT")
  @js.native
  def filterT[V](f: Predicate[V]): js.Function2[/* e */ Event[V], /* sink */ EventSink[V], Reply] = js.native
}
