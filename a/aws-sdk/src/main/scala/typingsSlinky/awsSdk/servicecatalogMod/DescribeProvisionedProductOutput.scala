package typingsSlinky.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeProvisionedProductOutput extends StObject {
  
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
  implicit class DescribeProvisionedProductOutputMutableBuilder[Self <: DescribeProvisionedProductOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloudWatchDashboards(value: CloudWatchDashboards): Self = StObject.set(x, "CloudWatchDashboards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudWatchDashboardsUndefined: Self = StObject.set(x, "CloudWatchDashboards", js.undefined)
    
    @scala.inline
    def setCloudWatchDashboardsVarargs(value: CloudWatchDashboard*): Self = StObject.set(x, "CloudWatchDashboards", js.Array(value :_*))
    
    @scala.inline
    def setProvisionedProductDetail(value: ProvisionedProductDetail): Self = StObject.set(x, "ProvisionedProductDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisionedProductDetailUndefined: Self = StObject.set(x, "ProvisionedProductDetail", js.undefined)
  }
}
