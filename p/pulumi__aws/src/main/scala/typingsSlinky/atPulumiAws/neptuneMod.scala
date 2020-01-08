package typingsSlinky.atPulumiAws

import typingsSlinky.atPulumiAws.neptuneClusterInstanceMod.ClusterInstanceArgs
import typingsSlinky.atPulumiAws.neptuneClusterInstanceMod.ClusterInstanceState
import typingsSlinky.atPulumiAws.neptuneClusterMod.ClusterArgs
import typingsSlinky.atPulumiAws.neptuneClusterMod.ClusterState
import typingsSlinky.atPulumiAws.neptuneClusterParameterGroupMod.ClusterParameterGroupArgs
import typingsSlinky.atPulumiAws.neptuneClusterParameterGroupMod.ClusterParameterGroupState
import typingsSlinky.atPulumiAws.neptuneClusterSnapshotMod.ClusterSnapshotArgs
import typingsSlinky.atPulumiAws.neptuneClusterSnapshotMod.ClusterSnapshotState
import typingsSlinky.atPulumiAws.neptuneEventSubscriptionMod.EventSubscriptionArgs
import typingsSlinky.atPulumiAws.neptuneEventSubscriptionMod.EventSubscriptionState
import typingsSlinky.atPulumiAws.neptuneParameterGroupMod.ParameterGroupArgs
import typingsSlinky.atPulumiAws.neptuneParameterGroupMod.ParameterGroupState
import typingsSlinky.atPulumiAws.neptuneSubnetGroupMod.SubnetGroupArgs
import typingsSlinky.atPulumiAws.neptuneSubnetGroupMod.SubnetGroupState
import typingsSlinky.atPulumiPulumi.outputMod.Input
import typingsSlinky.atPulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/neptune", JSImport.Namespace)
@js.native
object neptuneMod extends js.Object {
  @js.native
  class Cluster protected ()
    extends typingsSlinky.atPulumiAws.neptuneClusterMod.Cluster {
    /**
      * Create a Cluster resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ClusterArgs) = this()
    def this(name: String, args: ClusterArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class ClusterInstance protected ()
    extends typingsSlinky.atPulumiAws.neptuneClusterInstanceMod.ClusterInstance {
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
  
  @js.native
  class ClusterParameterGroup protected ()
    extends typingsSlinky.atPulumiAws.neptuneClusterParameterGroupMod.ClusterParameterGroup {
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
  
  @js.native
  class ClusterSnapshot protected ()
    extends typingsSlinky.atPulumiAws.neptuneClusterSnapshotMod.ClusterSnapshot {
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
  
  @js.native
  class EventSubscription protected ()
    extends typingsSlinky.atPulumiAws.neptuneEventSubscriptionMod.EventSubscription {
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
  
  @js.native
  class ParameterGroup protected ()
    extends typingsSlinky.atPulumiAws.neptuneParameterGroupMod.ParameterGroup {
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
  
  @js.native
  class SubnetGroup protected ()
    extends typingsSlinky.atPulumiAws.neptuneSubnetGroupMod.SubnetGroup {
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
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.neptuneClusterMod.Cluster = js.native
    def get(name: String, id: Input[ID], state: ClusterState): typingsSlinky.atPulumiAws.neptuneClusterMod.Cluster = js.native
    def get(name: String, id: Input[ID], state: ClusterState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.neptuneClusterMod.Cluster = js.native
    /**
      * Returns true if the given object is an instance of Cluster.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/neptune/cluster.Cluster */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ClusterInstance extends js.Object {
    /**
      * Get an existing ClusterInstance resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.neptuneClusterInstanceMod.ClusterInstance = js.native
    def get(name: String, id: Input[ID], state: ClusterInstanceState): typingsSlinky.atPulumiAws.neptuneClusterInstanceMod.ClusterInstance = js.native
    def get(name: String, id: Input[ID], state: ClusterInstanceState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.neptuneClusterInstanceMod.ClusterInstance = js.native
    /**
      * Returns true if the given object is an instance of ClusterInstance.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/neptune/clusterInstance.ClusterInstance */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ClusterParameterGroup extends js.Object {
    /**
      * Get an existing ClusterParameterGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.neptuneClusterParameterGroupMod.ClusterParameterGroup = js.native
    def get(name: String, id: Input[ID], state: ClusterParameterGroupState): typingsSlinky.atPulumiAws.neptuneClusterParameterGroupMod.ClusterParameterGroup = js.native
    def get(name: String, id: Input[ID], state: ClusterParameterGroupState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.neptuneClusterParameterGroupMod.ClusterParameterGroup = js.native
    /**
      * Returns true if the given object is an instance of ClusterParameterGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/neptune/clusterParameterGroup.ClusterParameterGroup */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ClusterSnapshot extends js.Object {
    /**
      * Get an existing ClusterSnapshot resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.neptuneClusterSnapshotMod.ClusterSnapshot = js.native
    def get(name: String, id: Input[ID], state: ClusterSnapshotState): typingsSlinky.atPulumiAws.neptuneClusterSnapshotMod.ClusterSnapshot = js.native
    def get(name: String, id: Input[ID], state: ClusterSnapshotState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.neptuneClusterSnapshotMod.ClusterSnapshot = js.native
    /**
      * Returns true if the given object is an instance of ClusterSnapshot.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/neptune/clusterSnapshot.ClusterSnapshot */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object EventSubscription extends js.Object {
    /**
      * Get an existing EventSubscription resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.neptuneEventSubscriptionMod.EventSubscription = js.native
    def get(name: String, id: Input[ID], state: EventSubscriptionState): typingsSlinky.atPulumiAws.neptuneEventSubscriptionMod.EventSubscription = js.native
    def get(name: String, id: Input[ID], state: EventSubscriptionState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.neptuneEventSubscriptionMod.EventSubscription = js.native
    /**
      * Returns true if the given object is an instance of EventSubscription.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/neptune/eventSubscription.EventSubscription */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ParameterGroup extends js.Object {
    /**
      * Get an existing ParameterGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.neptuneParameterGroupMod.ParameterGroup = js.native
    def get(name: String, id: Input[ID], state: ParameterGroupState): typingsSlinky.atPulumiAws.neptuneParameterGroupMod.ParameterGroup = js.native
    def get(name: String, id: Input[ID], state: ParameterGroupState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.neptuneParameterGroupMod.ParameterGroup = js.native
    /**
      * Returns true if the given object is an instance of ParameterGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/neptune/parameterGroup.ParameterGroup */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object SubnetGroup extends js.Object {
    /**
      * Get an existing SubnetGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.neptuneSubnetGroupMod.SubnetGroup = js.native
    def get(name: String, id: Input[ID], state: SubnetGroupState): typingsSlinky.atPulumiAws.neptuneSubnetGroupMod.SubnetGroup = js.native
    def get(name: String, id: Input[ID], state: SubnetGroupState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.neptuneSubnetGroupMod.SubnetGroup = js.native
    /**
      * Returns true if the given object is an instance of SubnetGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/neptune/subnetGroup.SubnetGroup */ Boolean = js.native
  }
  
}

