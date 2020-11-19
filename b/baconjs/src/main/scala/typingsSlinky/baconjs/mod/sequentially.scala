package typingsSlinky.baconjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("baconjs", "sequentially")
@js.native
object sequentially extends js.Object {
  
  def apply[V](delay: Double, values: js.Array[V | typingsSlinky.baconjs.eventMod.Event[V]]): typingsSlinky.baconjs.observableMod.EventStream[V] = js.native
}
