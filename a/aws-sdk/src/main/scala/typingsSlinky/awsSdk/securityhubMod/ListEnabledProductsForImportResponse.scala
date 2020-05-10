package typingsSlinky.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListEnabledProductsForImportResponse extends js.Object {
  /**
    * The pagination token to use to request the next page of results.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.securityhubMod.NextToken] = js.native
  /**
    * The list of ARNs for the resources that represent your subscriptions to products. 
    */
  var ProductSubscriptions: js.UndefOr[ProductSubscriptionArnList] = js.native
}

object ListEnabledProductsForImportResponse {
  @scala.inline
  def apply(): ListEnabledProductsForImportResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEnabledProductsForImportResponse]
  }
  @scala.inline
  implicit class ListEnabledProductsForImportResponseOps[Self <: ListEnabledProductsForImportResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: NextToken): Self = {
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
    @scala.inline
    def withProductSubscriptions(value: ProductSubscriptionArnList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProductSubscriptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductSubscriptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProductSubscriptions")(js.undefined)
        ret
    }
  }
  
}

