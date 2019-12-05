package typingsSlinky.qDashRetry.qDashRetryMod

import typingsSlinky.q.qMod.IWhenable
import typingsSlinky.q.qMod.PromiseState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("q-retry", "allSettled")
@js.native
object allSettled extends js.Object {
  def apply[T](promises: IWhenable[js.Array[IWhenable[T]]]): typingsSlinky.q.qMod.Promise[js.Array[PromiseState[T]]] = js.native
}

