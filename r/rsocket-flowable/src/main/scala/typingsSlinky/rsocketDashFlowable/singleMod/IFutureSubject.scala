package typingsSlinky.rsocketDashFlowable.singleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFutureSubject[T] extends js.Object {
  def onComplete(value: T): Unit = js.native
  def onError(error: js.Error): Unit = js.native
  def onSubscribe(): Unit = js.native
  def onSubscribe(cancel: CancelCallback): Unit = js.native
}

