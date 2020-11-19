package typingsSlinky.rxCore.Rx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Promise A+
  */
@js.native
trait IPromise[T] extends js.Object {
  
  def `then`[R](): IPromise[R] = js.native
  def `then`[R](onFulfilled: js.UndefOr[scala.Nothing], onRejected: js.Function1[/* reason */ js.Any, R]): IPromise[R] = js.native
  def `then`[R](onFulfilled: js.Function1[/* value */ T, IPromise[R] | R]): IPromise[R] = js.native
  def `then`[R](
    onFulfilled: js.Function1[/* value */ T, IPromise[R] | R],
    onRejected: js.Function1[/* reason */ js.Any, IPromise[R] | R]
  ): IPromise[R] = js.native
}
