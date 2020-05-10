package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAddressesResult extends js.Object {
  /**
    * Information about the Elastic IP addresses.
    */
  var Addresses: js.UndefOr[AddressList] = js.native
}

object DescribeAddressesResult {
  @scala.inline
  def apply(): DescribeAddressesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAddressesResult]
  }
  @scala.inline
  implicit class DescribeAddressesResultOps[Self <: DescribeAddressesResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddresses(value: AddressList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Addresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddresses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Addresses")(js.undefined)
        ret
    }
  }
  
}

