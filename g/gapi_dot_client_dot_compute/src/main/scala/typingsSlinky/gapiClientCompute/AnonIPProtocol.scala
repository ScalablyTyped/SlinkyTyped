package typingsSlinky.gapiClientCompute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIPProtocol extends js.Object {
  /**
    * The IP protocol to which this rule applies. The protocol type is required when creating a firewall rule. This value can either be one of the following
    * well known protocol strings (tcp, udp, icmp, esp, ah, ipip, sctp), or the IP protocol number.
    */
  var IPProtocol: js.UndefOr[String] = js.native
  /**
    * An optional list of ports to which this rule applies. This field is only applicable for UDP or TCP protocol. Each entry must be either an integer or a
    * range. If not specified, this rule applies to connections through any port.
    *
    * Example inputs include: ["22"], ["80","443"], and ["12345-12349"].
    */
  var ports: js.UndefOr[js.Array[String]] = js.native
}

object AnonIPProtocol {
  @scala.inline
  def apply(): AnonIPProtocol = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonIPProtocol]
  }
  @scala.inline
  implicit class AnonIPProtocolOps[Self <: AnonIPProtocol] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIPProtocol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IPProtocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIPProtocol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IPProtocol")(js.undefined)
        ret
    }
    @scala.inline
    def withPorts(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPorts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ports")(js.undefined)
        ret
    }
  }
  
}

