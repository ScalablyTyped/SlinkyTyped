package typingsSlinky.atPulumiAws

import typingsSlinky.atPulumiAws.eksClusterMod.ClusterArgs
import typingsSlinky.atPulumiAws.eksClusterMod.ClusterState
import typingsSlinky.atPulumiAws.eksFargateProfileMod.FargateProfileArgs
import typingsSlinky.atPulumiAws.eksFargateProfileMod.FargateProfileState
import typingsSlinky.atPulumiAws.eksGetClusterAuthMod.GetClusterAuthArgs
import typingsSlinky.atPulumiAws.eksGetClusterAuthMod.GetClusterAuthResult
import typingsSlinky.atPulumiAws.eksGetClusterMod.GetClusterArgs
import typingsSlinky.atPulumiAws.eksGetClusterMod.GetClusterResult
import typingsSlinky.atPulumiAws.eksNodeGroupMod.NodeGroupArgs
import typingsSlinky.atPulumiAws.eksNodeGroupMod.NodeGroupState
import typingsSlinky.atPulumiPulumi.invokeMod.InvokeOptions
import typingsSlinky.atPulumiPulumi.outputMod.Input
import typingsSlinky.atPulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/eks", JSImport.Namespace)
@js.native
object eksMod extends js.Object {
  @js.native
  class Cluster protected ()
    extends typingsSlinky.atPulumiAws.eksClusterMod.Cluster {
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
  
  @js.native
  class FargateProfile protected ()
    extends typingsSlinky.atPulumiAws.eksFargateProfileMod.FargateProfile {
    /**
      * Create a FargateProfile resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: FargateProfileArgs) = this()
    def this(name: String, args: FargateProfileArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class NodeGroup protected ()
    extends typingsSlinky.atPulumiAws.eksNodeGroupMod.NodeGroup {
    /**
      * Create a NodeGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: NodeGroupArgs) = this()
    def this(name: String, args: NodeGroupArgs, opts: CustomResourceOptions) = this()
  }
  
  def getCluster(args: GetClusterArgs): js.Promise[GetClusterResult] with GetClusterResult = js.native
  def getCluster(args: GetClusterArgs, opts: InvokeOptions): js.Promise[GetClusterResult] with GetClusterResult = js.native
  def getClusterAuth(args: GetClusterAuthArgs): js.Promise[GetClusterAuthResult] with GetClusterAuthResult = js.native
  def getClusterAuth(args: GetClusterAuthArgs, opts: InvokeOptions): js.Promise[GetClusterAuthResult] with GetClusterAuthResult = js.native
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
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.eksClusterMod.Cluster = js.native
    def get(name: String, id: Input[ID], state: ClusterState): typingsSlinky.atPulumiAws.eksClusterMod.Cluster = js.native
    def get(name: String, id: Input[ID], state: ClusterState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.eksClusterMod.Cluster = js.native
    /**
      * Returns true if the given object is an instance of Cluster.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/eks/cluster.Cluster */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object FargateProfile extends js.Object {
    /**
      * Get an existing FargateProfile resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.eksFargateProfileMod.FargateProfile = js.native
    def get(name: String, id: Input[ID], state: FargateProfileState): typingsSlinky.atPulumiAws.eksFargateProfileMod.FargateProfile = js.native
    def get(name: String, id: Input[ID], state: FargateProfileState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.eksFargateProfileMod.FargateProfile = js.native
    /**
      * Returns true if the given object is an instance of FargateProfile.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/eks/fargateProfile.FargateProfile */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object NodeGroup extends js.Object {
    /**
      * Get an existing NodeGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.eksNodeGroupMod.NodeGroup = js.native
    def get(name: String, id: Input[ID], state: NodeGroupState): typingsSlinky.atPulumiAws.eksNodeGroupMod.NodeGroup = js.native
    def get(name: String, id: Input[ID], state: NodeGroupState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.eksNodeGroupMod.NodeGroup = js.native
    /**
      * Returns true if the given object is an instance of NodeGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/eks/nodeGroup.NodeGroup */ Boolean = js.native
  }
  
}

