package typingsSlinky.awsDashSdk.clientsServicequotasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAWSDefaultServiceQuotaRequest extends js.Object {
  /**
    * Identifies the service quota you want to select.
    */
  var QuotaCode: typingsSlinky.awsDashSdk.clientsServicequotasMod.QuotaCode = js.native
  /**
    * Specifies the service that you want to use.
    */
  var ServiceCode: typingsSlinky.awsDashSdk.clientsServicequotasMod.ServiceCode = js.native
}

object GetAWSDefaultServiceQuotaRequest {
  @scala.inline
  def apply(QuotaCode: QuotaCode, ServiceCode: ServiceCode): GetAWSDefaultServiceQuotaRequest = {
    val __obj = js.Dynamic.literal(QuotaCode = QuotaCode.asInstanceOf[js.Any], ServiceCode = ServiceCode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetAWSDefaultServiceQuotaRequest]
  }
}

