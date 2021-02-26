package typingsSlinky.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object neptuneClusterInstanceMod {
  
  @JSImport("@pulumi/aws/neptune/clusterInstance", "ClusterInstance")
  @js.native
  class ClusterInstance protected () extends CustomResource {
    /**
      * Create a ClusterInstance resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ClusterInstanceArgs) = this()
    def this(name: String, args: ClusterInstanceArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The hostname of the instance. See also `endpoint` and `port`.
      */
    val address: Output_[String] = js.native
    
    /**
      * Specifies whether any instance modifications
      * are applied immediately, or during the next maintenance window. Default is`false`.
      */
    val applyImmediately: Output_[Boolean] = js.native
    
    /**
      * Amazon Resource Name (ARN) of neptune instance
      */
    val arn: Output_[String] = js.native
    
    /**
      * Indicates that minor engine upgrades will be applied automatically to the instance during the maintenance window. Default is `true`.
      */
    val autoMinorVersionUpgrade: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * The EC2 Availability Zone that the neptune instance is created in.
      */
    val availabilityZone: Output_[String] = js.native
    
    /**
      * The identifier of the `aws.neptune.Cluster` in which to launch this instance.
      */
    val clusterIdentifier: Output_[String] = js.native
    
    /**
      * The region-unique, immutable identifier for the neptune instance.
      */
    val dbiResourceId: Output_[String] = js.native
    
    /**
      * The connection endpoint in `address:port` format.
      */
    val endpoint: Output_[String] = js.native
    
    /**
      * The name of the database engine to be used for the neptune instance. Defaults to `neptune`. Valid Values: `neptune`.
      */
    val engine: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The neptune engine version.
      */
    val engineVersion: Output_[String] = js.native
    
    /**
      * The identifier for the neptune instance, if omitted, this provider will assign a random, unique identifier.
      */
    val identifier: Output_[String] = js.native
    
    /**
      * Creates a unique identifier beginning with the specified prefix. Conflicts with `identifier`.
      */
    val identifierPrefix: Output_[String] = js.native
    
    /**
      * The instance class to use.
      */
    val instanceClass: Output_[String] = js.native
    
    /**
      * The ARN for the KMS encryption key if one is set to the neptune cluster.
      */
    val kmsKeyArn: Output_[String] = js.native
    
    /**
      * The name of the neptune parameter group to associate with this instance.
      */
    val neptuneParameterGroupName: Output_[js.UndefOr[String]] = js.native
    
    /**
      * A subnet group to associate with this neptune instance. **NOTE:** This must match the `neptuneSubnetGroupName` of the attached `aws.neptune.Cluster`.
      */
    val neptuneSubnetGroupName: Output_[String] = js.native
    
    /**
      * The port on which the DB accepts connections. Defaults to `8182`.
      */
    val port: Output_[js.UndefOr[Double]] = js.native
    
    /**
      * The daily time range during which automated backups are created if automated backups are enabled. Eg: "04:00-09:00"
      */
    val preferredBackupWindow: Output_[String] = js.native
    
    /**
      * The window to perform maintenance in.
      * Syntax: "ddd:hh24:mi-ddd:hh24:mi". Eg: "Mon:00:00-Mon:03:00".
      */
    val preferredMaintenanceWindow: Output_[String] = js.native
    
    /**
      * Default 0. Failover Priority setting on instance level. The reader who has lower tier has higher priority to get promoter to writer.
      */
    val promotionTier: Output_[js.UndefOr[Double]] = js.native
    
    /**
      * Bool to control if instance is publicly accessible. Default is `false`.
      */
    val publiclyAccessible: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * Specifies whether the neptune cluster is encrypted.
      */
    val storageEncrypted: Output_[Boolean] = js.native
    
    /**
      * A map of tags to assign to the instance.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * Boolean indicating if this instance is writable. `False` indicates this instance is a read replica.
      */
    val writer: Output_[Boolean] = js.native
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
    @JSImport("@pulumi/aws/neptune/clusterInstance", "ClusterInstance.get")
    @js.native
    def get(name: String, id: Input[ID]): ClusterInstance = js.native
    @JSImport("@pulumi/aws/neptune/clusterInstance", "ClusterInstance.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): ClusterInstance = js.native
    @JSImport("@pulumi/aws/neptune/clusterInstance", "ClusterInstance.get")
    @js.native
    def get(name: String, id: Input[ID], state: ClusterInstanceState): ClusterInstance = js.native
    @JSImport("@pulumi/aws/neptune/clusterInstance", "ClusterInstance.get")
    @js.native
    def get(name: String, id: Input[ID], state: ClusterInstanceState, opts: CustomResourceOptions): ClusterInstance = js.native
    
    /**
      * Returns true if the given object is an instance of ClusterInstance.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/neptune/clusterInstance", "ClusterInstance.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/neptune/clusterInstance.ClusterInstance */ Boolean = js.native
  }
  
  @js.native
  trait ClusterInstanceArgs extends StObject {
    
    /**
      * Specifies whether any instance modifications
      * are applied immediately, or during the next maintenance window. Default is`false`.
      */
    val applyImmediately: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * Indicates that minor engine upgrades will be applied automatically to the instance during the maintenance window. Default is `true`.
      */
    val autoMinorVersionUpgrade: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The EC2 Availability Zone that the neptune instance is created in.
      */
    val availabilityZone: js.UndefOr[Input[String]] = js.native
    
    /**
      * The identifier of the `aws.neptune.Cluster` in which to launch this instance.
      */
    val clusterIdentifier: Input[String] = js.native
    
    /**
      * The name of the database engine to be used for the neptune instance. Defaults to `neptune`. Valid Values: `neptune`.
      */
    val engine: js.UndefOr[Input[String]] = js.native
    
    /**
      * The neptune engine version.
      */
    val engineVersion: js.UndefOr[Input[String]] = js.native
    
    /**
      * The identifier for the neptune instance, if omitted, this provider will assign a random, unique identifier.
      */
    val identifier: js.UndefOr[Input[String]] = js.native
    
    /**
      * Creates a unique identifier beginning with the specified prefix. Conflicts with `identifier`.
      */
    val identifierPrefix: js.UndefOr[Input[String]] = js.native
    
    /**
      * The instance class to use.
      */
    val instanceClass: Input[String] = js.native
    
    /**
      * The name of the neptune parameter group to associate with this instance.
      */
    val neptuneParameterGroupName: js.UndefOr[Input[String]] = js.native
    
    /**
      * A subnet group to associate with this neptune instance. **NOTE:** This must match the `neptuneSubnetGroupName` of the attached `aws.neptune.Cluster`.
      */
    val neptuneSubnetGroupName: js.UndefOr[Input[String]] = js.native
    
    /**
      * The port on which the DB accepts connections. Defaults to `8182`.
      */
    val port: js.UndefOr[Input[Double]] = js.native
    
    /**
      * The daily time range during which automated backups are created if automated backups are enabled. Eg: "04:00-09:00"
      */
    val preferredBackupWindow: js.UndefOr[Input[String]] = js.native
    
    /**
      * The window to perform maintenance in.
      * Syntax: "ddd:hh24:mi-ddd:hh24:mi". Eg: "Mon:00:00-Mon:03:00".
      */
    val preferredMaintenanceWindow: js.UndefOr[Input[String]] = js.native
    
    /**
      * Default 0. Failover Priority setting on instance level. The reader who has lower tier has higher priority to get promoter to writer.
      */
    val promotionTier: js.UndefOr[Input[Double]] = js.native
    
    /**
      * Bool to control if instance is publicly accessible. Default is `false`.
      */
    val publiclyAccessible: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * A map of tags to assign to the instance.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object ClusterInstanceArgs {
    
    @scala.inline
    def apply(clusterIdentifier: Input[String], instanceClass: Input[String]): ClusterInstanceArgs = {
      val __obj = js.Dynamic.literal(clusterIdentifier = clusterIdentifier.asInstanceOf[js.Any], instanceClass = instanceClass.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClusterInstanceArgs]
    }
    
    @scala.inline
    implicit class ClusterInstanceArgsMutableBuilder[Self <: ClusterInstanceArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApplyImmediately(value: Input[Boolean]): Self = StObject.set(x, "applyImmediately", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplyImmediatelyUndefined: Self = StObject.set(x, "applyImmediately", js.undefined)
      
      @scala.inline
      def setAutoMinorVersionUpgrade(value: Input[Boolean]): Self = StObject.set(x, "autoMinorVersionUpgrade", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoMinorVersionUpgradeUndefined: Self = StObject.set(x, "autoMinorVersionUpgrade", js.undefined)
      
      @scala.inline
      def setAvailabilityZone(value: Input[String]): Self = StObject.set(x, "availabilityZone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailabilityZoneUndefined: Self = StObject.set(x, "availabilityZone", js.undefined)
      
      @scala.inline
      def setClusterIdentifier(value: Input[String]): Self = StObject.set(x, "clusterIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEngine(value: Input[String]): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEngineUndefined: Self = StObject.set(x, "engine", js.undefined)
      
      @scala.inline
      def setEngineVersion(value: Input[String]): Self = StObject.set(x, "engineVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEngineVersionUndefined: Self = StObject.set(x, "engineVersion", js.undefined)
      
      @scala.inline
      def setIdentifier(value: Input[String]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentifierPrefix(value: Input[String]): Self = StObject.set(x, "identifierPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentifierPrefixUndefined: Self = StObject.set(x, "identifierPrefix", js.undefined)
      
      @scala.inline
      def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
      
      @scala.inline
      def setInstanceClass(value: Input[String]): Self = StObject.set(x, "instanceClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNeptuneParameterGroupName(value: Input[String]): Self = StObject.set(x, "neptuneParameterGroupName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNeptuneParameterGroupNameUndefined: Self = StObject.set(x, "neptuneParameterGroupName", js.undefined)
      
      @scala.inline
      def setNeptuneSubnetGroupName(value: Input[String]): Self = StObject.set(x, "neptuneSubnetGroupName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNeptuneSubnetGroupNameUndefined: Self = StObject.set(x, "neptuneSubnetGroupName", js.undefined)
      
      @scala.inline
      def setPort(value: Input[Double]): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setPreferredBackupWindow(value: Input[String]): Self = StObject.set(x, "preferredBackupWindow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreferredBackupWindowUndefined: Self = StObject.set(x, "preferredBackupWindow", js.undefined)
      
      @scala.inline
      def setPreferredMaintenanceWindow(value: Input[String]): Self = StObject.set(x, "preferredMaintenanceWindow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreferredMaintenanceWindowUndefined: Self = StObject.set(x, "preferredMaintenanceWindow", js.undefined)
      
      @scala.inline
      def setPromotionTier(value: Input[Double]): Self = StObject.set(x, "promotionTier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPromotionTierUndefined: Self = StObject.set(x, "promotionTier", js.undefined)
      
      @scala.inline
      def setPubliclyAccessible(value: Input[Boolean]): Self = StObject.set(x, "publiclyAccessible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPubliclyAccessibleUndefined: Self = StObject.set(x, "publiclyAccessible", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait ClusterInstanceState extends StObject {
    
    /**
      * The hostname of the instance. See also `endpoint` and `port`.
      */
    val address: js.UndefOr[Input[String]] = js.native
    
    /**
      * Specifies whether any instance modifications
      * are applied immediately, or during the next maintenance window. Default is`false`.
      */
    val applyImmediately: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * Amazon Resource Name (ARN) of neptune instance
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * Indicates that minor engine upgrades will be applied automatically to the instance during the maintenance window. Default is `true`.
      */
    val autoMinorVersionUpgrade: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The EC2 Availability Zone that the neptune instance is created in.
      */
    val availabilityZone: js.UndefOr[Input[String]] = js.native
    
    /**
      * The identifier of the `aws.neptune.Cluster` in which to launch this instance.
      */
    val clusterIdentifier: js.UndefOr[Input[String]] = js.native
    
    /**
      * The region-unique, immutable identifier for the neptune instance.
      */
    val dbiResourceId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The connection endpoint in `address:port` format.
      */
    val endpoint: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the database engine to be used for the neptune instance. Defaults to `neptune`. Valid Values: `neptune`.
      */
    val engine: js.UndefOr[Input[String]] = js.native
    
    /**
      * The neptune engine version.
      */
    val engineVersion: js.UndefOr[Input[String]] = js.native
    
    /**
      * The identifier for the neptune instance, if omitted, this provider will assign a random, unique identifier.
      */
    val identifier: js.UndefOr[Input[String]] = js.native
    
    /**
      * Creates a unique identifier beginning with the specified prefix. Conflicts with `identifier`.
      */
    val identifierPrefix: js.UndefOr[Input[String]] = js.native
    
    /**
      * The instance class to use.
      */
    val instanceClass: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ARN for the KMS encryption key if one is set to the neptune cluster.
      */
    val kmsKeyArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the neptune parameter group to associate with this instance.
      */
    val neptuneParameterGroupName: js.UndefOr[Input[String]] = js.native
    
    /**
      * A subnet group to associate with this neptune instance. **NOTE:** This must match the `neptuneSubnetGroupName` of the attached `aws.neptune.Cluster`.
      */
    val neptuneSubnetGroupName: js.UndefOr[Input[String]] = js.native
    
    /**
      * The port on which the DB accepts connections. Defaults to `8182`.
      */
    val port: js.UndefOr[Input[Double]] = js.native
    
    /**
      * The daily time range during which automated backups are created if automated backups are enabled. Eg: "04:00-09:00"
      */
    val preferredBackupWindow: js.UndefOr[Input[String]] = js.native
    
    /**
      * The window to perform maintenance in.
      * Syntax: "ddd:hh24:mi-ddd:hh24:mi". Eg: "Mon:00:00-Mon:03:00".
      */
    val preferredMaintenanceWindow: js.UndefOr[Input[String]] = js.native
    
    /**
      * Default 0. Failover Priority setting on instance level. The reader who has lower tier has higher priority to get promoter to writer.
      */
    val promotionTier: js.UndefOr[Input[Double]] = js.native
    
    /**
      * Bool to control if instance is publicly accessible. Default is `false`.
      */
    val publiclyAccessible: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * Specifies whether the neptune cluster is encrypted.
      */
    val storageEncrypted: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * A map of tags to assign to the instance.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * Boolean indicating if this instance is writable. `False` indicates this instance is a read replica.
      */
    val writer: js.UndefOr[Input[Boolean]] = js.native
  }
  object ClusterInstanceState {
    
    @scala.inline
    def apply(): ClusterInstanceState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClusterInstanceState]
    }
    
    @scala.inline
    implicit class ClusterInstanceStateMutableBuilder[Self <: ClusterInstanceState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: Input[String]): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
      
      @scala.inline
      def setApplyImmediately(value: Input[Boolean]): Self = StObject.set(x, "applyImmediately", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplyImmediatelyUndefined: Self = StObject.set(x, "applyImmediately", js.undefined)
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setAutoMinorVersionUpgrade(value: Input[Boolean]): Self = StObject.set(x, "autoMinorVersionUpgrade", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoMinorVersionUpgradeUndefined: Self = StObject.set(x, "autoMinorVersionUpgrade", js.undefined)
      
      @scala.inline
      def setAvailabilityZone(value: Input[String]): Self = StObject.set(x, "availabilityZone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailabilityZoneUndefined: Self = StObject.set(x, "availabilityZone", js.undefined)
      
      @scala.inline
      def setClusterIdentifier(value: Input[String]): Self = StObject.set(x, "clusterIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClusterIdentifierUndefined: Self = StObject.set(x, "clusterIdentifier", js.undefined)
      
      @scala.inline
      def setDbiResourceId(value: Input[String]): Self = StObject.set(x, "dbiResourceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDbiResourceIdUndefined: Self = StObject.set(x, "dbiResourceId", js.undefined)
      
      @scala.inline
      def setEndpoint(value: Input[String]): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
      
      @scala.inline
      def setEngine(value: Input[String]): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEngineUndefined: Self = StObject.set(x, "engine", js.undefined)
      
      @scala.inline
      def setEngineVersion(value: Input[String]): Self = StObject.set(x, "engineVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEngineVersionUndefined: Self = StObject.set(x, "engineVersion", js.undefined)
      
      @scala.inline
      def setIdentifier(value: Input[String]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentifierPrefix(value: Input[String]): Self = StObject.set(x, "identifierPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentifierPrefixUndefined: Self = StObject.set(x, "identifierPrefix", js.undefined)
      
      @scala.inline
      def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
      
      @scala.inline
      def setInstanceClass(value: Input[String]): Self = StObject.set(x, "instanceClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceClassUndefined: Self = StObject.set(x, "instanceClass", js.undefined)
      
      @scala.inline
      def setKmsKeyArn(value: Input[String]): Self = StObject.set(x, "kmsKeyArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKmsKeyArnUndefined: Self = StObject.set(x, "kmsKeyArn", js.undefined)
      
      @scala.inline
      def setNeptuneParameterGroupName(value: Input[String]): Self = StObject.set(x, "neptuneParameterGroupName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNeptuneParameterGroupNameUndefined: Self = StObject.set(x, "neptuneParameterGroupName", js.undefined)
      
      @scala.inline
      def setNeptuneSubnetGroupName(value: Input[String]): Self = StObject.set(x, "neptuneSubnetGroupName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNeptuneSubnetGroupNameUndefined: Self = StObject.set(x, "neptuneSubnetGroupName", js.undefined)
      
      @scala.inline
      def setPort(value: Input[Double]): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setPreferredBackupWindow(value: Input[String]): Self = StObject.set(x, "preferredBackupWindow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreferredBackupWindowUndefined: Self = StObject.set(x, "preferredBackupWindow", js.undefined)
      
      @scala.inline
      def setPreferredMaintenanceWindow(value: Input[String]): Self = StObject.set(x, "preferredMaintenanceWindow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreferredMaintenanceWindowUndefined: Self = StObject.set(x, "preferredMaintenanceWindow", js.undefined)
      
      @scala.inline
      def setPromotionTier(value: Input[Double]): Self = StObject.set(x, "promotionTier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPromotionTierUndefined: Self = StObject.set(x, "promotionTier", js.undefined)
      
      @scala.inline
      def setPubliclyAccessible(value: Input[Boolean]): Self = StObject.set(x, "publiclyAccessible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPubliclyAccessibleUndefined: Self = StObject.set(x, "publiclyAccessible", js.undefined)
      
      @scala.inline
      def setStorageEncrypted(value: Input[Boolean]): Self = StObject.set(x, "storageEncrypted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageEncryptedUndefined: Self = StObject.set(x, "storageEncrypted", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setWriter(value: Input[Boolean]): Self = StObject.set(x, "writer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWriterUndefined: Self = StObject.set(x, "writer", js.undefined)
    }
  }
}
