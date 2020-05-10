package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RiskExceptionConfigurationType extends js.Object {
  /**
    * Overrides the risk decision to always block the pre-authentication requests. The IP range is in CIDR notation: a compact representation of an IP address and its associated routing prefix.
    */
  var BlockedIPRangeList: js.UndefOr[BlockedIPRangeListType] = js.native
  /**
    * Risk detection is not performed on the IP addresses in the range list. The IP range is in CIDR notation.
    */
  var SkippedIPRangeList: js.UndefOr[SkippedIPRangeListType] = js.native
}

object RiskExceptionConfigurationType {
  @scala.inline
  def apply(): RiskExceptionConfigurationType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RiskExceptionConfigurationType]
  }
  @scala.inline
  implicit class RiskExceptionConfigurationTypeOps[Self <: RiskExceptionConfigurationType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlockedIPRangeList(value: BlockedIPRangeListType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BlockedIPRangeList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlockedIPRangeList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BlockedIPRangeList")(js.undefined)
        ret
    }
    @scala.inline
    def withSkippedIPRangeList(value: SkippedIPRangeListType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SkippedIPRangeList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkippedIPRangeList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SkippedIPRangeList")(js.undefined)
        ret
    }
  }
  
}

