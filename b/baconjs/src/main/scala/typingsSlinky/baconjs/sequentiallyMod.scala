package typingsSlinky.baconjs

import typingsSlinky.baconjs.eventMod.Event
import typingsSlinky.baconjs.observableMod.EventStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("baconjs/types/sequentially", JSImport.Namespace)
@js.native
object sequentiallyMod extends js.Object {
  
  def default[V](delay: Double, values: js.Array[V | Event[V]]): EventStream[V] = js.native
}
