package typingsSlinky.pulumiAws.mod

import typingsSlinky.pulumiAws.clusterInstanceMod.ClusterInstanceArgs
import typingsSlinky.pulumiAws.clusterInstanceMod.ClusterInstanceState
import typingsSlinky.pulumiAws.clusterParameterGroupMod.ClusterParameterGroupArgs
import typingsSlinky.pulumiAws.clusterParameterGroupMod.ClusterParameterGroupState
import typingsSlinky.pulumiAws.clusterSnapshotMod.ClusterSnapshotArgs
import typingsSlinky.pulumiAws.clusterSnapshotMod.ClusterSnapshotState
import typingsSlinky.pulumiAws.docdbClusterMod.ClusterArgs
import typingsSlinky.pulumiAws.docdbClusterMod.ClusterState
import typingsSlinky.pulumiAws.docdbSubnetGroupMod.SubnetGroupArgs
import typingsSlinky.pulumiAws.docdbSubnetGroupMod.SubnetGroupState
import typingsSlinky.pulumiAws.getEngineVersionMod.GetEngineVersionArgs
import typingsSlinky.pulumiAws.getEngineVersionMod.GetEngineVersionResult
import typingsSlinky.pulumiAws.getOrderableDbInstanceMod.GetOrderableDbInstanceArgs
import typingsSlinky.pulumiAws.getOrderableDbInstanceMod.GetOrderableDbInstanceResult
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object docdb {
  
  @JSImport("@pulumi/aws", "docdb.Cluster")
  @js.native
  class Cluster protected ()
    extends typingsSlinky.pulumiAws.docdbMod.Cluster {
    /**
      * Create a Cluster resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ClusterArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
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
    @JSImport("@pulumi/aws", "docdb.Cluster.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.docdbClusterMod.Cluster = js.native
    @JSImport("@pulumi/aws", "docdb.Cluster.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.docdbClusterMod.Cluster = js.native
    @JSImport("@pulumi/aws", "docdb.Cluster.get")
    @js.native
    def get(name: String, id: Input[ID], state: ClusterState): typingsSlinky.pulumiAws.docdbClusterMod.Cluster = js.native
    @JSImport("@pulumi/aws", "docdb.Cluster.get")
    @js.native
    def get(name: String, id: Input[ID], state: ClusterState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.docdbClusterMod.Cluster = js.native
    
    /**
      * Returns true if the given object is an instance of Cluster.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "docdb.Cluster.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/docdb/cluster.Cluster */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "docdb.ClusterInstance")
  @js.native
  class ClusterInstance protected ()
    extends typingsSlinky.pulumiAws.docdbMod.ClusterInstance {
    /**
      * Create a ClusterInstance resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ClusterInstanceArgs) = this()
    def this(name: String, args: ClusterInstanceArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ClusterInstance {
    
    /**
      * Get an existing ClusterInstance resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "docdb.ClusterInstance.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.clusterInstanceMod.ClusterInstance = js.native
    @JSImport("@pulumi/aws", "docdb.ClusterInstance.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.clusterInstanceMod.ClusterInstance = js.native
    @JSImport("@pulumi/aws", "docdb.ClusterInstance.get")
    @js.native
    def get(name: String, id: Input[ID], state: ClusterInstanceState): typingsSlinky.pulumiAws.clusterInstanceMod.ClusterInstance = js.native
    @JSImport("@pulumi/aws", "docdb.ClusterInstance.get")
    @js.native
    def get(name: String, id: Input[ID], state: ClusterInstanceState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.clusterInstanceMod.ClusterInstance = js.native
    
    /**
      * Returns true if the given object is an instance of ClusterInstance.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "docdb.ClusterInstance.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/docdb/clusterInstance.ClusterInstance */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "docdb.ClusterParameterGroup")
  @js.native
  class ClusterParameterGroup protected ()
    extends typingsSlinky.pulumiAws.docdbMod.ClusterParameterGroup {
    /**
      * Create a ClusterParameterGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ClusterParameterGroupArgs) = this()
    def this(name: String, args: ClusterParameterGroupArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ClusterParameterGroup {
    
    /**
      * Get an existing ClusterParameterGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "docdb.ClusterParameterGroup.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.clusterParameterGroupMod.ClusterParameterGroup = js.native
    @JSImport("@pulumi/aws", "docdb.ClusterParameterGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.clusterParameterGroupMod.ClusterParameterGroup = js.native
    @JSImport("@pulumi/aws", "docdb.ClusterParameterGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: ClusterParameterGroupState): typingsSlinky.pulumiAws.clusterParameterGroupMod.ClusterParameterGroup = js.native
    @JSImport("@pulumi/aws", "docdb.ClusterParameterGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: ClusterParameterGroupState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.clusterParameterGroupMod.ClusterParameterGroup = js.native
    
    /**
      * Returns true if the given object is an instance of ClusterParameterGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "docdb.ClusterParameterGroup.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/docdb/clusterParameterGroup.ClusterParameterGroup */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "docdb.ClusterSnapshot")
  @js.native
  class ClusterSnapshot protected ()
    extends typingsSlinky.pulumiAws.docdbMod.ClusterSnapshot {
    /**
      * Create a ClusterSnapshot resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ClusterSnapshotArgs) = this()
    def this(name: String, args: ClusterSnapshotArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ClusterSnapshot {
    
    /**
      * Get an existing ClusterSnapshot resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "docdb.ClusterSnapshot.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.clusterSnapshotMod.ClusterSnapshot = js.native
    @JSImport("@pulumi/aws", "docdb.ClusterSnapshot.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.clusterSnapshotMod.ClusterSnapshot = js.native
    @JSImport("@pulumi/aws", "docdb.ClusterSnapshot.get")
    @js.native
    def get(name: String, id: Input[ID], state: ClusterSnapshotState): typingsSlinky.pulumiAws.clusterSnapshotMod.ClusterSnapshot = js.native
    @JSImport("@pulumi/aws", "docdb.ClusterSnapshot.get")
    @js.native
    def get(name: String, id: Input[ID], state: ClusterSnapshotState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.clusterSnapshotMod.ClusterSnapshot = js.native
    
    /**
      * Returns true if the given object is an instance of ClusterSnapshot.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "docdb.ClusterSnapshot.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/docdb/clusterSnapshot.ClusterSnapshot */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "docdb.SubnetGroup")
  @js.native
  class SubnetGroup protected ()
    extends typingsSlinky.pulumiAws.docdbMod.SubnetGroup {
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
    @JSImport("@pulumi/aws", "docdb.SubnetGroup.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.docdbSubnetGroupMod.SubnetGroup = js.native
    @JSImport("@pulumi/aws", "docdb.SubnetGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.docdbSubnetGroupMod.SubnetGroup = js.native
    @JSImport("@pulumi/aws", "docdb.SubnetGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: SubnetGroupState): typingsSlinky.pulumiAws.docdbSubnetGroupMod.SubnetGroup = js.native
    @JSImport("@pulumi/aws", "docdb.SubnetGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: SubnetGroupState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.docdbSubnetGroupMod.SubnetGroup = js.native
    
    /**
      * Returns true if the given object is an instance of SubnetGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "docdb.SubnetGroup.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/docdb/subnetGroup.SubnetGroup */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "docdb.getEngineVersion")
  @js.native
  def getEngineVersion(): js.Promise[GetEngineVersionResult] = js.native
  @JSImport("@pulumi/aws", "docdb.getEngineVersion")
  @js.native
  def getEngineVersion(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetEngineVersionResult] = js.native
  @JSImport("@pulumi/aws", "docdb.getEngineVersion")
  @js.native
  def getEngineVersion(args: GetEngineVersionArgs): js.Promise[GetEngineVersionResult] = js.native
  @JSImport("@pulumi/aws", "docdb.getEngineVersion")
  @js.native
  def getEngineVersion(args: GetEngineVersionArgs, opts: InvokeOptions): js.Promise[GetEngineVersionResult] = js.native
  
  @JSImport("@pulumi/aws", "docdb.getOrderableDbInstance")
  @js.native
  def getOrderableDbInstance(): js.Promise[GetOrderableDbInstanceResult] = js.native
  @JSImport("@pulumi/aws", "docdb.getOrderableDbInstance")
  @js.native
  def getOrderableDbInstance(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetOrderableDbInstanceResult] = js.native
  @JSImport("@pulumi/aws", "docdb.getOrderableDbInstance")
  @js.native
  def getOrderableDbInstance(args: GetOrderableDbInstanceArgs): js.Promise[GetOrderableDbInstanceResult] = js.native
  @JSImport("@pulumi/aws", "docdb.getOrderableDbInstance")
  @js.native
  def getOrderableDbInstance(args: GetOrderableDbInstanceArgs, opts: InvokeOptions): js.Promise[GetOrderableDbInstanceResult] = js.native
}
