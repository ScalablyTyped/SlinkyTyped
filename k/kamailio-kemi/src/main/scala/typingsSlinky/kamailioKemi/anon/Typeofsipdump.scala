package typingsSlinky.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofsipdump extends js.Object {
  def send(stag: String): Double = js.native
}

object Typeofsipdump {
  @scala.inline
  def apply(send: String => Double): Typeofsipdump = {
    val __obj = js.Dynamic.literal(send = js.Any.fromFunction1(send))
    __obj.asInstanceOf[Typeofsipdump]
  }
  @scala.inline
  implicit class TypeofsipdumpOps[Self <: Typeofsipdump] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSend(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("send")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

