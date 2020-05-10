package typingsSlinky.awsSdk.snowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAddressesResult extends js.Object {
  /**
    * The Snowball shipping addresses that were created for this account.
    */
  var Addresses: js.UndefOr[AddressList] = js.native
  /**
    * HTTP requests are stateless. If you use the automatically generated NextToken value in your next DescribeAddresses call, your list of returned addresses will start from this point in the array.
    */
  var NextToken: js.UndefOr[String] = js.native
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
    @scala.inline
    def withNextToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
  }
  
}

