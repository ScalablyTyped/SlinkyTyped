package typingsSlinky.atPulumiAws

import typingsSlinky.atPulumiAws.elasticacheClusterMod.ClusterArgs
import typingsSlinky.atPulumiAws.elasticacheClusterMod.ClusterState
import typingsSlinky.atPulumiAws.elasticacheGetClusterMod.GetClusterArgs
import typingsSlinky.atPulumiAws.elasticacheGetClusterMod.GetClusterResult
import typingsSlinky.atPulumiAws.elasticacheGetReplicationGroupMod.GetReplicationGroupArgs
import typingsSlinky.atPulumiAws.elasticacheGetReplicationGroupMod.GetReplicationGroupResult
import typingsSlinky.atPulumiAws.elasticacheParameterGroupMod.ParameterGroupArgs
import typingsSlinky.atPulumiAws.elasticacheParameterGroupMod.ParameterGroupState
import typingsSlinky.atPulumiAws.elasticacheReplicationGroupMod.ReplicationGroupArgs
import typingsSlinky.atPulumiAws.elasticacheReplicationGroupMod.ReplicationGroupState
import typingsSlinky.atPulumiAws.elasticacheSecurityGroupMod.SecurityGroupArgs
import typingsSlinky.atPulumiAws.elasticacheSecurityGroupMod.SecurityGroupState
import typingsSlinky.atPulumiAws.elasticacheSubnetGroupMod.SubnetGroupArgs
import typingsSlinky.atPulumiAws.elasticacheSubnetGroupMod.SubnetGroupState
import typingsSlinky.atPulumiPulumi.invokeMod.InvokeOptions
import typingsSlinky.atPulumiPulumi.outputMod.Input
import typingsSlinky.atPulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/elasticache", JSImport.Namespace)
@js.native
object elasticacheMod extends js.Object {
  @js.native
  class Cluster protected ()
    extends typingsSlinky.atPulumiAws.elasticacheClusterMod.Cluster {
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
  class ParameterGroup protected ()
    extends typingsSlinky.atPulumiAws.elasticacheParameterGroupMod.ParameterGroup {
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
  class ReplicationGroup protected ()
    extends typingsSlinky.atPulumiAws.elasticacheReplicationGroupMod.ReplicationGroup {
    /**
      * Create a ReplicationGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ReplicationGroupArgs) = this()
    def this(name: String, args: ReplicationGroupArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class SecurityGroup protected ()
    extends typingsSlinky.atPulumiAws.elasticacheSecurityGroupMod.SecurityGroup {
    /**
      * Create a SecurityGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: SecurityGroupArgs) = this()
    def this(name: String, args: SecurityGroupArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class SubnetGroup protected ()
    extends typingsSlinky.atPulumiAws.elasticacheSubnetGroupMod.SubnetGroup {
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
  
  def getCluster(args: GetClusterArgs): js.Promise[GetClusterResult] with GetClusterResult = js.native
  def getCluster(args: GetClusterArgs, opts: InvokeOptions): js.Promise[GetClusterResult] with GetClusterResult = js.native
  def getReplicationGroup(args: GetReplicationGroupArgs): js.Promise[GetReplicationGroupResult] with GetReplicationGroupResult = js.native
  def getReplicationGroup(args: GetReplicationGroupArgs, opts: InvokeOptions): js.Promise[GetReplicationGroupResult] with GetReplicationGroupResult = js.native
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
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.elasticacheClusterMod.Cluster = js.native
    def get(name: String, id: Input[ID], state: ClusterState): typingsSlinky.atPulumiAws.elasticacheClusterMod.Cluster = js.native
    def get(name: String, id: Input[ID], state: ClusterState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.elasticacheClusterMod.Cluster = js.native
    /**
      * Returns true if the given object is an instance of Cluster.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticache/cluster.Cluster */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.elasticacheParameterGroupMod.ParameterGroup = js.native
    def get(name: String, id: Input[ID], state: ParameterGroupState): typingsSlinky.atPulumiAws.elasticacheParameterGroupMod.ParameterGroup = js.native
    def get(name: String, id: Input[ID], state: ParameterGroupState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.elasticacheParameterGroupMod.ParameterGroup = js.native
    /**
      * Returns true if the given object is an instance of ParameterGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticache/parameterGroup.ParameterGroup */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ReplicationGroup extends js.Object {
    /**
      * Get an existing ReplicationGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.elasticacheReplicationGroupMod.ReplicationGroup = js.native
    def get(name: String, id: Input[ID], state: ReplicationGroupState): typingsSlinky.atPulumiAws.elasticacheReplicationGroupMod.ReplicationGroup = js.native
    def get(name: String, id: Input[ID], state: ReplicationGroupState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.elasticacheReplicationGroupMod.ReplicationGroup = js.native
    /**
      * Returns true if the given object is an instance of ReplicationGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticache/replicationGroup.ReplicationGroup */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object SecurityGroup extends js.Object {
    /**
      * Get an existing SecurityGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.elasticacheSecurityGroupMod.SecurityGroup = js.native
    def get(name: String, id: Input[ID], state: SecurityGroupState): typingsSlinky.atPulumiAws.elasticacheSecurityGroupMod.SecurityGroup = js.native
    def get(name: String, id: Input[ID], state: SecurityGroupState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.elasticacheSecurityGroupMod.SecurityGroup = js.native
    /**
      * Returns true if the given object is an instance of SecurityGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticache/securityGroup.SecurityGroup */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.elasticacheSubnetGroupMod.SubnetGroup = js.native
    def get(name: String, id: Input[ID], state: SubnetGroupState): typingsSlinky.atPulumiAws.elasticacheSubnetGroupMod.SubnetGroup = js.native
    def get(name: String, id: Input[ID], state: SubnetGroupState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.elasticacheSubnetGroupMod.SubnetGroup = js.native
    /**
      * Returns true if the given object is an instance of SubnetGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticache/subnetGroup.SubnetGroup */ Boolean = js.native
  }
  
}

