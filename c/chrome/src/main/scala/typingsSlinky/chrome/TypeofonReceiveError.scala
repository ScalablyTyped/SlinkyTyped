package typingsSlinky.chrome

import typingsSlinky.chrome.chrome.serial.onReceiveError.OnReceiveErrorInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofonReceiveError extends js.Object {
  val OnReceiveErrorEnum: AnonBreak = js.native
  def addListener(callback: js.Function1[/* info */ OnReceiveErrorInfo, Unit]): Unit = js.native
}

object TypeofonReceiveError {
  @scala.inline
  def apply(
    OnReceiveErrorEnum: AnonBreak,
    addListener: js.Function1[/* info */ OnReceiveErrorInfo, Unit] => Unit
  ): TypeofonReceiveError = {
    val __obj = js.Dynamic.literal(OnReceiveErrorEnum = OnReceiveErrorEnum.asInstanceOf[js.Any], addListener = js.Any.fromFunction1(addListener))
    __obj.asInstanceOf[TypeofonReceiveError]
  }
  @scala.inline
  implicit class TypeofonReceiveErrorOps[Self <: TypeofonReceiveError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnReceiveErrorEnum(value: AnonBreak): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnReceiveErrorEnum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddListener(value: js.Function1[/* info */ OnReceiveErrorInfo, Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addListener")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

