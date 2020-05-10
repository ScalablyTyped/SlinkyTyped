package typingsSlinky.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProductViewSummary extends js.Object {
  /**
    * The distributor of the product. Contact the product administrator for the significance of this value.
    */
  var Distributor: js.UndefOr[ProductViewDistributor] = js.native
  /**
    * Indicates whether the product has a default path. If the product does not have a default path, call ListLaunchPaths to disambiguate between paths. Otherwise, ListLaunchPaths is not required, and the output of ProductViewSummary can be used directly with DescribeProvisioningParameters.
    */
  var HasDefaultPath: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.HasDefaultPath] = js.native
  /**
    * The product view identifier.
    */
  var Id: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.Id] = js.native
  /**
    * The name of the product.
    */
  var Name: js.UndefOr[ProductViewName] = js.native
  /**
    * The owner of the product. Contact the product administrator for the significance of this value.
    */
  var Owner: js.UndefOr[ProductViewOwner] = js.native
  /**
    * The product identifier.
    */
  var ProductId: js.UndefOr[Id] = js.native
  /**
    * Short description of the product.
    */
  var ShortDescription: js.UndefOr[ProductViewShortDescription] = js.native
  /**
    * The description of the support for this Product.
    */
  var SupportDescription: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.SupportDescription] = js.native
  /**
    * The email contact information to obtain support for this Product.
    */
  var SupportEmail: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.SupportEmail] = js.native
  /**
    * The URL information to obtain support for this Product.
    */
  var SupportUrl: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.SupportUrl] = js.native
  /**
    * The product type. Contact the product administrator for the significance of this value. If this value is MARKETPLACE, the product was created by AWS Marketplace.
    */
  var Type: js.UndefOr[ProductType] = js.native
}

object ProductViewSummary {
  @scala.inline
  def apply(): ProductViewSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductViewSummary]
  }
  @scala.inline
  implicit class ProductViewSummaryOps[Self <: ProductViewSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDistributor(value: ProductViewDistributor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Distributor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDistributor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Distributor")(js.undefined)
        ret
    }
    @scala.inline
    def withHasDefaultPath(value: HasDefaultPath): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HasDefaultPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasDefaultPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HasDefaultPath")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: ProductViewName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withOwner(value: ProductViewOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Owner")(js.undefined)
        ret
    }
    @scala.inline
    def withProductId(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProductId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProductId")(js.undefined)
        ret
    }
    @scala.inline
    def withShortDescription(value: ProductViewShortDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShortDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShortDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShortDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportDescription(value: SupportDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportEmail(value: SupportEmail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportEmail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportEmail")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportUrl(value: SupportUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: ProductType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(js.undefined)
        ret
    }
  }
  
}

