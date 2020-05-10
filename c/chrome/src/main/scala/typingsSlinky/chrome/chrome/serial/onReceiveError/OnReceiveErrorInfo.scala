package typingsSlinky.chrome.chrome.serial.onReceiveError

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnReceiveErrorInfo extends js.Object {
  /** The connection identifier. */
  var connectionId: Double = js.native
  /** The data received. */
  var error: js.typedarray.ArrayBuffer = js.native
}

object OnReceiveErrorInfo {
  @scala.inline
  def apply(connectionId: Double, error: js.typedarray.ArrayBuffer): OnReceiveErrorInfo = {
    val __obj = js.Dynamic.literal(connectionId = connectionId.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnReceiveErrorInfo]
  }
  @scala.inline
  implicit class OnReceiveErrorInfoOps[Self <: OnReceiveErrorInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnectionId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError(value: js.typedarray.ArrayBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

