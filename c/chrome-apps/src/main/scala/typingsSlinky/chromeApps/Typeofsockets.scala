package typingsSlinky.chromeApps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofsockets extends js.Object {
  /**
    * Use the chrome.sockets.tcp API to send and receive data over the network using TCP connections.
    * This API supersedes the TCP functionality previously found in the chrome.socket API.
    * @since Chrome 33.
    * @requires Manifest: 'Sockets': {...}
    */
  val tcp: Typeoftcp = js.native
  /**
    * Use the chrome.sockets.tcpServer API to create server applications using TCP
    * connections. This API supersedes the TCP functionality previously found in
    * the chrome.socket API.
    *
    * @since Chrome 33
    * @see https://developer.chrome.com/apps/sockets_tcpServer
    */
  val tcpServer: TypeoftcpServer = js.native
  /**
    * Use the chrome.sockets.udp API to send and receive data over the network
    * using UDP connections. This API supersedes the UDP functionality previously
    * found in the 'socket' API.
    * @requires Manifest: 'sockets': {...}
    * @since Chrome 33
    * @see https://developer.chrome.com/apps/sockets_udp
    */
  val udp: Typeofudp = js.native
}

object Typeofsockets {
  @scala.inline
  def apply(tcp: Typeoftcp, tcpServer: TypeoftcpServer, udp: Typeofudp): Typeofsockets = {
    val __obj = js.Dynamic.literal(tcp = tcp.asInstanceOf[js.Any], tcpServer = tcpServer.asInstanceOf[js.Any], udp = udp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofsockets]
  }
  @scala.inline
  implicit class TypeofsocketsOps[Self <: Typeofsockets] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTcp(value: Typeoftcp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tcp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTcpServer(value: TypeoftcpServer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tcpServer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUdp(value: Typeofudp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("udp")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

