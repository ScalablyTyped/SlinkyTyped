package typingsSlinky.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateClusterMessage extends js.Object {
  /**
    * Reserved.
    */
  var AdditionalInfo: js.UndefOr[String] = js.native
  /**
    * If true, major version upgrades can be applied during the maintenance window to the Amazon Redshift engine that is running on the cluster. When a new major version of the Amazon Redshift engine is released, you can request that the service automatically apply upgrades during the maintenance window to the Amazon Redshift engine that is running on your cluster. Default: true 
    */
  var AllowVersionUpgrade: js.UndefOr[BooleanOptional] = js.native
  /**
    * The number of days that automated snapshots are retained. If the value is 0, automated snapshots are disabled. Even if automated snapshots are disabled, you can still create manual snapshots when you want with CreateClusterSnapshot.  Default: 1  Constraints: Must be a value from 0 to 35.
    */
  var AutomatedSnapshotRetentionPeriod: js.UndefOr[IntegerOptional] = js.native
  /**
    * The EC2 Availability Zone (AZ) in which you want Amazon Redshift to provision the cluster. For example, if you have several EC2 instances running in a specific Availability Zone, then you might want the cluster to be provisioned in the same zone in order to decrease network latency. Default: A random, system-chosen Availability Zone in the region that is specified by the endpoint. Example: us-east-2d  Constraint: The specified Availability Zone must be in the same region as the current endpoint.
    */
  var AvailabilityZone: js.UndefOr[String] = js.native
  /**
    * A unique identifier for the cluster. You use this identifier to refer to the cluster for any subsequent cluster operations such as deleting or modifying. The identifier also appears in the Amazon Redshift console. Constraints:   Must contain from 1 to 63 alphanumeric characters or hyphens.   Alphabetic characters must be lowercase.   First character must be a letter.   Cannot end with a hyphen or contain two consecutive hyphens.   Must be unique for all clusters within an AWS account.   Example: myexamplecluster 
    */
  var ClusterIdentifier: String = js.native
  /**
    * The name of the parameter group to be associated with this cluster. Default: The default Amazon Redshift cluster parameter group. For information about the default parameter group, go to Working with Amazon Redshift Parameter Groups  Constraints:   Must be 1 to 255 alphanumeric characters or hyphens.   First character must be a letter.   Cannot end with a hyphen or contain two consecutive hyphens.  
    */
  var ClusterParameterGroupName: js.UndefOr[String] = js.native
  /**
    * A list of security groups to be associated with this cluster. Default: The default cluster security group for Amazon Redshift.
    */
  var ClusterSecurityGroups: js.UndefOr[ClusterSecurityGroupNameList] = js.native
  /**
    * The name of a cluster subnet group to be associated with this cluster. If this parameter is not provided the resulting cluster will be deployed outside virtual private cloud (VPC).
    */
  var ClusterSubnetGroupName: js.UndefOr[String] = js.native
  /**
    * The type of the cluster. When cluster type is specified as    single-node, the NumberOfNodes parameter is not required.    multi-node, the NumberOfNodes parameter is required.   Valid Values: multi-node | single-node  Default: multi-node 
    */
  var ClusterType: js.UndefOr[String] = js.native
  /**
    * The version of the Amazon Redshift engine software that you want to deploy on the cluster. The version selected runs on all the nodes in the cluster. Constraints: Only version 1.0 is currently available. Example: 1.0 
    */
  var ClusterVersion: js.UndefOr[String] = js.native
  /**
    * The name of the first database to be created when the cluster is created. To create additional databases after the cluster is created, connect to the cluster with a SQL client and use SQL commands to create a database. For more information, go to Create a Database in the Amazon Redshift Database Developer Guide.  Default: dev  Constraints:   Must contain 1 to 64 alphanumeric characters.   Must contain only lowercase letters.   Cannot be a word that is reserved by the service. A list of reserved words can be found in Reserved Words in the Amazon Redshift Database Developer Guide.   
    */
  var DBName: js.UndefOr[String] = js.native
  /**
    * The Elastic IP (EIP) address for the cluster. Constraints: The cluster must be provisioned in EC2-VPC and publicly-accessible through an Internet gateway. For more information about provisioning clusters in EC2-VPC, go to Supported Platforms to Launch Your Cluster in the Amazon Redshift Cluster Management Guide.
    */
  var ElasticIp: js.UndefOr[String] = js.native
  /**
    * If true, the data in the cluster is encrypted at rest.  Default: false
    */
  var Encrypted: js.UndefOr[BooleanOptional] = js.native
  /**
    * An option that specifies whether to create the cluster with enhanced VPC routing enabled. To create a cluster that uses enhanced VPC routing, the cluster must be in a VPC. For more information, see Enhanced VPC Routing in the Amazon Redshift Cluster Management Guide. If this option is true, enhanced VPC routing is enabled.  Default: false
    */
  var EnhancedVpcRouting: js.UndefOr[BooleanOptional] = js.native
  /**
    * Specifies the name of the HSM client certificate the Amazon Redshift cluster uses to retrieve the data encryption keys stored in an HSM.
    */
  var HsmClientCertificateIdentifier: js.UndefOr[String] = js.native
  /**
    * Specifies the name of the HSM configuration that contains the information the Amazon Redshift cluster can use to retrieve and store keys in an HSM.
    */
  var HsmConfigurationIdentifier: js.UndefOr[String] = js.native
  /**
    * A list of AWS Identity and Access Management (IAM) roles that can be used by the cluster to access other AWS services. You must supply the IAM roles in their Amazon Resource Name (ARN) format. You can supply up to 10 IAM roles in a single request. A cluster can have up to 10 IAM roles associated with it at any time.
    */
  var IamRoles: js.UndefOr[IamRoleArnList] = js.native
  /**
    * The AWS Key Management Service (KMS) key ID of the encryption key that you want to use to encrypt data in the cluster.
    */
  var KmsKeyId: js.UndefOr[String] = js.native
  /**
    * An optional parameter for the name of the maintenance track for the cluster. If you don't provide a maintenance track name, the cluster is assigned to the current track.
    */
  var MaintenanceTrackName: js.UndefOr[String] = js.native
  /**
    * The default number of days to retain a manual snapshot. If the value is -1, the snapshot is retained indefinitely. This setting doesn't change the retention period of existing snapshots. The value must be either -1 or an integer between 1 and 3,653.
    */
  var ManualSnapshotRetentionPeriod: js.UndefOr[IntegerOptional] = js.native
  /**
    * The password associated with the master user account for the cluster that is being created. Constraints:   Must be between 8 and 64 characters in length.   Must contain at least one uppercase letter.   Must contain at least one lowercase letter.   Must contain one number.   Can be any printable ASCII character (ASCII code 33 to 126) except ' (single quote), " (double quote), \, /, @, or space.  
    */
  var MasterUserPassword: String = js.native
  /**
    * The user name associated with the master user account for the cluster that is being created. Constraints:   Must be 1 - 128 alphanumeric characters. The user name can't be PUBLIC.   First character must be a letter.   Cannot be a reserved word. A list of reserved words can be found in Reserved Words in the Amazon Redshift Database Developer Guide.   
    */
  var MasterUsername: String = js.native
  /**
    * The node type to be provisioned for the cluster. For information about node types, go to  Working with Clusters in the Amazon Redshift Cluster Management Guide.  Valid Values: ds2.xlarge | ds2.8xlarge | dc1.large | dc1.8xlarge | dc2.large | dc2.8xlarge | ra3.16xlarge 
    */
  var NodeType: String = js.native
  /**
    * The number of compute nodes in the cluster. This parameter is required when the ClusterType parameter is specified as multi-node.  For information about determining how many nodes you need, go to  Working with Clusters in the Amazon Redshift Cluster Management Guide.  If you don't specify this parameter, you get a single-node cluster. When requesting a multi-node cluster, you must specify the number of nodes that you want in the cluster. Default: 1  Constraints: Value must be at least 1 and no more than 100.
    */
  var NumberOfNodes: js.UndefOr[IntegerOptional] = js.native
  /**
    * The port number on which the cluster accepts incoming connections. The cluster is accessible only via the JDBC and ODBC connection strings. Part of the connection string requires the port on which the cluster will listen for incoming connections. Default: 5439  Valid Values: 1150-65535 
    */
  var Port: js.UndefOr[IntegerOptional] = js.native
  /**
    * The weekly time range (in UTC) during which automated cluster maintenance can occur.  Format: ddd:hh24:mi-ddd:hh24:mi   Default: A 30-minute window selected at random from an 8-hour block of time per region, occurring on a random day of the week. For more information about the time blocks for each region, see Maintenance Windows in Amazon Redshift Cluster Management Guide. Valid Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun Constraints: Minimum 30-minute window.
    */
  var PreferredMaintenanceWindow: js.UndefOr[String] = js.native
  /**
    * If true, the cluster can be accessed from a public network. 
    */
  var PubliclyAccessible: js.UndefOr[BooleanOptional] = js.native
  /**
    * A unique identifier for the snapshot schedule.
    */
  var SnapshotScheduleIdentifier: js.UndefOr[String] = js.native
  /**
    * A list of tag instances.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * A list of Virtual Private Cloud (VPC) security groups to be associated with the cluster. Default: The default VPC security group is associated with the cluster.
    */
  var VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.native
}

object CreateClusterMessage {
  @scala.inline
  def apply(ClusterIdentifier: String, MasterUserPassword: String, MasterUsername: String, NodeType: String): CreateClusterMessage = {
    val __obj = js.Dynamic.literal(ClusterIdentifier = ClusterIdentifier.asInstanceOf[js.Any], MasterUserPassword = MasterUserPassword.asInstanceOf[js.Any], MasterUsername = MasterUsername.asInstanceOf[js.Any], NodeType = NodeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateClusterMessage]
  }
  @scala.inline
  implicit class CreateClusterMessageOps[Self <: CreateClusterMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClusterIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMasterUserPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MasterUserPassword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMasterUsername(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MasterUsername")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodeType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NodeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdditionalInfo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdditionalInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdditionalInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowVersionUpgrade(value: BooleanOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowVersionUpgrade")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowVersionUpgrade: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowVersionUpgrade")(js.undefined)
        ret
    }
    @scala.inline
    def withAutomatedSnapshotRetentionPeriod(value: IntegerOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutomatedSnapshotRetentionPeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutomatedSnapshotRetentionPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutomatedSnapshotRetentionPeriod")(js.undefined)
        ret
    }
    @scala.inline
    def withAvailabilityZone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailabilityZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailabilityZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailabilityZone")(js.undefined)
        ret
    }
    @scala.inline
    def withClusterParameterGroupName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterParameterGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterParameterGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterParameterGroupName")(js.undefined)
        ret
    }
    @scala.inline
    def withClusterSecurityGroups(value: ClusterSecurityGroupNameList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterSecurityGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterSecurityGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterSecurityGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withClusterSubnetGroupName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterSubnetGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterSubnetGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterSubnetGroupName")(js.undefined)
        ret
    }
    @scala.inline
    def withClusterType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterType")(js.undefined)
        ret
    }
    @scala.inline
    def withClusterVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withDBName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDBName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBName")(js.undefined)
        ret
    }
    @scala.inline
    def withElasticIp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ElasticIp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElasticIp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ElasticIp")(js.undefined)
        ret
    }
    @scala.inline
    def withEncrypted(value: BooleanOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Encrypted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncrypted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Encrypted")(js.undefined)
        ret
    }
    @scala.inline
    def withEnhancedVpcRouting(value: BooleanOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnhancedVpcRouting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnhancedVpcRouting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnhancedVpcRouting")(js.undefined)
        ret
    }
    @scala.inline
    def withHsmClientCertificateIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HsmClientCertificateIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHsmClientCertificateIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HsmClientCertificateIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withHsmConfigurationIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HsmConfigurationIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHsmConfigurationIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HsmConfigurationIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withIamRoles(value: IamRoleArnList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IamRoles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIamRoles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IamRoles")(js.undefined)
        ret
    }
    @scala.inline
    def withKmsKeyId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KmsKeyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKmsKeyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KmsKeyId")(js.undefined)
        ret
    }
    @scala.inline
    def withMaintenanceTrackName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaintenanceTrackName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaintenanceTrackName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaintenanceTrackName")(js.undefined)
        ret
    }
    @scala.inline
    def withManualSnapshotRetentionPeriod(value: IntegerOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ManualSnapshotRetentionPeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManualSnapshotRetentionPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ManualSnapshotRetentionPeriod")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberOfNodes(value: IntegerOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberOfNodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberOfNodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberOfNodes")(js.undefined)
        ret
    }
    @scala.inline
    def withPort(value: IntegerOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Port")(js.undefined)
        ret
    }
    @scala.inline
    def withPreferredMaintenanceWindow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PreferredMaintenanceWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreferredMaintenanceWindow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PreferredMaintenanceWindow")(js.undefined)
        ret
    }
    @scala.inline
    def withPubliclyAccessible(value: BooleanOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PubliclyAccessible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPubliclyAccessible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PubliclyAccessible")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapshotScheduleIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnapshotScheduleIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapshotScheduleIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnapshotScheduleIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
    @scala.inline
    def withVpcSecurityGroupIds(value: VpcSecurityGroupIdList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcSecurityGroupIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcSecurityGroupIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcSecurityGroupIds")(js.undefined)
        ret
    }
  }
  
}

