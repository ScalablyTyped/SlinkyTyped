package typingsSlinky.reactRelay.useLoadMoreFunctionMod

import typingsSlinky.relayRuntime.relayRuntimeTypesMod.DisposeFn
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.OperationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-relay/lib/relay-experimental/useLoadMoreFunction", "useLoadMoreFunction")
@js.native
object useLoadMoreFunction extends js.Object {
  
  def apply[TQuery /* <: OperationType */](args: UseLoadMoreFunctionArgs): js.Tuple3[LoadMoreFn[TQuery], Boolean, DisposeFn] = js.native
}
