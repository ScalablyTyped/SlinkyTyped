package typingsSlinky.qDashRetry.qDashRetryMod

import typingsSlinky.q.qMod.IPromise
import typingsSlinky.qDashRetry.qDashRetryMod.qMod.IRetryOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("q-retry", "retry")
@js.native
object retry extends js.Object {
  def apply[U](process: js.Function0[IPromise[U] | U]): typingsSlinky.qDashRetry.qDashRetryMod.qMod.Promise[U] = js.native
  def apply[U](process: js.Function0[IPromise[U] | U], limit: Double): typingsSlinky.qDashRetry.qDashRetryMod.qMod.Promise[U] = js.native
  def apply[U](
    process: js.Function0[IPromise[U] | U],
    onFail: js.Function2[/* reason */ js.Any, /* retries */ Double, Unit]
  ): typingsSlinky.qDashRetry.qDashRetryMod.qMod.Promise[U] = js.native
  def apply[U](
    process: js.Function0[IPromise[U] | U],
    onFail: js.Function2[/* reason */ js.Any, /* retries */ Double, Unit],
    limit: Double
  ): typingsSlinky.qDashRetry.qDashRetryMod.qMod.Promise[U] = js.native
  def apply[U](
    process: js.Function0[IPromise[U] | U],
    onFail: js.Function2[/* reason */ js.Any, /* retries */ Double, Unit],
    options: IRetryOptions
  ): typingsSlinky.qDashRetry.qDashRetryMod.qMod.Promise[U] = js.native
  def apply[U](process: js.Function0[IPromise[U] | U], options: IRetryOptions): typingsSlinky.qDashRetry.qDashRetryMod.qMod.Promise[U] = js.native
}

