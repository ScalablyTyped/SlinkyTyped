package typingsSlinky.androiduix.android.os.Handler

import typingsSlinky.androiduix.android.os.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Callback extends js.Object {
  def handleMessage(msg: Message): Boolean = js.native
}

object Callback {
  @scala.inline
  def apply(handleMessage: Message => Boolean): Callback = {
    val __obj = js.Dynamic.literal(handleMessage = js.Any.fromFunction1(handleMessage))
    __obj.asInstanceOf[Callback]
  }
  @scala.inline
  implicit class CallbackOps[Self <: Callback] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHandleMessage(value: Message => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleMessage")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

