package typingsSlinky.googleapis.replicapoolV1beta1Mod.replicapoolV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Parameters for creating a Compute Engine Instance resource. Most fields are
  * identical to the corresponding Compute Engine resource.
  */
@js.native
trait SchemaVmParams extends StObject {
  
  /**
    * Deprecated. Please use baseInstanceName instead.
    */
  var baseInstanceName: js.UndefOr[String] = js.native
  
  /**
    * Enables IP Forwarding, which allows this instance to receive packets
    * destined for a different IP address, and send packets with a different
    * source IP. See IP Forwarding for more information.
    */
  var canIpForward: js.UndefOr[Boolean] = js.native
  
  /**
    * An optional textual description of the instance.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * A list of existing Persistent Disk resources to attach to each replica in
    * the pool. Each disk will be attached in read-only mode to every replica.
    */
  var disksToAttach: js.UndefOr[js.Array[SchemaExistingDisk]] = js.native
  
  /**
    * A list of Disk resources to create and attach to each Replica in the
    * Pool. Currently, you can only define one disk and it must be a root
    * persistent disk. Note that Replica Pool will create a root persistent
    * disk for each replica.
    */
  var disksToCreate: js.UndefOr[js.Array[SchemaNewDisk]] = js.native
  
  /**
    * The machine type for this instance. The resource name (e.g.
    * n1-standard-1).
    */
  var machineType: js.UndefOr[String] = js.native
  
  /**
    * The metadata key/value pairs assigned to this instance.
    */
  var metadata: js.UndefOr[SchemaMetadata] = js.native
  
  /**
    * A list of network interfaces for the instance. Currently only one
    * interface is supported by Google Compute Engine, ONE_TO_ONE_NAT.
    */
  var networkInterfaces: js.UndefOr[js.Array[SchemaNetworkInterface]] = js.native
  
  var onHostMaintenance: js.UndefOr[String] = js.native
  
  /**
    * A list of Service Accounts to enable for this instance.
    */
  var serviceAccounts: js.UndefOr[js.Array[SchemaServiceAccount]] = js.native
  
  /**
    * A list of tags to apply to the Google Compute Engine instance to identify
    * resources.
    */
  var tags: js.UndefOr[SchemaTag] = js.native
}
object SchemaVmParams {
  
  @scala.inline
  def apply(): SchemaVmParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVmParams]
  }
  
  @scala.inline
  implicit class SchemaVmParamsMutableBuilder[Self <: SchemaVmParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseInstanceName(value: String): Self = StObject.set(x, "baseInstanceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseInstanceNameUndefined: Self = StObject.set(x, "baseInstanceName", js.undefined)
    
    @scala.inline
    def setCanIpForward(value: Boolean): Self = StObject.set(x, "canIpForward", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanIpForwardUndefined: Self = StObject.set(x, "canIpForward", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDisksToAttach(value: js.Array[SchemaExistingDisk]): Self = StObject.set(x, "disksToAttach", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisksToAttachUndefined: Self = StObject.set(x, "disksToAttach", js.undefined)
    
    @scala.inline
    def setDisksToAttachVarargs(value: SchemaExistingDisk*): Self = StObject.set(x, "disksToAttach", js.Array(value :_*))
    
    @scala.inline
    def setDisksToCreate(value: js.Array[SchemaNewDisk]): Self = StObject.set(x, "disksToCreate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisksToCreateUndefined: Self = StObject.set(x, "disksToCreate", js.undefined)
    
    @scala.inline
    def setDisksToCreateVarargs(value: SchemaNewDisk*): Self = StObject.set(x, "disksToCreate", js.Array(value :_*))
    
    @scala.inline
    def setMachineType(value: String): Self = StObject.set(x, "machineType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMachineTypeUndefined: Self = StObject.set(x, "machineType", js.undefined)
    
    @scala.inline
    def setMetadata(value: SchemaMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setNetworkInterfaces(value: js.Array[SchemaNetworkInterface]): Self = StObject.set(x, "networkInterfaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkInterfacesUndefined: Self = StObject.set(x, "networkInterfaces", js.undefined)
    
    @scala.inline
    def setNetworkInterfacesVarargs(value: SchemaNetworkInterface*): Self = StObject.set(x, "networkInterfaces", js.Array(value :_*))
    
    @scala.inline
    def setOnHostMaintenance(value: String): Self = StObject.set(x, "onHostMaintenance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnHostMaintenanceUndefined: Self = StObject.set(x, "onHostMaintenance", js.undefined)
    
    @scala.inline
    def setServiceAccounts(value: js.Array[SchemaServiceAccount]): Self = StObject.set(x, "serviceAccounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceAccountsUndefined: Self = StObject.set(x, "serviceAccounts", js.undefined)
    
    @scala.inline
    def setServiceAccountsVarargs(value: SchemaServiceAccount*): Self = StObject.set(x, "serviceAccounts", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: SchemaTag): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
