package typingsSlinky.baconjs

import typingsSlinky.baconjs.observableMod.EventStream
import typingsSlinky.baconjs.observableMod.EventStreamOptions
import typingsSlinky.baconjs.observableMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("baconjs/types/concat", JSImport.Namespace)
@js.native
object concatMod extends js.Object {
  
  def concatAll[V](streams_ : (default[V] | js.Array[default[V]])*): EventStream[V] = js.native
  
  def concatE[V, V2](left: EventStream[V], right: default[V2]): EventStream[V | V2] = js.native
  def concatE[V, V2](left: EventStream[V], right: default[V2], options: EventStreamOptions): EventStream[V | V2] = js.native
}
