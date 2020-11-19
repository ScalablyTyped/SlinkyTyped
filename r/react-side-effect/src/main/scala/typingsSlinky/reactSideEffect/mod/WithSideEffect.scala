package typingsSlinky.reactSideEffect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WithSideEffect extends js.Object {
  
  def apply[TProp, TState](
    reducePropsToState: js.Function1[/* propsList */ js.Array[TProp], TState],
    handleStateChangeOnClient: js.Function1[/* state */ TState, Unit]
  ): typingsSlinky.std.ClassDecorator = js.native
  def apply[TProp, TState, TServerState](
    reducePropsToState: js.Function1[/* propsList */ js.Array[TProp], TState],
    handleStateChangeOnClient: js.Function1[/* state */ TState, Unit],
    mapStateOnServer: js.Function1[/* state */ TState, TServerState]
  ): typingsSlinky.std.ClassDecorator = js.native
}
