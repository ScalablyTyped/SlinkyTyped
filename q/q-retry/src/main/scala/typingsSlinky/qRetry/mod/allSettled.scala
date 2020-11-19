package typingsSlinky.qRetry.mod

import typingsSlinky.q.mod.IWhenable
import typingsSlinky.q.mod.PromiseState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("q-retry", "allSettled")
@js.native
object allSettled extends js.Object {
  
  def apply[T](promises: IWhenable[js.Array[IWhenable[T]]]): typingsSlinky.q.mod.Promise[js.Array[PromiseState[T]]] = js.native
}
