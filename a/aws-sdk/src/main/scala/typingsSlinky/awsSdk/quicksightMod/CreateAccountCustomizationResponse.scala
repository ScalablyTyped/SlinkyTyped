package typingsSlinky.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateAccountCustomizationResponse extends StObject {
  
  /**
    * The QuickSight customizations you're adding in the current AWS Region. 
    */
  var AccountCustomization: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.AccountCustomization] = js.native
  
  /**
    * The Amazon Resource Name (ARN) for the customization that you created for this AWS account.
    */
  var Arn: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.Arn] = js.native
  
  /**
    * The ID for the AWS account that you want to customize QuickSight for.
    */
  var AwsAccountId: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.AwsAccountId] = js.native
  
  /**
    * The namespace associated with the customization you're creating. 
    */
  var Namespace: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.Namespace] = js.native
  
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.native
  
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.native
}
object CreateAccountCustomizationResponse {
  
  @scala.inline
  def apply(): CreateAccountCustomizationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAccountCustomizationResponse]
  }
  
  @scala.inline
  implicit class CreateAccountCustomizationResponseMutableBuilder[Self <: CreateAccountCustomizationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountCustomization(value: AccountCustomization): Self = StObject.set(x, "AccountCustomization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountCustomizationUndefined: Self = StObject.set(x, "AccountCustomization", js.undefined)
    
    @scala.inline
    def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsAccountIdUndefined: Self = StObject.set(x, "AwsAccountId", js.undefined)
    
    @scala.inline
    def setNamespace(value: Namespace): Self = StObject.set(x, "Namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceUndefined: Self = StObject.set(x, "Namespace", js.undefined)
    
    @scala.inline
    def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    @scala.inline
    def setStatus(value: StatusCode): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
