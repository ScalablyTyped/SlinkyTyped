package typingsSlinky.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectoryConnectSettingsDescription extends js.Object {
  
  /**
    * A list of the Availability Zones that the directory is in.
    */
  var AvailabilityZones: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.AvailabilityZones] = js.native
  
  /**
    * The IP addresses of the AD Connector servers.
    */
  var ConnectIps: js.UndefOr[IpAddrs] = js.native
  
  /**
    * The user name of the service account in the on-premises directory.
    */
  var CustomerUserName: js.UndefOr[UserName] = js.native
  
  /**
    * The security group identifier for the AD Connector directory.
    */
  var SecurityGroupId: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.SecurityGroupId] = js.native
  
  /**
    * A list of subnet identifiers in the VPC that the AD Connector is in.
    */
  var SubnetIds: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.SubnetIds] = js.native
  
  /**
    * The identifier of the VPC that the AD Connector is in.
    */
  var VpcId: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.VpcId] = js.native
}
object DirectoryConnectSettingsDescription {
  
  @scala.inline
  def apply(): DirectoryConnectSettingsDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectoryConnectSettingsDescription]
  }
  
  @scala.inline
  implicit class DirectoryConnectSettingsDescriptionOps[Self <: DirectoryConnectSettingsDescription] (val x: Self) extends AnyVal {
    
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
    def setAvailabilityZonesVarargs(value: AvailabilityZone*): Self = this.set("AvailabilityZones", js.Array(value :_*))
    
    @scala.inline
    def setAvailabilityZones(value: AvailabilityZones): Self = this.set("AvailabilityZones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailabilityZones: Self = this.set("AvailabilityZones", js.undefined)
    
    @scala.inline
    def setConnectIpsVarargs(value: IpAddr*): Self = this.set("ConnectIps", js.Array(value :_*))
    
    @scala.inline
    def setConnectIps(value: IpAddrs): Self = this.set("ConnectIps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectIps: Self = this.set("ConnectIps", js.undefined)
    
    @scala.inline
    def setCustomerUserName(value: UserName): Self = this.set("CustomerUserName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomerUserName: Self = this.set("CustomerUserName", js.undefined)
    
    @scala.inline
    def setSecurityGroupId(value: SecurityGroupId): Self = this.set("SecurityGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityGroupId: Self = this.set("SecurityGroupId", js.undefined)
    
    @scala.inline
    def setSubnetIdsVarargs(value: SubnetId*): Self = this.set("SubnetIds", js.Array(value :_*))
    
    @scala.inline
    def setSubnetIds(value: SubnetIds): Self = this.set("SubnetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubnetIds: Self = this.set("SubnetIds", js.undefined)
    
    @scala.inline
    def setVpcId(value: VpcId): Self = this.set("VpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcId: Self = this.set("VpcId", js.undefined)
  }
}
