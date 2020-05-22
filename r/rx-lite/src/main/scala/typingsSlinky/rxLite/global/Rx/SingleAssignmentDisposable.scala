package typingsSlinky.rxLite.global.Rx

import typingsSlinky.rxCore.Rx.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Single assignment
@JSGlobal("Rx.SingleAssignmentDisposable")
@js.native
class SingleAssignmentDisposable ()
  extends typingsSlinky.rxLite.Rx.SingleAssignmentDisposable {
  /* CompleteClass */
  override var current: IDisposable = js.native
  /* CompleteClass */
  override var isDisposed: Boolean = js.native
  /* CompleteClass */
  override def dispose(): Unit = js.native
  /* CompleteClass */
  override def getDisposable(): IDisposable = js.native
  /* CompleteClass */
  override def setDisposable(value: IDisposable): Unit = js.native
}

