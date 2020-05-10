package typingsSlinky.ip.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubnetInfo extends js.Object {
  var broadcastAddress: String = js.native
  var firstAddress: String = js.native
  var lastAddress: String = js.native
  var length: Double = js.native
  var networkAddress: String = js.native
  var numHosts: Double = js.native
  var subnetMask: String = js.native
  var subnetMaskLength: Double = js.native
  def contains(ip: String): Boolean = js.native
}

object SubnetInfo {
  @scala.inline
  def apply(
    broadcastAddress: String,
    contains: String => Boolean,
    firstAddress: String,
    lastAddress: String,
    length: Double,
    networkAddress: String,
    numHosts: Double,
    subnetMask: String,
    subnetMaskLength: Double
  ): SubnetInfo = {
    val __obj = js.Dynamic.literal(broadcastAddress = broadcastAddress.asInstanceOf[js.Any], contains = js.Any.fromFunction1(contains), firstAddress = firstAddress.asInstanceOf[js.Any], lastAddress = lastAddress.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], networkAddress = networkAddress.asInstanceOf[js.Any], numHosts = numHosts.asInstanceOf[js.Any], subnetMask = subnetMask.asInstanceOf[js.Any], subnetMaskLength = subnetMaskLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubnetInfo]
  }
  @scala.inline
  implicit class SubnetInfoOps[Self <: SubnetInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBroadcastAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("broadcastAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContains(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contains")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFirstAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNetworkAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumHosts(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numHosts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubnetMask(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnetMask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubnetMaskLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnetMaskLength")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

