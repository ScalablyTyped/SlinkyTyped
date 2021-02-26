package typingsSlinky.baconjs

import typingsSlinky.baconjs.eventMod.Event
import typingsSlinky.baconjs.observableMod.Property
import typingsSlinky.baconjs.observableMod.default
import typingsSlinky.baconjs.replyMod.Reply
import typingsSlinky.baconjs.typesMod.EventSink
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mapMod {
  
  @JSImport("baconjs/types/map", JSImport.Default)
  @js.native
  def default[V, V2](src: typingsSlinky.baconjs.observableMod.default[V], f: V2): typingsSlinky.baconjs.observableMod.default[V2] = js.native
  @JSImport("baconjs/types/map", JSImport.Default)
  @js.native
  def default[V, V2](src: typingsSlinky.baconjs.observableMod.default[V], f: js.Function1[/* value */ V, V2]): typingsSlinky.baconjs.observableMod.default[V2] = js.native
  @JSImport("baconjs/types/map", JSImport.Default)
  @js.native
  def default[V, V2](src: typingsSlinky.baconjs.observableMod.default[V], f: Property[V2]): typingsSlinky.baconjs.observableMod.default[V2] = js.native
  
  @JSImport("baconjs/types/map", "map")
  @js.native
  def map[V, V2](src: default[V], f: V2): default[V2] = js.native
  @JSImport("baconjs/types/map", "map")
  @js.native
  def map[V, V2](src: default[V], f: js.Function1[/* value */ V, V2]): default[V2] = js.native
  @JSImport("baconjs/types/map", "map")
  @js.native
  def map[V, V2](src: default[V], f: Property[V2]): default[V2] = js.native
  
  @JSImport("baconjs/types/map", "mapT")
  @js.native
  def mapT[V, V2](f: V2): js.Function2[/* e */ Event[V], /* sink */ EventSink[V2], Reply] = js.native
  @JSImport("baconjs/types/map", "mapT")
  @js.native
  def mapT[V, V2](f: js.Function1[/* value */ V, V2]): js.Function2[/* e */ Event[V], /* sink */ EventSink[V2], Reply] = js.native
}
