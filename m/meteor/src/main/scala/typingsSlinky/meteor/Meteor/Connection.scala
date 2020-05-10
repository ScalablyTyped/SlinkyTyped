package typingsSlinky.meteor.Meteor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Connection **/
@js.native
trait Connection extends js.Object {
  var clientAddress: String = js.native
  var close: js.Function = js.native
  var httpHeaders: js.Object = js.native
  var id: String = js.native
  var onClose: js.Function = js.native
}

object Connection {
  @scala.inline
  def apply(
    clientAddress: String,
    close: js.Function,
    httpHeaders: js.Object,
    id: String,
    onClose: js.Function
  ): Connection = {
    val __obj = js.Dynamic.literal(clientAddress = clientAddress.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], httpHeaders = httpHeaders.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], onClose = onClose.asInstanceOf[js.Any])
    __obj.asInstanceOf[Connection]
  }
  @scala.inline
  implicit class ConnectionOps[Self <: Connection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClose(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHttpHeaders(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnClose(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

