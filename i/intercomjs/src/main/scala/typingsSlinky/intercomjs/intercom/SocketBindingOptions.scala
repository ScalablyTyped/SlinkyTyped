package typingsSlinky.intercomjs.intercom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SocketBindingOptions extends js.Object {
   /* boolean | (name: string, message: any)=>any */ var receive: js.UndefOr[js.Any] = js.native
  var send: js.UndefOr[js.Any] = js.native
}

object SocketBindingOptions {
  @scala.inline
  def apply(): SocketBindingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SocketBindingOptions]
  }
  @scala.inline
  implicit class SocketBindingOptionsOps[Self <: SocketBindingOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReceive(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReceive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receive")(js.undefined)
        ret
    }
    @scala.inline
    def withSend(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("send")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("send")(js.undefined)
        ret
    }
  }
  
}

