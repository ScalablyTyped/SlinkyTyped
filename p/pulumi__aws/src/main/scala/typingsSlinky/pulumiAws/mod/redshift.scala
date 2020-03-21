package typingsSlinky.pulumiAws.mod

import typingsSlinky.pulumiAws.redshiftClusterMod.ClusterArgs
import typingsSlinky.pulumiAws.redshiftClusterMod.ClusterState
import typingsSlinky.pulumiAws.redshiftEventSubscriptionMod.EventSubscriptionArgs
import typingsSlinky.pulumiAws.redshiftEventSubscriptionMod.EventSubscriptionState
import typingsSlinky.pulumiAws.redshiftGetClusterMod.GetClusterArgs
import typingsSlinky.pulumiAws.redshiftGetClusterMod.GetClusterResult
import typingsSlinky.pulumiAws.redshiftGetServiceAccountMod.GetServiceAccountArgs
import typingsSlinky.pulumiAws.redshiftGetServiceAccountMod.GetServiceAccountResult
import typingsSlinky.pulumiAws.redshiftParameterGroupMod.ParameterGroupArgs
import typingsSlinky.pulumiAws.redshiftParameterGroupMod.ParameterGroupState
import typingsSlinky.pulumiAws.redshiftSecurityGroupMod.SecurityGroupArgs
import typingsSlinky.pulumiAws.redshiftSecurityGroupMod.SecurityGroupState
import typingsSlinky.pulumiAws.redshiftSubnetGroupMod.SubnetGroupArgs
import typingsSlinky.pulumiAws.redshiftSubnetGroupMod.SubnetGroupState
import typingsSlinky.pulumiAws.snapshotCopyGrantMod.SnapshotCopyGrantArgs
import typingsSlinky.pulumiAws.snapshotCopyGrantMod.SnapshotCopyGrantState
import typingsSlinky.pulumiAws.snapshotScheduleAssociationMod.SnapshotScheduleAssociationArgs
import typingsSlinky.pulumiAws.snapshotScheduleAssociationMod.SnapshotScheduleAssociationState
import typingsSlinky.pulumiAws.snapshotScheduleMod.SnapshotScheduleArgs
import typingsSlinky.pulumiAws.snapshotScheduleMod.SnapshotScheduleState
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "redshift")
@js.native
object redshift extends js.Object {
  @js.native
  class Cluster protected ()
    extends typingsSlinky.pulumiAws.redshiftMod.Cluster {
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
  class EventSubscription protected ()
    extends typingsSlinky.pulumiAws.redshiftMod.EventSubscription {
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
    extends typingsSlinky.pulumiAws.redshiftMod.ParameterGroup {
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
  class SecurityGroup protected ()
    extends typingsSlinky.pulumiAws.redshiftMod.SecurityGroup {
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
  class SnapshotCopyGrant protected ()
    extends typingsSlinky.pulumiAws.redshiftMod.SnapshotCopyGrant {
    /**
      * Create a SnapshotCopyGrant resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: SnapshotCopyGrantArgs) = this()
    def this(name: String, args: SnapshotCopyGrantArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class SnapshotSchedule protected ()
    extends typingsSlinky.pulumiAws.redshiftMod.SnapshotSchedule {
    /**
      * Create a SnapshotSchedule resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: SnapshotScheduleArgs) = this()
    def this(name: String, args: SnapshotScheduleArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class SnapshotScheduleAssociation protected ()
    extends typingsSlinky.pulumiAws.redshiftMod.SnapshotScheduleAssociation {
    /**
      * Create a SnapshotScheduleAssociation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: SnapshotScheduleAssociationArgs) = this()
    def this(name: String, args: SnapshotScheduleAssociationArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class SubnetGroup protected ()
    extends typingsSlinky.pulumiAws.redshiftMod.SubnetGroup {
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
  def getServiceAccount(): js.Promise[GetServiceAccountResult] with GetServiceAccountResult = js.native
  def getServiceAccount(args: GetServiceAccountArgs): js.Promise[GetServiceAccountResult] with GetServiceAccountResult = js.native
  def getServiceAccount(args: GetServiceAccountArgs, opts: InvokeOptions): js.Promise[GetServiceAccountResult] with GetServiceAccountResult = js.native
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
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.redshiftClusterMod.Cluster = js.native
    def get(name: String, id: Input[ID], state: ClusterState): typingsSlinky.pulumiAws.redshiftClusterMod.Cluster = js.native
    def get(name: String, id: Input[ID], state: ClusterState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.redshiftClusterMod.Cluster = js.native
    /**
      * Returns true if the given object is an instance of Cluster.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/redshift/cluster.Cluster */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.redshiftEventSubscriptionMod.EventSubscription = js.native
    def get(name: String, id: Input[ID], state: EventSubscriptionState): typingsSlinky.pulumiAws.redshiftEventSubscriptionMod.EventSubscription = js.native
    def get(name: String, id: Input[ID], state: EventSubscriptionState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.redshiftEventSubscriptionMod.EventSubscription = js.native
    /**
      * Returns true if the given object is an instance of EventSubscription.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/redshift/eventSubscription.EventSubscription */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.redshiftParameterGroupMod.ParameterGroup = js.native
    def get(name: String, id: Input[ID], state: ParameterGroupState): typingsSlinky.pulumiAws.redshiftParameterGroupMod.ParameterGroup = js.native
    def get(name: String, id: Input[ID], state: ParameterGroupState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.redshiftParameterGroupMod.ParameterGroup = js.native
    /**
      * Returns true if the given object is an instance of ParameterGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/redshift/parameterGroup.ParameterGroup */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.redshiftSecurityGroupMod.SecurityGroup = js.native
    def get(name: String, id: Input[ID], state: SecurityGroupState): typingsSlinky.pulumiAws.redshiftSecurityGroupMod.SecurityGroup = js.native
    def get(name: String, id: Input[ID], state: SecurityGroupState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.redshiftSecurityGroupMod.SecurityGroup = js.native
    /**
      * Returns true if the given object is an instance of SecurityGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/redshift/securityGroup.SecurityGroup */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object SnapshotCopyGrant extends js.Object {
    /**
      * Get an existing SnapshotCopyGrant resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.snapshotCopyGrantMod.SnapshotCopyGrant = js.native
    def get(name: String, id: Input[ID], state: SnapshotCopyGrantState): typingsSlinky.pulumiAws.snapshotCopyGrantMod.SnapshotCopyGrant = js.native
    def get(name: String, id: Input[ID], state: SnapshotCopyGrantState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.snapshotCopyGrantMod.SnapshotCopyGrant = js.native
    /**
      * Returns true if the given object is an instance of SnapshotCopyGrant.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/redshift/snapshotCopyGrant.SnapshotCopyGrant */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object SnapshotSchedule extends js.Object {
    /**
      * Get an existing SnapshotSchedule resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.snapshotScheduleMod.SnapshotSchedule = js.native
    def get(name: String, id: Input[ID], state: SnapshotScheduleState): typingsSlinky.pulumiAws.snapshotScheduleMod.SnapshotSchedule = js.native
    def get(name: String, id: Input[ID], state: SnapshotScheduleState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.snapshotScheduleMod.SnapshotSchedule = js.native
    /**
      * Returns true if the given object is an instance of SnapshotSchedule.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/redshift/snapshotSchedule.SnapshotSchedule */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object SnapshotScheduleAssociation extends js.Object {
    /**
      * Get an existing SnapshotScheduleAssociation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.snapshotScheduleAssociationMod.SnapshotScheduleAssociation = js.native
    def get(name: String, id: Input[ID], state: SnapshotScheduleAssociationState): typingsSlinky.pulumiAws.snapshotScheduleAssociationMod.SnapshotScheduleAssociation = js.native
    def get(name: String, id: Input[ID], state: SnapshotScheduleAssociationState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.snapshotScheduleAssociationMod.SnapshotScheduleAssociation = js.native
    /**
      * Returns true if the given object is an instance of SnapshotScheduleAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/redshift/snapshotScheduleAssociation.SnapshotScheduleAssociation */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.redshiftSubnetGroupMod.SubnetGroup = js.native
    def get(name: String, id: Input[ID], state: SubnetGroupState): typingsSlinky.pulumiAws.redshiftSubnetGroupMod.SubnetGroup = js.native
    def get(name: String, id: Input[ID], state: SubnetGroupState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.redshiftSubnetGroupMod.SubnetGroup = js.native
    /**
      * Returns true if the given object is an instance of SubnetGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/redshift/subnetGroup.SubnetGroup */ Boolean = js.native
  }
  
}

