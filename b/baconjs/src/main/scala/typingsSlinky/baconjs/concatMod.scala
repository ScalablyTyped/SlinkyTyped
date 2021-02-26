package typingsSlinky.baconjs

import typingsSlinky.baconjs.observableMod.EventStream
import typingsSlinky.baconjs.observableMod.EventStreamOptions
import typingsSlinky.baconjs.observableMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object concatMod {
  
  @JSImport("baconjs/types/concat", "concatAll")
  @js.native
  def concatAll[V](streams_ : (default[V] | js.Array[default[V]])*): EventStream[V] = js.native
  
  @JSImport("baconjs/types/concat", "concatE")
  @js.native
  def concatE[V, V2](left: EventStream[V], right: default[V2]): EventStream[V | V2] = js.native
  @JSImport("baconjs/types/concat", "concatE")
  @js.native
  def concatE[V, V2](left: EventStream[V], right: default[V2], options: EventStreamOptions): EventStream[V | V2] = js.native
}
