package typingsSlinky.baconjs

import typingsSlinky.baconjs.eventMod.Event
import typingsSlinky.baconjs.observableMod.EventStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object onceMod {
  
  @JSImport("baconjs/types/once", JSImport.Default)
  @js.native
  def default[V](value: V): EventStream[V] = js.native
  @JSImport("baconjs/types/once", JSImport.Default)
  @js.native
  def default[V](value: Event[V]): EventStream[V] = js.native
}
