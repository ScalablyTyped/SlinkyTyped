package typingsSlinky.qRetry.mod

import typingsSlinky.q.mod.IWhenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("q-retry", "spread")
@js.native
object spread extends js.Object {
  
  def apply[T, U](promises: js.Array[IWhenable[T]], onFulfilled: js.Function1[/* repeated */ T, IWhenable[U]]): typingsSlinky.q.mod.Promise[U] = js.native
  def apply[T, U](
    promises: js.Array[IWhenable[T]],
    onFulfilled: js.Function1[/* repeated */ T, IWhenable[U]],
    onRejected: js.Function1[/* reason */ js.Any, IWhenable[U]]
  ): typingsSlinky.q.mod.Promise[U] = js.native
}
