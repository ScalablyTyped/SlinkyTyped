package typingsSlinky.awsSdk.mediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListEntitlementsResponse extends js.Object {
  /**
    * A list of entitlements that have been granted to you from other AWS accounts.
    */
  var Entitlements: js.UndefOr[listOfListedEntitlement] = js.native
  /**
    * The token that identifies which batch of results that you want to see. For example, you submit a ListEntitlements request with MaxResults set at 5. The service returns the first batch of results (up to 5) and a NextToken value. To see the next batch of results, you can submit the ListEntitlements request a second time and specify the NextToken value.
    */
  var NextToken: js.UndefOr[string] = js.native
}

object ListEntitlementsResponse {
  @scala.inline
  def apply(): ListEntitlementsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEntitlementsResponse]
  }
  @scala.inline
  implicit class ListEntitlementsResponseOps[Self <: ListEntitlementsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntitlements(value: listOfListedEntitlement): Self = {
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
    def withNextToken(value: string): Self = {
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

