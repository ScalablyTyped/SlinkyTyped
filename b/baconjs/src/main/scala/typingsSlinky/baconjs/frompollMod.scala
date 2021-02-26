package typingsSlinky.baconjs

import typingsSlinky.baconjs.frombinderMod.EventLike
import typingsSlinky.baconjs.observableMod.EventStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object frompollMod {
  
  @JSImport("baconjs/types/frompoll", JSImport.Default)
  @js.native
  def default[V](delay: Double, poll: PollFunction[V]): EventStream[V] = js.native
  
  type PollFunction[V] = js.Function0[EventLike[V]]
}
