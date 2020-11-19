package typingsSlinky.falcor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Thenable[T] extends js.Object {
  
  def `then`[U](): Thenable[U] = js.native
  def `then`[U](
    onFulfilled: js.UndefOr[scala.Nothing],
    onRejected: js.Function1[/* error */ js.Any, U | Thenable[U] | Unit]
  ): Thenable[U] = js.native
  def `then`[U](onFulfilled: js.Function1[/* value */ T, U | Thenable[U]]): Thenable[U] = js.native
  def `then`[U](
    onFulfilled: js.Function1[/* value */ T, U | Thenable[U]],
    onRejected: js.Function1[/* error */ js.Any, U | Thenable[U] | Unit]
  ): Thenable[U] = js.native
}
