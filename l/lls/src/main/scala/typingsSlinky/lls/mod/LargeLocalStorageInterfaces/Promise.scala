package typingsSlinky.lls.mod.LargeLocalStorageInterfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Promise[T] extends js.Object {
  
  def `catch`[U](): Promise[U] = js.native
  def `catch`[U](onRejected: js.Function1[/* error */ js.Any, U | Promise[U]]): Promise[U] = js.native
  
  def `then`[U](): Promise[U] = js.native
  def `then`[U](
    onFulfilled: js.UndefOr[scala.Nothing],
    onRejected: js.Function1[/* error */ js.Any, Promise[U] | U | Unit]
  ): Promise[U] = js.native
  def `then`[U](onFulfilled: js.Function1[/* value */ T, U | Promise[U]]): Promise[U] = js.native
  def `then`[U](
    onFulfilled: js.Function1[/* value */ T, Promise[U] | U],
    onRejected: js.Function1[/* error */ js.Any, Promise[U] | U | Unit]
  ): Promise[U] = js.native
}
