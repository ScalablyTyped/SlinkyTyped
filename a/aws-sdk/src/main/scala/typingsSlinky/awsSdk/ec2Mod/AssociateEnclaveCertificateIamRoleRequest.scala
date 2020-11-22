package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociateEnclaveCertificateIamRoleRequest extends js.Object {
  
  /**
    * The ARN of the ACM certificate with which to associate the IAM role.
    */
  var CertificateArn: js.UndefOr[ResourceArn] = js.native
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * The ARN of the IAM role to associate with the ACM certificate. You can associate up to 16 IAM roles with an ACM certificate.
    */
  var RoleArn: js.UndefOr[ResourceArn] = js.native
}
object AssociateEnclaveCertificateIamRoleRequest {
  
  @scala.inline
  def apply(): AssociateEnclaveCertificateIamRoleRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateEnclaveCertificateIamRoleRequest]
  }
  
  @scala.inline
  implicit class AssociateEnclaveCertificateIamRoleRequestOps[Self <: AssociateEnclaveCertificateIamRoleRequest] (val x: Self) extends AnyVal {
    
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
    def setCertificateArn(value: ResourceArn): Self = this.set("CertificateArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertificateArn: Self = this.set("CertificateArn", js.undefined)
    
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
    
    @scala.inline
    def setRoleArn(value: ResourceArn): Self = this.set("RoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoleArn: Self = this.set("RoleArn", js.undefined)
  }
}
