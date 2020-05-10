package typingsSlinky.chromeApps.chrome.bluetooth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BluetoothEvent[T] extends js.Object {
  def addListener(callback: js.Function1[/* event */ T, Unit]): Unit = js.native
}

object BluetoothEvent {
  @scala.inline
  def apply[T](addListener: js.Function1[/* event */ T, Unit] => Unit): BluetoothEvent[T] = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction1(addListener))
    __obj.asInstanceOf[BluetoothEvent[T]]
  }
  @scala.inline
  implicit class BluetoothEventOps[Self[t] <: BluetoothEvent[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withAddListener(value: js.Function1[/* event */ T, Unit] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addListener")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

