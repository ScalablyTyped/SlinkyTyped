package typingsSlinky.chromeApps.chrome.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/// For chrome.sockets ///
@js.native
trait SocketTcpPermission extends js.Object {
  /**
    * The host:port pattern for connect operations.
    * *:* are allowed
    */
  var connect: js.UndefOr[String | js.Array[String]] = js.native
}

object SocketTcpPermission {
  @scala.inline
  def apply(): SocketTcpPermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SocketTcpPermission]
  }
  @scala.inline
  implicit class SocketTcpPermissionOps[Self <: SocketTcpPermission] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnect(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connect")(js.undefined)
        ret
    }
  }
  
}

