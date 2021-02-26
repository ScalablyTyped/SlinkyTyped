package typingsSlinky.awsSdk.servicequotasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceQuotaIncreaseRequestInTemplate extends StObject {
  
  /**
    * The AWS Region where the increase request occurs.
    */
  var AwsRegion: js.UndefOr[typingsSlinky.awsSdk.servicequotasMod.AwsRegion] = js.native
  
  /**
    * Identifies the new, increased value of the service quota in the increase request. 
    */
  var DesiredValue: js.UndefOr[QuotaValue] = js.native
  
  /**
    * Specifies if the quota is a global quota.
    */
  var GlobalQuota: js.UndefOr[typingsSlinky.awsSdk.servicequotasMod.GlobalQuota] = js.native
  
  /**
    * The code identifier for the service quota specified in the increase request.
    */
  var QuotaCode: js.UndefOr[typingsSlinky.awsSdk.servicequotasMod.QuotaCode] = js.native
  
  /**
    * The name of the service quota in the increase request.
    */
  var QuotaName: js.UndefOr[typingsSlinky.awsSdk.servicequotasMod.QuotaName] = js.native
  
  /**
    * The code identifier for the AWS service specified in the increase request.
    */
  var ServiceCode: js.UndefOr[typingsSlinky.awsSdk.servicequotasMod.ServiceCode] = js.native
  
  /**
    * The name of the AWS service specified in the increase request. 
    */
  var ServiceName: js.UndefOr[typingsSlinky.awsSdk.servicequotasMod.ServiceName] = js.native
  
  /**
    * The unit of measure for the increase request.
    */
  var Unit: js.UndefOr[QuotaUnit] = js.native
}
object ServiceQuotaIncreaseRequestInTemplate {
  
  @scala.inline
  def apply(): ServiceQuotaIncreaseRequestInTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceQuotaIncreaseRequestInTemplate]
  }
  
  @scala.inline
  implicit class ServiceQuotaIncreaseRequestInTemplateMutableBuilder[Self <: ServiceQuotaIncreaseRequestInTemplate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAwsRegion(value: AwsRegion): Self = StObject.set(x, "AwsRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsRegionUndefined: Self = StObject.set(x, "AwsRegion", js.undefined)
    
    @scala.inline
    def setDesiredValue(value: QuotaValue): Self = StObject.set(x, "DesiredValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesiredValueUndefined: Self = StObject.set(x, "DesiredValue", js.undefined)
    
    @scala.inline
    def setGlobalQuota(value: GlobalQuota): Self = StObject.set(x, "GlobalQuota", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalQuotaUndefined: Self = StObject.set(x, "GlobalQuota", js.undefined)
    
    @scala.inline
    def setQuotaCode(value: QuotaCode): Self = StObject.set(x, "QuotaCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuotaCodeUndefined: Self = StObject.set(x, "QuotaCode", js.undefined)
    
    @scala.inline
    def setQuotaName(value: QuotaName): Self = StObject.set(x, "QuotaName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuotaNameUndefined: Self = StObject.set(x, "QuotaName", js.undefined)
    
    @scala.inline
    def setServiceCode(value: ServiceCode): Self = StObject.set(x, "ServiceCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceCodeUndefined: Self = StObject.set(x, "ServiceCode", js.undefined)
    
    @scala.inline
    def setServiceName(value: ServiceName): Self = StObject.set(x, "ServiceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceNameUndefined: Self = StObject.set(x, "ServiceName", js.undefined)
    
    @scala.inline
    def setUnit(value: QuotaUnit): Self = StObject.set(x, "Unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitUndefined: Self = StObject.set(x, "Unit", js.undefined)
  }
}
