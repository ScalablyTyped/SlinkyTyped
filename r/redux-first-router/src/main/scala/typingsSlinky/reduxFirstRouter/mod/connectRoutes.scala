package typingsSlinky.reduxFirstRouter.mod

import typingsSlinky.reduxFirstRouter.anon.Enhancer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("redux-first-router", "connectRoutes")
@js.native
object connectRoutes extends js.Object {
  
  def apply[TKeys, TState](routesMap: RoutesMap[TKeys, TState]): Enhancer[TKeys, TState] = js.native
  def apply[TKeys, TState](routesMap: RoutesMap[TKeys, TState], options: Options[TKeys, TState]): Enhancer[TKeys, TState] = js.native
}
