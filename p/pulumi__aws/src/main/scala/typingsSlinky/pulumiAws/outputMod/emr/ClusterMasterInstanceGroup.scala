package typingsSlinky.pulumiAws.outputMod.emr

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterMasterInstanceGroup extends StObject {
  
  /**
    * The bid price for each EC2 Spot instance type as defined by `instanceType`. Expressed in USD. If neither `bidPrice` nor `bidPriceAsPercentageOfOnDemandPrice` is provided, `bidPriceAsPercentageOfOnDemandPrice` defaults to 100%.
    */
  var bidPrice: js.UndefOr[String] = js.native
  
  /**
    * Configuration block(s) for EBS volumes attached to each instance in the instance group. Detailed below.
    */
  var ebsConfigs: js.Array[ClusterMasterInstanceGroupEbsConfig] = js.native
  
  /**
    * The ID of the EMR Cluster
    */
  var id: String = js.native
  
  /**
    * Target number of instances for the instance group. Must be 1 or 3. Defaults to 1. Launching with multiple master nodes is only supported in EMR version 5.23.0+, and requires this resource's `coreInstanceGroup` to be configured. Public (Internet accessible) instances must be created in VPC subnets that have `map public IP on launch` enabled. Termination protection is automatically enabled when launched with multiple master nodes and this provider must have the `terminationProtection = false` configuration applied before destroying this resource.
    */
  var instanceCount: js.UndefOr[Double] = js.native
  
  /**
    * An EC2 instance type, such as m4.xlarge.
    */
  var instanceType: String = js.native
  
  /**
    * Friendly name given to the instance fleet.
    */
  var name: js.UndefOr[String] = js.native
}
object ClusterMasterInstanceGroup {
  
  @scala.inline
  def apply(ebsConfigs: js.Array[ClusterMasterInstanceGroupEbsConfig], id: String, instanceType: String): ClusterMasterInstanceGroup = {
    val __obj = js.Dynamic.literal(ebsConfigs = ebsConfigs.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], instanceType = instanceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterMasterInstanceGroup]
  }
  
  @scala.inline
  implicit class ClusterMasterInstanceGroupMutableBuilder[Self <: ClusterMasterInstanceGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBidPrice(value: String): Self = StObject.set(x, "bidPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBidPriceUndefined: Self = StObject.set(x, "bidPrice", js.undefined)
    
    @scala.inline
    def setEbsConfigs(value: js.Array[ClusterMasterInstanceGroupEbsConfig]): Self = StObject.set(x, "ebsConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEbsConfigsVarargs(value: ClusterMasterInstanceGroupEbsConfig*): Self = StObject.set(x, "ebsConfigs", js.Array(value :_*))
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceCount(value: Double): Self = StObject.set(x, "instanceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceCountUndefined: Self = StObject.set(x, "instanceCount", js.undefined)
    
    @scala.inline
    def setInstanceType(value: String): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
