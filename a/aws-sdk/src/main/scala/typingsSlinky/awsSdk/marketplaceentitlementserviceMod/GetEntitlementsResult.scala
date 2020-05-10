package typingsSlinky.awsSdk.marketplaceentitlementserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetEntitlementsResult extends js.Object {
  /**
    * The set of entitlements found through the GetEntitlements operation. If the result contains an empty set of entitlements, NextToken might still be present and should be used.
    */
  var Entitlements: js.UndefOr[EntitlementList] = js.native
  /**
    * For paginated results, use NextToken in subsequent calls to GetEntitlements. If the result contains an empty set of entitlements, NextToken might still be present and should be used.
    */
  var NextToken: js.UndefOr[NonEmptyString] = js.native
}

object GetEntitlementsResult {
  @scala.inline
  def apply(): GetEntitlementsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetEntitlementsResult]
  }
  @scala.inline
  implicit class GetEntitlementsResultOps[Self <: GetEntitlementsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntitlements(value: EntitlementList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Entitlements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntitlements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Entitlements")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: NonEmptyString): Self = {
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

