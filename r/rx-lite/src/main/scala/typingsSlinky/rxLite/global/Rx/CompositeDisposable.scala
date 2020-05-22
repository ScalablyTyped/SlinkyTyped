package typingsSlinky.rxLite.global.Rx

import typingsSlinky.rxCore.Rx.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Rx.CompositeDisposable")
@js.native
class CompositeDisposable protected ()
  extends typingsSlinky.rxLite.Rx.CompositeDisposable {
  def this(disposables: IDisposable*) = this()
  def this(disposables: js.Array[IDisposable]) = this()
  /* CompleteClass */
  override var isDisposed: Boolean = js.native
  /* CompleteClass */
  override var length: Double = js.native
  /* CompleteClass */
  override def add(item: IDisposable): Unit = js.native
  /* CompleteClass */
  override def dispose(): Unit = js.native
  /* CompleteClass */
  override def remove(item: IDisposable): Boolean = js.native
  /* CompleteClass */
  override def toArray(): js.Array[IDisposable] = js.native
}

