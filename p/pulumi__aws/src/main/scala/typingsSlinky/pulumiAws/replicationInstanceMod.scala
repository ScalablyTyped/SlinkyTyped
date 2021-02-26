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

object replicationInstanceMod {
  
  @JSImport("@pulumi/aws/dms/replicationInstance", "ReplicationInstance")
  @js.native
  class ReplicationInstance protected () extends CustomResource {
    /**
      * Create a ReplicationInstance resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ReplicationInstanceArgs) = this()
    def this(name: String, args: ReplicationInstanceArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The amount of storage (in gigabytes) to be initially allocated for the replication instance.
      */
    val allocatedStorage: Output_[Double] = js.native
    
    /**
      * Indicates that major version upgrades are allowed.
      */
    val allowMajorVersionUpgrade: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * Indicates whether the changes should be applied immediately or during the next maintenance window. Only used when updating an existing resource.
      */
    val applyImmediately: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * Indicates that minor engine upgrades will be applied automatically to the replication instance during the maintenance window.
      */
    val autoMinorVersionUpgrade: Output_[Boolean] = js.native
    
    /**
      * The EC2 Availability Zone that the replication instance will be created in.
      */
    val availabilityZone: Output_[String] = js.native
    
    /**
      * The engine version number of the replication instance.
      */
    val engineVersion: Output_[String] = js.native
    
    /**
      * The Amazon Resource Name (ARN) for the KMS key that will be used to encrypt the connection parameters. If you do not specify a value for `kmsKeyArn`, then AWS DMS will use your default encryption key. AWS KMS creates the default encryption key for your AWS account. Your AWS account has a different default encryption key for each AWS region.
      */
    val kmsKeyArn: Output_[String] = js.native
    
    /**
      * Specifies if the replication instance is a multi-az deployment. You cannot set the `availabilityZone` parameter if the `multiAz` parameter is set to `true`.
      */
    val multiAz: Output_[Boolean] = js.native
    
    /**
      * The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).
      */
    val preferredMaintenanceWindow: Output_[String] = js.native
    
    /**
      * Specifies the accessibility options for the replication instance. A value of true represents an instance with a public IP address. A value of false represents an instance with a private IP address.
      */
    val publiclyAccessible: Output_[Boolean] = js.native
    
    /**
      * The Amazon Resource Name (ARN) of the replication instance.
      */
    val replicationInstanceArn: Output_[String] = js.native
    
    /**
      * The compute and memory capacity of the replication instance as specified by the replication instance class. Can be one of `dms.t2.micro | dms.t2.small | dms.t2.medium | dms.t2.large | dms.c4.large | dms.c4.xlarge | dms.c4.2xlarge | dms.c4.4xlarge`
      */
    val replicationInstanceClass: Output_[String] = js.native
    
    /**
      * The replication instance identifier. This parameter is stored as a lowercase string.
      */
    val replicationInstanceId: Output_[String] = js.native
    
    /**
      * A list of the private IP addresses of the replication instance.
      */
    val replicationInstancePrivateIps: Output_[js.Array[String]] = js.native
    
    /**
      * A list of the public IP addresses of the replication instance.
      */
    val replicationInstancePublicIps: Output_[js.Array[String]] = js.native
    
    /**
      * A subnet group to associate with the replication instance.
      */
    val replicationSubnetGroupId: Output_[String] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * A list of VPC security group IDs to be used with the replication instance. The VPC security groups must work with the VPC containing the replication instance.
      */
    val vpcSecurityGroupIds: Output_[js.Array[String]] = js.native
  }
  /* static members */
  object ReplicationInstance {
    
    /**
      * Get an existing ReplicationInstance resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/dms/replicationInstance", "ReplicationInstance.get")
    @js.native
    def get(name: String, id: Input[ID]): ReplicationInstance = js.native
    @JSImport("@pulumi/aws/dms/replicationInstance", "ReplicationInstance.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): ReplicationInstance = js.native
    @JSImport("@pulumi/aws/dms/replicationInstance", "ReplicationInstance.get")
    @js.native
    def get(name: String, id: Input[ID], state: ReplicationInstanceState): ReplicationInstance = js.native
    @JSImport("@pulumi/aws/dms/replicationInstance", "ReplicationInstance.get")
    @js.native
    def get(name: String, id: Input[ID], state: ReplicationInstanceState, opts: CustomResourceOptions): ReplicationInstance = js.native
    
    /**
      * Returns true if the given object is an instance of ReplicationInstance.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/dms/replicationInstance", "ReplicationInstance.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/dms/replicationInstance.ReplicationInstance */ Boolean = js.native
  }
  
  @js.native
  trait ReplicationInstanceArgs extends StObject {
    
    /**
      * The amount of storage (in gigabytes) to be initially allocated for the replication instance.
      */
    val allocatedStorage: js.UndefOr[Input[Double]] = js.native
    
    /**
      * Indicates that major version upgrades are allowed.
      */
    val allowMajorVersionUpgrade: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * Indicates whether the changes should be applied immediately or during the next maintenance window. Only used when updating an existing resource.
      */
    val applyImmediately: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * Indicates that minor engine upgrades will be applied automatically to the replication instance during the maintenance window.
      */
    val autoMinorVersionUpgrade: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The EC2 Availability Zone that the replication instance will be created in.
      */
    val availabilityZone: js.UndefOr[Input[String]] = js.native
    
    /**
      * The engine version number of the replication instance.
      */
    val engineVersion: js.UndefOr[Input[String]] = js.native
    
    /**
      * The Amazon Resource Name (ARN) for the KMS key that will be used to encrypt the connection parameters. If you do not specify a value for `kmsKeyArn`, then AWS DMS will use your default encryption key. AWS KMS creates the default encryption key for your AWS account. Your AWS account has a different default encryption key for each AWS region.
      */
    val kmsKeyArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * Specifies if the replication instance is a multi-az deployment. You cannot set the `availabilityZone` parameter if the `multiAz` parameter is set to `true`.
      */
    val multiAz: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).
      */
    val preferredMaintenanceWindow: js.UndefOr[Input[String]] = js.native
    
    /**
      * Specifies the accessibility options for the replication instance. A value of true represents an instance with a public IP address. A value of false represents an instance with a private IP address.
      */
    val publiclyAccessible: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The compute and memory capacity of the replication instance as specified by the replication instance class. Can be one of `dms.t2.micro | dms.t2.small | dms.t2.medium | dms.t2.large | dms.c4.large | dms.c4.xlarge | dms.c4.2xlarge | dms.c4.4xlarge`
      */
    val replicationInstanceClass: Input[String] = js.native
    
    /**
      * The replication instance identifier. This parameter is stored as a lowercase string.
      */
    val replicationInstanceId: Input[String] = js.native
    
    /**
      * A subnet group to associate with the replication instance.
      */
    val replicationSubnetGroupId: js.UndefOr[Input[String]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * A list of VPC security group IDs to be used with the replication instance. The VPC security groups must work with the VPC containing the replication instance.
      */
    val vpcSecurityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  }
  object ReplicationInstanceArgs {
    
    @scala.inline
    def apply(replicationInstanceClass: Input[String], replicationInstanceId: Input[String]): ReplicationInstanceArgs = {
      val __obj = js.Dynamic.literal(replicationInstanceClass = replicationInstanceClass.asInstanceOf[js.Any], replicationInstanceId = replicationInstanceId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReplicationInstanceArgs]
    }
    
    @scala.inline
    implicit class ReplicationInstanceArgsMutableBuilder[Self <: ReplicationInstanceArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllocatedStorage(value: Input[Double]): Self = StObject.set(x, "allocatedStorage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllocatedStorageUndefined: Self = StObject.set(x, "allocatedStorage", js.undefined)
      
      @scala.inline
      def setAllowMajorVersionUpgrade(value: Input[Boolean]): Self = StObject.set(x, "allowMajorVersionUpgrade", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowMajorVersionUpgradeUndefined: Self = StObject.set(x, "allowMajorVersionUpgrade", js.undefined)
      
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
      def setEngineVersion(value: Input[String]): Self = StObject.set(x, "engineVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEngineVersionUndefined: Self = StObject.set(x, "engineVersion", js.undefined)
      
      @scala.inline
      def setKmsKeyArn(value: Input[String]): Self = StObject.set(x, "kmsKeyArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKmsKeyArnUndefined: Self = StObject.set(x, "kmsKeyArn", js.undefined)
      
      @scala.inline
      def setMultiAz(value: Input[Boolean]): Self = StObject.set(x, "multiAz", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiAzUndefined: Self = StObject.set(x, "multiAz", js.undefined)
      
      @scala.inline
      def setPreferredMaintenanceWindow(value: Input[String]): Self = StObject.set(x, "preferredMaintenanceWindow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreferredMaintenanceWindowUndefined: Self = StObject.set(x, "preferredMaintenanceWindow", js.undefined)
      
      @scala.inline
      def setPubliclyAccessible(value: Input[Boolean]): Self = StObject.set(x, "publiclyAccessible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPubliclyAccessibleUndefined: Self = StObject.set(x, "publiclyAccessible", js.undefined)
      
      @scala.inline
      def setReplicationInstanceClass(value: Input[String]): Self = StObject.set(x, "replicationInstanceClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicationInstanceId(value: Input[String]): Self = StObject.set(x, "replicationInstanceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicationSubnetGroupId(value: Input[String]): Self = StObject.set(x, "replicationSubnetGroupId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicationSubnetGroupIdUndefined: Self = StObject.set(x, "replicationSubnetGroupId", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setVpcSecurityGroupIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "vpcSecurityGroupIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcSecurityGroupIdsUndefined: Self = StObject.set(x, "vpcSecurityGroupIds", js.undefined)
      
      @scala.inline
      def setVpcSecurityGroupIdsVarargs(value: Input[String]*): Self = StObject.set(x, "vpcSecurityGroupIds", js.Array(value :_*))
    }
  }
  
  @js.native
  trait ReplicationInstanceState extends StObject {
    
    /**
      * The amount of storage (in gigabytes) to be initially allocated for the replication instance.
      */
    val allocatedStorage: js.UndefOr[Input[Double]] = js.native
    
    /**
      * Indicates that major version upgrades are allowed.
      */
    val allowMajorVersionUpgrade: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * Indicates whether the changes should be applied immediately or during the next maintenance window. Only used when updating an existing resource.
      */
    val applyImmediately: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * Indicates that minor engine upgrades will be applied automatically to the replication instance during the maintenance window.
      */
    val autoMinorVersionUpgrade: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The EC2 Availability Zone that the replication instance will be created in.
      */
    val availabilityZone: js.UndefOr[Input[String]] = js.native
    
    /**
      * The engine version number of the replication instance.
      */
    val engineVersion: js.UndefOr[Input[String]] = js.native
    
    /**
      * The Amazon Resource Name (ARN) for the KMS key that will be used to encrypt the connection parameters. If you do not specify a value for `kmsKeyArn`, then AWS DMS will use your default encryption key. AWS KMS creates the default encryption key for your AWS account. Your AWS account has a different default encryption key for each AWS region.
      */
    val kmsKeyArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * Specifies if the replication instance is a multi-az deployment. You cannot set the `availabilityZone` parameter if the `multiAz` parameter is set to `true`.
      */
    val multiAz: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).
      */
    val preferredMaintenanceWindow: js.UndefOr[Input[String]] = js.native
    
    /**
      * Specifies the accessibility options for the replication instance. A value of true represents an instance with a public IP address. A value of false represents an instance with a private IP address.
      */
    val publiclyAccessible: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The Amazon Resource Name (ARN) of the replication instance.
      */
    val replicationInstanceArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The compute and memory capacity of the replication instance as specified by the replication instance class. Can be one of `dms.t2.micro | dms.t2.small | dms.t2.medium | dms.t2.large | dms.c4.large | dms.c4.xlarge | dms.c4.2xlarge | dms.c4.4xlarge`
      */
    val replicationInstanceClass: js.UndefOr[Input[String]] = js.native
    
    /**
      * The replication instance identifier. This parameter is stored as a lowercase string.
      */
    val replicationInstanceId: js.UndefOr[Input[String]] = js.native
    
    /**
      * A list of the private IP addresses of the replication instance.
      */
    val replicationInstancePrivateIps: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * A list of the public IP addresses of the replication instance.
      */
    val replicationInstancePublicIps: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * A subnet group to associate with the replication instance.
      */
    val replicationSubnetGroupId: js.UndefOr[Input[String]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * A list of VPC security group IDs to be used with the replication instance. The VPC security groups must work with the VPC containing the replication instance.
      */
    val vpcSecurityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  }
  object ReplicationInstanceState {
    
    @scala.inline
    def apply(): ReplicationInstanceState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReplicationInstanceState]
    }
    
    @scala.inline
    implicit class ReplicationInstanceStateMutableBuilder[Self <: ReplicationInstanceState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllocatedStorage(value: Input[Double]): Self = StObject.set(x, "allocatedStorage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllocatedStorageUndefined: Self = StObject.set(x, "allocatedStorage", js.undefined)
      
      @scala.inline
      def setAllowMajorVersionUpgrade(value: Input[Boolean]): Self = StObject.set(x, "allowMajorVersionUpgrade", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowMajorVersionUpgradeUndefined: Self = StObject.set(x, "allowMajorVersionUpgrade", js.undefined)
      
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
      def setEngineVersion(value: Input[String]): Self = StObject.set(x, "engineVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEngineVersionUndefined: Self = StObject.set(x, "engineVersion", js.undefined)
      
      @scala.inline
      def setKmsKeyArn(value: Input[String]): Self = StObject.set(x, "kmsKeyArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKmsKeyArnUndefined: Self = StObject.set(x, "kmsKeyArn", js.undefined)
      
      @scala.inline
      def setMultiAz(value: Input[Boolean]): Self = StObject.set(x, "multiAz", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiAzUndefined: Self = StObject.set(x, "multiAz", js.undefined)
      
      @scala.inline
      def setPreferredMaintenanceWindow(value: Input[String]): Self = StObject.set(x, "preferredMaintenanceWindow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreferredMaintenanceWindowUndefined: Self = StObject.set(x, "preferredMaintenanceWindow", js.undefined)
      
      @scala.inline
      def setPubliclyAccessible(value: Input[Boolean]): Self = StObject.set(x, "publiclyAccessible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPubliclyAccessibleUndefined: Self = StObject.set(x, "publiclyAccessible", js.undefined)
      
      @scala.inline
      def setReplicationInstanceArn(value: Input[String]): Self = StObject.set(x, "replicationInstanceArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicationInstanceArnUndefined: Self = StObject.set(x, "replicationInstanceArn", js.undefined)
      
      @scala.inline
      def setReplicationInstanceClass(value: Input[String]): Self = StObject.set(x, "replicationInstanceClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicationInstanceClassUndefined: Self = StObject.set(x, "replicationInstanceClass", js.undefined)
      
      @scala.inline
      def setReplicationInstanceId(value: Input[String]): Self = StObject.set(x, "replicationInstanceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicationInstanceIdUndefined: Self = StObject.set(x, "replicationInstanceId", js.undefined)
      
      @scala.inline
      def setReplicationInstancePrivateIps(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "replicationInstancePrivateIps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicationInstancePrivateIpsUndefined: Self = StObject.set(x, "replicationInstancePrivateIps", js.undefined)
      
      @scala.inline
      def setReplicationInstancePrivateIpsVarargs(value: Input[String]*): Self = StObject.set(x, "replicationInstancePrivateIps", js.Array(value :_*))
      
      @scala.inline
      def setReplicationInstancePublicIps(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "replicationInstancePublicIps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicationInstancePublicIpsUndefined: Self = StObject.set(x, "replicationInstancePublicIps", js.undefined)
      
      @scala.inline
      def setReplicationInstancePublicIpsVarargs(value: Input[String]*): Self = StObject.set(x, "replicationInstancePublicIps", js.Array(value :_*))
      
      @scala.inline
      def setReplicationSubnetGroupId(value: Input[String]): Self = StObject.set(x, "replicationSubnetGroupId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicationSubnetGroupIdUndefined: Self = StObject.set(x, "replicationSubnetGroupId", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setVpcSecurityGroupIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "vpcSecurityGroupIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcSecurityGroupIdsUndefined: Self = StObject.set(x, "vpcSecurityGroupIds", js.undefined)
      
      @scala.inline
      def setVpcSecurityGroupIdsVarargs(value: Input[String]*): Self = StObject.set(x, "vpcSecurityGroupIds", js.Array(value :_*))
    }
  }
}
