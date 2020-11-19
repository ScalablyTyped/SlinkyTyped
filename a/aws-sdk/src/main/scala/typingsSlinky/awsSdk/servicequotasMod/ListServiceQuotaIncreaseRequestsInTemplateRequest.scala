package typingsSlinky.awsSdk.servicequotasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListServiceQuotaIncreaseRequestsInTemplateRequest extends js.Object {
  
  /**
    * Specifies the AWS Region for the quota that you want to use.
    */
  var AwsRegion: js.UndefOr[typingsSlinky.awsSdk.servicequotasMod.AwsRegion] = js.native
  
  /**
    * (Optional) Limits the number of results that you want to include in the response. If you don't include this parameter, the response defaults to a value that's specific to the operation. If additional items exist beyond the specified maximum, the NextToken element is present and has a value (isn't null). Include that value as the NextToken request parameter in the call to the operation to get the next part of the results. You should check NextToken after every operation to ensure that you receive all of the results.
    */
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.servicequotasMod.MaxResults] = js.native
  
  /**
    * (Optional) Use this parameter in a request if you receive a NextToken response in a previous request that indicates that there's more output available. In a subsequent call, set it to the value of the previous call's NextToken response to indicate where the output should continue from.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.servicequotasMod.NextToken] = js.native
  
  /**
    * The identifier for a service. When performing an operation, use the ServiceCode to specify a particular service. 
    */
  var ServiceCode: js.UndefOr[typingsSlinky.awsSdk.servicequotasMod.ServiceCode] = js.native
}
object ListServiceQuotaIncreaseRequestsInTemplateRequest {
  
  @scala.inline
  def apply(): ListServiceQuotaIncreaseRequestsInTemplateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListServiceQuotaIncreaseRequestsInTemplateRequest]
  }
  
  @scala.inline
  implicit class ListServiceQuotaIncreaseRequestsInTemplateRequestOps[Self <: ListServiceQuotaIncreaseRequestsInTemplateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAwsRegion(value: AwsRegion): Self = this.set("AwsRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAwsRegion: Self = this.set("AwsRegion", js.undefined)
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setServiceCode(value: ServiceCode): Self = this.set("ServiceCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceCode: Self = this.set("ServiceCode", js.undefined)
  }
}
