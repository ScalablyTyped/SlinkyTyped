package typingsSlinky.pulumiAws.mod

import typingsSlinky.pulumiAws.daxClusterMod.ClusterArgs
import typingsSlinky.pulumiAws.daxClusterMod.ClusterState
import typingsSlinky.pulumiAws.parameterGroupMod.ParameterGroupArgs
import typingsSlinky.pulumiAws.parameterGroupMod.ParameterGroupState
import typingsSlinky.pulumiAws.subnetGroupMod.SubnetGroupArgs
import typingsSlinky.pulumiAws.subnetGroupMod.SubnetGroupState
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dax {
  
  @JSImport("@pulumi/aws", "dax.Cluster")
  @js.native
  class Cluster protected ()
    extends typingsSlinky.pulumiAws.daxMod.Cluster {
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
    @JSImport("@pulumi/aws", "dax.Cluster.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.daxClusterMod.Cluster = js.native
    @JSImport("@pulumi/aws", "dax.Cluster.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.daxClusterMod.Cluster = js.native
    @JSImport("@pulumi/aws", "dax.Cluster.get")
    @js.native
    def get(name: String, id: Input[ID], state: ClusterState): typingsSlinky.pulumiAws.daxClusterMod.Cluster = js.native
    @JSImport("@pulumi/aws", "dax.Cluster.get")
    @js.native
    def get(name: String, id: Input[ID], state: ClusterState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.daxClusterMod.Cluster = js.native
    
    /**
      * Returns true if the given object is an instance of Cluster.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "dax.Cluster.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/dax/cluster.Cluster */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "dax.ParameterGroup")
  @js.native
  class ParameterGroup protected ()
    extends typingsSlinky.pulumiAws.daxMod.ParameterGroup {
    /**
      * Create a ParameterGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ParameterGroupArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: ParameterGroupArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ParameterGroup {
    
    /**
      * Get an existing ParameterGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "dax.ParameterGroup.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.parameterGroupMod.ParameterGroup = js.native
    @JSImport("@pulumi/aws", "dax.ParameterGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.parameterGroupMod.ParameterGroup = js.native
    @JSImport("@pulumi/aws", "dax.ParameterGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: ParameterGroupState): typingsSlinky.pulumiAws.parameterGroupMod.ParameterGroup = js.native
    @JSImport("@pulumi/aws", "dax.ParameterGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: ParameterGroupState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.parameterGroupMod.ParameterGroup = js.native
    
    /**
      * Returns true if the given object is an instance of ParameterGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "dax.ParameterGroup.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/dax/parameterGroup.ParameterGroup */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "dax.SubnetGroup")
  @js.native
  class SubnetGroup protected ()
    extends typingsSlinky.pulumiAws.daxMod.SubnetGroup {
    /**
      * Create a SubnetGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: SubnetGroupArgs) = this()
    def this(name: String, args: SubnetGroupArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object SubnetGroup {
    
    /**
      * Get an existing SubnetGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "dax.SubnetGroup.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.subnetGroupMod.SubnetGroup = js.native
    @JSImport("@pulumi/aws", "dax.SubnetGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.subnetGroupMod.SubnetGroup = js.native
    @JSImport("@pulumi/aws", "dax.SubnetGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: SubnetGroupState): typingsSlinky.pulumiAws.subnetGroupMod.SubnetGroup = js.native
    @JSImport("@pulumi/aws", "dax.SubnetGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: SubnetGroupState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.subnetGroupMod.SubnetGroup = js.native
    
    /**
      * Returns true if the given object is an instance of SubnetGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "dax.SubnetGroup.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/dax/subnetGroup.SubnetGroup */ Boolean = js.native
  }
}
