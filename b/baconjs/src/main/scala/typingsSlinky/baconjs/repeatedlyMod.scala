package typingsSlinky.baconjs

import typingsSlinky.baconjs.eventMod.Event
import typingsSlinky.baconjs.observableMod.EventStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object repeatedlyMod {
  
  @JSImport("baconjs/types/repeatedly", JSImport.Default)
  @js.native
  def default[V](delay: Double, values: js.Array[V | Event[V]]): EventStream[V] = js.native
}
