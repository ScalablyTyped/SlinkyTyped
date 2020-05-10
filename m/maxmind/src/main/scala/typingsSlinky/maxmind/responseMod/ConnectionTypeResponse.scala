package typingsSlinky.maxmind.responseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionTypeResponse extends Response {
  val connection_type: String = js.native
  var ip_address: js.UndefOr[String] = js.native
}

object ConnectionTypeResponse {
  @scala.inline
  def apply(connection_type: String): ConnectionTypeResponse = {
    val __obj = js.Dynamic.literal(connection_type = connection_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionTypeResponse]
  }
  @scala.inline
  implicit class ConnectionTypeResponseOps[Self <: ConnectionTypeResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnection_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIp_address(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ip_address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIp_address: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ip_address")(js.undefined)
        ret
    }
  }
  
}

