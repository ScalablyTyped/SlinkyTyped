package typingsSlinky.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateAccountCustomizationResponse extends js.Object {
  
  /**
    * The customizations you're adding to the QuickSight subscription for the AWS account.
    */
  var AccountCustomization: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.AccountCustomization] = js.native
  
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
  implicit class CreateAccountCustomizationResponseOps[Self <: CreateAccountCustomizationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccountCustomization(value: AccountCustomization): Self = this.set("AccountCustomization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountCustomization: Self = this.set("AccountCustomization", js.undefined)
    
    @scala.inline
    def setAwsAccountId(value: AwsAccountId): Self = this.set("AwsAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAwsAccountId: Self = this.set("AwsAccountId", js.undefined)
    
    @scala.inline
    def setNamespace(value: Namespace): Self = this.set("Namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamespace: Self = this.set("Namespace", js.undefined)
    
    @scala.inline
    def setRequestId(value: String): Self = this.set("RequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestId: Self = this.set("RequestId", js.undefined)
    
    @scala.inline
    def setStatus(value: StatusCode): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
}
