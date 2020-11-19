package typingsSlinky.qRetry.mod

import typingsSlinky.q.mod.IPromise
import typingsSlinky.qRetry.mod.qAugmentingMod.IRetryOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("q-retry", "retry")
@js.native
object retry extends js.Object {
  
  def apply[U](process: js.Function0[IPromise[U] | U]): typingsSlinky.qRetry.mod.qAugmentingMod.Promise[U] = js.native
  def apply[U](process: js.Function0[IPromise[U] | U], limit: Double): typingsSlinky.qRetry.mod.qAugmentingMod.Promise[U] = js.native
  def apply[U](
    process: js.Function0[IPromise[U] | U],
    onFail: js.Function2[/* reason */ js.Any, /* retries */ Double, Unit]
  ): typingsSlinky.qRetry.mod.qAugmentingMod.Promise[U] = js.native
  def apply[U](
    process: js.Function0[IPromise[U] | U],
    onFail: js.Function2[/* reason */ js.Any, /* retries */ Double, Unit],
    limit: Double
  ): typingsSlinky.qRetry.mod.qAugmentingMod.Promise[U] = js.native
  def apply[U](
    process: js.Function0[IPromise[U] | U],
    onFail: js.Function2[/* reason */ js.Any, /* retries */ Double, Unit],
    options: IRetryOptions
  ): typingsSlinky.qRetry.mod.qAugmentingMod.Promise[U] = js.native
  def apply[U](process: js.Function0[IPromise[U] | U], options: IRetryOptions): typingsSlinky.qRetry.mod.qAugmentingMod.Promise[U] = js.native
}
