package typingsSlinky.iobroker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonExecute extends js.Object {
  var execute: Boolean = js.native
  var http: Boolean = js.native
  var sendto: Boolean = js.native
}

object AnonExecute {
  @scala.inline
  def apply(execute: Boolean, http: Boolean, sendto: Boolean): AnonExecute = {
    val __obj = js.Dynamic.literal(execute = execute.asInstanceOf[js.Any], http = http.asInstanceOf[js.Any], sendto = sendto.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExecute]
  }
  @scala.inline
  implicit class AnonExecuteOps[Self <: AnonExecute] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExecute(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHttp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("http")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSendto(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendto")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

