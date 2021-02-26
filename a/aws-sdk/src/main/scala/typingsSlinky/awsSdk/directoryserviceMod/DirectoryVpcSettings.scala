package typingsSlinky.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectoryVpcSettings extends StObject {
  
  /**
    * The identifiers of the subnets for the directory servers. The two subnets must be in different Availability Zones. AWS Directory Service creates a directory server and a DNS server in each of these subnets.
    */
  var SubnetIds: typingsSlinky.awsSdk.directoryserviceMod.SubnetIds = js.native
  
  /**
    * The identifier of the VPC in which to create the directory.
    */
  var VpcId: typingsSlinky.awsSdk.directoryserviceMod.VpcId = js.native
}
object DirectoryVpcSettings {
  
  @scala.inline
  def apply(SubnetIds: SubnetIds, VpcId: VpcId): DirectoryVpcSettings = {
    val __obj = js.Dynamic.literal(SubnetIds = SubnetIds.asInstanceOf[js.Any], VpcId = VpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectoryVpcSettings]
  }
  
  @scala.inline
  implicit class DirectoryVpcSettingsMutableBuilder[Self <: DirectoryVpcSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSubnetIds(value: SubnetIds): Self = StObject.set(x, "SubnetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIdsVarargs(value: SubnetId*): Self = StObject.set(x, "SubnetIds", js.Array(value :_*))
    
    @scala.inline
    def setVpcId(value: VpcId): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
  }
}
