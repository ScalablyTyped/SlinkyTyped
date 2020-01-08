package typingsSlinky.atPulumiAws

import typingsSlinky.atPulumiAws.docdbClusterInstanceMod.ClusterInstanceArgs
import typingsSlinky.atPulumiAws.docdbClusterInstanceMod.ClusterInstanceState
import typingsSlinky.atPulumiAws.docdbClusterMod.ClusterArgs
import typingsSlinky.atPulumiAws.docdbClusterMod.ClusterState
import typingsSlinky.atPulumiAws.docdbClusterParameterGroupMod.ClusterParameterGroupArgs
import typingsSlinky.atPulumiAws.docdbClusterParameterGroupMod.ClusterParameterGroupState
import typingsSlinky.atPulumiAws.docdbClusterSnapshotMod.ClusterSnapshotArgs
import typingsSlinky.atPulumiAws.docdbClusterSnapshotMod.ClusterSnapshotState
import typingsSlinky.atPulumiAws.docdbSubnetGroupMod.SubnetGroupArgs
import typingsSlinky.atPulumiAws.docdbSubnetGroupMod.SubnetGroupState
import typingsSlinky.atPulumiPulumi.outputMod.Input
import typingsSlinky.atPulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/docdb", JSImport.Namespace)
@js.native
object docdbMod extends js.Object {
  @js.native
  class Cluster protected ()
    extends typingsSlinky.atPulumiAws.docdbClusterMod.Cluster {
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
    extends typingsSlinky.atPulumiAws.docdbClusterInstanceMod.ClusterInstance {
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
    extends typingsSlinky.atPulumiAws.docdbClusterParameterGroupMod.ClusterParameterGroup {
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
    extends typingsSlinky.atPulumiAws.docdbClusterSnapshotMod.ClusterSnapshot {
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
  class SubnetGroup protected ()
    extends typingsSlinky.atPulumiAws.docdbSubnetGroupMod.SubnetGroup {
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
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.docdbClusterMod.Cluster = js.native
    def get(name: String, id: Input[ID], state: ClusterState): typingsSlinky.atPulumiAws.docdbClusterMod.Cluster = js.native
    def get(name: String, id: Input[ID], state: ClusterState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.docdbClusterMod.Cluster = js.native
    /**
      * Returns true if the given object is an instance of Cluster.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/docdb/cluster.Cluster */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.docdbClusterInstanceMod.ClusterInstance = js.native
    def get(name: String, id: Input[ID], state: ClusterInstanceState): typingsSlinky.atPulumiAws.docdbClusterInstanceMod.ClusterInstance = js.native
    def get(name: String, id: Input[ID], state: ClusterInstanceState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.docdbClusterInstanceMod.ClusterInstance = js.native
    /**
      * Returns true if the given object is an instance of ClusterInstance.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/docdb/clusterInstance.ClusterInstance */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.docdbClusterParameterGroupMod.ClusterParameterGroup = js.native
    def get(name: String, id: Input[ID], state: ClusterParameterGroupState): typingsSlinky.atPulumiAws.docdbClusterParameterGroupMod.ClusterParameterGroup = js.native
    def get(name: String, id: Input[ID], state: ClusterParameterGroupState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.docdbClusterParameterGroupMod.ClusterParameterGroup = js.native
    /**
      * Returns true if the given object is an instance of ClusterParameterGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/docdb/clusterParameterGroup.ClusterParameterGroup */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.docdbClusterSnapshotMod.ClusterSnapshot = js.native
    def get(name: String, id: Input[ID], state: ClusterSnapshotState): typingsSlinky.atPulumiAws.docdbClusterSnapshotMod.ClusterSnapshot = js.native
    def get(name: String, id: Input[ID], state: ClusterSnapshotState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.docdbClusterSnapshotMod.ClusterSnapshot = js.native
    /**
      * Returns true if the given object is an instance of ClusterSnapshot.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/docdb/clusterSnapshot.ClusterSnapshot */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.docdbSubnetGroupMod.SubnetGroup = js.native
    def get(name: String, id: Input[ID], state: SubnetGroupState): typingsSlinky.atPulumiAws.docdbSubnetGroupMod.SubnetGroup = js.native
    def get(name: String, id: Input[ID], state: SubnetGroupState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.docdbSubnetGroupMod.SubnetGroup = js.native
    /**
      * Returns true if the given object is an instance of SubnetGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/docdb/subnetGroup.SubnetGroup */ Boolean = js.native
  }
  
}

