package typingsSlinky.chromeApps.chrome.bluetoothSocket

import typingsSlinky.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnAcceptInfoData extends js.Object {
  /**
    * The client socket identifier, i.e. the socket
    * identifier of the newly established connection.
    * This socket identifier should be used only with
    * functions from the chrome.bluetoothSocket namespace.
    * Note the client socket is initially paused and must
    * be explictly un-paused by the application to start
    * receiving data.
    */
  var clientSocketId: integer = js.native
  /** The server socket identifier. */
  var socketId: integer = js.native
}

object OnAcceptInfoData {
  @scala.inline
  def apply(clientSocketId: integer, socketId: integer): OnAcceptInfoData = {
    val __obj = js.Dynamic.literal(clientSocketId = clientSocketId.asInstanceOf[js.Any], socketId = socketId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnAcceptInfoData]
  }
  @scala.inline
  implicit class OnAcceptInfoDataOps[Self <: OnAcceptInfoData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientSocketId(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientSocketId")(value.asInstanceOf[js.Any])
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

