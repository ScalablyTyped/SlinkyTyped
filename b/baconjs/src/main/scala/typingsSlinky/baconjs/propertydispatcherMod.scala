package typingsSlinky.baconjs

import typingsSlinky.baconjs.eventMod.Value
import typingsSlinky.baconjs.optionalMod.Option
import typingsSlinky.baconjs.typesMod.EventSink
import typingsSlinky.baconjs.typesMod.Subscribe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object propertydispatcherMod {
  
  @JSImport("baconjs/types/internal/propertydispatcher", JSImport.Default)
  @js.native
  class default[V, O /* <: typingsSlinky.baconjs.observableMod.default[V] */] protected () extends PropertyDispatcher[V, O] {
    def this(property: O, subscribe: Subscribe[V]) = this()
    def this(property: O, subscribe: Subscribe[V], handleEvent: EventSink[V]) = this()
  }
  
  @js.native
  trait PropertyDispatcher[V, O /* <: typingsSlinky.baconjs.observableMod.default[V] */]
    extends typingsSlinky.baconjs.dispatcherMod.default[V, O] {
    
    var current: Option[Value[V]] = js.native
    
    var currentValueRootId: js.UndefOr[Double] = js.native
    
    def maybeSubSource(sink: EventSink[V], reply: js.Any): js.Function0[Unit] = js.native
    
    var propertyEnded: Boolean = js.native
  }
}
