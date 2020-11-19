package typingsSlinky.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteAccountCustomizationRequest extends js.Object {
  
  /**
    * The ID for the AWS account that you want to delete QuickSight customizations from.
    */
  var AwsAccountId: typingsSlinky.awsSdk.quicksightMod.AwsAccountId = js.native
  
  /**
    * The namespace associated with the customization that you're deleting.
    */
  var Namespace: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.Namespace] = js.native
}
object DeleteAccountCustomizationRequest {
  
  @scala.inline
  def apply(AwsAccountId: AwsAccountId): DeleteAccountCustomizationRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAccountCustomizationRequest]
  }
  
  @scala.inline
  implicit class DeleteAccountCustomizationRequestOps[Self <: DeleteAccountCustomizationRequest] (val x: Self) extends AnyVal {
    
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
    def setAwsAccountId(value: AwsAccountId): Self = this.set("AwsAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespace(value: Namespace): Self = this.set("Namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamespace: Self = this.set("Namespace", js.undefined)
  }
}
