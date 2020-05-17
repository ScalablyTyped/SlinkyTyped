package typingsSlinky.chromeApps.anon

import typingsSlinky.chromeApps.chrome.runtime.SocketTcpPermission
import typingsSlinky.chromeApps.chrome.runtime.SocketTcpServerPermission
import typingsSlinky.chromeApps.chrome.runtime.SocketUdpPermission
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tcp extends js.Object {
  /** The tcp manifest property declares which sockets.tcp operations an app can issue. */
  var tcp: js.UndefOr[SocketTcpPermission] = js.native
  /** The tcpServer manifest property declares which sockets.tcpServer operations an app can issue. */
  var tcpServer: js.UndefOr[SocketTcpServerPermission] = js.native
  /** The udp manifest property declares which sockets.udp operations an app can issue. */
  var udp: js.UndefOr[SocketUdpPermission] = js.native
}

object Tcp {
  @scala.inline
  def apply(): Tcp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Tcp]
  }
  @scala.inline
  implicit class TcpOps[Self <: Tcp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTcp(value: SocketTcpPermission): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tcp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTcp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tcp")(js.undefined)
        ret
    }
    @scala.inline
    def withTcpServer(value: SocketTcpServerPermission): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tcpServer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTcpServer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tcpServer")(js.undefined)
        ret
    }
    @scala.inline
    def withUdp(value: SocketUdpPermission): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("udp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUdp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("udp")(js.undefined)
        ret
    }
  }
  
}

