package typingsSlinky.pulumiAws.mod

import typingsSlinky.pulumiAws.eksClusterMod.ClusterArgs
import typingsSlinky.pulumiAws.eksClusterMod.ClusterState
import typingsSlinky.pulumiAws.eksGetClusterMod.GetClusterArgs
import typingsSlinky.pulumiAws.eksGetClusterMod.GetClusterResult
import typingsSlinky.pulumiAws.fargateProfileMod.FargateProfileArgs
import typingsSlinky.pulumiAws.fargateProfileMod.FargateProfileState
import typingsSlinky.pulumiAws.getClusterAuthMod.GetClusterAuthArgs
import typingsSlinky.pulumiAws.getClusterAuthMod.GetClusterAuthResult
import typingsSlinky.pulumiAws.nodeGroupMod.NodeGroupArgs
import typingsSlinky.pulumiAws.nodeGroupMod.NodeGroupState
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eks {
  
  @JSImport("@pulumi/aws", "eks.Cluster")
  @js.native
  class Cluster protected ()
    extends typingsSlinky.pulumiAws.eksMod.Cluster {
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
    @JSImport("@pulumi/aws", "eks.Cluster.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.eksClusterMod.Cluster = js.native
    @JSImport("@pulumi/aws", "eks.Cluster.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.eksClusterMod.Cluster = js.native
    @JSImport("@pulumi/aws", "eks.Cluster.get")
    @js.native
    def get(name: String, id: Input[ID], state: ClusterState): typingsSlinky.pulumiAws.eksClusterMod.Cluster = js.native
    @JSImport("@pulumi/aws", "eks.Cluster.get")
    @js.native
    def get(name: String, id: Input[ID], state: ClusterState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.eksClusterMod.Cluster = js.native
    
    /**
      * Returns true if the given object is an instance of Cluster.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "eks.Cluster.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/eks/cluster.Cluster */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "eks.FargateProfile")
  @js.native
  class FargateProfile protected ()
    extends typingsSlinky.pulumiAws.eksMod.FargateProfile {
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
  /* static members */
  object FargateProfile {
    
    /**
      * Get an existing FargateProfile resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "eks.FargateProfile.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.fargateProfileMod.FargateProfile = js.native
    @JSImport("@pulumi/aws", "eks.FargateProfile.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.fargateProfileMod.FargateProfile = js.native
    @JSImport("@pulumi/aws", "eks.FargateProfile.get")
    @js.native
    def get(name: String, id: Input[ID], state: FargateProfileState): typingsSlinky.pulumiAws.fargateProfileMod.FargateProfile = js.native
    @JSImport("@pulumi/aws", "eks.FargateProfile.get")
    @js.native
    def get(name: String, id: Input[ID], state: FargateProfileState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.fargateProfileMod.FargateProfile = js.native
    
    /**
      * Returns true if the given object is an instance of FargateProfile.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "eks.FargateProfile.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/eks/fargateProfile.FargateProfile */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "eks.NodeGroup")
  @js.native
  class NodeGroup protected ()
    extends typingsSlinky.pulumiAws.eksMod.NodeGroup {
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
  /* static members */
  object NodeGroup {
    
    /**
      * Get an existing NodeGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "eks.NodeGroup.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.nodeGroupMod.NodeGroup = js.native
    @JSImport("@pulumi/aws", "eks.NodeGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.nodeGroupMod.NodeGroup = js.native
    @JSImport("@pulumi/aws", "eks.NodeGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: NodeGroupState): typingsSlinky.pulumiAws.nodeGroupMod.NodeGroup = js.native
    @JSImport("@pulumi/aws", "eks.NodeGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: NodeGroupState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.nodeGroupMod.NodeGroup = js.native
    
    /**
      * Returns true if the given object is an instance of NodeGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "eks.NodeGroup.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/eks/nodeGroup.NodeGroup */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "eks.getCluster")
  @js.native
  def getCluster(args: GetClusterArgs): js.Promise[GetClusterResult] = js.native
  @JSImport("@pulumi/aws", "eks.getCluster")
  @js.native
  def getCluster(args: GetClusterArgs, opts: InvokeOptions): js.Promise[GetClusterResult] = js.native
  
  @JSImport("@pulumi/aws", "eks.getClusterAuth")
  @js.native
  def getClusterAuth(args: GetClusterAuthArgs): js.Promise[GetClusterAuthResult] = js.native
  @JSImport("@pulumi/aws", "eks.getClusterAuth")
  @js.native
  def getClusterAuth(args: GetClusterAuthArgs, opts: InvokeOptions): js.Promise[GetClusterAuthResult] = js.native
}
