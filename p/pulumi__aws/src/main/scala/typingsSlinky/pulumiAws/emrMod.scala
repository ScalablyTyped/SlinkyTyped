package typingsSlinky.pulumiAws

import typingsSlinky.pulumiAws.emrClusterMod.ClusterArgs
import typingsSlinky.pulumiAws.emrClusterMod.ClusterState
import typingsSlinky.pulumiAws.instanceFleetMod.InstanceFleetArgs
import typingsSlinky.pulumiAws.instanceFleetMod.InstanceFleetState
import typingsSlinky.pulumiAws.instanceGroupMod.InstanceGroupArgs
import typingsSlinky.pulumiAws.instanceGroupMod.InstanceGroupState
import typingsSlinky.pulumiAws.managedScalingPolicyMod.ManagedScalingPolicyArgs
import typingsSlinky.pulumiAws.managedScalingPolicyMod.ManagedScalingPolicyState
import typingsSlinky.pulumiAws.securityConfigurationMod.SecurityConfigurationArgs
import typingsSlinky.pulumiAws.securityConfigurationMod.SecurityConfigurationState
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object emrMod {
  
  @JSImport("@pulumi/aws/emr", "Cluster")
  @js.native
  class Cluster protected ()
    extends typingsSlinky.pulumiAws.emrClusterMod.Cluster {
    /**
      * Create a Cluster resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ClusterArgs) = this()
    def this(name: String, args: ClusterArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Cluster {
    
    /**
      * Get an existing Cluster resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/emr", "Cluster.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.emrClusterMod.Cluster = js.native
    @JSImport("@pulumi/aws/emr", "Cluster.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.emrClusterMod.Cluster = js.native
    @JSImport("@pulumi/aws/emr", "Cluster.get")
    @js.native
    def get(name: String, id: Input[ID], state: ClusterState): typingsSlinky.pulumiAws.emrClusterMod.Cluster = js.native
    @JSImport("@pulumi/aws/emr", "Cluster.get")
    @js.native
    def get(name: String, id: Input[ID], state: ClusterState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.emrClusterMod.Cluster = js.native
    
    /**
      * Returns true if the given object is an instance of Cluster.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/emr", "Cluster.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/emr/cluster.Cluster */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/emr", "InstanceFleet")
  @js.native
  class InstanceFleet protected ()
    extends typingsSlinky.pulumiAws.instanceFleetMod.InstanceFleet {
    /**
      * Create a InstanceFleet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: InstanceFleetArgs) = this()
    def this(name: String, args: InstanceFleetArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object InstanceFleet {
    
    /**
      * Get an existing InstanceFleet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/emr", "InstanceFleet.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.instanceFleetMod.InstanceFleet = js.native
    @JSImport("@pulumi/aws/emr", "InstanceFleet.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.instanceFleetMod.InstanceFleet = js.native
    @JSImport("@pulumi/aws/emr", "InstanceFleet.get")
    @js.native
    def get(name: String, id: Input[ID], state: InstanceFleetState): typingsSlinky.pulumiAws.instanceFleetMod.InstanceFleet = js.native
    @JSImport("@pulumi/aws/emr", "InstanceFleet.get")
    @js.native
    def get(name: String, id: Input[ID], state: InstanceFleetState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.instanceFleetMod.InstanceFleet = js.native
    
    /**
      * Returns true if the given object is an instance of InstanceFleet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/emr", "InstanceFleet.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/emr/instanceFleet.InstanceFleet */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/emr", "InstanceGroup")
  @js.native
  class InstanceGroup protected ()
    extends typingsSlinky.pulumiAws.instanceGroupMod.InstanceGroup {
    /**
      * Create a InstanceGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: InstanceGroupArgs) = this()
    def this(name: String, args: InstanceGroupArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object InstanceGroup {
    
    /**
      * Get an existing InstanceGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/emr", "InstanceGroup.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.instanceGroupMod.InstanceGroup = js.native
    @JSImport("@pulumi/aws/emr", "InstanceGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.instanceGroupMod.InstanceGroup = js.native
    @JSImport("@pulumi/aws/emr", "InstanceGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: InstanceGroupState): typingsSlinky.pulumiAws.instanceGroupMod.InstanceGroup = js.native
    @JSImport("@pulumi/aws/emr", "InstanceGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: InstanceGroupState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.instanceGroupMod.InstanceGroup = js.native
    
    /**
      * Returns true if the given object is an instance of InstanceGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/emr", "InstanceGroup.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/emr/instanceGroup.InstanceGroup */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/emr", "ManagedScalingPolicy")
  @js.native
  class ManagedScalingPolicy protected ()
    extends typingsSlinky.pulumiAws.managedScalingPolicyMod.ManagedScalingPolicy {
    /**
      * Create a ManagedScalingPolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ManagedScalingPolicyArgs) = this()
    def this(name: String, args: ManagedScalingPolicyArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ManagedScalingPolicy {
    
    /**
      * Get an existing ManagedScalingPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/emr", "ManagedScalingPolicy.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.managedScalingPolicyMod.ManagedScalingPolicy = js.native
    @JSImport("@pulumi/aws/emr", "ManagedScalingPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.managedScalingPolicyMod.ManagedScalingPolicy = js.native
    @JSImport("@pulumi/aws/emr", "ManagedScalingPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: ManagedScalingPolicyState): typingsSlinky.pulumiAws.managedScalingPolicyMod.ManagedScalingPolicy = js.native
    @JSImport("@pulumi/aws/emr", "ManagedScalingPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: ManagedScalingPolicyState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.managedScalingPolicyMod.ManagedScalingPolicy = js.native
    
    /**
      * Returns true if the given object is an instance of ManagedScalingPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/emr", "ManagedScalingPolicy.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/emr/managedScalingPolicy.ManagedScalingPolicy */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/emr", "SecurityConfiguration")
  @js.native
  class SecurityConfiguration protected ()
    extends typingsSlinky.pulumiAws.securityConfigurationMod.SecurityConfiguration {
    /**
      * Create a SecurityConfiguration resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: SecurityConfigurationArgs) = this()
    def this(name: String, args: SecurityConfigurationArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object SecurityConfiguration {
    
    /**
      * Get an existing SecurityConfiguration resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/emr", "SecurityConfiguration.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.securityConfigurationMod.SecurityConfiguration = js.native
    @JSImport("@pulumi/aws/emr", "SecurityConfiguration.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.securityConfigurationMod.SecurityConfiguration = js.native
    @JSImport("@pulumi/aws/emr", "SecurityConfiguration.get")
    @js.native
    def get(name: String, id: Input[ID], state: SecurityConfigurationState): typingsSlinky.pulumiAws.securityConfigurationMod.SecurityConfiguration = js.native
    @JSImport("@pulumi/aws/emr", "SecurityConfiguration.get")
    @js.native
    def get(name: String, id: Input[ID], state: SecurityConfigurationState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.securityConfigurationMod.SecurityConfiguration = js.native
    
    /**
      * Returns true if the given object is an instance of SecurityConfiguration.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/emr", "SecurityConfiguration.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/emr/securityConfiguration.SecurityConfiguration */ Boolean = js.native
  }
}
