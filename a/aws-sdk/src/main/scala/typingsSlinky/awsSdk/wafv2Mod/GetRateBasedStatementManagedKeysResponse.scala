package typingsSlinky.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRateBasedStatementManagedKeysResponse extends js.Object {
  /**
    * The keys that are of Internet Protocol version 4 (IPv4). 
    */
  var ManagedKeysIPV4: js.UndefOr[RateBasedStatementManagedKeysIPSet] = js.native
  /**
    * The keys that are of Internet Protocol version 6 (IPv6). 
    */
  var ManagedKeysIPV6: js.UndefOr[RateBasedStatementManagedKeysIPSet] = js.native
}

object GetRateBasedStatementManagedKeysResponse {
  @scala.inline
  def apply(): GetRateBasedStatementManagedKeysResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRateBasedStatementManagedKeysResponse]
  }
  @scala.inline
  implicit class GetRateBasedStatementManagedKeysResponseOps[Self <: GetRateBasedStatementManagedKeysResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withManagedKeysIPV4(value: RateBasedStatementManagedKeysIPSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ManagedKeysIPV4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManagedKeysIPV4: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ManagedKeysIPV4")(js.undefined)
        ret
    }
    @scala.inline
    def withManagedKeysIPV6(value: RateBasedStatementManagedKeysIPSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ManagedKeysIPV6")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManagedKeysIPV6: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ManagedKeysIPV6")(js.undefined)
        ret
    }
  }
  
}

