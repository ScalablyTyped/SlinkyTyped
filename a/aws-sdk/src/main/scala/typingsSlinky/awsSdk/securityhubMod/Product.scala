package typingsSlinky.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Product extends js.Object {
  /**
    * The URL used to activate the product.
    */
  var ActivationUrl: js.UndefOr[NonEmptyString] = js.native
  /**
    * The categories assigned to the product.
    */
  var Categories: js.UndefOr[CategoryList] = js.native
  /**
    * The name of the company that provides the product.
    */
  var CompanyName: js.UndefOr[NonEmptyString] = js.native
  /**
    * A description of the product.
    */
  var Description: js.UndefOr[NonEmptyString] = js.native
  /**
    * The types of integration that the product supports. Available values are the following.    SEND_FINDINGS_TO_SECURITY_HUB - Indicates that the integration sends findings to Security Hub.    RECEIVE_FINDINGS_FROM_SECURITY_HUB - Indicates that the integration receives findings from Security Hub.  
    */
  var IntegrationTypes: js.UndefOr[IntegrationTypeList] = js.native
  /**
    * The URL for the page that contains more information about the product.
    */
  var MarketplaceUrl: js.UndefOr[NonEmptyString] = js.native
  /**
    * The ARN assigned to the product.
    */
  var ProductArn: NonEmptyString = js.native
  /**
    * The name of the product.
    */
  var ProductName: js.UndefOr[NonEmptyString] = js.native
  /**
    * The resource policy associated with the product.
    */
  var ProductSubscriptionResourcePolicy: js.UndefOr[NonEmptyString] = js.native
}

object Product {
  @scala.inline
  def apply(ProductArn: NonEmptyString): Product = {
    val __obj = js.Dynamic.literal(ProductArn = ProductArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Product]
  }
  @scala.inline
  implicit class ProductOps[Self <: Product] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProductArn(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProductArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActivationUrl(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActivationUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivationUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActivationUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withCategories(value: CategoryList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Categories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategories: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Categories")(js.undefined)
        ret
    }
    @scala.inline
    def withCompanyName(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CompanyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompanyName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CompanyName")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: NonEmptyString): Self = {
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
    def withIntegrationTypes(value: IntegrationTypeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IntegrationTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntegrationTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IntegrationTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withMarketplaceUrl(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MarketplaceUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarketplaceUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MarketplaceUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withProductName(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProductName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProductName")(js.undefined)
        ret
    }
    @scala.inline
    def withProductSubscriptionResourcePolicy(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProductSubscriptionResourcePolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductSubscriptionResourcePolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProductSubscriptionResourcePolicy")(js.undefined)
        ret
    }
  }
  
}

