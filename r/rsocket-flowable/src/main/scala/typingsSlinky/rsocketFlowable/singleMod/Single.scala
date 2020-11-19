package typingsSlinky.rsocketFlowable.singleMod

import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Single[T] extends js.Object {
  
  def flatMap[R](fn: js.Function1[/* data */ T, Single[R]]): Single[R] = js.native
  
  /**
    * Return a new Single that resolves to the value of this Single applied to
    * the given mapping function.
    */
  def map[R](fn: js.Function1[/* data */ T, R]): Single[R] = js.native
  
  def subscribe(): Unit = js.native
  def subscribe(partialSubscriber: Partial[IFutureSubscriber[T]]): Unit = js.native
  
  def `then`(): Unit = js.native
  def `then`(successFn: js.UndefOr[scala.Nothing], errorFn: js.Function1[/* error */ js.Error, Unit]): Unit = js.native
  def `then`(successFn: js.Function1[/* data */ T, Unit]): Unit = js.native
  def `then`(successFn: js.Function1[/* data */ T, Unit], errorFn: js.Function1[/* error */ js.Error, Unit]): Unit = js.native
}
