package typingsSlinky.fridaGum

import typingsSlinky.fridaGum.fridaGumStrings.ipv4
import typingsSlinky.fridaGum.fridaGumStrings.ipv6
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TcpListenOptions
  extends BaseListenOptions
     with SocketListenOptions {
  /**
    * Address family. Omit to listen on both ipv4 and ipv6 – if supported by the OS.
    */
  var family: js.UndefOr[ipv4 | ipv6] = js.native
  /**
    * Host or IP address to listen on. Omit to listen on all interfaces.
    */
  var host: js.UndefOr[String] = js.native
  /**
    * Port to listen on. Omit to listen on a randomly selected port.
    */
  var port: js.UndefOr[Double] = js.native
}

object TcpListenOptions {
  @scala.inline
  def apply(): TcpListenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TcpListenOptions]
  }
  @scala.inline
  implicit class TcpListenOptionsOps[Self <: TcpListenOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFamily(value: ipv4 | ipv6): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("family")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFamily: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("family")(js.undefined)
        ret
    }
    @scala.inline
    def withHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(js.undefined)
        ret
    }
    @scala.inline
    def withPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(js.undefined)
        ret
    }
  }
  
}

