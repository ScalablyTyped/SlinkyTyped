package typingsSlinky.keystonejsEmail.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Send extends js.Object {
  def send(rendererOpts: js.Any, transportOptions: js.Any): js.Any = js.native
}

object Send {
  @scala.inline
  def apply(send: (js.Any, js.Any) => js.Any): Send = {
    val __obj = js.Dynamic.literal(send = js.Any.fromFunction2(send))
    __obj.asInstanceOf[Send]
  }
  @scala.inline
  implicit class SendOps[Self <: Send] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSend(value: (js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("send")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

