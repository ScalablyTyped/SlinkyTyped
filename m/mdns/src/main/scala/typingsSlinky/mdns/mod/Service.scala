package typingsSlinky.mdns.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// --- Services ---
@js.native
trait Service extends js.Object {
  var addresses: js.Array[String] = js.native
  var flags: Double = js.native
  var fullname: String = js.native
  var host: String = js.native
  var interfaceIndex: Double = js.native
  var name: js.UndefOr[String] = js.native
  var networkInterface: String = js.native
  var port: Double = js.native
  var rawTxtRecord: js.UndefOr[Buffer] = js.native
  var replyDomain: String = js.native
  var txtRecord: js.UndefOr[js.Any] = js.native
  var `type`: ServiceType = js.native
}

object Service {
  @scala.inline
  def apply(
    addresses: js.Array[String],
    flags: Double,
    fullname: String,
    host: String,
    interfaceIndex: Double,
    networkInterface: String,
    port: Double,
    replyDomain: String,
    `type`: ServiceType
  ): Service = {
    val __obj = js.Dynamic.literal(addresses = addresses.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], fullname = fullname.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], interfaceIndex = interfaceIndex.asInstanceOf[js.Any], networkInterface = networkInterface.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], replyDomain = replyDomain.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Service]
  }
  @scala.inline
  implicit class ServiceOps[Self <: Service] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddresses(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlags(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFullname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInterfaceIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interfaceIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNetworkInterface(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkInterface")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReplyDomain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replyDomain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: ServiceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withRawTxtRecord(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawTxtRecord")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRawTxtRecord: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawTxtRecord")(js.undefined)
        ret
    }
    @scala.inline
    def withTxtRecord(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("txtRecord")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTxtRecord: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("txtRecord")(js.undefined)
        ret
    }
  }
  
}

