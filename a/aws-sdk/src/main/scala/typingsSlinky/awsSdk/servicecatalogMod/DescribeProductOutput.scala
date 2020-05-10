package typingsSlinky.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeProductOutput extends js.Object {
  /**
    * Information about the associated budgets.
    */
  var Budgets: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.Budgets] = js.native
  /**
    * Summary information about the product view.
    */
  var ProductViewSummary: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.ProductViewSummary] = js.native
  /**
    * Information about the provisioning artifacts for the specified product.
    */
  var ProvisioningArtifacts: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.ProvisioningArtifacts] = js.native
}

object DescribeProductOutput {
  @scala.inline
  def apply(): DescribeProductOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeProductOutput]
  }
  @scala.inline
  implicit class DescribeProductOutputOps[Self <: DescribeProductOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBudgets(value: Budgets): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Budgets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBudgets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Budgets")(js.undefined)
        ret
    }
    @scala.inline
    def withProductViewSummary(value: ProductViewSummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProductViewSummary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductViewSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProductViewSummary")(js.undefined)
        ret
    }
    @scala.inline
    def withProvisioningArtifacts(value: ProvisioningArtifacts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisioningArtifacts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvisioningArtifacts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisioningArtifacts")(js.undefined)
        ret
    }
  }
  
}

