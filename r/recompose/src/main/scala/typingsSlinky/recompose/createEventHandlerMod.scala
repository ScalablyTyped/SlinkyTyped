package typingsSlinky.recompose

import typingsSlinky.recompose.mod.EventHandlerOf
import typingsSlinky.recompose.mod.ObservableConfig
import typingsSlinky.recompose.mod.Subscribable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/acdlite/recompose/blob/master/docs/API.md#createeventhandler
@JSImport("recompose/createEventHandler", JSImport.Namespace)
@js.native
object createEventHandlerMod extends js.Object {
  
  def createEventHandlerWithConfig(config: ObservableConfig): js.Function0[EventHandlerOf[_, Subscribable[_]]] = js.native
  
  def default[T, TSubs /* <: Subscribable[T] */](): EventHandlerOf[T, TSubs] = js.native
}
