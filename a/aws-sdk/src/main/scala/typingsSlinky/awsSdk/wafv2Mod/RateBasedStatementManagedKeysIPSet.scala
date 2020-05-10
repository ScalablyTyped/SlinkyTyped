package typingsSlinky.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RateBasedStatementManagedKeysIPSet extends js.Object {
  /**
    * The IP addresses that are currently blocked.
    */
  var Addresses: js.UndefOr[IPAddresses] = js.native
  var IPAddressVersion: js.UndefOr[typingsSlinky.awsSdk.wafv2Mod.IPAddressVersion] = js.native
}

object RateBasedStatementManagedKeysIPSet {
  @scala.inline
  def apply(): RateBasedStatementManagedKeysIPSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RateBasedStatementManagedKeysIPSet]
  }
  @scala.inline
  implicit class RateBasedStatementManagedKeysIPSetOps[Self <: RateBasedStatementManagedKeysIPSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddresses(value: IPAddresses): Self = {
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
    def withIPAddressVersion(value: IPAddressVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IPAddressVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIPAddressVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IPAddressVersion")(js.undefined)
        ret
    }
  }
  
}

