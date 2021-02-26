package typingsSlinky.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StackResourceSummary extends StObject {
  
  /**
    * Information about whether the resource's actual configuration differs, or has drifted, from its expected configuration, as defined in the stack template and any values specified as template parameters. For more information, see Detecting Unregulated Configuration Changes to Stacks and Resources.
    */
  var DriftInformation: js.UndefOr[StackResourceDriftInformationSummary] = js.native
  
  /**
    * Time the status was updated.
    */
  var LastUpdatedTimestamp: js.Date = js.native
  
  /**
    * The logical name of the resource specified in the template.
    */
  var LogicalResourceId: typingsSlinky.awsSdk.cloudformationMod.LogicalResourceId = js.native
  
  /**
    * The name or unique identifier that corresponds to a physical instance ID of the resource.
    */
  var PhysicalResourceId: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.PhysicalResourceId] = js.native
  
  /**
    * Current status of the resource.
    */
  var ResourceStatus: typingsSlinky.awsSdk.cloudformationMod.ResourceStatus = js.native
  
  /**
    * Success/failure message associated with the resource.
    */
  var ResourceStatusReason: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.ResourceStatusReason] = js.native
  
  /**
    * Type of resource. (For more information, go to  AWS Resource Types Reference in the AWS CloudFormation User Guide.)
    */
  var ResourceType: typingsSlinky.awsSdk.cloudformationMod.ResourceType = js.native
}
object StackResourceSummary {
  
  @scala.inline
  def apply(
    LastUpdatedTimestamp: js.Date,
    LogicalResourceId: LogicalResourceId,
    ResourceStatus: ResourceStatus,
    ResourceType: ResourceType
  ): StackResourceSummary = {
    val __obj = js.Dynamic.literal(LastUpdatedTimestamp = LastUpdatedTimestamp.asInstanceOf[js.Any], LogicalResourceId = LogicalResourceId.asInstanceOf[js.Any], ResourceStatus = ResourceStatus.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackResourceSummary]
  }
  
  @scala.inline
  implicit class StackResourceSummaryMutableBuilder[Self <: StackResourceSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDriftInformation(value: StackResourceDriftInformationSummary): Self = StObject.set(x, "DriftInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDriftInformationUndefined: Self = StObject.set(x, "DriftInformation", js.undefined)
    
    @scala.inline
    def setLastUpdatedTimestamp(value: js.Date): Self = StObject.set(x, "LastUpdatedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogicalResourceId(value: LogicalResourceId): Self = StObject.set(x, "LogicalResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhysicalResourceId(value: PhysicalResourceId): Self = StObject.set(x, "PhysicalResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhysicalResourceIdUndefined: Self = StObject.set(x, "PhysicalResourceId", js.undefined)
    
    @scala.inline
    def setResourceStatus(value: ResourceStatus): Self = StObject.set(x, "ResourceStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceStatusReason(value: ResourceStatusReason): Self = StObject.set(x, "ResourceStatusReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceStatusReasonUndefined: Self = StObject.set(x, "ResourceStatusReason", js.undefined)
    
    @scala.inline
    def setResourceType(value: ResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
  }
}
