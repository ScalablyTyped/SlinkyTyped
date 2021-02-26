package typingsSlinky.awsSdk.inspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssetAttributes extends StObject {
  
  /**
    * The ID of the agent that is installed on the EC2 instance where the finding is generated.
    */
  var agentId: js.UndefOr[AgentId] = js.native
  
  /**
    * The ID of the Amazon Machine Image (AMI) that is installed on the EC2 instance where the finding is generated.
    */
  var amiId: js.UndefOr[AmiId] = js.native
  
  /**
    * The Auto Scaling group of the EC2 instance where the finding is generated.
    */
  var autoScalingGroup: js.UndefOr[AutoScalingGroup] = js.native
  
  /**
    * The hostname of the EC2 instance where the finding is generated.
    */
  var hostname: js.UndefOr[Hostname] = js.native
  
  /**
    * The list of IP v4 addresses of the EC2 instance where the finding is generated.
    */
  var ipv4Addresses: js.UndefOr[Ipv4AddressList] = js.native
  
  /**
    * An array of the network interfaces interacting with the EC2 instance where the finding is generated.
    */
  var networkInterfaces: js.UndefOr[NetworkInterfaces] = js.native
  
  /**
    * The schema version of this data type.
    */
  var schemaVersion: NumericVersion = js.native
  
  /**
    * The tags related to the EC2 instance where the finding is generated.
    */
  var tags: js.UndefOr[Tags] = js.native
}
object AssetAttributes {
  
  @scala.inline
  def apply(schemaVersion: NumericVersion): AssetAttributes = {
    val __obj = js.Dynamic.literal(schemaVersion = schemaVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetAttributes]
  }
  
  @scala.inline
  implicit class AssetAttributesMutableBuilder[Self <: AssetAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAgentId(value: AgentId): Self = StObject.set(x, "agentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgentIdUndefined: Self = StObject.set(x, "agentId", js.undefined)
    
    @scala.inline
    def setAmiId(value: AmiId): Self = StObject.set(x, "amiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmiIdUndefined: Self = StObject.set(x, "amiId", js.undefined)
    
    @scala.inline
    def setAutoScalingGroup(value: AutoScalingGroup): Self = StObject.set(x, "autoScalingGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoScalingGroupUndefined: Self = StObject.set(x, "autoScalingGroup", js.undefined)
    
    @scala.inline
    def setHostname(value: Hostname): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
    
    @scala.inline
    def setIpv4Addresses(value: Ipv4AddressList): Self = StObject.set(x, "ipv4Addresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpv4AddressesUndefined: Self = StObject.set(x, "ipv4Addresses", js.undefined)
    
    @scala.inline
    def setIpv4AddressesVarargs(value: Ipv4Address*): Self = StObject.set(x, "ipv4Addresses", js.Array(value :_*))
    
    @scala.inline
    def setNetworkInterfaces(value: NetworkInterfaces): Self = StObject.set(x, "networkInterfaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkInterfacesUndefined: Self = StObject.set(x, "networkInterfaces", js.undefined)
    
    @scala.inline
    def setNetworkInterfacesVarargs(value: NetworkInterface*): Self = StObject.set(x, "networkInterfaces", js.Array(value :_*))
    
    @scala.inline
    def setSchemaVersion(value: NumericVersion): Self = StObject.set(x, "schemaVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
