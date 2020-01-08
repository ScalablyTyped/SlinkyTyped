package typingsSlinky.atPulumiAws

import typingsSlinky.atPulumiAws.redshiftClusterMod.ClusterArgs
import typingsSlinky.atPulumiAws.redshiftClusterMod.ClusterState
import typingsSlinky.atPulumiAws.redshiftEventSubscriptionMod.EventSubscriptionArgs
import typingsSlinky.atPulumiAws.redshiftEventSubscriptionMod.EventSubscriptionState
import typingsSlinky.atPulumiAws.redshiftGetClusterMod.GetClusterArgs
import typingsSlinky.atPulumiAws.redshiftGetClusterMod.GetClusterResult
import typingsSlinky.atPulumiAws.redshiftGetServiceAccountMod.GetServiceAccountArgs
import typingsSlinky.atPulumiAws.redshiftGetServiceAccountMod.GetServiceAccountResult
import typingsSlinky.atPulumiAws.redshiftParameterGroupMod.ParameterGroupArgs
import typingsSlinky.atPulumiAws.redshiftParameterGroupMod.ParameterGroupState
import typingsSlinky.atPulumiAws.redshiftSecurityGroupMod.SecurityGroupArgs
import typingsSlinky.atPulumiAws.redshiftSecurityGroupMod.SecurityGroupState
import typingsSlinky.atPulumiAws.redshiftSnapshotCopyGrantMod.SnapshotCopyGrantArgs
import typingsSlinky.atPulumiAws.redshiftSnapshotCopyGrantMod.SnapshotCopyGrantState
import typingsSlinky.atPulumiAws.redshiftSnapshotScheduleAssociationMod.SnapshotScheduleAssociationArgs
import typingsSlinky.atPulumiAws.redshiftSnapshotScheduleAssociationMod.SnapshotScheduleAssociationState
import typingsSlinky.atPulumiAws.redshiftSnapshotScheduleMod.SnapshotScheduleArgs
import typingsSlinky.atPulumiAws.redshiftSnapshotScheduleMod.SnapshotScheduleState
import typingsSlinky.atPulumiAws.redshiftSubnetGroupMod.SubnetGroupArgs
import typingsSlinky.atPulumiAws.redshiftSubnetGroupMod.SubnetGroupState
import typingsSlinky.atPulumiPulumi.invokeMod.InvokeOptions
import typingsSlinky.atPulumiPulumi.outputMod.Input
import typingsSlinky.atPulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/redshift", JSImport.Namespace)
@js.native
object redshiftMod extends js.Object {
  @js.native
  class Cluster protected ()
    extends typingsSlinky.atPulumiAws.redshiftClusterMod.Cluster {
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
    extends typingsSlinky.atPulumiAws.redshiftEventSubscriptionMod.EventSubscription {
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
    extends typingsSlinky.atPulumiAws.redshiftParameterGroupMod.ParameterGroup {
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
    extends typingsSlinky.atPulumiAws.redshiftSecurityGroupMod.SecurityGroup {
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
    extends typingsSlinky.atPulumiAws.redshiftSnapshotCopyGrantMod.SnapshotCopyGrant {
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
    extends typingsSlinky.atPulumiAws.redshiftSnapshotScheduleMod.SnapshotSchedule {
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
    extends typingsSlinky.atPulumiAws.redshiftSnapshotScheduleAssociationMod.SnapshotScheduleAssociation {
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
    extends typingsSlinky.atPulumiAws.redshiftSubnetGroupMod.SubnetGroup {
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
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.redshiftClusterMod.Cluster = js.native
    def get(name: String, id: Input[ID], state: ClusterState): typingsSlinky.atPulumiAws.redshiftClusterMod.Cluster = js.native
    def get(name: String, id: Input[ID], state: ClusterState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.redshiftClusterMod.Cluster = js.native
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
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.redshiftEventSubscriptionMod.EventSubscription = js.native
    def get(name: String, id: Input[ID], state: EventSubscriptionState): typingsSlinky.atPulumiAws.redshiftEventSubscriptionMod.EventSubscription = js.native
    def get(name: String, id: Input[ID], state: EventSubscriptionState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.redshiftEventSubscriptionMod.EventSubscription = js.native
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
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.redshiftParameterGroupMod.ParameterGroup = js.native
    def get(name: String, id: Input[ID], state: ParameterGroupState): typingsSlinky.atPulumiAws.redshiftParameterGroupMod.ParameterGroup = js.native
    def get(name: String, id: Input[ID], state: ParameterGroupState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.redshiftParameterGroupMod.ParameterGroup = js.native
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
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.redshiftSecurityGroupMod.SecurityGroup = js.native
    def get(name: String, id: Input[ID], state: SecurityGroupState): typingsSlinky.atPulumiAws.redshiftSecurityGroupMod.SecurityGroup = js.native
    def get(name: String, id: Input[ID], state: SecurityGroupState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.redshiftSecurityGroupMod.SecurityGroup = js.native
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
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.redshiftSnapshotCopyGrantMod.SnapshotCopyGrant = js.native
    def get(name: String, id: Input[ID], state: SnapshotCopyGrantState): typingsSlinky.atPulumiAws.redshiftSnapshotCopyGrantMod.SnapshotCopyGrant = js.native
    def get(name: String, id: Input[ID], state: SnapshotCopyGrantState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.redshiftSnapshotCopyGrantMod.SnapshotCopyGrant = js.native
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
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.redshiftSnapshotScheduleMod.SnapshotSchedule = js.native
    def get(name: String, id: Input[ID], state: SnapshotScheduleState): typingsSlinky.atPulumiAws.redshiftSnapshotScheduleMod.SnapshotSchedule = js.native
    def get(name: String, id: Input[ID], state: SnapshotScheduleState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.redshiftSnapshotScheduleMod.SnapshotSchedule = js.native
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
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.redshiftSnapshotScheduleAssociationMod.SnapshotScheduleAssociation = js.native
    def get(name: String, id: Input[ID], state: SnapshotScheduleAssociationState): typingsSlinky.atPulumiAws.redshiftSnapshotScheduleAssociationMod.SnapshotScheduleAssociation = js.native
    def get(name: String, id: Input[ID], state: SnapshotScheduleAssociationState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.redshiftSnapshotScheduleAssociationMod.SnapshotScheduleAssociation = js.native
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
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.redshiftSubnetGroupMod.SubnetGroup = js.native
    def get(name: String, id: Input[ID], state: SubnetGroupState): typingsSlinky.atPulumiAws.redshiftSubnetGroupMod.SubnetGroup = js.native
    def get(name: String, id: Input[ID], state: SubnetGroupState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.redshiftSubnetGroupMod.SubnetGroup = js.native
    /**
      * Returns true if the given object is an instance of SubnetGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/redshift/subnetGroup.SubnetGroup */ Boolean = js.native
  }
  
}

