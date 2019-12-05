package typingsSlinky.qDashRetry.qDashRetryMod.qMod

import typingsSlinky.q.qMod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Promise[T] extends js.Object {
  def retry[U](process: js.Function1[/* value */ T, IPromise[U] | U]): typingsSlinky.qDashRetry.qDashRetryMod.qMod.Promise[U] = js.native
  def retry[U](process: js.Function1[/* value */ T, IPromise[U] | U], limit: Double): typingsSlinky.qDashRetry.qDashRetryMod.qMod.Promise[U] = js.native
  def retry[U](
    process: js.Function1[/* value */ T, IPromise[U] | U],
    onFail: js.Function2[/* reason */ js.Any, /* retries */ Double, Unit]
  ): typingsSlinky.qDashRetry.qDashRetryMod.qMod.Promise[U] = js.native
  def retry[U](
    process: js.Function1[/* value */ T, IPromise[U] | U],
    onFail: js.Function2[/* reason */ js.Any, /* retries */ Double, Unit],
    limit: Double
  ): typingsSlinky.qDashRetry.qDashRetryMod.qMod.Promise[U] = js.native
  def retry[U](
    process: js.Function1[/* value */ T, IPromise[U] | U],
    onFail: js.Function2[/* reason */ js.Any, /* retries */ Double, Unit],
    options: IRetryOptions
  ): typingsSlinky.qDashRetry.qDashRetryMod.qMod.Promise[U] = js.native
  def retry[U](process: js.Function1[/* value */ T, IPromise[U] | U], options: IRetryOptions): typingsSlinky.qDashRetry.qDashRetryMod.qMod.Promise[U] = js.native
}

