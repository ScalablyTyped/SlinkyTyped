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

object skipwhileMod {
  
  @JSImport("baconjs/types/skipwhile", JSImport.Default)
  @js.native
  def default[V](src: typingsSlinky.baconjs.observableMod.default[V], f: PredicateOrProperty[V]): typingsSlinky.baconjs.observableMod.default[V] = js.native
  
  @JSImport("baconjs/types/skipwhile", "skipWhile")
  @js.native
  def skipWhile[V](src: default[V], f: PredicateOrProperty[V]): default[V] = js.native
  
  @JSImport("baconjs/types/skipwhile", "skipWhileT")
  @js.native
  def skipWhileT[V](f: Predicate[V]): js.Function2[/* event */ Event[V], /* sink */ EventSink[V], Reply] = js.native
}
