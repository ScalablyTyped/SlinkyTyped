package typingsSlinky.pulumiAws.outputMod.globalaccelerator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AcceleratorIpSet extends js.Object {
  /**
    * A list of IP addresses in the IP address set.
    */
  var ipAddresses: js.Array[String] = js.native
  /**
    * The types of IP addresses included in this IP set.
    */
  var ipFamily: String = js.native
}

object AcceleratorIpSet {
  @scala.inline
  def apply(ipAddresses: js.Array[String], ipFamily: String): AcceleratorIpSet = {
    val __obj = js.Dynamic.literal(ipAddresses = ipAddresses.asInstanceOf[js.Any], ipFamily = ipFamily.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceleratorIpSet]
  }
  @scala.inline
  implicit class AcceleratorIpSetOps[Self <: AcceleratorIpSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIpAddresses(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipAddresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIpFamily(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipFamily")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

