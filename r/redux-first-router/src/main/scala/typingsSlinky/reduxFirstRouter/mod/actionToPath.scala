package typingsSlinky.reduxFirstRouter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("redux-first-router", "actionToPath")
@js.native
object actionToPath extends js.Object {
  
  def apply[TKeys, TState](action: ReceivedAction, routesMap: RoutesMap[TKeys, TState]): String = js.native
  def apply[TKeys, TState](action: ReceivedAction, routesMap: RoutesMap[TKeys, TState], querySerializer: QuerySerializer): String = js.native
}
