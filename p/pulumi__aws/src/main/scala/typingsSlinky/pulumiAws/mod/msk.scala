package typingsSlinky.pulumiAws.mod

import typingsSlinky.pulumiAws.getConfigurationMod.GetConfigurationArgs
import typingsSlinky.pulumiAws.getConfigurationMod.GetConfigurationResult
import typingsSlinky.pulumiAws.mskClusterMod.ClusterArgs
import typingsSlinky.pulumiAws.mskClusterMod.ClusterState
import typingsSlinky.pulumiAws.mskConfigurationMod.ConfigurationArgs
import typingsSlinky.pulumiAws.mskConfigurationMod.ConfigurationState
import typingsSlinky.pulumiAws.mskGetClusterMod.GetClusterArgs
import typingsSlinky.pulumiAws.mskGetClusterMod.GetClusterResult
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object msk {
  
  @JSImport("@pulumi/aws", "msk.Cluster")
  @js.native
  class Cluster protected ()
    extends typingsSlinky.pulumiAws.mskMod.Cluster {
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
    @JSImport("@pulumi/aws", "msk.Cluster.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.mskClusterMod.Cluster = js.native
    @JSImport("@pulumi/aws", "msk.Cluster.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.mskClusterMod.Cluster = js.native
    @JSImport("@pulumi/aws", "msk.Cluster.get")
    @js.native
    def get(name: String, id: Input[ID], state: ClusterState): typingsSlinky.pulumiAws.mskClusterMod.Cluster = js.native
    @JSImport("@pulumi/aws", "msk.Cluster.get")
    @js.native
    def get(name: String, id: Input[ID], state: ClusterState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.mskClusterMod.Cluster = js.native
    
    /**
      * Returns true if the given object is an instance of Cluster.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "msk.Cluster.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/msk/cluster.Cluster */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "msk.Configuration")
  @js.native
  class Configuration protected ()
    extends typingsSlinky.pulumiAws.mskMod.Configuration {
    /**
      * Create a Configuration resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ConfigurationArgs) = this()
    def this(name: String, args: ConfigurationArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Configuration {
    
    /**
      * Get an existing Configuration resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "msk.Configuration.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.mskConfigurationMod.Configuration = js.native
    @JSImport("@pulumi/aws", "msk.Configuration.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.mskConfigurationMod.Configuration = js.native
    @JSImport("@pulumi/aws", "msk.Configuration.get")
    @js.native
    def get(name: String, id: Input[ID], state: ConfigurationState): typingsSlinky.pulumiAws.mskConfigurationMod.Configuration = js.native
    @JSImport("@pulumi/aws", "msk.Configuration.get")
    @js.native
    def get(name: String, id: Input[ID], state: ConfigurationState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.mskConfigurationMod.Configuration = js.native
    
    /**
      * Returns true if the given object is an instance of Configuration.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "msk.Configuration.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/msk/configuration.Configuration */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "msk.getCluster")
  @js.native
  def getCluster(args: GetClusterArgs): js.Promise[GetClusterResult] = js.native
  @JSImport("@pulumi/aws", "msk.getCluster")
  @js.native
  def getCluster(args: GetClusterArgs, opts: InvokeOptions): js.Promise[GetClusterResult] = js.native
  
  @JSImport("@pulumi/aws", "msk.getConfiguration")
  @js.native
  def getConfiguration(args: GetConfigurationArgs): js.Promise[GetConfigurationResult] = js.native
  @JSImport("@pulumi/aws", "msk.getConfiguration")
  @js.native
  def getConfiguration(args: GetConfigurationArgs, opts: InvokeOptions): js.Promise[GetConfigurationResult] = js.native
}
