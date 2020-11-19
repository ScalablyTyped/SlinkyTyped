package typingsSlinky.awsSdk.autoscalingplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScalingPlanResource extends js.Object {
  
  /**
    * The ID of the resource. This string consists of the resource type and unique identifier.   Auto Scaling group - The resource type is autoScalingGroup and the unique identifier is the name of the Auto Scaling group. Example: autoScalingGroup/my-asg.   ECS service - The resource type is service and the unique identifier is the cluster name and service name. Example: service/default/sample-webapp.   Spot Fleet request - The resource type is spot-fleet-request and the unique identifier is the Spot Fleet request ID. Example: spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE.   DynamoDB table - The resource type is table and the unique identifier is the resource ID. Example: table/my-table.   DynamoDB global secondary index - The resource type is index and the unique identifier is the resource ID. Example: table/my-table/index/my-table-index.   Aurora DB cluster - The resource type is cluster and the unique identifier is the cluster name. Example: cluster:my-db-cluster.  
    */
  var ResourceId: ResourceIdMaxLen1600 = js.native
  
  /**
    * The scalable dimension for the resource.    autoscaling:autoScalingGroup:DesiredCapacity - The desired capacity of an Auto Scaling group.    ecs:service:DesiredCount - The desired task count of an ECS service.    ec2:spot-fleet-request:TargetCapacity - The target capacity of a Spot Fleet request.    dynamodb:table:ReadCapacityUnits - The provisioned read capacity for a DynamoDB table.    dynamodb:table:WriteCapacityUnits - The provisioned write capacity for a DynamoDB table.    dynamodb:index:ReadCapacityUnits - The provisioned read capacity for a DynamoDB global secondary index.    dynamodb:index:WriteCapacityUnits - The provisioned write capacity for a DynamoDB global secondary index.    rds:cluster:ReadReplicaCount - The count of Aurora Replicas in an Aurora DB cluster. Available for Aurora MySQL-compatible edition and Aurora PostgreSQL-compatible edition.  
    */
  var ScalableDimension: typingsSlinky.awsSdk.autoscalingplansMod.ScalableDimension = js.native
  
  /**
    * The name of the scaling plan.
    */
  var ScalingPlanName: typingsSlinky.awsSdk.autoscalingplansMod.ScalingPlanName = js.native
  
  /**
    * The version number of the scaling plan.
    */
  var ScalingPlanVersion: typingsSlinky.awsSdk.autoscalingplansMod.ScalingPlanVersion = js.native
  
  /**
    * The scaling policies.
    */
  var ScalingPolicies: js.UndefOr[typingsSlinky.awsSdk.autoscalingplansMod.ScalingPolicies] = js.native
  
  /**
    * The scaling status of the resource.    Active - The scaling configuration is active.    Inactive - The scaling configuration is not active because the scaling plan is being created or the scaling configuration could not be applied. Check the status message for more information.    PartiallyActive - The scaling configuration is partially active because the scaling plan is being created or deleted or the scaling configuration could not be fully applied. Check the status message for more information.  
    */
  var ScalingStatusCode: typingsSlinky.awsSdk.autoscalingplansMod.ScalingStatusCode = js.native
  
  /**
    * A simple message about the current scaling status of the resource.
    */
  var ScalingStatusMessage: js.UndefOr[XmlString] = js.native
  
  /**
    * The namespace of the AWS service.
    */
  var ServiceNamespace: typingsSlinky.awsSdk.autoscalingplansMod.ServiceNamespace = js.native
}
object ScalingPlanResource {
  
  @scala.inline
  def apply(
    ResourceId: ResourceIdMaxLen1600,
    ScalableDimension: ScalableDimension,
    ScalingPlanName: ScalingPlanName,
    ScalingPlanVersion: ScalingPlanVersion,
    ScalingStatusCode: ScalingStatusCode,
    ServiceNamespace: ServiceNamespace
  ): ScalingPlanResource = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any], ScalableDimension = ScalableDimension.asInstanceOf[js.Any], ScalingPlanName = ScalingPlanName.asInstanceOf[js.Any], ScalingPlanVersion = ScalingPlanVersion.asInstanceOf[js.Any], ScalingStatusCode = ScalingStatusCode.asInstanceOf[js.Any], ServiceNamespace = ServiceNamespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalingPlanResource]
  }
  
  @scala.inline
  implicit class ScalingPlanResourceOps[Self <: ScalingPlanResource] (val x: Self) extends AnyVal {
    
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
    def setResourceId(value: ResourceIdMaxLen1600): Self = this.set("ResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScalableDimension(value: ScalableDimension): Self = this.set("ScalableDimension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScalingPlanName(value: ScalingPlanName): Self = this.set("ScalingPlanName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScalingPlanVersion(value: ScalingPlanVersion): Self = this.set("ScalingPlanVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScalingStatusCode(value: ScalingStatusCode): Self = this.set("ScalingStatusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceNamespace(value: ServiceNamespace): Self = this.set("ServiceNamespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScalingPoliciesVarargs(value: ScalingPolicy*): Self = this.set("ScalingPolicies", js.Array(value :_*))
    
    @scala.inline
    def setScalingPolicies(value: ScalingPolicies): Self = this.set("ScalingPolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScalingPolicies: Self = this.set("ScalingPolicies", js.undefined)
    
    @scala.inline
    def setScalingStatusMessage(value: XmlString): Self = this.set("ScalingStatusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScalingStatusMessage: Self = this.set("ScalingStatusMessage", js.undefined)
  }
}
