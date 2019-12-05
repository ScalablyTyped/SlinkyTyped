package typingsSlinky.dojo.dojo.promise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Thenable[T] extends js.Object {
  def `then`[U](): Thenable[U] = js.native
  def `then`[U](onFulfilled: js.Function1[/* value */ js.UndefOr[T], Thenable[U] | U]): Thenable[U] = js.native
  def `then`[U](
    onFulfilled: js.Function1[/* value */ js.UndefOr[T], Thenable[U] | U],
    onRejected: js.Function1[/* error */ js.UndefOr[js.Error], Thenable[U] | U]
  ): Thenable[U] = js.native
}

