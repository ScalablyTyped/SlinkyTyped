package typingsSlinky.chrome.anon

import typingsSlinky.chrome.chrome.serial.onReceive.OnReceiveInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofonReceive extends js.Object {
  def addListener(callback: js.Function1[/* info */ OnReceiveInfo, Unit]): Unit = js.native
}

object TypeofonReceive {
  @scala.inline
  def apply(addListener: js.Function1[/* info */ OnReceiveInfo, Unit] => Unit): TypeofonReceive = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction1(addListener))
    __obj.asInstanceOf[TypeofonReceive]
  }
  @scala.inline
  implicit class TypeofonReceiveOps[Self <: TypeofonReceive] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddListener(value: js.Function1[/* info */ OnReceiveInfo, Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addListener")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

