package typingsSlinky.grpcGrpcJs.subchannelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TcpSubchannelAddress extends SubchannelAddress {
  var host: String = js.native
  var port: Double = js.native
}

object TcpSubchannelAddress {
  @scala.inline
  def apply(host: String, port: Double): TcpSubchannelAddress = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[TcpSubchannelAddress]
  }
  @scala.inline
  implicit class TcpSubchannelAddressOps[Self <: TcpSubchannelAddress] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

