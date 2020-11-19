package typingsSlinky.baconjs

import typingsSlinky.baconjs.eventMod.Event
import typingsSlinky.baconjs.observableMod.EventStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("baconjs/types/once", JSImport.Namespace)
@js.native
object onceMod extends js.Object {
  
  def default[V](value: V): EventStream[V] = js.native
  def default[V](value: Event[V]): EventStream[V] = js.native
}
