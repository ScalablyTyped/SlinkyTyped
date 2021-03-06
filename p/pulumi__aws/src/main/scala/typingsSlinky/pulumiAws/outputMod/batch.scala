package typingsSlinky.pulumiAws.outputMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object batch {
  
  @js.native
  trait ComputeEnvironmentComputeResources extends StObject {
    
    /**
      * The allocation strategy to use for the compute resource in case not enough instances of the best fitting instance type can be allocated. Valid items are `BEST_FIT_PROGRESSIVE`, `SPOT_CAPACITY_OPTIMIZED` or `BEST_FIT`. Defaults to `BEST_FIT`. See [AWS docs](https://docs.aws.amazon.com/batch/latest/userguide/allocation-strategies.html) for details.
      */
    var allocationStrategy: js.UndefOr[String] = js.native
    
    /**
      * Integer of minimum percentage that a Spot Instance price must be when compared with the On-Demand price for that instance type before instances are launched. For example, if your bid percentage is 20% (`20`), then the Spot price must be below 20% of the current On-Demand price for that EC2 instance. This parameter is required for SPOT compute environments.
      */
    var bidPercentage: js.UndefOr[Double] = js.native
    
    /**
      * The desired number of EC2 vCPUS in the compute environment.
      */
    var desiredVcpus: Double = js.native
    
    /**
      * The EC2 key pair that is used for instances launched in the compute environment.
      */
    var ec2KeyPair: js.UndefOr[String] = js.native
    
    /**
      * The Amazon Machine Image (AMI) ID used for instances launched in the compute environment.
      */
    var imageId: js.UndefOr[String] = js.native
    
    /**
      * The Amazon ECS instance role applied to Amazon EC2 instances in a compute environment.
      */
    var instanceRole: String = js.native
    
    /**
      * A list of instance types that may be launched.
      */
    var instanceTypes: js.Array[String] = js.native
    
    /**
      * The launch template to use for your compute resources. See details below.
      */
    var launchTemplate: js.UndefOr[ComputeEnvironmentComputeResourcesLaunchTemplate] = js.native
    
    /**
      * The maximum number of EC2 vCPUs that an environment can reach.
      */
    var maxVcpus: Double = js.native
    
    /**
      * The minimum number of EC2 vCPUs that an environment should maintain.
      */
    var minVcpus: Double = js.native
    
    /**
      * A list of EC2 security group that are associated with instances launched in the compute environment.
      */
    var securityGroupIds: js.Array[String] = js.native
    
    /**
      * The Amazon Resource Name (ARN) of the Amazon EC2 Spot Fleet IAM role applied to a SPOT compute environment. This parameter is required for SPOT compute environments.
      */
    var spotIamFleetRole: js.UndefOr[String] = js.native
    
    /**
      * A list of VPC subnets into which the compute resources are launched.
      */
    var subnets: js.Array[String] = js.native
    
    /**
      * Key-value pair tags to be applied to resources that are launched in the compute environment.
      */
    var tags: js.UndefOr[StringDictionary[String]] = js.native
    
    /**
      * The type of compute environment. Valid items are `EC2` or `SPOT`.
      */
    var `type`: String = js.native
  }
  object ComputeEnvironmentComputeResources {
    
    @scala.inline
    def apply(
      desiredVcpus: Double,
      instanceRole: String,
      instanceTypes: js.Array[String],
      maxVcpus: Double,
      minVcpus: Double,
      securityGroupIds: js.Array[String],
      subnets: js.Array[String],
      `type`: String
    ): ComputeEnvironmentComputeResources = {
      val __obj = js.Dynamic.literal(desiredVcpus = desiredVcpus.asInstanceOf[js.Any], instanceRole = instanceRole.asInstanceOf[js.Any], instanceTypes = instanceTypes.asInstanceOf[js.Any], maxVcpus = maxVcpus.asInstanceOf[js.Any], minVcpus = minVcpus.asInstanceOf[js.Any], securityGroupIds = securityGroupIds.asInstanceOf[js.Any], subnets = subnets.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComputeEnvironmentComputeResources]
    }
    
    @scala.inline
    implicit class ComputeEnvironmentComputeResourcesMutableBuilder[Self <: ComputeEnvironmentComputeResources] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllocationStrategy(value: String): Self = StObject.set(x, "allocationStrategy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllocationStrategyUndefined: Self = StObject.set(x, "allocationStrategy", js.undefined)
      
      @scala.inline
      def setBidPercentage(value: Double): Self = StObject.set(x, "bidPercentage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBidPercentageUndefined: Self = StObject.set(x, "bidPercentage", js.undefined)
      
      @scala.inline
      def setDesiredVcpus(value: Double): Self = StObject.set(x, "desiredVcpus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEc2KeyPair(value: String): Self = StObject.set(x, "ec2KeyPair", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEc2KeyPairUndefined: Self = StObject.set(x, "ec2KeyPair", js.undefined)
      
      @scala.inline
      def setImageId(value: String): Self = StObject.set(x, "imageId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageIdUndefined: Self = StObject.set(x, "imageId", js.undefined)
      
      @scala.inline
      def setInstanceRole(value: String): Self = StObject.set(x, "instanceRole", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceTypes(value: js.Array[String]): Self = StObject.set(x, "instanceTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceTypesVarargs(value: String*): Self = StObject.set(x, "instanceTypes", js.Array(value :_*))
      
      @scala.inline
      def setLaunchTemplate(value: ComputeEnvironmentComputeResourcesLaunchTemplate): Self = StObject.set(x, "launchTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLaunchTemplateUndefined: Self = StObject.set(x, "launchTemplate", js.undefined)
      
      @scala.inline
      def setMaxVcpus(value: Double): Self = StObject.set(x, "maxVcpus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinVcpus(value: Double): Self = StObject.set(x, "minVcpus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityGroupIds(value: js.Array[String]): Self = StObject.set(x, "securityGroupIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityGroupIdsVarargs(value: String*): Self = StObject.set(x, "securityGroupIds", js.Array(value :_*))
      
      @scala.inline
      def setSpotIamFleetRole(value: String): Self = StObject.set(x, "spotIamFleetRole", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpotIamFleetRoleUndefined: Self = StObject.set(x, "spotIamFleetRole", js.undefined)
      
      @scala.inline
      def setSubnets(value: js.Array[String]): Self = StObject.set(x, "subnets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubnetsVarargs(value: String*): Self = StObject.set(x, "subnets", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ComputeEnvironmentComputeResourcesLaunchTemplate extends StObject {
    
    /**
      * ID of the launch template. You must specify either the launch template ID or launch template name in the request, but not both.
      */
    var launchTemplateId: js.UndefOr[String] = js.native
    
    /**
      * Name of the launch template.
      */
    var launchTemplateName: js.UndefOr[String] = js.native
    
    /**
      * The version number of the launch template. Default: The default version of the launch template.
      */
    var version: js.UndefOr[String] = js.native
  }
  object ComputeEnvironmentComputeResourcesLaunchTemplate {
    
    @scala.inline
    def apply(): ComputeEnvironmentComputeResourcesLaunchTemplate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ComputeEnvironmentComputeResourcesLaunchTemplate]
    }
    
    @scala.inline
    implicit class ComputeEnvironmentComputeResourcesLaunchTemplateMutableBuilder[Self <: ComputeEnvironmentComputeResourcesLaunchTemplate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLaunchTemplateId(value: String): Self = StObject.set(x, "launchTemplateId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLaunchTemplateIdUndefined: Self = StObject.set(x, "launchTemplateId", js.undefined)
      
      @scala.inline
      def setLaunchTemplateName(value: String): Self = StObject.set(x, "launchTemplateName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLaunchTemplateNameUndefined: Self = StObject.set(x, "launchTemplateName", js.undefined)
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  @js.native
  trait GetJobQueueComputeEnvironmentOrder extends StObject {
    
    var computeEnvironment: String = js.native
    
    var order: Double = js.native
  }
  object GetJobQueueComputeEnvironmentOrder {
    
    @scala.inline
    def apply(computeEnvironment: String, order: Double): GetJobQueueComputeEnvironmentOrder = {
      val __obj = js.Dynamic.literal(computeEnvironment = computeEnvironment.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetJobQueueComputeEnvironmentOrder]
    }
    
    @scala.inline
    implicit class GetJobQueueComputeEnvironmentOrderMutableBuilder[Self <: GetJobQueueComputeEnvironmentOrder] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComputeEnvironment(value: String): Self = StObject.set(x, "computeEnvironment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait JobDefinitionRetryStrategy extends StObject {
    
    /**
      * The number of times to move a job to the `RUNNABLE` status. You may specify between `1` and `10` attempts.
      */
    var attempts: js.UndefOr[Double] = js.native
  }
  object JobDefinitionRetryStrategy {
    
    @scala.inline
    def apply(): JobDefinitionRetryStrategy = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JobDefinitionRetryStrategy]
    }
    
    @scala.inline
    implicit class JobDefinitionRetryStrategyMutableBuilder[Self <: JobDefinitionRetryStrategy] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttempts(value: Double): Self = StObject.set(x, "attempts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttemptsUndefined: Self = StObject.set(x, "attempts", js.undefined)
    }
  }
  
  @js.native
  trait JobDefinitionTimeout extends StObject {
    
    /**
      * The time duration in seconds after which AWS Batch terminates your jobs if they have not finished. The minimum value for the timeout is `60` seconds.
      */
    var attemptDurationSeconds: js.UndefOr[Double] = js.native
  }
  object JobDefinitionTimeout {
    
    @scala.inline
    def apply(): JobDefinitionTimeout = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JobDefinitionTimeout]
    }
    
    @scala.inline
    implicit class JobDefinitionTimeoutMutableBuilder[Self <: JobDefinitionTimeout] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttemptDurationSeconds(value: Double): Self = StObject.set(x, "attemptDurationSeconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttemptDurationSecondsUndefined: Self = StObject.set(x, "attemptDurationSeconds", js.undefined)
    }
  }
}
