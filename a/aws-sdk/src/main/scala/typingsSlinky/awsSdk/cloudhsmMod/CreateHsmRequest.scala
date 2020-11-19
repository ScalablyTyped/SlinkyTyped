package typingsSlinky.awsSdk.cloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateHsmRequest extends js.Object {
  
  /**
    * A user-defined token to ensure idempotence. Subsequent calls to this operation with the same token will be ignored.
    */
  var ClientToken: js.UndefOr[typingsSlinky.awsSdk.cloudhsmMod.ClientToken] = js.native
  
  /**
    * The IP address to assign to the HSM's ENI. If an IP address is not specified, an IP address will be randomly chosen from the CIDR range of the subnet.
    */
  var EniIp: js.UndefOr[IpAddress] = js.native
  
  /**
    * The external ID from IamRoleArn, if present.
    */
  var ExternalId: js.UndefOr[typingsSlinky.awsSdk.cloudhsmMod.ExternalId] = js.native
  
  /**
    * The ARN of an IAM role to enable the AWS CloudHSM service to allocate an ENI on your behalf.
    */
  var IamRoleArn: typingsSlinky.awsSdk.cloudhsmMod.IamRoleArn = js.native
  
  /**
    * The SSH public key to install on the HSM.
    */
  var SshKey: typingsSlinky.awsSdk.cloudhsmMod.SshKey = js.native
  
  /**
    * The identifier of the subnet in your VPC in which to place the HSM.
    */
  var SubnetId: typingsSlinky.awsSdk.cloudhsmMod.SubnetId = js.native
  
  var SubscriptionType: typingsSlinky.awsSdk.cloudhsmMod.SubscriptionType = js.native
  
  /**
    * The IP address for the syslog monitoring server. The AWS CloudHSM service only supports one syslog monitoring server.
    */
  var SyslogIp: js.UndefOr[IpAddress] = js.native
}
object CreateHsmRequest {
  
  @scala.inline
  def apply(IamRoleArn: IamRoleArn, SshKey: SshKey, SubnetId: SubnetId, SubscriptionType: SubscriptionType): CreateHsmRequest = {
    val __obj = js.Dynamic.literal(IamRoleArn = IamRoleArn.asInstanceOf[js.Any], SshKey = SshKey.asInstanceOf[js.Any], SubnetId = SubnetId.asInstanceOf[js.Any], SubscriptionType = SubscriptionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateHsmRequest]
  }
  
  @scala.inline
  implicit class CreateHsmRequestOps[Self <: CreateHsmRequest] (val x: Self) extends AnyVal {
    
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
    def setIamRoleArn(value: IamRoleArn): Self = this.set("IamRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSshKey(value: SshKey): Self = this.set("SshKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetId(value: SubnetId): Self = this.set("SubnetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionType(value: SubscriptionType): Self = this.set("SubscriptionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientToken(value: ClientToken): Self = this.set("ClientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientToken: Self = this.set("ClientToken", js.undefined)
    
    @scala.inline
    def setEniIp(value: IpAddress): Self = this.set("EniIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEniIp: Self = this.set("EniIp", js.undefined)
    
    @scala.inline
    def setExternalId(value: ExternalId): Self = this.set("ExternalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternalId: Self = this.set("ExternalId", js.undefined)
    
    @scala.inline
    def setSyslogIp(value: IpAddress): Self = this.set("SyslogIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSyslogIp: Self = this.set("SyslogIp", js.undefined)
  }
}
