package typingsSlinky.chromeApps.chrome.bluetoothSocket

import typingsSlinky.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnReceiveEventData extends js.Object {
  /** The data received, with a maxium size of bufferSize. */
  var data: js.typedarray.ArrayBuffer = js.native
  /** The socket identifier. */
  var socketId: integer = js.native
}

object OnReceiveEventData {
  @scala.inline
  def apply(data: js.typedarray.ArrayBuffer, socketId: integer): OnReceiveEventData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], socketId = socketId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnReceiveEventData]
  }
  @scala.inline
  implicit class OnReceiveEventDataOps[Self <: OnReceiveEventData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: js.typedarray.ArrayBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSocketId(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socketId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

