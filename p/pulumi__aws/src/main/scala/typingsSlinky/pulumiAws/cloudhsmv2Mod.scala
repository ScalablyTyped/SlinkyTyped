package typingsSlinky.pulumiAws

import typingsSlinky.pulumiAws.clusterMod.ClusterArgs
import typingsSlinky.pulumiAws.clusterMod.ClusterState
import typingsSlinky.pulumiAws.getClusterMod.GetClusterArgs
import typingsSlinky.pulumiAws.getClusterMod.GetClusterResult
import typingsSlinky.pulumiAws.hsmMod.HsmArgs
import typingsSlinky.pulumiAws.hsmMod.HsmState
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cloudhsmv2Mod {
  
  @JSImport("@pulumi/aws/cloudhsmv2", "Cluster")
  @js.native
  class Cluster protected ()
    extends typingsSlinky.pulumiAws.clusterMod.Cluster {
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
    @JSImport("@pulumi/aws/cloudhsmv2", "Cluster.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.clusterMod.Cluster = js.native
    @JSImport("@pulumi/aws/cloudhsmv2", "Cluster.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.clusterMod.Cluster = js.native
    @JSImport("@pulumi/aws/cloudhsmv2", "Cluster.get")
    @js.native
    def get(name: String, id: Input[ID], state: ClusterState): typingsSlinky.pulumiAws.clusterMod.Cluster = js.native
    @JSImport("@pulumi/aws/cloudhsmv2", "Cluster.get")
    @js.native
    def get(name: String, id: Input[ID], state: ClusterState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.clusterMod.Cluster = js.native
    
    /**
      * Returns true if the given object is an instance of Cluster.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/cloudhsmv2", "Cluster.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudhsmv2/cluster.Cluster */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/cloudhsmv2", "Hsm")
  @js.native
  class Hsm protected ()
    extends typingsSlinky.pulumiAws.hsmMod.Hsm {
    /**
      * Create a Hsm resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: HsmArgs) = this()
    def this(name: String, args: HsmArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Hsm {
    
    /**
      * Get an existing Hsm resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/cloudhsmv2", "Hsm.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.hsmMod.Hsm = js.native
    @JSImport("@pulumi/aws/cloudhsmv2", "Hsm.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.hsmMod.Hsm = js.native
    @JSImport("@pulumi/aws/cloudhsmv2", "Hsm.get")
    @js.native
    def get(name: String, id: Input[ID], state: HsmState): typingsSlinky.pulumiAws.hsmMod.Hsm = js.native
    @JSImport("@pulumi/aws/cloudhsmv2", "Hsm.get")
    @js.native
    def get(name: String, id: Input[ID], state: HsmState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.hsmMod.Hsm = js.native
    
    /**
      * Returns true if the given object is an instance of Hsm.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/cloudhsmv2", "Hsm.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudhsmv2/hsm.Hsm */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/cloudhsmv2", "getCluster")
  @js.native
  def getCluster(args: GetClusterArgs): js.Promise[GetClusterResult] = js.native
  @JSImport("@pulumi/aws/cloudhsmv2", "getCluster")
  @js.native
  def getCluster(args: GetClusterArgs, opts: InvokeOptions): js.Promise[GetClusterResult] = js.native
}
