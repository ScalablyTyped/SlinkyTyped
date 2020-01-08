package typingsSlinky.awsDashSdk.clientsServicequotasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetServiceQuotaIncreaseRequestFromTemplateRequest extends js.Object {
  /**
    * Specifies the AWS Region for the quota that you want to use.
    */
  var AwsRegion: typingsSlinky.awsDashSdk.clientsServicequotasMod.AwsRegion = js.native
  /**
    * Specifies the quota you want.
    */
  var QuotaCode: typingsSlinky.awsDashSdk.clientsServicequotasMod.QuotaCode = js.native
  /**
    * Specifies the service that you want to use.
    */
  var ServiceCode: typingsSlinky.awsDashSdk.clientsServicequotasMod.ServiceCode = js.native
}

object GetServiceQuotaIncreaseRequestFromTemplateRequest {
  @scala.inline
  def apply(AwsRegion: AwsRegion, QuotaCode: QuotaCode, ServiceCode: ServiceCode): GetServiceQuotaIncreaseRequestFromTemplateRequest = {
    val __obj = js.Dynamic.literal(AwsRegion = AwsRegion.asInstanceOf[js.Any], QuotaCode = QuotaCode.asInstanceOf[js.Any], ServiceCode = ServiceCode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetServiceQuotaIncreaseRequestFromTemplateRequest]
  }
}

