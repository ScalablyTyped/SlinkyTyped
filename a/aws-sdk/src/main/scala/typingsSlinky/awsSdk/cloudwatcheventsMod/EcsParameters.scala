package typingsSlinky.awsSdk.cloudwatcheventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EcsParameters extends StObject {
  
  /**
    * Specifies an ECS task group for the task. The maximum length is 255 characters.
    */
  var Group: js.UndefOr[String] = js.native
  
  /**
    * Specifies the launch type on which your task is running. The launch type that you specify here must match one of the launch type (compatibilities) of the target task. The FARGATE value is supported only in the Regions where AWS Fargate with Amazon ECS is supported. For more information, see AWS Fargate on Amazon ECS in the Amazon Elastic Container Service Developer Guide.
    */
  var LaunchType: js.UndefOr[typingsSlinky.awsSdk.cloudwatcheventsMod.LaunchType] = js.native
  
  /**
    * Use this structure if the ECS task uses the awsvpc network mode. This structure specifies the VPC subnets and security groups associated with the task, and whether a public IP address is to be used. This structure is required if LaunchType is FARGATE because the awsvpc mode is required for Fargate tasks. If you specify NetworkConfiguration when the target ECS task does not use the awsvpc network mode, the task fails.
    */
  var NetworkConfiguration: js.UndefOr[typingsSlinky.awsSdk.cloudwatcheventsMod.NetworkConfiguration] = js.native
  
  /**
    * Specifies the platform version for the task. Specify only the numeric portion of the platform version, such as 1.1.0. This structure is used only if LaunchType is FARGATE. For more information about valid platform versions, see AWS Fargate Platform Versions in the Amazon Elastic Container Service Developer Guide.
    */
  var PlatformVersion: js.UndefOr[String] = js.native
  
  /**
    * The number of tasks to create based on TaskDefinition. The default is 1.
    */
  var TaskCount: js.UndefOr[LimitMin1] = js.native
  
  /**
    * The ARN of the task definition to use if the event target is an Amazon ECS task. 
    */
  var TaskDefinitionArn: Arn = js.native
}
object EcsParameters {
  
  @scala.inline
  def apply(TaskDefinitionArn: Arn): EcsParameters = {
    val __obj = js.Dynamic.literal(TaskDefinitionArn = TaskDefinitionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[EcsParameters]
  }
  
  @scala.inline
  implicit class EcsParametersMutableBuilder[Self <: EcsParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroup(value: String): Self = StObject.set(x, "Group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupUndefined: Self = StObject.set(x, "Group", js.undefined)
    
    @scala.inline
    def setLaunchType(value: LaunchType): Self = StObject.set(x, "LaunchType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchTypeUndefined: Self = StObject.set(x, "LaunchType", js.undefined)
    
    @scala.inline
    def setNetworkConfiguration(value: NetworkConfiguration): Self = StObject.set(x, "NetworkConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkConfigurationUndefined: Self = StObject.set(x, "NetworkConfiguration", js.undefined)
    
    @scala.inline
    def setPlatformVersion(value: String): Self = StObject.set(x, "PlatformVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformVersionUndefined: Self = StObject.set(x, "PlatformVersion", js.undefined)
    
    @scala.inline
    def setTaskCount(value: LimitMin1): Self = StObject.set(x, "TaskCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskCountUndefined: Self = StObject.set(x, "TaskCount", js.undefined)
    
    @scala.inline
    def setTaskDefinitionArn(value: Arn): Self = StObject.set(x, "TaskDefinitionArn", value.asInstanceOf[js.Any])
  }
}
