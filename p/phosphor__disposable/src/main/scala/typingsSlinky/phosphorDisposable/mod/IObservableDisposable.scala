package typingsSlinky.phosphorDisposable.mod

import typingsSlinky.phosphorSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IObservableDisposable extends IDisposable {
  /**
    * A signal emitted when the object is disposed.
    */
  val disposed: ISignal[this.type, Unit] = js.native
}

object IObservableDisposable {
  @scala.inline
  def apply(dispose: () => Unit, disposed: ISignal[IObservableDisposable, Unit], isDisposed: Boolean): IObservableDisposable = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), disposed = disposed.asInstanceOf[js.Any], isDisposed = isDisposed.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObservableDisposable]
  }
  @scala.inline
  implicit class IObservableDisposableOps[Self <: IObservableDisposable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisposed(value: ISignal[IObservableDisposable, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disposed")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

