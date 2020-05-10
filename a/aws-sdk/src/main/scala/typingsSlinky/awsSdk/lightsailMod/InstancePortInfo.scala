package typingsSlinky.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstancePortInfo extends js.Object {
  /**
    * The access direction (inbound or outbound).
    */
  var accessDirection: js.UndefOr[AccessDirection] = js.native
  /**
    * The location from which access is allowed (e.g., Anywhere (0.0.0.0/0)).
    */
  var accessFrom: js.UndefOr[String] = js.native
  /**
    * The type of access (Public or Private).
    */
  var accessType: js.UndefOr[PortAccessType] = js.native
  /**
    * The common name.
    */
  var commonName: js.UndefOr[String] = js.native
  /**
    * The first port in the range.
    */
  var fromPort: js.UndefOr[Port] = js.native
  /**
    * The protocol being used. Can be one of the following.    tcp - Transmission Control Protocol (TCP) provides reliable, ordered, and error-checked delivery of streamed data between applications running on hosts communicating by an IP network. If you have an application that doesn't require reliable data stream service, use UDP instead.    all - All transport layer protocol types. For more general information, see Transport layer on Wikipedia.    udp - With User Datagram Protocol (UDP), computer applications can send messages (or datagrams) to other hosts on an Internet Protocol (IP) network. Prior communications are not required to set up transmission channels or data paths. Applications that don't require reliable data stream service can use UDP, which provides a connectionless datagram service that emphasizes reduced latency over reliability. If you do require reliable data stream service, use TCP instead.  
    */
  var protocol: js.UndefOr[NetworkProtocol] = js.native
  /**
    * The last port in the range.
    */
  var toPort: js.UndefOr[Port] = js.native
}

object InstancePortInfo {
  @scala.inline
  def apply(): InstancePortInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstancePortInfo]
  }
  @scala.inline
  implicit class InstancePortInfoOps[Self <: InstancePortInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessDirection(value: AccessDirection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessDirection")(js.undefined)
        ret
    }
    @scala.inline
    def withAccessFrom(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessFrom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessFrom")(js.undefined)
        ret
    }
    @scala.inline
    def withAccessType(value: PortAccessType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessType")(js.undefined)
        ret
    }
    @scala.inline
    def withCommonName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commonName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommonName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commonName")(js.undefined)
        ret
    }
    @scala.inline
    def withFromPort(value: Port): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFromPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromPort")(js.undefined)
        ret
    }
    @scala.inline
    def withProtocol(value: NetworkProtocol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtocol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(js.undefined)
        ret
    }
    @scala.inline
    def withToPort(value: Port): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toPort")(js.undefined)
        ret
    }
  }
  
}

