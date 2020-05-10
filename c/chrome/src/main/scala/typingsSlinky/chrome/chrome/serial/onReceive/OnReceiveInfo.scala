package typingsSlinky.chrome.chrome.serial.onReceive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnReceiveInfo extends js.Object {
  /** The connection identifier. */
  var connectionId: Double = js.native
  /** The data received. */
  var data: js.typedarray.ArrayBuffer = js.native
}

object OnReceiveInfo {
  @scala.inline
  def apply(connectionId: Double, data: js.typedarray.ArrayBuffer): OnReceiveInfo = {
    val __obj = js.Dynamic.literal(connectionId = connectionId.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnReceiveInfo]
  }
  @scala.inline
  implicit class OnReceiveInfoOps[Self <: OnReceiveInfo] (val x: Self) extends AnyVal {
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
    def withData(value: js.typedarray.ArrayBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

