package typingsSlinky.awsSdk.servicequotasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetServiceQuotaIncreaseRequestFromTemplateRequest extends StObject {
  
  /**
    * Specifies the AWS Region for the quota that you want to use.
    */
  var AwsRegion: typingsSlinky.awsSdk.servicequotasMod.AwsRegion = js.native
  
  /**
    * Specifies the quota you want.
    */
  var QuotaCode: typingsSlinky.awsSdk.servicequotasMod.QuotaCode = js.native
  
  /**
    * Specifies the service that you want to use.
    */
  var ServiceCode: typingsSlinky.awsSdk.servicequotasMod.ServiceCode = js.native
}
object GetServiceQuotaIncreaseRequestFromTemplateRequest {
  
  @scala.inline
  def apply(AwsRegion: AwsRegion, QuotaCode: QuotaCode, ServiceCode: ServiceCode): GetServiceQuotaIncreaseRequestFromTemplateRequest = {
    val __obj = js.Dynamic.literal(AwsRegion = AwsRegion.asInstanceOf[js.Any], QuotaCode = QuotaCode.asInstanceOf[js.Any], ServiceCode = ServiceCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetServiceQuotaIncreaseRequestFromTemplateRequest]
  }
  
  @scala.inline
  implicit class GetServiceQuotaIncreaseRequestFromTemplateRequestMutableBuilder[Self <: GetServiceQuotaIncreaseRequestFromTemplateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAwsRegion(value: AwsRegion): Self = StObject.set(x, "AwsRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuotaCode(value: QuotaCode): Self = StObject.set(x, "QuotaCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceCode(value: ServiceCode): Self = StObject.set(x, "ServiceCode", value.asInstanceOf[js.Any])
  }
}
