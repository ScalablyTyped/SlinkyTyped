package typingsSlinky.pulumiAws

import typingsSlinky.pulumiAws.clusterEndpointMod.ClusterEndpointArgs
import typingsSlinky.pulumiAws.clusterEndpointMod.ClusterEndpointState
import typingsSlinky.pulumiAws.enumsRdsMod.EngineMode
import typingsSlinky.pulumiAws.enumsRdsMod.EngineType
import typingsSlinky.pulumiAws.enumsRdsMod.InstanceType
import typingsSlinky.pulumiAws.enumsRdsMod.StorageType
import typingsSlinky.pulumiAws.getClusterSnapshotMod.GetClusterSnapshotArgs
import typingsSlinky.pulumiAws.getClusterSnapshotMod.GetClusterSnapshotResult
import typingsSlinky.pulumiAws.getEventCategoriesMod.GetEventCategoriesArgs
import typingsSlinky.pulumiAws.getEventCategoriesMod.GetEventCategoriesResult
import typingsSlinky.pulumiAws.getSubnetGroupMod.GetSubnetGroupArgs
import typingsSlinky.pulumiAws.getSubnetGroupMod.GetSubnetGroupResult
import typingsSlinky.pulumiAws.globalClusterMod.GlobalClusterArgs
import typingsSlinky.pulumiAws.globalClusterMod.GlobalClusterState
import typingsSlinky.pulumiAws.optionGroupMod.OptionGroupArgs
import typingsSlinky.pulumiAws.optionGroupMod.OptionGroupState
import typingsSlinky.pulumiAws.proxyDefaultTargetGroupMod.ProxyDefaultTargetGroupArgs
import typingsSlinky.pulumiAws.proxyDefaultTargetGroupMod.ProxyDefaultTargetGroupState
import typingsSlinky.pulumiAws.proxyMod.ProxyArgs
import typingsSlinky.pulumiAws.proxyMod.ProxyState
import typingsSlinky.pulumiAws.proxyTargetMod.ProxyTargetArgs
import typingsSlinky.pulumiAws.proxyTargetMod.ProxyTargetState
import typingsSlinky.pulumiAws.pulumiAwsStrings.`aurora-mysql`
import typingsSlinky.pulumiAws.pulumiAwsStrings.`aurora-postgresql`
import typingsSlinky.pulumiAws.pulumiAwsStrings.aurora
import typingsSlinky.pulumiAws.pulumiAwsStrings.dbDotm1Dotlarge
import typingsSlinky.pulumiAws.pulumiAwsStrings.dbDotm1Dotmedium
import typingsSlinky.pulumiAws.pulumiAwsStrings.dbDotm1Dotsmall
import typingsSlinky.pulumiAws.pulumiAwsStrings.dbDotm1Dotxlarge
import typingsSlinky.pulumiAws.pulumiAwsStrings.dbDotm2Dot2xlarge
import typingsSlinky.pulumiAws.pulumiAwsStrings.dbDotm2Dot4xlarge
import typingsSlinky.pulumiAws.pulumiAwsStrings.dbDotm2Dotxlarge
import typingsSlinky.pulumiAws.pulumiAwsStrings.dbDotm3Dot2xlarge
import typingsSlinky.pulumiAws.pulumiAwsStrings.dbDotm3Dotlarge
import typingsSlinky.pulumiAws.pulumiAwsStrings.dbDotm3Dotmedium
import typingsSlinky.pulumiAws.pulumiAwsStrings.dbDotm3Dotxlarge
import typingsSlinky.pulumiAws.pulumiAwsStrings.dbDotm4Dot10xlarge
import typingsSlinky.pulumiAws.pulumiAwsStrings.dbDotm4Dot2xlarge
import typingsSlinky.pulumiAws.pulumiAwsStrings.dbDotm4Dot4xlarge
import typingsSlinky.pulumiAws.pulumiAwsStrings.dbDotm4Dotlarge
import typingsSlinky.pulumiAws.pulumiAwsStrings.dbDotm4Dotxlarge
import typingsSlinky.pulumiAws.pulumiAwsStrings.dbDotm5Dot12xlarge
import typingsSlinky.pulumiAws.pulumiAwsStrings.dbDotm5Dot24xlarge
import typingsSlinky.pulumiAws.pulumiAwsStrings.dbDotm5Dot2xlarge
import typingsSlinky.pulumiAws.pulumiAwsStrings.dbDotm5Dot4xlarge
import typingsSlinky.pulumiAws.pulumiAwsStrings.dbDotm5Dotlarge
import typingsSlinky.pulumiAws.pulumiAwsStrings.dbDotm5Dotxlarge
import typingsSlinky.pulumiAws.pulumiAwsStrings.dbDotr3Dot2xlarge
import typingsSlinky.pulumiAws.pulumiAwsStrings.dbDotr3Dot4xlarge
import typingsSlinky.pulumiAws.pulumiAwsStrings.dbDotr3Dot8xlarge
import typingsSlinky.pulumiAws.pulumiAwsStrings.dbDotr3Dotlarge
import typingsSlinky.pulumiAws.pulumiAwsStrings.dbDotr3Dotxlarge
import typingsSlinky.pulumiAws.pulumiAwsStrings.dbDotr4Dot16xlarge
import typingsSlinky.pulumiAws.pulumiAwsStrings.dbDotr4Dot2xlarge
import typingsSlinky.pulumiAws.pulumiAwsStrings.dbDotr4Dot4xlarge
import typingsSlinky.pulumiAws.pulumiAwsStrings.dbDotr4Dot8xlarge
import typingsSlinky.pulumiAws.pulumiAwsStrings.dbDotr4Dotlarge
import typingsSlinky.pulumiAws.pulumiAwsStrings.dbDotr4Dotxlarge
import typingsSlinky.pulumiAws.pulumiAwsStrings.dbDotr5Dot12xlarge
import typingsSlinky.pulumiAws.pulumiAwsStrings.dbDotr5Dot24xlarge
import typingsSlinky.pulumiAws.pulumiAwsStrings.dbDotr5Dot2xlarge
import typingsSlinky.pulumiAws.pulumiAwsStrings.dbDotr5Dot4xlarge
import typingsSlinky.pulumiAws.pulumiAwsStrings.dbDotr5Dotlarge
import typingsSlinky.pulumiAws.pulumiAwsStrings.dbDotr5Dotxlarge
import typingsSlinky.pulumiAws.pulumiAwsStrings.dbDott2Dot2xlarge
import typingsSlinky.pulumiAws.pulumiAwsStrings.dbDott2Dotlarge
import typingsSlinky.pulumiAws.pulumiAwsStrings.dbDott2Dotmedium
import typingsSlinky.pulumiAws.pulumiAwsStrings.dbDott2Dotmicro
import typingsSlinky.pulumiAws.pulumiAwsStrings.dbDott2Dotsmall
import typingsSlinky.pulumiAws.pulumiAwsStrings.dbDott2Dotxlarge
import typingsSlinky.pulumiAws.pulumiAwsStrings.dbDott3Dot2xlarge
import typingsSlinky.pulumiAws.pulumiAwsStrings.dbDott3Dotlarge
import typingsSlinky.pulumiAws.pulumiAwsStrings.dbDott3Dotmedium
import typingsSlinky.pulumiAws.pulumiAwsStrings.dbDott3Dotmicro
import typingsSlinky.pulumiAws.pulumiAwsStrings.dbDott3Dotsmall
import typingsSlinky.pulumiAws.pulumiAwsStrings.dbDott3Dotxlarge
import typingsSlinky.pulumiAws.pulumiAwsStrings.dbDotx1Dot16xlarge
import typingsSlinky.pulumiAws.pulumiAwsStrings.dbDotx1Dot32xlarge
import typingsSlinky.pulumiAws.pulumiAwsStrings.dbDotx1eDot2xlarge
import typingsSlinky.pulumiAws.pulumiAwsStrings.dbDotx1eDot32xlarge
import typingsSlinky.pulumiAws.pulumiAwsStrings.dbDotx1eDot4xlarge
import typingsSlinky.pulumiAws.pulumiAwsStrings.dbDotx1eDot8xlarge
import typingsSlinky.pulumiAws.pulumiAwsStrings.dbDotx1eDotxlarge
import typingsSlinky.pulumiAws.pulumiAwsStrings.global
import typingsSlinky.pulumiAws.pulumiAwsStrings.gp2
import typingsSlinky.pulumiAws.pulumiAwsStrings.io1
import typingsSlinky.pulumiAws.pulumiAwsStrings.parallelquery
import typingsSlinky.pulumiAws.pulumiAwsStrings.provisioned
import typingsSlinky.pulumiAws.pulumiAwsStrings.serverless
import typingsSlinky.pulumiAws.pulumiAwsStrings.standard
import typingsSlinky.pulumiAws.rdsClusterInstanceMod.ClusterInstanceArgs
import typingsSlinky.pulumiAws.rdsClusterInstanceMod.ClusterInstanceState
import typingsSlinky.pulumiAws.rdsClusterMod.ClusterArgs
import typingsSlinky.pulumiAws.rdsClusterMod.ClusterState
import typingsSlinky.pulumiAws.rdsClusterParameterGroupMod.ClusterParameterGroupArgs
import typingsSlinky.pulumiAws.rdsClusterParameterGroupMod.ClusterParameterGroupState
import typingsSlinky.pulumiAws.rdsClusterSnapshotMod.ClusterSnapshotArgs
import typingsSlinky.pulumiAws.rdsClusterSnapshotMod.ClusterSnapshotState
import typingsSlinky.pulumiAws.rdsEventSubscriptionMod.EventSubscriptionArgs
import typingsSlinky.pulumiAws.rdsEventSubscriptionMod.EventSubscriptionState
import typingsSlinky.pulumiAws.rdsGetCertificateMod.GetCertificateArgs
import typingsSlinky.pulumiAws.rdsGetCertificateMod.GetCertificateResult
import typingsSlinky.pulumiAws.rdsGetClusterMod.GetClusterArgs
import typingsSlinky.pulumiAws.rdsGetClusterMod.GetClusterResult
import typingsSlinky.pulumiAws.rdsGetEngineVersionMod.GetEngineVersionArgs
import typingsSlinky.pulumiAws.rdsGetEngineVersionMod.GetEngineVersionResult
import typingsSlinky.pulumiAws.rdsGetInstanceMod.GetInstanceArgs
import typingsSlinky.pulumiAws.rdsGetInstanceMod.GetInstanceResult
import typingsSlinky.pulumiAws.rdsGetOrderableDbInstanceMod.GetOrderableDbInstanceArgs
import typingsSlinky.pulumiAws.rdsGetOrderableDbInstanceMod.GetOrderableDbInstanceResult
import typingsSlinky.pulumiAws.rdsGetSnapshotMod.GetSnapshotArgs
import typingsSlinky.pulumiAws.rdsGetSnapshotMod.GetSnapshotResult
import typingsSlinky.pulumiAws.rdsInstanceMod.InstanceArgs
import typingsSlinky.pulumiAws.rdsInstanceMod.InstanceState
import typingsSlinky.pulumiAws.rdsParameterGroupMod.ParameterGroupArgs
import typingsSlinky.pulumiAws.rdsParameterGroupMod.ParameterGroupState
import typingsSlinky.pulumiAws.rdsSecurityGroupMod.SecurityGroupArgs
import typingsSlinky.pulumiAws.rdsSecurityGroupMod.SecurityGroupState
import typingsSlinky.pulumiAws.rdsSnapshotMod.SnapshotArgs
import typingsSlinky.pulumiAws.rdsSnapshotMod.SnapshotState
import typingsSlinky.pulumiAws.rdsSubnetGroupMod.SubnetGroupArgs
import typingsSlinky.pulumiAws.rdsSubnetGroupMod.SubnetGroupState
import typingsSlinky.pulumiAws.roleAssociationMod.RoleAssociationArgs
import typingsSlinky.pulumiAws.roleAssociationMod.RoleAssociationState
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rdsMod {
  
  @JSImport("@pulumi/aws/rds", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pulumi/aws/rds", "AuroraEngine")
  @js.native
  def AuroraEngine: EngineType = js.native
  @scala.inline
  def AuroraEngine_=(x: EngineType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AuroraEngine")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws/rds", "AuroraMysqlEngine")
  @js.native
  def AuroraMysqlEngine: EngineType = js.native
  @scala.inline
  def AuroraMysqlEngine_=(x: EngineType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AuroraMysqlEngine")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws/rds", "AuroraPostgresqlEngine")
  @js.native
  def AuroraPostgresqlEngine: EngineType = js.native
  @scala.inline
  def AuroraPostgresqlEngine_=(x: EngineType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AuroraPostgresqlEngine")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws/rds", "Cluster")
  @js.native
  class Cluster protected ()
    extends typingsSlinky.pulumiAws.rdsClusterMod.Cluster {
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
    @JSImport("@pulumi/aws/rds", "Cluster.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.rdsClusterMod.Cluster = js.native
    @JSImport("@pulumi/aws/rds", "Cluster.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.rdsClusterMod.Cluster = js.native
    @JSImport("@pulumi/aws/rds", "Cluster.get")
    @js.native
    def get(name: String, id: Input[ID], state: ClusterState): typingsSlinky.pulumiAws.rdsClusterMod.Cluster = js.native
    @JSImport("@pulumi/aws/rds", "Cluster.get")
    @js.native
    def get(name: String, id: Input[ID], state: ClusterState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.rdsClusterMod.Cluster = js.native
    
    /**
      * Returns true if the given object is an instance of Cluster.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/rds", "Cluster.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/cluster.Cluster */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/rds", "ClusterEndpoint")
  @js.native
  class ClusterEndpoint protected ()
    extends typingsSlinky.pulumiAws.clusterEndpointMod.ClusterEndpoint {
    /**
      * Create a ClusterEndpoint resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ClusterEndpointArgs) = this()
    def this(name: String, args: ClusterEndpointArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ClusterEndpoint {
    
    /**
      * Get an existing ClusterEndpoint resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/rds", "ClusterEndpoint.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.clusterEndpointMod.ClusterEndpoint = js.native
    @JSImport("@pulumi/aws/rds", "ClusterEndpoint.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.clusterEndpointMod.ClusterEndpoint = js.native
    @JSImport("@pulumi/aws/rds", "ClusterEndpoint.get")
    @js.native
    def get(name: String, id: Input[ID], state: ClusterEndpointState): typingsSlinky.pulumiAws.clusterEndpointMod.ClusterEndpoint = js.native
    @JSImport("@pulumi/aws/rds", "ClusterEndpoint.get")
    @js.native
    def get(name: String, id: Input[ID], state: ClusterEndpointState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.clusterEndpointMod.ClusterEndpoint = js.native
    
    /**
      * Returns true if the given object is an instance of ClusterEndpoint.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/rds", "ClusterEndpoint.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/clusterEndpoint.ClusterEndpoint */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/rds", "ClusterInstance")
  @js.native
  class ClusterInstance protected ()
    extends typingsSlinky.pulumiAws.rdsClusterInstanceMod.ClusterInstance {
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
    @JSImport("@pulumi/aws/rds", "ClusterInstance.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.rdsClusterInstanceMod.ClusterInstance = js.native
    @JSImport("@pulumi/aws/rds", "ClusterInstance.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.rdsClusterInstanceMod.ClusterInstance = js.native
    @JSImport("@pulumi/aws/rds", "ClusterInstance.get")
    @js.native
    def get(name: String, id: Input[ID], state: ClusterInstanceState): typingsSlinky.pulumiAws.rdsClusterInstanceMod.ClusterInstance = js.native
    @JSImport("@pulumi/aws/rds", "ClusterInstance.get")
    @js.native
    def get(name: String, id: Input[ID], state: ClusterInstanceState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.rdsClusterInstanceMod.ClusterInstance = js.native
    
    /**
      * Returns true if the given object is an instance of ClusterInstance.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/rds", "ClusterInstance.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/clusterInstance.ClusterInstance */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/rds", "ClusterParameterGroup")
  @js.native
  class ClusterParameterGroup protected ()
    extends typingsSlinky.pulumiAws.rdsClusterParameterGroupMod.ClusterParameterGroup {
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
    @JSImport("@pulumi/aws/rds", "ClusterParameterGroup.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.rdsClusterParameterGroupMod.ClusterParameterGroup = js.native
    @JSImport("@pulumi/aws/rds", "ClusterParameterGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.rdsClusterParameterGroupMod.ClusterParameterGroup = js.native
    @JSImport("@pulumi/aws/rds", "ClusterParameterGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: ClusterParameterGroupState): typingsSlinky.pulumiAws.rdsClusterParameterGroupMod.ClusterParameterGroup = js.native
    @JSImport("@pulumi/aws/rds", "ClusterParameterGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: ClusterParameterGroupState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.rdsClusterParameterGroupMod.ClusterParameterGroup = js.native
    
    /**
      * Returns true if the given object is an instance of ClusterParameterGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/rds", "ClusterParameterGroup.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/clusterParameterGroup.ClusterParameterGroup */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/rds", "ClusterSnapshot")
  @js.native
  class ClusterSnapshot protected ()
    extends typingsSlinky.pulumiAws.rdsClusterSnapshotMod.ClusterSnapshot {
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
    @JSImport("@pulumi/aws/rds", "ClusterSnapshot.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.rdsClusterSnapshotMod.ClusterSnapshot = js.native
    @JSImport("@pulumi/aws/rds", "ClusterSnapshot.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.rdsClusterSnapshotMod.ClusterSnapshot = js.native
    @JSImport("@pulumi/aws/rds", "ClusterSnapshot.get")
    @js.native
    def get(name: String, id: Input[ID], state: ClusterSnapshotState): typingsSlinky.pulumiAws.rdsClusterSnapshotMod.ClusterSnapshot = js.native
    @JSImport("@pulumi/aws/rds", "ClusterSnapshot.get")
    @js.native
    def get(name: String, id: Input[ID], state: ClusterSnapshotState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.rdsClusterSnapshotMod.ClusterSnapshot = js.native
    
    /**
      * Returns true if the given object is an instance of ClusterSnapshot.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/rds", "ClusterSnapshot.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/clusterSnapshot.ClusterSnapshot */ Boolean = js.native
  }
  
  object EngineMode {
    
    @JSImport("@pulumi/aws/rds", "EngineMode.Global")
    @js.native
    val Global: global = js.native
    
    @JSImport("@pulumi/aws/rds", "EngineMode.ParallelQuery")
    @js.native
    val ParallelQuery: parallelquery = js.native
    
    @JSImport("@pulumi/aws/rds", "EngineMode.Provisioned")
    @js.native
    val Provisioned: provisioned = js.native
    
    @JSImport("@pulumi/aws/rds", "EngineMode.Serverless")
    @js.native
    val Serverless: serverless = js.native
  }
  
  object EngineType {
    
    @JSImport("@pulumi/aws/rds", "EngineType.Aurora")
    @js.native
    val Aurora: aurora = js.native
    
    @JSImport("@pulumi/aws/rds", "EngineType.AuroraMysql")
    @js.native
    val AuroraMysql: `aurora-mysql` = js.native
    
    @JSImport("@pulumi/aws/rds", "EngineType.AuroraPostgresql")
    @js.native
    val AuroraPostgresql: `aurora-postgresql` = js.native
  }
  
  @JSImport("@pulumi/aws/rds", "EventSubscription")
  @js.native
  class EventSubscription protected ()
    extends typingsSlinky.pulumiAws.rdsEventSubscriptionMod.EventSubscription {
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
    @JSImport("@pulumi/aws/rds", "EventSubscription.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.rdsEventSubscriptionMod.EventSubscription = js.native
    @JSImport("@pulumi/aws/rds", "EventSubscription.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.rdsEventSubscriptionMod.EventSubscription = js.native
    @JSImport("@pulumi/aws/rds", "EventSubscription.get")
    @js.native
    def get(name: String, id: Input[ID], state: EventSubscriptionState): typingsSlinky.pulumiAws.rdsEventSubscriptionMod.EventSubscription = js.native
    @JSImport("@pulumi/aws/rds", "EventSubscription.get")
    @js.native
    def get(name: String, id: Input[ID], state: EventSubscriptionState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.rdsEventSubscriptionMod.EventSubscription = js.native
    
    /**
      * Returns true if the given object is an instance of EventSubscription.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/rds", "EventSubscription.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/eventSubscription.EventSubscription */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/rds", "GlobalCluster")
  @js.native
  class GlobalCluster protected ()
    extends typingsSlinky.pulumiAws.globalClusterMod.GlobalCluster {
    /**
      * Create a GlobalCluster resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: GlobalClusterArgs) = this()
    def this(name: String, args: GlobalClusterArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object GlobalCluster {
    
    /**
      * Get an existing GlobalCluster resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/rds", "GlobalCluster.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.globalClusterMod.GlobalCluster = js.native
    @JSImport("@pulumi/aws/rds", "GlobalCluster.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.globalClusterMod.GlobalCluster = js.native
    @JSImport("@pulumi/aws/rds", "GlobalCluster.get")
    @js.native
    def get(name: String, id: Input[ID], state: GlobalClusterState): typingsSlinky.pulumiAws.globalClusterMod.GlobalCluster = js.native
    @JSImport("@pulumi/aws/rds", "GlobalCluster.get")
    @js.native
    def get(name: String, id: Input[ID], state: GlobalClusterState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.globalClusterMod.GlobalCluster = js.native
    
    /**
      * Returns true if the given object is an instance of GlobalCluster.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/rds", "GlobalCluster.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/globalCluster.GlobalCluster */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/rds", "GlobalEngine")
  @js.native
  def GlobalEngine: EngineMode = js.native
  @scala.inline
  def GlobalEngine_=(x: EngineMode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GlobalEngine")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws/rds", "Instance")
  @js.native
  class Instance protected ()
    extends typingsSlinky.pulumiAws.rdsInstanceMod.Instance {
    /**
      * Create a Instance resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: InstanceArgs) = this()
    def this(name: String, args: InstanceArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Instance {
    
    /**
      * Get an existing Instance resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/rds", "Instance.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.rdsInstanceMod.Instance = js.native
    @JSImport("@pulumi/aws/rds", "Instance.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.rdsInstanceMod.Instance = js.native
    @JSImport("@pulumi/aws/rds", "Instance.get")
    @js.native
    def get(name: String, id: Input[ID], state: InstanceState): typingsSlinky.pulumiAws.rdsInstanceMod.Instance = js.native
    @JSImport("@pulumi/aws/rds", "Instance.get")
    @js.native
    def get(name: String, id: Input[ID], state: InstanceState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.rdsInstanceMod.Instance = js.native
    
    /**
      * Returns true if the given object is an instance of Instance.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/rds", "Instance.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/instance.Instance */ Boolean = js.native
  }
  
  object InstanceType {
    
    @JSImport("@pulumi/aws/rds", "InstanceType.M1_Large")
    @js.native
    val M1Large: dbDotm1Dotlarge = js.native
    
    @JSImport("@pulumi/aws/rds", "InstanceType.M1_Medium")
    @js.native
    val M1Medium: dbDotm1Dotmedium = js.native
    
    @JSImport("@pulumi/aws/rds", "InstanceType.M1_Small")
    @js.native
    val M1Small: dbDotm1Dotsmall = js.native
    
    @JSImport("@pulumi/aws/rds", "InstanceType.M1_XLarge")
    @js.native
    val M1XLarge: dbDotm1Dotxlarge = js.native
    
    @JSImport("@pulumi/aws/rds", "InstanceType.M2_2XLarge")
    @js.native
    val M22XLarge: dbDotm2Dot2xlarge = js.native
    
    @JSImport("@pulumi/aws/rds", "InstanceType.M2_4XLarge")
    @js.native
    val M24XLarge: dbDotm2Dot4xlarge = js.native
    
    @JSImport("@pulumi/aws/rds", "InstanceType.M2_XLarge")
    @js.native
    val M2XLarge: dbDotm2Dotxlarge = js.native
    
    @JSImport("@pulumi/aws/rds", "InstanceType.M3_2XLarge")
    @js.native
    val M32XLarge: dbDotm3Dot2xlarge = js.native
    
    @JSImport("@pulumi/aws/rds", "InstanceType.M3_Large")
    @js.native
    val M3Large: dbDotm3Dotlarge = js.native
    
    @JSImport("@pulumi/aws/rds", "InstanceType.M3_Medium")
    @js.native
    val M3Medium: dbDotm3Dotmedium = js.native
    
    @JSImport("@pulumi/aws/rds", "InstanceType.M3_XLarge")
    @js.native
    val M3XLarge: dbDotm3Dotxlarge = js.native
    
    @JSImport("@pulumi/aws/rds", "InstanceType.M4_10XLarge")
    @js.native
    val M410XLarge: dbDotm4Dot10xlarge = js.native
    
    @JSImport("@pulumi/aws/rds", "InstanceType.M4_16XLarge")
    @js.native
    val M416XLarge: dbDotm4Dot10xlarge = js.native
    
    @JSImport("@pulumi/aws/rds", "InstanceType.M4_2XLarge")
    @js.native
    val M42XLarge: dbDotm4Dot2xlarge = js.native
    
    @JSImport("@pulumi/aws/rds", "InstanceType.M4_4XLarge")
    @js.native
    val M44XLarge: dbDotm4Dot4xlarge = js.native
    
    @JSImport("@pulumi/aws/rds", "InstanceType.M4_Large")
    @js.native
    val M4Large: dbDotm4Dotlarge = js.native
    
    @JSImport("@pulumi/aws/rds", "InstanceType.M4_XLarge")
    @js.native
    val M4XLarge: dbDotm4Dotxlarge = js.native
    
    @JSImport("@pulumi/aws/rds", "InstanceType.M5_12XLarge")
    @js.native
    val M512XLarge: dbDotm5Dot12xlarge = js.native
    
    @JSImport("@pulumi/aws/rds", "InstanceType.M5_24XLarge")
    @js.native
    val M524XLarge: dbDotm5Dot24xlarge = js.native
    
    @JSImport("@pulumi/aws/rds", "InstanceType.M5_2XLarge")
    @js.native
    val M52XLarge: dbDotm5Dot2xlarge = js.native
    
    @JSImport("@pulumi/aws/rds", "InstanceType.M5_4XLarge")
    @js.native
    val M54XLarge: dbDotm5Dot4xlarge = js.native
    
    @JSImport("@pulumi/aws/rds", "InstanceType.M5_Large")
    @js.native
    val M5Large: dbDotm5Dotlarge = js.native
    
    @JSImport("@pulumi/aws/rds", "InstanceType.M5_XLarge")
    @js.native
    val M5XLarge: dbDotm5Dotxlarge = js.native
    
    @JSImport("@pulumi/aws/rds", "InstanceType.R3_2XLarge")
    @js.native
    val R32XLarge: dbDotr3Dot2xlarge = js.native
    
    @JSImport("@pulumi/aws/rds", "InstanceType.R3_4XLarge")
    @js.native
    val R34XLarge: dbDotr3Dot4xlarge = js.native
    
    @JSImport("@pulumi/aws/rds", "InstanceType.R3_8XLarge")
    @js.native
    val R38XLarge: dbDotr3Dot8xlarge = js.native
    
    @JSImport("@pulumi/aws/rds", "InstanceType.R3_Large")
    @js.native
    val R3Large: dbDotr3Dotlarge = js.native
    
    @JSImport("@pulumi/aws/rds", "InstanceType.R3_XLarge")
    @js.native
    val R3XLarge: dbDotr3Dotxlarge = js.native
    
    @JSImport("@pulumi/aws/rds", "InstanceType.R4_16XLarge")
    @js.native
    val R416XLarge: dbDotr4Dot16xlarge = js.native
    
    @JSImport("@pulumi/aws/rds", "InstanceType.R4_2XLarge")
    @js.native
    val R42XLarge: dbDotr4Dot2xlarge = js.native
    
    @JSImport("@pulumi/aws/rds", "InstanceType.R4_4XLarge")
    @js.native
    val R44XLarge: dbDotr4Dot4xlarge = js.native
    
    @JSImport("@pulumi/aws/rds", "InstanceType.R4_8XLarge")
    @js.native
    val R48XLarge: dbDotr4Dot8xlarge = js.native
    
    @JSImport("@pulumi/aws/rds", "InstanceType.R4_Large")
    @js.native
    val R4Large: dbDotr4Dotlarge = js.native
    
    @JSImport("@pulumi/aws/rds", "InstanceType.R4_XLarge")
    @js.native
    val R4XLarge: dbDotr4Dotxlarge = js.native
    
    @JSImport("@pulumi/aws/rds", "InstanceType.R5_12XLarge")
    @js.native
    val R512XLarge: dbDotr5Dot12xlarge = js.native
    
    @JSImport("@pulumi/aws/rds", "InstanceType.R5_24XLarge")
    @js.native
    val R524XLarge: dbDotr5Dot24xlarge = js.native
    
    @JSImport("@pulumi/aws/rds", "InstanceType.R5_2XLarge")
    @js.native
    val R52XLarge: dbDotr5Dot2xlarge = js.native
    
    @JSImport("@pulumi/aws/rds", "InstanceType.R5_4XLarge")
    @js.native
    val R54XLarge: dbDotr5Dot4xlarge = js.native
    
    @JSImport("@pulumi/aws/rds", "InstanceType.R5_Large")
    @js.native
    val R5Large: dbDotr5Dotlarge = js.native
    
    @JSImport("@pulumi/aws/rds", "InstanceType.R5_XLarge")
    @js.native
    val R5XLarge: dbDotr5Dotxlarge = js.native
    
    @JSImport("@pulumi/aws/rds", "InstanceType.T2_2XLarge")
    @js.native
    val T22XLarge: dbDott2Dot2xlarge = js.native
    
    @JSImport("@pulumi/aws/rds", "InstanceType.T2_Large")
    @js.native
    val T2Large: dbDott2Dotlarge = js.native
    
    @JSImport("@pulumi/aws/rds", "InstanceType.T2_Medium")
    @js.native
    val T2Medium: dbDott2Dotmedium = js.native
    
    @JSImport("@pulumi/aws/rds", "InstanceType.T2_Micro")
    @js.native
    val T2Micro: dbDott2Dotmicro = js.native
    
    @JSImport("@pulumi/aws/rds", "InstanceType.T2_Small")
    @js.native
    val T2Small: dbDott2Dotsmall = js.native
    
    @JSImport("@pulumi/aws/rds", "InstanceType.T2_XLarge")
    @js.native
    val T2XLarge: dbDott2Dotxlarge = js.native
    
    @JSImport("@pulumi/aws/rds", "InstanceType.T3_2XLarge")
    @js.native
    val T32XLarge: dbDott3Dot2xlarge = js.native
    
    @JSImport("@pulumi/aws/rds", "InstanceType.T3_Large")
    @js.native
    val T3Large: dbDott3Dotlarge = js.native
    
    @JSImport("@pulumi/aws/rds", "InstanceType.T3_Medium")
    @js.native
    val T3Medium: dbDott3Dotmedium = js.native
    
    @JSImport("@pulumi/aws/rds", "InstanceType.T3_Micro")
    @js.native
    val T3Micro: dbDott3Dotmicro = js.native
    
    @JSImport("@pulumi/aws/rds", "InstanceType.T3_Small")
    @js.native
    val T3Small: dbDott3Dotsmall = js.native
    
    @JSImport("@pulumi/aws/rds", "InstanceType.T3_XLarge")
    @js.native
    val T3XLarge: dbDott3Dotxlarge = js.native
    
    @JSImport("@pulumi/aws/rds", "InstanceType.X1_16XLarge")
    @js.native
    val X116XLarge: dbDotx1Dot16xlarge = js.native
    
    @JSImport("@pulumi/aws/rds", "InstanceType.X1_32XLarge")
    @js.native
    val X132XLarge: dbDotx1Dot32xlarge = js.native
    
    @JSImport("@pulumi/aws/rds", "InstanceType.X1E_2XLarge")
    @js.native
    val X1E2XLarge: dbDotx1eDot2xlarge = js.native
    
    @JSImport("@pulumi/aws/rds", "InstanceType.X1E_32XLarge")
    @js.native
    val X1E32XLarge: dbDotx1eDot32xlarge = js.native
    
    @JSImport("@pulumi/aws/rds", "InstanceType.X1E_4XLarge")
    @js.native
    val X1E4XLarge: dbDotx1eDot4xlarge = js.native
    
    @JSImport("@pulumi/aws/rds", "InstanceType.X1E_8XLarge")
    @js.native
    val X1E8XLarge: dbDotx1eDot8xlarge = js.native
    
    @JSImport("@pulumi/aws/rds", "InstanceType.X1E_XLarge")
    @js.native
    val X1EXLarge: dbDotx1eDotxlarge = js.native
  }
  
  object InstanceTypes {
    
    /** Use InstanceType.M1_Large instead. */
    @JSImport("@pulumi/aws/rds", "InstanceTypes.M1_Large")
    @js.native
    val M1Large: InstanceType = js.native
    
    /** Use InstanceType.M1_Medium instead. */
    @JSImport("@pulumi/aws/rds", "InstanceTypes.M1_Medium")
    @js.native
    val M1Medium: InstanceType = js.native
    
    /** Use InstanceType.M1_Small instead. */
    @JSImport("@pulumi/aws/rds", "InstanceTypes.M1_Small")
    @js.native
    val M1Small: InstanceType = js.native
    
    /** Use InstanceType.M1_XLarge instead. */
    @JSImport("@pulumi/aws/rds", "InstanceTypes.M1_XLarge")
    @js.native
    val M1XLarge: InstanceType = js.native
    
    /** Use InstanceType.M2_2XLarge instead. */
    @JSImport("@pulumi/aws/rds", "InstanceTypes.M2_2XLarge")
    @js.native
    val M22XLarge: InstanceType = js.native
    
    /** Use InstanceType.M2_4XLarge instead. */
    @JSImport("@pulumi/aws/rds", "InstanceTypes.M2_4XLarge")
    @js.native
    val M24XLarge: InstanceType = js.native
    
    /** Use InstanceType.M2_XLarge instead. */
    @JSImport("@pulumi/aws/rds", "InstanceTypes.M2_XLarge")
    @js.native
    val M2XLarge: InstanceType = js.native
    
    /** Use InstanceType.M3_2XLarge instead. */
    @JSImport("@pulumi/aws/rds", "InstanceTypes.M3_2XLarge")
    @js.native
    val M32XLarge: InstanceType = js.native
    
    /** Use InstanceType.M3_Large instead. */
    @JSImport("@pulumi/aws/rds", "InstanceTypes.M3_Large")
    @js.native
    val M3Large: InstanceType = js.native
    
    /** Use InstanceType.M3_Medium instead. */
    @JSImport("@pulumi/aws/rds", "InstanceTypes.M3_Medium")
    @js.native
    val M3Medium: InstanceType = js.native
    
    /** Use InstanceType.M3_XLarge instead. */
    @JSImport("@pulumi/aws/rds", "InstanceTypes.M3_XLarge")
    @js.native
    val M3XLarge: InstanceType = js.native
    
    /** Use InstanceType.M4_10XLarge instead. */
    @JSImport("@pulumi/aws/rds", "InstanceTypes.M4_10XLarge")
    @js.native
    val M410XLarge: InstanceType = js.native
    
    /** Use InstanceType.M4_16XLarge instead. */
    @JSImport("@pulumi/aws/rds", "InstanceTypes.M4_16XLarge")
    @js.native
    val M416XLarge: InstanceType = js.native
    
    /** Use InstanceType.M4_2XLarge instead. */
    @JSImport("@pulumi/aws/rds", "InstanceTypes.M4_2XLarge")
    @js.native
    val M42XLarge: InstanceType = js.native
    
    /** Use InstanceType.M4_4XLarge instead. */
    @JSImport("@pulumi/aws/rds", "InstanceTypes.M4_4XLarge")
    @js.native
    val M44XLarge: InstanceType = js.native
    
    /** Use InstanceType.M4_Large instead. */
    @JSImport("@pulumi/aws/rds", "InstanceTypes.M4_Large")
    @js.native
    val M4Large: InstanceType = js.native
    
    /** Use InstanceType.M4_XLarge instead. */
    @JSImport("@pulumi/aws/rds", "InstanceTypes.M4_XLarge")
    @js.native
    val M4XLarge: InstanceType = js.native
    
    /** Use InstanceType.M5_12XLarge instead. */
    @JSImport("@pulumi/aws/rds", "InstanceTypes.M5_12XLarge")
    @js.native
    val M512XLarge: InstanceType = js.native
    
    /** Use InstanceType.M5_24XLarge instead. */
    @JSImport("@pulumi/aws/rds", "InstanceTypes.M5_24XLarge")
    @js.native
    val M524XLarge: InstanceType = js.native
    
    /** Use InstanceType.M5_2XLarge instead. */
    @JSImport("@pulumi/aws/rds", "InstanceTypes.M5_2XLarge")
    @js.native
    val M52XLarge: InstanceType = js.native
    
    /** Use InstanceType.M5_4XLarge instead. */
    @JSImport("@pulumi/aws/rds", "InstanceTypes.M5_4XLarge")
    @js.native
    val M54XLarge: InstanceType = js.native
    
    /** Use InstanceType.M5_Large instead. */
    @JSImport("@pulumi/aws/rds", "InstanceTypes.M5_Large")
    @js.native
    val M5Large: InstanceType = js.native
    
    /** Use InstanceType.M5_XLarge instead. */
    @JSImport("@pulumi/aws/rds", "InstanceTypes.M5_XLarge")
    @js.native
    val M5XLarge: InstanceType = js.native
    
    /** Use InstanceType.R3_2XLarge instead. */
    @JSImport("@pulumi/aws/rds", "InstanceTypes.R3_2XLarge")
    @js.native
    val R32XLarge: InstanceType = js.native
    
    /** Use InstanceType.R3_4XLarge instead. */
    @JSImport("@pulumi/aws/rds", "InstanceTypes.R3_4XLarge")
    @js.native
    val R34XLarge: InstanceType = js.native
    
    /** Use InstanceType.R3_8XLarge instead. */
    @JSImport("@pulumi/aws/rds", "InstanceTypes.R3_8XLarge")
    @js.native
    val R38XLarge: InstanceType = js.native
    
    /** Use InstanceType.R3_Large instead. */
    @JSImport("@pulumi/aws/rds", "InstanceTypes.R3_Large")
    @js.native
    val R3Large: InstanceType = js.native
    
    /** Use InstanceType.R3_XLarge instead. */
    @JSImport("@pulumi/aws/rds", "InstanceTypes.R3_XLarge")
    @js.native
    val R3XLarge: InstanceType = js.native
    
    /** Use InstanceType.R4_16XLarge instead. */
    @JSImport("@pulumi/aws/rds", "InstanceTypes.R4_16XLarge")
    @js.native
    val R416XLarge: InstanceType = js.native
    
    /** Use InstanceType.R4_2XLarge instead. */
    @JSImport("@pulumi/aws/rds", "InstanceTypes.R4_2XLarge")
    @js.native
    val R42XLarge: InstanceType = js.native
    
    /** Use InstanceType.R4_4XLarge instead. */
    @JSImport("@pulumi/aws/rds", "InstanceTypes.R4_4XLarge")
    @js.native
    val R44XLarge: InstanceType = js.native
    
    /** Use InstanceType.R4_8XLarge instead. */
    @JSImport("@pulumi/aws/rds", "InstanceTypes.R4_8XLarge")
    @js.native
    val R48XLarge: InstanceType = js.native
    
    /** Use InstanceType.R4_Large instead. */
    @JSImport("@pulumi/aws/rds", "InstanceTypes.R4_Large")
    @js.native
    val R4Large: InstanceType = js.native
    
    /** Use InstanceType.R4_XLarge instead. */
    @JSImport("@pulumi/aws/rds", "InstanceTypes.R4_XLarge")
    @js.native
    val R4XLarge: InstanceType = js.native
    
    /** Use InstanceType.R5_12XLarge instead. */
    @JSImport("@pulumi/aws/rds", "InstanceTypes.R5_12XLarge")
    @js.native
    val R512XLarge: InstanceType = js.native
    
    /** Use InstanceType.R5_24XLarge instead. */
    @JSImport("@pulumi/aws/rds", "InstanceTypes.R5_24XLarge")
    @js.native
    val R524XLarge: InstanceType = js.native
    
    /** Use InstanceType.R5_2XLarge instead. */
    @JSImport("@pulumi/aws/rds", "InstanceTypes.R5_2XLarge")
    @js.native
    val R52XLarge: InstanceType = js.native
    
    /** Use InstanceType.R5_4XLarge instead. */
    @JSImport("@pulumi/aws/rds", "InstanceTypes.R5_4XLarge")
    @js.native
    val R54XLarge: InstanceType = js.native
    
    /** Use InstanceType.R5_Large instead. */
    @JSImport("@pulumi/aws/rds", "InstanceTypes.R5_Large")
    @js.native
    val R5Large: InstanceType = js.native
    
    /** Use InstanceType.R5_XLarge instead. */
    @JSImport("@pulumi/aws/rds", "InstanceTypes.R5_XLarge")
    @js.native
    val R5XLarge: InstanceType = js.native
    
    /** Use InstanceType.T2_2XLarge instead. */
    @JSImport("@pulumi/aws/rds", "InstanceTypes.T2_2XLarge")
    @js.native
    val T22XLarge: InstanceType = js.native
    
    /** Use InstanceType.T2_Large instead. */
    @JSImport("@pulumi/aws/rds", "InstanceTypes.T2_Large")
    @js.native
    val T2Large: InstanceType = js.native
    
    /** Use InstanceType.T2_Medium instead. */
    @JSImport("@pulumi/aws/rds", "InstanceTypes.T2_Medium")
    @js.native
    val T2Medium: InstanceType = js.native
    
    /** Use InstanceType.T2_Micro instead. */
    @JSImport("@pulumi/aws/rds", "InstanceTypes.T2_Micro")
    @js.native
    val T2Micro: InstanceType = js.native
    
    /** Use InstanceType.T2_Small instead. */
    @JSImport("@pulumi/aws/rds", "InstanceTypes.T2_Small")
    @js.native
    val T2Small: InstanceType = js.native
    
    /** Use InstanceType.T2_XLarge instead. */
    @JSImport("@pulumi/aws/rds", "InstanceTypes.T2_XLarge")
    @js.native
    val T2XLarge: InstanceType = js.native
    
    /** Use InstanceType.T3_2XLarge instead. */
    @JSImport("@pulumi/aws/rds", "InstanceTypes.T3_2XLarge")
    @js.native
    val T32XLarge: InstanceType = js.native
    
    /** Use InstanceType.T3_Large instead. */
    @JSImport("@pulumi/aws/rds", "InstanceTypes.T3_Large")
    @js.native
    val T3Large: InstanceType = js.native
    
    /** Use InstanceType.T3_Medium instead. */
    @JSImport("@pulumi/aws/rds", "InstanceTypes.T3_Medium")
    @js.native
    val T3Medium: InstanceType = js.native
    
    /** Use InstanceType.T3_Micro instead. */
    @JSImport("@pulumi/aws/rds", "InstanceTypes.T3_Micro")
    @js.native
    val T3Micro: InstanceType = js.native
    
    /** Use InstanceType.T3_Small instead. */
    @JSImport("@pulumi/aws/rds", "InstanceTypes.T3_Small")
    @js.native
    val T3Small: InstanceType = js.native
    
    /** Use InstanceType.T3_XLarge instead. */
    @JSImport("@pulumi/aws/rds", "InstanceTypes.T3_XLarge")
    @js.native
    val T3XLarge: InstanceType = js.native
    
    /** Use InstanceType.X1_16XLarge instead. */
    @JSImport("@pulumi/aws/rds", "InstanceTypes.X1_16XLarge")
    @js.native
    val X116XLarge: InstanceType = js.native
    
    /** Use InstanceType.X1_32XLarge instead. */
    @JSImport("@pulumi/aws/rds", "InstanceTypes.X1_32XLarge")
    @js.native
    val X132XLarge: InstanceType = js.native
    
    /** Use InstanceType.X1E_2XLarge instead. */
    @JSImport("@pulumi/aws/rds", "InstanceTypes.X1E_2XLarge")
    @js.native
    val X1E2XLarge: InstanceType = js.native
    
    /** Use InstanceType.X1E_32XLarge instead. */
    @JSImport("@pulumi/aws/rds", "InstanceTypes.X1E_32XLarge")
    @js.native
    val X1E32XLarge: InstanceType = js.native
    
    /** Use InstanceType.X1E_4XLarge instead. */
    @JSImport("@pulumi/aws/rds", "InstanceTypes.X1E_4XLarge")
    @js.native
    val X1E4XLarge: InstanceType = js.native
    
    /** Use InstanceType.X1E_8XLarge instead. */
    @JSImport("@pulumi/aws/rds", "InstanceTypes.X1E_8XLarge")
    @js.native
    val X1E8XLarge: InstanceType = js.native
    
    /** Use InstanceType.X1E_XLarge instead. */
    @JSImport("@pulumi/aws/rds", "InstanceTypes.X1E_XLarge")
    @js.native
    val X1EXLarge: InstanceType = js.native
  }
  
  @JSImport("@pulumi/aws/rds", "OptionGroup")
  @js.native
  class OptionGroup protected ()
    extends typingsSlinky.pulumiAws.optionGroupMod.OptionGroup {
    /**
      * Create a OptionGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: OptionGroupArgs) = this()
    def this(name: String, args: OptionGroupArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object OptionGroup {
    
    /**
      * Get an existing OptionGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/rds", "OptionGroup.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.optionGroupMod.OptionGroup = js.native
    @JSImport("@pulumi/aws/rds", "OptionGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.optionGroupMod.OptionGroup = js.native
    @JSImport("@pulumi/aws/rds", "OptionGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: OptionGroupState): typingsSlinky.pulumiAws.optionGroupMod.OptionGroup = js.native
    @JSImport("@pulumi/aws/rds", "OptionGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: OptionGroupState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.optionGroupMod.OptionGroup = js.native
    
    /**
      * Returns true if the given object is an instance of OptionGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/rds", "OptionGroup.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/optionGroup.OptionGroup */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/rds", "ParallelQueryEngine")
  @js.native
  def ParallelQueryEngine: EngineMode = js.native
  @scala.inline
  def ParallelQueryEngine_=(x: EngineMode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ParallelQueryEngine")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws/rds", "ParameterGroup")
  @js.native
  class ParameterGroup protected ()
    extends typingsSlinky.pulumiAws.rdsParameterGroupMod.ParameterGroup {
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
    @JSImport("@pulumi/aws/rds", "ParameterGroup.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.rdsParameterGroupMod.ParameterGroup = js.native
    @JSImport("@pulumi/aws/rds", "ParameterGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.rdsParameterGroupMod.ParameterGroup = js.native
    @JSImport("@pulumi/aws/rds", "ParameterGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: ParameterGroupState): typingsSlinky.pulumiAws.rdsParameterGroupMod.ParameterGroup = js.native
    @JSImport("@pulumi/aws/rds", "ParameterGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: ParameterGroupState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.rdsParameterGroupMod.ParameterGroup = js.native
    
    /**
      * Returns true if the given object is an instance of ParameterGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/rds", "ParameterGroup.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/parameterGroup.ParameterGroup */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/rds", "ProvisionedEngine")
  @js.native
  def ProvisionedEngine: EngineMode = js.native
  @scala.inline
  def ProvisionedEngine_=(x: EngineMode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ProvisionedEngine")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws/rds", "Proxy")
  @js.native
  class Proxy protected ()
    extends typingsSlinky.pulumiAws.proxyMod.Proxy {
    /**
      * Create a Proxy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ProxyArgs) = this()
    def this(name: String, args: ProxyArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Proxy {
    
    /**
      * Get an existing Proxy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/rds", "Proxy.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.proxyMod.Proxy = js.native
    @JSImport("@pulumi/aws/rds", "Proxy.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.proxyMod.Proxy = js.native
    @JSImport("@pulumi/aws/rds", "Proxy.get")
    @js.native
    def get(name: String, id: Input[ID], state: ProxyState): typingsSlinky.pulumiAws.proxyMod.Proxy = js.native
    @JSImport("@pulumi/aws/rds", "Proxy.get")
    @js.native
    def get(name: String, id: Input[ID], state: ProxyState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.proxyMod.Proxy = js.native
    
    /**
      * Returns true if the given object is an instance of Proxy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/rds", "Proxy.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/proxy.Proxy */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/rds", "ProxyDefaultTargetGroup")
  @js.native
  class ProxyDefaultTargetGroup protected ()
    extends typingsSlinky.pulumiAws.proxyDefaultTargetGroupMod.ProxyDefaultTargetGroup {
    /**
      * Create a ProxyDefaultTargetGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ProxyDefaultTargetGroupArgs) = this()
    def this(name: String, args: ProxyDefaultTargetGroupArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ProxyDefaultTargetGroup {
    
    /**
      * Get an existing ProxyDefaultTargetGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/rds", "ProxyDefaultTargetGroup.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.proxyDefaultTargetGroupMod.ProxyDefaultTargetGroup = js.native
    @JSImport("@pulumi/aws/rds", "ProxyDefaultTargetGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.proxyDefaultTargetGroupMod.ProxyDefaultTargetGroup = js.native
    @JSImport("@pulumi/aws/rds", "ProxyDefaultTargetGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: ProxyDefaultTargetGroupState): typingsSlinky.pulumiAws.proxyDefaultTargetGroupMod.ProxyDefaultTargetGroup = js.native
    @JSImport("@pulumi/aws/rds", "ProxyDefaultTargetGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: ProxyDefaultTargetGroupState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.proxyDefaultTargetGroupMod.ProxyDefaultTargetGroup = js.native
    
    /**
      * Returns true if the given object is an instance of ProxyDefaultTargetGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/rds", "ProxyDefaultTargetGroup.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/proxyDefaultTargetGroup.ProxyDefaultTargetGroup */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/rds", "ProxyTarget")
  @js.native
  class ProxyTarget protected ()
    extends typingsSlinky.pulumiAws.proxyTargetMod.ProxyTarget {
    /**
      * Create a ProxyTarget resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ProxyTargetArgs) = this()
    def this(name: String, args: ProxyTargetArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ProxyTarget {
    
    /**
      * Get an existing ProxyTarget resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/rds", "ProxyTarget.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.proxyTargetMod.ProxyTarget = js.native
    @JSImport("@pulumi/aws/rds", "ProxyTarget.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.proxyTargetMod.ProxyTarget = js.native
    @JSImport("@pulumi/aws/rds", "ProxyTarget.get")
    @js.native
    def get(name: String, id: Input[ID], state: ProxyTargetState): typingsSlinky.pulumiAws.proxyTargetMod.ProxyTarget = js.native
    @JSImport("@pulumi/aws/rds", "ProxyTarget.get")
    @js.native
    def get(name: String, id: Input[ID], state: ProxyTargetState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.proxyTargetMod.ProxyTarget = js.native
    
    /**
      * Returns true if the given object is an instance of ProxyTarget.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/rds", "ProxyTarget.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/proxyTarget.ProxyTarget */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/rds", "RoleAssociation")
  @js.native
  class RoleAssociation protected ()
    extends typingsSlinky.pulumiAws.roleAssociationMod.RoleAssociation {
    /**
      * Create a RoleAssociation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: RoleAssociationArgs) = this()
    def this(name: String, args: RoleAssociationArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object RoleAssociation {
    
    /**
      * Get an existing RoleAssociation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/rds", "RoleAssociation.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.roleAssociationMod.RoleAssociation = js.native
    @JSImport("@pulumi/aws/rds", "RoleAssociation.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.roleAssociationMod.RoleAssociation = js.native
    @JSImport("@pulumi/aws/rds", "RoleAssociation.get")
    @js.native
    def get(name: String, id: Input[ID], state: RoleAssociationState): typingsSlinky.pulumiAws.roleAssociationMod.RoleAssociation = js.native
    @JSImport("@pulumi/aws/rds", "RoleAssociation.get")
    @js.native
    def get(name: String, id: Input[ID], state: RoleAssociationState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.roleAssociationMod.RoleAssociation = js.native
    
    /**
      * Returns true if the given object is an instance of RoleAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/rds", "RoleAssociation.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/roleAssociation.RoleAssociation */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/rds", "SecurityGroup")
  @js.native
  class SecurityGroup protected ()
    extends typingsSlinky.pulumiAws.rdsSecurityGroupMod.SecurityGroup {
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
    @JSImport("@pulumi/aws/rds", "SecurityGroup.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.rdsSecurityGroupMod.SecurityGroup = js.native
    @JSImport("@pulumi/aws/rds", "SecurityGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.rdsSecurityGroupMod.SecurityGroup = js.native
    @JSImport("@pulumi/aws/rds", "SecurityGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: SecurityGroupState): typingsSlinky.pulumiAws.rdsSecurityGroupMod.SecurityGroup = js.native
    @JSImport("@pulumi/aws/rds", "SecurityGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: SecurityGroupState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.rdsSecurityGroupMod.SecurityGroup = js.native
    
    /**
      * Returns true if the given object is an instance of SecurityGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/rds", "SecurityGroup.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/securityGroup.SecurityGroup */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/rds", "ServerlessEngine")
  @js.native
  def ServerlessEngine: EngineMode = js.native
  @scala.inline
  def ServerlessEngine_=(x: EngineMode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ServerlessEngine")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws/rds", "Snapshot")
  @js.native
  class Snapshot protected ()
    extends typingsSlinky.pulumiAws.rdsSnapshotMod.Snapshot {
    /**
      * Create a Snapshot resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: SnapshotArgs) = this()
    def this(name: String, args: SnapshotArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Snapshot {
    
    /**
      * Get an existing Snapshot resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/rds", "Snapshot.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.rdsSnapshotMod.Snapshot = js.native
    @JSImport("@pulumi/aws/rds", "Snapshot.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.rdsSnapshotMod.Snapshot = js.native
    @JSImport("@pulumi/aws/rds", "Snapshot.get")
    @js.native
    def get(name: String, id: Input[ID], state: SnapshotState): typingsSlinky.pulumiAws.rdsSnapshotMod.Snapshot = js.native
    @JSImport("@pulumi/aws/rds", "Snapshot.get")
    @js.native
    def get(name: String, id: Input[ID], state: SnapshotState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.rdsSnapshotMod.Snapshot = js.native
    
    /**
      * Returns true if the given object is an instance of Snapshot.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/rds", "Snapshot.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/snapshot.Snapshot */ Boolean = js.native
  }
  
  object StorageType {
    
    @JSImport("@pulumi/aws/rds", "StorageType.GP2")
    @js.native
    val GP2: gp2 = js.native
    
    @JSImport("@pulumi/aws/rds", "StorageType.IO1")
    @js.native
    val IO1: io1 = js.native
    
    @JSImport("@pulumi/aws/rds", "StorageType.Standard")
    @js.native
    val Standard: standard = js.native
  }
  
  object StorageTypes {
    
    /** Use StorageType.GP2 instead. */
    @JSImport("@pulumi/aws/rds", "StorageTypes.GP2")
    @js.native
    val GP2: StorageType = js.native
    
    /** Use StorageType.IO1 instead. */
    @JSImport("@pulumi/aws/rds", "StorageTypes.Io1")
    @js.native
    val Io1: StorageType = js.native
    
    /** Use StorageType.Standard instead. */
    @JSImport("@pulumi/aws/rds", "StorageTypes.Standard")
    @js.native
    val Standard: StorageType = js.native
  }
  
  @JSImport("@pulumi/aws/rds", "SubnetGroup")
  @js.native
  class SubnetGroup protected ()
    extends typingsSlinky.pulumiAws.rdsSubnetGroupMod.SubnetGroup {
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
    @JSImport("@pulumi/aws/rds", "SubnetGroup.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.rdsSubnetGroupMod.SubnetGroup = js.native
    @JSImport("@pulumi/aws/rds", "SubnetGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.rdsSubnetGroupMod.SubnetGroup = js.native
    @JSImport("@pulumi/aws/rds", "SubnetGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: SubnetGroupState): typingsSlinky.pulumiAws.rdsSubnetGroupMod.SubnetGroup = js.native
    @JSImport("@pulumi/aws/rds", "SubnetGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: SubnetGroupState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.rdsSubnetGroupMod.SubnetGroup = js.native
    
    /**
      * Returns true if the given object is an instance of SubnetGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/rds", "SubnetGroup.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/subnetGroup.SubnetGroup */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/rds", "getCertificate")
  @js.native
  def getCertificate(): js.Promise[GetCertificateResult] = js.native
  @JSImport("@pulumi/aws/rds", "getCertificate")
  @js.native
  def getCertificate(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetCertificateResult] = js.native
  @JSImport("@pulumi/aws/rds", "getCertificate")
  @js.native
  def getCertificate(args: GetCertificateArgs): js.Promise[GetCertificateResult] = js.native
  @JSImport("@pulumi/aws/rds", "getCertificate")
  @js.native
  def getCertificate(args: GetCertificateArgs, opts: InvokeOptions): js.Promise[GetCertificateResult] = js.native
  
  @JSImport("@pulumi/aws/rds", "getCluster")
  @js.native
  def getCluster(args: GetClusterArgs): js.Promise[GetClusterResult] = js.native
  @JSImport("@pulumi/aws/rds", "getCluster")
  @js.native
  def getCluster(args: GetClusterArgs, opts: InvokeOptions): js.Promise[GetClusterResult] = js.native
  
  @JSImport("@pulumi/aws/rds", "getClusterSnapshot")
  @js.native
  def getClusterSnapshot(): js.Promise[GetClusterSnapshotResult] = js.native
  @JSImport("@pulumi/aws/rds", "getClusterSnapshot")
  @js.native
  def getClusterSnapshot(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetClusterSnapshotResult] = js.native
  @JSImport("@pulumi/aws/rds", "getClusterSnapshot")
  @js.native
  def getClusterSnapshot(args: GetClusterSnapshotArgs): js.Promise[GetClusterSnapshotResult] = js.native
  @JSImport("@pulumi/aws/rds", "getClusterSnapshot")
  @js.native
  def getClusterSnapshot(args: GetClusterSnapshotArgs, opts: InvokeOptions): js.Promise[GetClusterSnapshotResult] = js.native
  
  @JSImport("@pulumi/aws/rds", "getEngineVersion")
  @js.native
  def getEngineVersion(args: GetEngineVersionArgs): js.Promise[GetEngineVersionResult] = js.native
  @JSImport("@pulumi/aws/rds", "getEngineVersion")
  @js.native
  def getEngineVersion(args: GetEngineVersionArgs, opts: InvokeOptions): js.Promise[GetEngineVersionResult] = js.native
  
  @JSImport("@pulumi/aws/rds", "getEventCategories")
  @js.native
  def getEventCategories(): js.Promise[GetEventCategoriesResult] = js.native
  @JSImport("@pulumi/aws/rds", "getEventCategories")
  @js.native
  def getEventCategories(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetEventCategoriesResult] = js.native
  @JSImport("@pulumi/aws/rds", "getEventCategories")
  @js.native
  def getEventCategories(args: GetEventCategoriesArgs): js.Promise[GetEventCategoriesResult] = js.native
  @JSImport("@pulumi/aws/rds", "getEventCategories")
  @js.native
  def getEventCategories(args: GetEventCategoriesArgs, opts: InvokeOptions): js.Promise[GetEventCategoriesResult] = js.native
  
  @JSImport("@pulumi/aws/rds", "getInstance")
  @js.native
  def getInstance(args: GetInstanceArgs): js.Promise[GetInstanceResult] = js.native
  @JSImport("@pulumi/aws/rds", "getInstance")
  @js.native
  def getInstance(args: GetInstanceArgs, opts: InvokeOptions): js.Promise[GetInstanceResult] = js.native
  
  @JSImport("@pulumi/aws/rds", "getOrderableDbInstance")
  @js.native
  def getOrderableDbInstance(args: GetOrderableDbInstanceArgs): js.Promise[GetOrderableDbInstanceResult] = js.native
  @JSImport("@pulumi/aws/rds", "getOrderableDbInstance")
  @js.native
  def getOrderableDbInstance(args: GetOrderableDbInstanceArgs, opts: InvokeOptions): js.Promise[GetOrderableDbInstanceResult] = js.native
  
  @JSImport("@pulumi/aws/rds", "getSnapshot")
  @js.native
  def getSnapshot(): js.Promise[GetSnapshotResult] = js.native
  @JSImport("@pulumi/aws/rds", "getSnapshot")
  @js.native
  def getSnapshot(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetSnapshotResult] = js.native
  @JSImport("@pulumi/aws/rds", "getSnapshot")
  @js.native
  def getSnapshot(args: GetSnapshotArgs): js.Promise[GetSnapshotResult] = js.native
  @JSImport("@pulumi/aws/rds", "getSnapshot")
  @js.native
  def getSnapshot(args: GetSnapshotArgs, opts: InvokeOptions): js.Promise[GetSnapshotResult] = js.native
  
  @JSImport("@pulumi/aws/rds", "getSubnetGroup")
  @js.native
  def getSubnetGroup(args: GetSubnetGroupArgs): js.Promise[GetSubnetGroupResult] = js.native
  @JSImport("@pulumi/aws/rds", "getSubnetGroup")
  @js.native
  def getSubnetGroup(args: GetSubnetGroupArgs, opts: InvokeOptions): js.Promise[GetSubnetGroupResult] = js.native
}
