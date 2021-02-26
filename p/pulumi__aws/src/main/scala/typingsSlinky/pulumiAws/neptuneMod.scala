package typingsSlinky.pulumiAws

import typingsSlinky.pulumiAws.neptuneClusterInstanceMod.ClusterInstanceArgs
import typingsSlinky.pulumiAws.neptuneClusterInstanceMod.ClusterInstanceState
import typingsSlinky.pulumiAws.neptuneClusterMod.ClusterArgs
import typingsSlinky.pulumiAws.neptuneClusterMod.ClusterState
import typingsSlinky.pulumiAws.neptuneClusterParameterGroupMod.ClusterParameterGroupArgs
import typingsSlinky.pulumiAws.neptuneClusterParameterGroupMod.ClusterParameterGroupState
import typingsSlinky.pulumiAws.neptuneClusterSnapshotMod.ClusterSnapshotArgs
import typingsSlinky.pulumiAws.neptuneClusterSnapshotMod.ClusterSnapshotState
import typingsSlinky.pulumiAws.neptuneEventSubscriptionMod.EventSubscriptionArgs
import typingsSlinky.pulumiAws.neptuneEventSubscriptionMod.EventSubscriptionState
import typingsSlinky.pulumiAws.neptuneGetEngineVersionMod.GetEngineVersionArgs
import typingsSlinky.pulumiAws.neptuneGetEngineVersionMod.GetEngineVersionResult
import typingsSlinky.pulumiAws.neptuneGetOrderableDbInstanceMod.GetOrderableDbInstanceArgs
import typingsSlinky.pulumiAws.neptuneGetOrderableDbInstanceMod.GetOrderableDbInstanceResult
import typingsSlinky.pulumiAws.neptuneParameterGroupMod.ParameterGroupArgs
import typingsSlinky.pulumiAws.neptuneParameterGroupMod.ParameterGroupState
import typingsSlinky.pulumiAws.neptuneSubnetGroupMod.SubnetGroupArgs
import typingsSlinky.pulumiAws.neptuneSubnetGroupMod.SubnetGroupState
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object neptuneMod {
  
  @JSImport("@pulumi/aws/neptune", "Cluster")
  @js.native
  class Cluster protected ()
    extends typingsSlinky.pulumiAws.neptuneClusterMod.Cluster {
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
    @JSImport("@pulumi/aws/neptune", "Cluster.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.neptuneClusterMod.Cluster = js.native
    @JSImport("@pulumi/aws/neptune", "Cluster.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.neptuneClusterMod.Cluster = js.native
    @JSImport("@pulumi/aws/neptune", "Cluster.get")
    @js.native
    def get(name: String, id: Input[ID], state: ClusterState): typingsSlinky.pulumiAws.neptuneClusterMod.Cluster = js.native
    @JSImport("@pulumi/aws/neptune", "Cluster.get")
    @js.native
    def get(name: String, id: Input[ID], state: ClusterState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.neptuneClusterMod.Cluster = js.native
    
    /**
      * Returns true if the given object is an instance of Cluster.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/neptune", "Cluster.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/neptune/cluster.Cluster */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/neptune", "ClusterInstance")
  @js.native
  class ClusterInstance protected ()
    extends typingsSlinky.pulumiAws.neptuneClusterInstanceMod.ClusterInstance {
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
    @JSImport("@pulumi/aws/neptune", "ClusterInstance.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.neptuneClusterInstanceMod.ClusterInstance = js.native
    @JSImport("@pulumi/aws/neptune", "ClusterInstance.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.neptuneClusterInstanceMod.ClusterInstance = js.native
    @JSImport("@pulumi/aws/neptune", "ClusterInstance.get")
    @js.native
    def get(name: String, id: Input[ID], state: ClusterInstanceState): typingsSlinky.pulumiAws.neptuneClusterInstanceMod.ClusterInstance = js.native
    @JSImport("@pulumi/aws/neptune", "ClusterInstance.get")
    @js.native
    def get(name: String, id: Input[ID], state: ClusterInstanceState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.neptuneClusterInstanceMod.ClusterInstance = js.native
    
    /**
      * Returns true if the given object is an instance of ClusterInstance.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/neptune", "ClusterInstance.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/neptune/clusterInstance.ClusterInstance */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/neptune", "ClusterParameterGroup")
  @js.native
  class ClusterParameterGroup protected ()
    extends typingsSlinky.pulumiAws.neptuneClusterParameterGroupMod.ClusterParameterGroup {
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
    @JSImport("@pulumi/aws/neptune", "ClusterParameterGroup.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.neptuneClusterParameterGroupMod.ClusterParameterGroup = js.native
    @JSImport("@pulumi/aws/neptune", "ClusterParameterGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.neptuneClusterParameterGroupMod.ClusterParameterGroup = js.native
    @JSImport("@pulumi/aws/neptune", "ClusterParameterGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: ClusterParameterGroupState): typingsSlinky.pulumiAws.neptuneClusterParameterGroupMod.ClusterParameterGroup = js.native
    @JSImport("@pulumi/aws/neptune", "ClusterParameterGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: ClusterParameterGroupState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.neptuneClusterParameterGroupMod.ClusterParameterGroup = js.native
    
    /**
      * Returns true if the given object is an instance of ClusterParameterGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/neptune", "ClusterParameterGroup.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/neptune/clusterParameterGroup.ClusterParameterGroup */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/neptune", "ClusterSnapshot")
  @js.native
  class ClusterSnapshot protected ()
    extends typingsSlinky.pulumiAws.neptuneClusterSnapshotMod.ClusterSnapshot {
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
    @JSImport("@pulumi/aws/neptune", "ClusterSnapshot.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.neptuneClusterSnapshotMod.ClusterSnapshot = js.native
    @JSImport("@pulumi/aws/neptune", "ClusterSnapshot.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.neptuneClusterSnapshotMod.ClusterSnapshot = js.native
    @JSImport("@pulumi/aws/neptune", "ClusterSnapshot.get")
    @js.native
    def get(name: String, id: Input[ID], state: ClusterSnapshotState): typingsSlinky.pulumiAws.neptuneClusterSnapshotMod.ClusterSnapshot = js.native
    @JSImport("@pulumi/aws/neptune", "ClusterSnapshot.get")
    @js.native
    def get(name: String, id: Input[ID], state: ClusterSnapshotState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.neptuneClusterSnapshotMod.ClusterSnapshot = js.native
    
    /**
      * Returns true if the given object is an instance of ClusterSnapshot.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/neptune", "ClusterSnapshot.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/neptune/clusterSnapshot.ClusterSnapshot */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/neptune", "EventSubscription")
  @js.native
  class EventSubscription protected ()
    extends typingsSlinky.pulumiAws.neptuneEventSubscriptionMod.EventSubscription {
    /**
      * Create a EventSubscription resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: EventSubscriptionArgs) = this()
    def this(name: String, args: EventSubscriptionArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object EventSubscription {
    
    /**
      * Get an existing EventSubscription resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/neptune", "EventSubscription.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.neptuneEventSubscriptionMod.EventSubscription = js.native
    @JSImport("@pulumi/aws/neptune", "EventSubscription.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.neptuneEventSubscriptionMod.EventSubscription = js.native
    @JSImport("@pulumi/aws/neptune", "EventSubscription.get")
    @js.native
    def get(name: String, id: Input[ID], state: EventSubscriptionState): typingsSlinky.pulumiAws.neptuneEventSubscriptionMod.EventSubscription = js.native
    @JSImport("@pulumi/aws/neptune", "EventSubscription.get")
    @js.native
    def get(name: String, id: Input[ID], state: EventSubscriptionState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.neptuneEventSubscriptionMod.EventSubscription = js.native
    
    /**
      * Returns true if the given object is an instance of EventSubscription.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/neptune", "EventSubscription.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/neptune/eventSubscription.EventSubscription */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/neptune", "ParameterGroup")
  @js.native
  class ParameterGroup protected ()
    extends typingsSlinky.pulumiAws.neptuneParameterGroupMod.ParameterGroup {
    /**
      * Create a ParameterGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ParameterGroupArgs) = this()
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
    @JSImport("@pulumi/aws/neptune", "ParameterGroup.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.neptuneParameterGroupMod.ParameterGroup = js.native
    @JSImport("@pulumi/aws/neptune", "ParameterGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.neptuneParameterGroupMod.ParameterGroup = js.native
    @JSImport("@pulumi/aws/neptune", "ParameterGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: ParameterGroupState): typingsSlinky.pulumiAws.neptuneParameterGroupMod.ParameterGroup = js.native
    @JSImport("@pulumi/aws/neptune", "ParameterGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: ParameterGroupState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.neptuneParameterGroupMod.ParameterGroup = js.native
    
    /**
      * Returns true if the given object is an instance of ParameterGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/neptune", "ParameterGroup.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/neptune/parameterGroup.ParameterGroup */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/neptune", "SubnetGroup")
  @js.native
  class SubnetGroup protected ()
    extends typingsSlinky.pulumiAws.neptuneSubnetGroupMod.SubnetGroup {
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
    @JSImport("@pulumi/aws/neptune", "SubnetGroup.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.neptuneSubnetGroupMod.SubnetGroup = js.native
    @JSImport("@pulumi/aws/neptune", "SubnetGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.neptuneSubnetGroupMod.SubnetGroup = js.native
    @JSImport("@pulumi/aws/neptune", "SubnetGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: SubnetGroupState): typingsSlinky.pulumiAws.neptuneSubnetGroupMod.SubnetGroup = js.native
    @JSImport("@pulumi/aws/neptune", "SubnetGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: SubnetGroupState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.neptuneSubnetGroupMod.SubnetGroup = js.native
    
    /**
      * Returns true if the given object is an instance of SubnetGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/neptune", "SubnetGroup.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/neptune/subnetGroup.SubnetGroup */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/neptune", "getEngineVersion")
  @js.native
  def getEngineVersion(): js.Promise[GetEngineVersionResult] = js.native
  @JSImport("@pulumi/aws/neptune", "getEngineVersion")
  @js.native
  def getEngineVersion(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetEngineVersionResult] = js.native
  @JSImport("@pulumi/aws/neptune", "getEngineVersion")
  @js.native
  def getEngineVersion(args: GetEngineVersionArgs): js.Promise[GetEngineVersionResult] = js.native
  @JSImport("@pulumi/aws/neptune", "getEngineVersion")
  @js.native
  def getEngineVersion(args: GetEngineVersionArgs, opts: InvokeOptions): js.Promise[GetEngineVersionResult] = js.native
  
  @JSImport("@pulumi/aws/neptune", "getOrderableDbInstance")
  @js.native
  def getOrderableDbInstance(): js.Promise[GetOrderableDbInstanceResult] = js.native
  @JSImport("@pulumi/aws/neptune", "getOrderableDbInstance")
  @js.native
  def getOrderableDbInstance(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetOrderableDbInstanceResult] = js.native
  @JSImport("@pulumi/aws/neptune", "getOrderableDbInstance")
  @js.native
  def getOrderableDbInstance(args: GetOrderableDbInstanceArgs): js.Promise[GetOrderableDbInstanceResult] = js.native
  @JSImport("@pulumi/aws/neptune", "getOrderableDbInstance")
  @js.native
  def getOrderableDbInstance(args: GetOrderableDbInstanceArgs, opts: InvokeOptions): js.Promise[GetOrderableDbInstanceResult] = js.native
}
