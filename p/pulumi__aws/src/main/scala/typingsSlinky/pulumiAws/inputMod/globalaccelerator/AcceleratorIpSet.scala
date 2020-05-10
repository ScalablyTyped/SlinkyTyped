package typingsSlinky.pulumiAws.inputMod.globalaccelerator

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AcceleratorIpSet extends js.Object {
  /**
    * A list of IP addresses in the IP address set.
    */
  var ipAddresses: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The types of IP addresses included in this IP set.
    */
  var ipFamily: js.UndefOr[Input[String]] = js.native
}

object AcceleratorIpSet {
  @scala.inline
  def apply(): AcceleratorIpSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AcceleratorIpSet]
  }
  @scala.inline
  implicit class AcceleratorIpSetOps[Self <: AcceleratorIpSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIpAddresses(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipAddresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpAddresses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipAddresses")(js.undefined)
        ret
    }
    @scala.inline
    def withIpFamily(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpFamily: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipFamily")(js.undefined)
        ret
    }
  }
  
}

