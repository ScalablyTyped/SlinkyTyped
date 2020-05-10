package typingsSlinky.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeProductAsAdminOutput extends js.Object {
  /**
    * Information about the associated budgets.
    */
  var Budgets: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.Budgets] = js.native
  /**
    * Information about the product view.
    */
  var ProductViewDetail: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.ProductViewDetail] = js.native
  /**
    * Information about the provisioning artifacts (also known as versions) for the specified product.
    */
  var ProvisioningArtifactSummaries: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.ProvisioningArtifactSummaries] = js.native
  /**
    * Information about the TagOptions associated with the product.
    */
  var TagOptions: js.UndefOr[TagOptionDetails] = js.native
  /**
    * Information about the tags associated with the product.
    */
  var Tags: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.Tags] = js.native
}

object DescribeProductAsAdminOutput {
  @scala.inline
  def apply(): DescribeProductAsAdminOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeProductAsAdminOutput]
  }
  @scala.inline
  implicit class DescribeProductAsAdminOutputOps[Self <: DescribeProductAsAdminOutput] (val x: Self) extends AnyVal {
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
    def withProductViewDetail(value: ProductViewDetail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProductViewDetail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductViewDetail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProductViewDetail")(js.undefined)
        ret
    }
    @scala.inline
    def withProvisioningArtifactSummaries(value: ProvisioningArtifactSummaries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisioningArtifactSummaries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvisioningArtifactSummaries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisioningArtifactSummaries")(js.undefined)
        ret
    }
    @scala.inline
    def withTagOptions(value: TagOptionDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TagOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TagOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Tags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
  }
  
}

