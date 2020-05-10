package typingsSlinky.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRateBasedRuleManagedKeysResponse extends js.Object {
  /**
    * An array of IP addresses that currently are blocked by the specified RateBasedRule. 
    */
  var ManagedKeys: js.UndefOr[typingsSlinky.awsSdk.wafregionalMod.ManagedKeys] = js.native
  /**
    * A null value and not currently used.
    */
  var NextMarker: js.UndefOr[typingsSlinky.awsSdk.wafregionalMod.NextMarker] = js.native
}

object GetRateBasedRuleManagedKeysResponse {
  @scala.inline
  def apply(): GetRateBasedRuleManagedKeysResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRateBasedRuleManagedKeysResponse]
  }
  @scala.inline
  implicit class GetRateBasedRuleManagedKeysResponseOps[Self <: GetRateBasedRuleManagedKeysResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withManagedKeys(value: ManagedKeys): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ManagedKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManagedKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ManagedKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withNextMarker(value: NextMarker): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextMarker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextMarker")(js.undefined)
        ret
    }
  }
  
}

