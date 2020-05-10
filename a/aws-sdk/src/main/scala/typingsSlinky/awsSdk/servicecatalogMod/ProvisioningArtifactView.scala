package typingsSlinky.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProvisioningArtifactView extends js.Object {
  /**
    * Summary information about a product view.
    */
  var ProductViewSummary: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.ProductViewSummary] = js.native
  /**
    * Information about a provisioning artifact. A provisioning artifact is also known as a product version.
    */
  var ProvisioningArtifact: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.ProvisioningArtifact] = js.native
}

object ProvisioningArtifactView {
  @scala.inline
  def apply(): ProvisioningArtifactView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProvisioningArtifactView]
  }
  @scala.inline
  implicit class ProvisioningArtifactViewOps[Self <: ProvisioningArtifactView] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withProvisioningArtifact(value: ProvisioningArtifact): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisioningArtifact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvisioningArtifact: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisioningArtifact")(js.undefined)
        ret
    }
  }
  
}

