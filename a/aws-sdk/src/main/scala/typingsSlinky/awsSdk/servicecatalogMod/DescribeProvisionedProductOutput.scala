package typingsSlinky.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeProvisionedProductOutput extends js.Object {
  /**
    * Any CloudWatch dashboards that were created when provisioning the product.
    */
  var CloudWatchDashboards: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.CloudWatchDashboards] = js.native
  /**
    * Information about the provisioned product.
    */
  var ProvisionedProductDetail: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.ProvisionedProductDetail] = js.native
}

object DescribeProvisionedProductOutput {
  @scala.inline
  def apply(): DescribeProvisionedProductOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeProvisionedProductOutput]
  }
  @scala.inline
  implicit class DescribeProvisionedProductOutputOps[Self <: DescribeProvisionedProductOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloudWatchDashboards(value: CloudWatchDashboards): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloudWatchDashboards")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloudWatchDashboards: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloudWatchDashboards")(js.undefined)
        ret
    }
    @scala.inline
    def withProvisionedProductDetail(value: ProvisionedProductDetail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisionedProductDetail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvisionedProductDetail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisionedProductDetail")(js.undefined)
        ret
    }
  }
  
}

