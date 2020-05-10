package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublicIpv4Pool extends js.Object {
  /**
    * A description of the address pool.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The address ranges.
    */
  var PoolAddressRanges: js.UndefOr[PublicIpv4PoolRangeSet] = js.native
  /**
    * The ID of the address pool.
    */
  var PoolId: js.UndefOr[String] = js.native
  /**
    * Any tags for the address pool.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The total number of addresses.
    */
  var TotalAddressCount: js.UndefOr[Integer] = js.native
  /**
    * The total number of available addresses.
    */
  var TotalAvailableAddressCount: js.UndefOr[Integer] = js.native
}

object PublicIpv4Pool {
  @scala.inline
  def apply(): PublicIpv4Pool = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublicIpv4Pool]
  }
  @scala.inline
  implicit class PublicIpv4PoolOps[Self <: PublicIpv4Pool] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withPoolAddressRanges(value: PublicIpv4PoolRangeSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PoolAddressRanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPoolAddressRanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PoolAddressRanges")(js.undefined)
        ret
    }
    @scala.inline
    def withPoolId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PoolId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPoolId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PoolId")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalAddressCount(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalAddressCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalAddressCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalAddressCount")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalAvailableAddressCount(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalAvailableAddressCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalAvailableAddressCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalAvailableAddressCount")(js.undefined)
        ret
    }
  }
  
}

