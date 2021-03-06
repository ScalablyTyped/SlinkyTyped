package typingsSlinky.pulumiAws.mod

import typingsSlinky.pulumiAws.getOrderableClusterMod.GetOrderableClusterArgs
import typingsSlinky.pulumiAws.getOrderableClusterMod.GetOrderableClusterResult
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object redshift {
  
  @JSImport("@pulumi/aws", "redshift.Cluster")
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
    @JSImport("@pulumi/aws", "redshift.Cluster.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.redshiftClusterMod.Cluster = js.native
    @JSImport("@pulumi/aws", "redshift.Cluster.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.redshiftClusterMod.Cluster = js.native
    @JSImport("@pulumi/aws", "redshift.Cluster.get")
    @js.native
    def get(name: String, id: Input[ID], state: ClusterState): typingsSlinky.pulumiAws.redshiftClusterMod.Cluster = js.native
    @JSImport("@pulumi/aws", "redshift.Cluster.get")
    @js.native
    def get(name: String, id: Input[ID], state: ClusterState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.redshiftClusterMod.Cluster = js.native
    
    /**
      * Returns true if the given object is an instance of Cluster.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "redshift.Cluster.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/redshift/cluster.Cluster */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "redshift.EventSubscription")
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
    @JSImport("@pulumi/aws", "redshift.EventSubscription.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.redshiftEventSubscriptionMod.EventSubscription = js.native
    @JSImport("@pulumi/aws", "redshift.EventSubscription.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.redshiftEventSubscriptionMod.EventSubscription = js.native
    @JSImport("@pulumi/aws", "redshift.EventSubscription.get")
    @js.native
    def get(name: String, id: Input[ID], state: EventSubscriptionState): typingsSlinky.pulumiAws.redshiftEventSubscriptionMod.EventSubscription = js.native
    @JSImport("@pulumi/aws", "redshift.EventSubscription.get")
    @js.native
    def get(name: String, id: Input[ID], state: EventSubscriptionState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.redshiftEventSubscriptionMod.EventSubscription = js.native
    
    /**
      * Returns true if the given object is an instance of EventSubscription.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "redshift.EventSubscription.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/redshift/eventSubscription.EventSubscription */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "redshift.ParameterGroup")
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
    @JSImport("@pulumi/aws", "redshift.ParameterGroup.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.redshiftParameterGroupMod.ParameterGroup = js.native
    @JSImport("@pulumi/aws", "redshift.ParameterGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.redshiftParameterGroupMod.ParameterGroup = js.native
    @JSImport("@pulumi/aws", "redshift.ParameterGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: ParameterGroupState): typingsSlinky.pulumiAws.redshiftParameterGroupMod.ParameterGroup = js.native
    @JSImport("@pulumi/aws", "redshift.ParameterGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: ParameterGroupState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.redshiftParameterGroupMod.ParameterGroup = js.native
    
    /**
      * Returns true if the given object is an instance of ParameterGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "redshift.ParameterGroup.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/redshift/parameterGroup.ParameterGroup */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "redshift.SecurityGroup")
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
  /* static members */
  object SecurityGroup {
    
    /**
      * Get an existing SecurityGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "redshift.SecurityGroup.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.redshiftSecurityGroupMod.SecurityGroup = js.native
    @JSImport("@pulumi/aws", "redshift.SecurityGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.redshiftSecurityGroupMod.SecurityGroup = js.native
    @JSImport("@pulumi/aws", "redshift.SecurityGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: SecurityGroupState): typingsSlinky.pulumiAws.redshiftSecurityGroupMod.SecurityGroup = js.native
    @JSImport("@pulumi/aws", "redshift.SecurityGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: SecurityGroupState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.redshiftSecurityGroupMod.SecurityGroup = js.native
    
    /**
      * Returns true if the given object is an instance of SecurityGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "redshift.SecurityGroup.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/redshift/securityGroup.SecurityGroup */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "redshift.SnapshotCopyGrant")
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
  /* static members */
  object SnapshotCopyGrant {
    
    /**
      * Get an existing SnapshotCopyGrant resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "redshift.SnapshotCopyGrant.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.snapshotCopyGrantMod.SnapshotCopyGrant = js.native
    @JSImport("@pulumi/aws", "redshift.SnapshotCopyGrant.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.snapshotCopyGrantMod.SnapshotCopyGrant = js.native
    @JSImport("@pulumi/aws", "redshift.SnapshotCopyGrant.get")
    @js.native
    def get(name: String, id: Input[ID], state: SnapshotCopyGrantState): typingsSlinky.pulumiAws.snapshotCopyGrantMod.SnapshotCopyGrant = js.native
    @JSImport("@pulumi/aws", "redshift.SnapshotCopyGrant.get")
    @js.native
    def get(name: String, id: Input[ID], state: SnapshotCopyGrantState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.snapshotCopyGrantMod.SnapshotCopyGrant = js.native
    
    /**
      * Returns true if the given object is an instance of SnapshotCopyGrant.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "redshift.SnapshotCopyGrant.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/redshift/snapshotCopyGrant.SnapshotCopyGrant */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "redshift.SnapshotSchedule")
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
  /* static members */
  object SnapshotSchedule {
    
    /**
      * Get an existing SnapshotSchedule resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "redshift.SnapshotSchedule.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.snapshotScheduleMod.SnapshotSchedule = js.native
    @JSImport("@pulumi/aws", "redshift.SnapshotSchedule.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.snapshotScheduleMod.SnapshotSchedule = js.native
    @JSImport("@pulumi/aws", "redshift.SnapshotSchedule.get")
    @js.native
    def get(name: String, id: Input[ID], state: SnapshotScheduleState): typingsSlinky.pulumiAws.snapshotScheduleMod.SnapshotSchedule = js.native
    @JSImport("@pulumi/aws", "redshift.SnapshotSchedule.get")
    @js.native
    def get(name: String, id: Input[ID], state: SnapshotScheduleState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.snapshotScheduleMod.SnapshotSchedule = js.native
    
    /**
      * Returns true if the given object is an instance of SnapshotSchedule.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "redshift.SnapshotSchedule.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/redshift/snapshotSchedule.SnapshotSchedule */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "redshift.SnapshotScheduleAssociation")
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
  /* static members */
  object SnapshotScheduleAssociation {
    
    /**
      * Get an existing SnapshotScheduleAssociation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "redshift.SnapshotScheduleAssociation.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.snapshotScheduleAssociationMod.SnapshotScheduleAssociation = js.native
    @JSImport("@pulumi/aws", "redshift.SnapshotScheduleAssociation.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.snapshotScheduleAssociationMod.SnapshotScheduleAssociation = js.native
    @JSImport("@pulumi/aws", "redshift.SnapshotScheduleAssociation.get")
    @js.native
    def get(name: String, id: Input[ID], state: SnapshotScheduleAssociationState): typingsSlinky.pulumiAws.snapshotScheduleAssociationMod.SnapshotScheduleAssociation = js.native
    @JSImport("@pulumi/aws", "redshift.SnapshotScheduleAssociation.get")
    @js.native
    def get(name: String, id: Input[ID], state: SnapshotScheduleAssociationState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.snapshotScheduleAssociationMod.SnapshotScheduleAssociation = js.native
    
    /**
      * Returns true if the given object is an instance of SnapshotScheduleAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "redshift.SnapshotScheduleAssociation.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/redshift/snapshotScheduleAssociation.SnapshotScheduleAssociation */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "redshift.SubnetGroup")
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
    @JSImport("@pulumi/aws", "redshift.SubnetGroup.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.redshiftSubnetGroupMod.SubnetGroup = js.native
    @JSImport("@pulumi/aws", "redshift.SubnetGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.redshiftSubnetGroupMod.SubnetGroup = js.native
    @JSImport("@pulumi/aws", "redshift.SubnetGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: SubnetGroupState): typingsSlinky.pulumiAws.redshiftSubnetGroupMod.SubnetGroup = js.native
    @JSImport("@pulumi/aws", "redshift.SubnetGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: SubnetGroupState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.redshiftSubnetGroupMod.SubnetGroup = js.native
    
    /**
      * Returns true if the given object is an instance of SubnetGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "redshift.SubnetGroup.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/redshift/subnetGroup.SubnetGroup */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "redshift.getCluster")
  @js.native
  def getCluster(args: GetClusterArgs): js.Promise[GetClusterResult] = js.native
  @JSImport("@pulumi/aws", "redshift.getCluster")
  @js.native
  def getCluster(args: GetClusterArgs, opts: InvokeOptions): js.Promise[GetClusterResult] = js.native
  
  @JSImport("@pulumi/aws", "redshift.getOrderableCluster")
  @js.native
  def getOrderableCluster(): js.Promise[GetOrderableClusterResult] = js.native
  @JSImport("@pulumi/aws", "redshift.getOrderableCluster")
  @js.native
  def getOrderableCluster(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetOrderableClusterResult] = js.native
  @JSImport("@pulumi/aws", "redshift.getOrderableCluster")
  @js.native
  def getOrderableCluster(args: GetOrderableClusterArgs): js.Promise[GetOrderableClusterResult] = js.native
  @JSImport("@pulumi/aws", "redshift.getOrderableCluster")
  @js.native
  def getOrderableCluster(args: GetOrderableClusterArgs, opts: InvokeOptions): js.Promise[GetOrderableClusterResult] = js.native
  
  @JSImport("@pulumi/aws", "redshift.getServiceAccount")
  @js.native
  def getServiceAccount(): js.Promise[GetServiceAccountResult] = js.native
  @JSImport("@pulumi/aws", "redshift.getServiceAccount")
  @js.native
  def getServiceAccount(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetServiceAccountResult] = js.native
  @JSImport("@pulumi/aws", "redshift.getServiceAccount")
  @js.native
  def getServiceAccount(args: GetServiceAccountArgs): js.Promise[GetServiceAccountResult] = js.native
  @JSImport("@pulumi/aws", "redshift.getServiceAccount")
  @js.native
  def getServiceAccount(args: GetServiceAccountArgs, opts: InvokeOptions): js.Promise[GetServiceAccountResult] = js.native
}
