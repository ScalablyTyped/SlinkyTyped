package typingsSlinky.pulumiAws.mod

import typingsSlinky.pulumiAws.emrClusterMod.ClusterArgs
import typingsSlinky.pulumiAws.emrClusterMod.ClusterState
import typingsSlinky.pulumiAws.instanceGroupMod.InstanceGroupArgs
import typingsSlinky.pulumiAws.instanceGroupMod.InstanceGroupState
import typingsSlinky.pulumiAws.securityConfigurationMod.SecurityConfigurationArgs
import typingsSlinky.pulumiAws.securityConfigurationMod.SecurityConfigurationState
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws", "emr")
@js.native
object emr extends js.Object {
  
  @js.native
  class Cluster protected ()
    extends typingsSlinky.pulumiAws.emrMod.Cluster {
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
  @js.native
  object Cluster extends js.Object {
    
    /**
      * Get an existing Cluster resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.emrClusterMod.Cluster = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.emrClusterMod.Cluster = js.native
    def get(name: String, id: Input[ID], state: ClusterState): typingsSlinky.pulumiAws.emrClusterMod.Cluster = js.native
    def get(name: String, id: Input[ID], state: ClusterState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.emrClusterMod.Cluster = js.native
    
    /**
      * Returns true if the given object is an instance of Cluster.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/emr/cluster.Cluster */ Boolean = js.native
  }
  
  @js.native
  class InstanceGroup protected ()
    extends typingsSlinky.pulumiAws.emrMod.InstanceGroup {
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
  @js.native
  object InstanceGroup extends js.Object {
    
    /**
      * Get an existing InstanceGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.instanceGroupMod.InstanceGroup = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.instanceGroupMod.InstanceGroup = js.native
    def get(name: String, id: Input[ID], state: InstanceGroupState): typingsSlinky.pulumiAws.instanceGroupMod.InstanceGroup = js.native
    def get(name: String, id: Input[ID], state: InstanceGroupState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.instanceGroupMod.InstanceGroup = js.native
    
    /**
      * Returns true if the given object is an instance of InstanceGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/emr/instanceGroup.InstanceGroup */ Boolean = js.native
  }
  
  @js.native
  class SecurityConfiguration protected ()
    extends typingsSlinky.pulumiAws.emrMod.SecurityConfiguration {
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
  @js.native
  object SecurityConfiguration extends js.Object {
    
    /**
      * Get an existing SecurityConfiguration resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.securityConfigurationMod.SecurityConfiguration = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.securityConfigurationMod.SecurityConfiguration = js.native
    def get(name: String, id: Input[ID], state: SecurityConfigurationState): typingsSlinky.pulumiAws.securityConfigurationMod.SecurityConfiguration = js.native
    def get(name: String, id: Input[ID], state: SecurityConfigurationState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.securityConfigurationMod.SecurityConfiguration = js.native
    
    /**
      * Returns true if the given object is an instance of SecurityConfiguration.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/emr/securityConfiguration.SecurityConfiguration */ Boolean = js.native
  }
}
