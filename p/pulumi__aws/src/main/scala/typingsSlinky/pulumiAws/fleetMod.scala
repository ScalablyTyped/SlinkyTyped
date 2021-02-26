package typingsSlinky.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.outputMod.ec2.FleetLaunchTemplateConfig
import typingsSlinky.pulumiAws.outputMod.ec2.FleetOnDemandOptions
import typingsSlinky.pulumiAws.outputMod.ec2.FleetSpotOptions
import typingsSlinky.pulumiAws.outputMod.ec2.FleetTargetCapacitySpecification
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fleetMod {
  
  @JSImport("@pulumi/aws/ec2/fleet", "Fleet")
  @js.native
  class Fleet protected () extends CustomResource {
    /**
      * Create a Fleet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: FleetArgs) = this()
    def this(name: String, args: FleetArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Whether running instances should be terminated if the total target capacity of the EC2 Fleet is decreased below the current size of the EC2. Valid values: `no-termination`, `termination`. Defaults to `termination`.
      */
    val excessCapacityTerminationPolicy: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Nested argument containing EC2 Launch Template configurations. Defined below.
      */
    val launchTemplateConfig: Output_[FleetLaunchTemplateConfig] = js.native
    
    /**
      * Nested argument containing On-Demand configurations. Defined below.
      */
    val onDemandOptions: Output_[js.UndefOr[FleetOnDemandOptions]] = js.native
    
    /**
      * Whether EC2 Fleet should replace unhealthy instances. Defaults to `false`.
      */
    val replaceUnhealthyInstances: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * Nested argument containing Spot configurations. Defined below.
      */
    val spotOptions: Output_[js.UndefOr[FleetSpotOptions]] = js.native
    
    /**
      * Map of Fleet tags. To tag instances at launch, specify the tags in the Launch Template.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * Nested argument containing target capacity configurations. Defined below.
      */
    val targetCapacitySpecification: Output_[FleetTargetCapacitySpecification] = js.native
    
    /**
      * Whether to terminate instances for an EC2 Fleet if it is deleted successfully. Defaults to `false`.
      */
    val terminateInstances: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * Whether running instances should be terminated when the EC2 Fleet expires. Defaults to `false`.
      */
    val terminateInstancesWithExpiration: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * The type of request. Indicates whether the EC2 Fleet only requests the target capacity, or also attempts to maintain it. Valid values: `maintain`, `request`. Defaults to `maintain`.
      */
    val `type`: Output_[js.UndefOr[String]] = js.native
  }
  /* static members */
  object Fleet {
    
    /**
      * Get an existing Fleet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ec2/fleet", "Fleet.get")
    @js.native
    def get(name: String, id: Input[ID]): Fleet = js.native
    @JSImport("@pulumi/aws/ec2/fleet", "Fleet.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Fleet = js.native
    @JSImport("@pulumi/aws/ec2/fleet", "Fleet.get")
    @js.native
    def get(name: String, id: Input[ID], state: FleetState): Fleet = js.native
    @JSImport("@pulumi/aws/ec2/fleet", "Fleet.get")
    @js.native
    def get(name: String, id: Input[ID], state: FleetState, opts: CustomResourceOptions): Fleet = js.native
    
    /**
      * Returns true if the given object is an instance of Fleet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ec2/fleet", "Fleet.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/fleet.Fleet */ Boolean = js.native
  }
  
  @js.native
  trait FleetArgs extends StObject {
    
    /**
      * Whether running instances should be terminated if the total target capacity of the EC2 Fleet is decreased below the current size of the EC2. Valid values: `no-termination`, `termination`. Defaults to `termination`.
      */
    val excessCapacityTerminationPolicy: js.UndefOr[Input[String]] = js.native
    
    /**
      * Nested argument containing EC2 Launch Template configurations. Defined below.
      */
    val launchTemplateConfig: Input[typingsSlinky.pulumiAws.inputMod.ec2.FleetLaunchTemplateConfig] = js.native
    
    /**
      * Nested argument containing On-Demand configurations. Defined below.
      */
    val onDemandOptions: js.UndefOr[Input[typingsSlinky.pulumiAws.inputMod.ec2.FleetOnDemandOptions]] = js.native
    
    /**
      * Whether EC2 Fleet should replace unhealthy instances. Defaults to `false`.
      */
    val replaceUnhealthyInstances: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * Nested argument containing Spot configurations. Defined below.
      */
    val spotOptions: js.UndefOr[Input[typingsSlinky.pulumiAws.inputMod.ec2.FleetSpotOptions]] = js.native
    
    /**
      * Map of Fleet tags. To tag instances at launch, specify the tags in the Launch Template.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * Nested argument containing target capacity configurations. Defined below.
      */
    val targetCapacitySpecification: Input[typingsSlinky.pulumiAws.inputMod.ec2.FleetTargetCapacitySpecification] = js.native
    
    /**
      * Whether to terminate instances for an EC2 Fleet if it is deleted successfully. Defaults to `false`.
      */
    val terminateInstances: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * Whether running instances should be terminated when the EC2 Fleet expires. Defaults to `false`.
      */
    val terminateInstancesWithExpiration: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The type of request. Indicates whether the EC2 Fleet only requests the target capacity, or also attempts to maintain it. Valid values: `maintain`, `request`. Defaults to `maintain`.
      */
    val `type`: js.UndefOr[Input[String]] = js.native
  }
  object FleetArgs {
    
    @scala.inline
    def apply(
      launchTemplateConfig: Input[typingsSlinky.pulumiAws.inputMod.ec2.FleetLaunchTemplateConfig],
      targetCapacitySpecification: Input[typingsSlinky.pulumiAws.inputMod.ec2.FleetTargetCapacitySpecification]
    ): FleetArgs = {
      val __obj = js.Dynamic.literal(launchTemplateConfig = launchTemplateConfig.asInstanceOf[js.Any], targetCapacitySpecification = targetCapacitySpecification.asInstanceOf[js.Any])
      __obj.asInstanceOf[FleetArgs]
    }
    
    @scala.inline
    implicit class FleetArgsMutableBuilder[Self <: FleetArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExcessCapacityTerminationPolicy(value: Input[String]): Self = StObject.set(x, "excessCapacityTerminationPolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcessCapacityTerminationPolicyUndefined: Self = StObject.set(x, "excessCapacityTerminationPolicy", js.undefined)
      
      @scala.inline
      def setLaunchTemplateConfig(value: Input[typingsSlinky.pulumiAws.inputMod.ec2.FleetLaunchTemplateConfig]): Self = StObject.set(x, "launchTemplateConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnDemandOptions(value: Input[typingsSlinky.pulumiAws.inputMod.ec2.FleetOnDemandOptions]): Self = StObject.set(x, "onDemandOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnDemandOptionsUndefined: Self = StObject.set(x, "onDemandOptions", js.undefined)
      
      @scala.inline
      def setReplaceUnhealthyInstances(value: Input[Boolean]): Self = StObject.set(x, "replaceUnhealthyInstances", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplaceUnhealthyInstancesUndefined: Self = StObject.set(x, "replaceUnhealthyInstances", js.undefined)
      
      @scala.inline
      def setSpotOptions(value: Input[typingsSlinky.pulumiAws.inputMod.ec2.FleetSpotOptions]): Self = StObject.set(x, "spotOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpotOptionsUndefined: Self = StObject.set(x, "spotOptions", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTargetCapacitySpecification(value: Input[typingsSlinky.pulumiAws.inputMod.ec2.FleetTargetCapacitySpecification]): Self = StObject.set(x, "targetCapacitySpecification", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTerminateInstances(value: Input[Boolean]): Self = StObject.set(x, "terminateInstances", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTerminateInstancesUndefined: Self = StObject.set(x, "terminateInstances", js.undefined)
      
      @scala.inline
      def setTerminateInstancesWithExpiration(value: Input[Boolean]): Self = StObject.set(x, "terminateInstancesWithExpiration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTerminateInstancesWithExpirationUndefined: Self = StObject.set(x, "terminateInstancesWithExpiration", js.undefined)
      
      @scala.inline
      def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait FleetState extends StObject {
    
    /**
      * Whether running instances should be terminated if the total target capacity of the EC2 Fleet is decreased below the current size of the EC2. Valid values: `no-termination`, `termination`. Defaults to `termination`.
      */
    val excessCapacityTerminationPolicy: js.UndefOr[Input[String]] = js.native
    
    /**
      * Nested argument containing EC2 Launch Template configurations. Defined below.
      */
    val launchTemplateConfig: js.UndefOr[Input[typingsSlinky.pulumiAws.inputMod.ec2.FleetLaunchTemplateConfig]] = js.native
    
    /**
      * Nested argument containing On-Demand configurations. Defined below.
      */
    val onDemandOptions: js.UndefOr[Input[typingsSlinky.pulumiAws.inputMod.ec2.FleetOnDemandOptions]] = js.native
    
    /**
      * Whether EC2 Fleet should replace unhealthy instances. Defaults to `false`.
      */
    val replaceUnhealthyInstances: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * Nested argument containing Spot configurations. Defined below.
      */
    val spotOptions: js.UndefOr[Input[typingsSlinky.pulumiAws.inputMod.ec2.FleetSpotOptions]] = js.native
    
    /**
      * Map of Fleet tags. To tag instances at launch, specify the tags in the Launch Template.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * Nested argument containing target capacity configurations. Defined below.
      */
    val targetCapacitySpecification: js.UndefOr[Input[typingsSlinky.pulumiAws.inputMod.ec2.FleetTargetCapacitySpecification]] = js.native
    
    /**
      * Whether to terminate instances for an EC2 Fleet if it is deleted successfully. Defaults to `false`.
      */
    val terminateInstances: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * Whether running instances should be terminated when the EC2 Fleet expires. Defaults to `false`.
      */
    val terminateInstancesWithExpiration: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The type of request. Indicates whether the EC2 Fleet only requests the target capacity, or also attempts to maintain it. Valid values: `maintain`, `request`. Defaults to `maintain`.
      */
    val `type`: js.UndefOr[Input[String]] = js.native
  }
  object FleetState {
    
    @scala.inline
    def apply(): FleetState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FleetState]
    }
    
    @scala.inline
    implicit class FleetStateMutableBuilder[Self <: FleetState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExcessCapacityTerminationPolicy(value: Input[String]): Self = StObject.set(x, "excessCapacityTerminationPolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcessCapacityTerminationPolicyUndefined: Self = StObject.set(x, "excessCapacityTerminationPolicy", js.undefined)
      
      @scala.inline
      def setLaunchTemplateConfig(value: Input[typingsSlinky.pulumiAws.inputMod.ec2.FleetLaunchTemplateConfig]): Self = StObject.set(x, "launchTemplateConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLaunchTemplateConfigUndefined: Self = StObject.set(x, "launchTemplateConfig", js.undefined)
      
      @scala.inline
      def setOnDemandOptions(value: Input[typingsSlinky.pulumiAws.inputMod.ec2.FleetOnDemandOptions]): Self = StObject.set(x, "onDemandOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnDemandOptionsUndefined: Self = StObject.set(x, "onDemandOptions", js.undefined)
      
      @scala.inline
      def setReplaceUnhealthyInstances(value: Input[Boolean]): Self = StObject.set(x, "replaceUnhealthyInstances", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplaceUnhealthyInstancesUndefined: Self = StObject.set(x, "replaceUnhealthyInstances", js.undefined)
      
      @scala.inline
      def setSpotOptions(value: Input[typingsSlinky.pulumiAws.inputMod.ec2.FleetSpotOptions]): Self = StObject.set(x, "spotOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpotOptionsUndefined: Self = StObject.set(x, "spotOptions", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTargetCapacitySpecification(value: Input[typingsSlinky.pulumiAws.inputMod.ec2.FleetTargetCapacitySpecification]): Self = StObject.set(x, "targetCapacitySpecification", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetCapacitySpecificationUndefined: Self = StObject.set(x, "targetCapacitySpecification", js.undefined)
      
      @scala.inline
      def setTerminateInstances(value: Input[Boolean]): Self = StObject.set(x, "terminateInstances", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTerminateInstancesUndefined: Self = StObject.set(x, "terminateInstances", js.undefined)
      
      @scala.inline
      def setTerminateInstancesWithExpiration(value: Input[Boolean]): Self = StObject.set(x, "terminateInstancesWithExpiration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTerminateInstancesWithExpirationUndefined: Self = StObject.set(x, "terminateInstancesWithExpiration", js.undefined)
      
      @scala.inline
      def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
