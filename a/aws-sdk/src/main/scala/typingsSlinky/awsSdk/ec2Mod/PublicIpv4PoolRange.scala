package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublicIpv4PoolRange extends js.Object {
  /**
    * The number of addresses in the range.
    */
  var AddressCount: js.UndefOr[Integer] = js.native
  /**
    * The number of available addresses in the range.
    */
  var AvailableAddressCount: js.UndefOr[Integer] = js.native
  /**
    * The first IP address in the range.
    */
  var FirstAddress: js.UndefOr[String] = js.native
  /**
    * The last IP address in the range.
    */
  var LastAddress: js.UndefOr[String] = js.native
}

object PublicIpv4PoolRange {
  @scala.inline
  def apply(): PublicIpv4PoolRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublicIpv4PoolRange]
  }
  @scala.inline
  implicit class PublicIpv4PoolRangeOps[Self <: PublicIpv4PoolRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddressCount(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddressCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddressCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddressCount")(js.undefined)
        ret
    }
    @scala.inline
    def withAvailableAddressCount(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailableAddressCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailableAddressCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailableAddressCount")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FirstAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FirstAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withLastAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastAddress")(js.undefined)
        ret
    }
  }
  
}

