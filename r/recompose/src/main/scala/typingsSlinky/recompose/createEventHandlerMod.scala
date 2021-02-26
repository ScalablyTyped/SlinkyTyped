package typingsSlinky.recompose

import typingsSlinky.recompose.mod.EventHandlerOf
import typingsSlinky.recompose.mod.ObservableConfig
import typingsSlinky.recompose.mod.Subscribable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/acdlite/recompose/blob/master/docs/API.md#createeventhandler
object createEventHandlerMod {
  
  @JSImport("recompose/createEventHandler", JSImport.Default)
  @js.native
  def default[T, TSubs /* <: Subscribable[T] */](): EventHandlerOf[T, TSubs] = js.native
  
  @JSImport("recompose/createEventHandler", "createEventHandlerWithConfig")
  @js.native
  def createEventHandlerWithConfig(config: ObservableConfig): js.Function0[EventHandlerOf[_, Subscribable[_]]] = js.native
}
