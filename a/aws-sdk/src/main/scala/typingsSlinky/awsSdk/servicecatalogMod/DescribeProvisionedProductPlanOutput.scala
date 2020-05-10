package typingsSlinky.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeProvisionedProductPlanOutput extends js.Object {
  /**
    * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
    */
  var NextPageToken: js.UndefOr[PageToken] = js.native
  /**
    * Information about the plan.
    */
  var ProvisionedProductPlanDetails: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.ProvisionedProductPlanDetails] = js.native
  /**
    * Information about the resource changes that will occur when the plan is executed.
    */
  var ResourceChanges: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.ResourceChanges] = js.native
}

object DescribeProvisionedProductPlanOutput {
  @scala.inline
  def apply(): DescribeProvisionedProductPlanOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeProvisionedProductPlanOutput]
  }
  @scala.inline
  implicit class DescribeProvisionedProductPlanOutputOps[Self <: DescribeProvisionedProductPlanOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextPageToken(value: PageToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextPageToken")(js.undefined)
        ret
    }
    @scala.inline
    def withProvisionedProductPlanDetails(value: ProvisionedProductPlanDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisionedProductPlanDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvisionedProductPlanDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisionedProductPlanDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceChanges(value: ResourceChanges): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceChanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceChanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceChanges")(js.undefined)
        ret
    }
  }
  
}

