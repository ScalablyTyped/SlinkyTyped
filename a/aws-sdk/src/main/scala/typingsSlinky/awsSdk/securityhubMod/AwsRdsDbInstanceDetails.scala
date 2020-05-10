package typingsSlinky.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsRdsDbInstanceDetails extends js.Object {
  /**
    * The AWS Identity and Access Management (IAM) roles associated with the DB instance.
    */
  var AssociatedRoles: js.UndefOr[AwsRdsDbInstanceAssociatedRoles] = js.native
  /**
    * The identifier of the CA certificate for this DB instance.
    */
  var CACertificateIdentifier: js.UndefOr[NonEmptyString] = js.native
  /**
    * If the DB instance is a member of a DB cluster, contains the name of the DB cluster that the DB instance is a member of.
    */
  var DBClusterIdentifier: js.UndefOr[NonEmptyString] = js.native
  /**
    * Contains the name of the compute and memory capacity class of the DB instance.
    */
  var DBInstanceClass: js.UndefOr[NonEmptyString] = js.native
  /**
    * Contains a user-supplied database identifier. This identifier is the unique key that identifies a DB instance.
    */
  var DBInstanceIdentifier: js.UndefOr[NonEmptyString] = js.native
  /**
    * The meaning of this parameter differs according to the database engine you use.  MySQL, MariaDB, SQL Server, PostgreSQL  Contains the name of the initial database of this instance that was provided at create time, if one was specified when the DB instance was created. This same name is returned for the life of the DB instance.  Oracle  Contains the Oracle System ID (SID) of the created DB instance. Not shown when the returned parameters do not apply to an Oracle DB instance. 
    */
  var DBName: js.UndefOr[NonEmptyString] = js.native
  /**
    * Specifies the port that the DB instance listens on. If the DB instance is part of a DB cluster, this can be a different port than the DB cluster port.
    */
  var DbInstancePort: js.UndefOr[Integer] = js.native
  /**
    * The AWS Region-unique, immutable identifier for the DB instance. This identifier is found in AWS CloudTrail log entries whenever the AWS KMS key for the DB instance is accessed. 
    */
  var DbiResourceId: js.UndefOr[NonEmptyString] = js.native
  /**
    * Indicates whether the DB instance has deletion protection enabled. When deletion protection is enabled, the database cannot be deleted.
    */
  var DeletionProtection: js.UndefOr[Boolean] = js.native
  /**
    * Specifies the connection endpoint.
    */
  var Endpoint: js.UndefOr[AwsRdsDbInstanceEndpoint] = js.native
  /**
    * Provides the name of the database engine to use for this DB instance.
    */
  var Engine: js.UndefOr[NonEmptyString] = js.native
  /**
    * Indicates the database engine version.
    */
  var EngineVersion: js.UndefOr[NonEmptyString] = js.native
  /**
    * True if mapping of AWS Identity and Access Management (IAM) accounts to database accounts is enabled, and otherwise false. IAM database authentication can be enabled for the following database engines.   For MySQL 5.6, minor version 5.6.34 or higher   For MySQL 5.7, minor version 5.7.16 or higher   Aurora 5.6 or higher  
    */
  var IAMDatabaseAuthenticationEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Provides the date and time the DB instance was created.
    */
  var InstanceCreateTime: js.UndefOr[NonEmptyString] = js.native
  /**
    * If StorageEncrypted is true, the AWS KMS key identifier for the encrypted DB instance.
    */
  var KmsKeyId: js.UndefOr[NonEmptyString] = js.native
  /**
    * Specifies the accessibility options for the DB instance. A value of true specifies an Internet-facing instance with a publicly resolvable DNS name, which resolves to a public IP address. A value of false specifies an internal instance with a DNS name that resolves to a private IP address. 
    */
  var PubliclyAccessible: js.UndefOr[Boolean] = js.native
  /**
    * Specifies whether the DB instance is encrypted.
    */
  var StorageEncrypted: js.UndefOr[Boolean] = js.native
  /**
    * The ARN from the key store with which the instance is associated for TDE encryption.
    */
  var TdeCredentialArn: js.UndefOr[NonEmptyString] = js.native
  /**
    * A list of VPC security groups that the DB instance belongs to.
    */
  var VpcSecurityGroups: js.UndefOr[AwsRdsDbInstanceVpcSecurityGroups] = js.native
}

object AwsRdsDbInstanceDetails {
  @scala.inline
  def apply(): AwsRdsDbInstanceDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsRdsDbInstanceDetails]
  }
  @scala.inline
  implicit class AwsRdsDbInstanceDetailsOps[Self <: AwsRdsDbInstanceDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssociatedRoles(value: AwsRdsDbInstanceAssociatedRoles): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssociatedRoles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssociatedRoles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssociatedRoles")(js.undefined)
        ret
    }
    @scala.inline
    def withCACertificateIdentifier(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CACertificateIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCACertificateIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CACertificateIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withDBClusterIdentifier(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBClusterIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDBClusterIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBClusterIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withDBInstanceClass(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBInstanceClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDBInstanceClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBInstanceClass")(js.undefined)
        ret
    }
    @scala.inline
    def withDBInstanceIdentifier(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBInstanceIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDBInstanceIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBInstanceIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withDBName(value: NonEmptyString): Self = {
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
    def withDbInstancePort(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DbInstancePort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDbInstancePort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DbInstancePort")(js.undefined)
        ret
    }
    @scala.inline
    def withDbiResourceId(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DbiResourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDbiResourceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DbiResourceId")(js.undefined)
        ret
    }
    @scala.inline
    def withDeletionProtection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeletionProtection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeletionProtection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeletionProtection")(js.undefined)
        ret
    }
    @scala.inline
    def withEndpoint(value: AwsRdsDbInstanceEndpoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Endpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Endpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withEngine(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Engine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEngine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Engine")(js.undefined)
        ret
    }
    @scala.inline
    def withEngineVersion(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EngineVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEngineVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EngineVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withIAMDatabaseAuthenticationEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IAMDatabaseAuthenticationEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIAMDatabaseAuthenticationEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IAMDatabaseAuthenticationEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceCreateTime(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceCreateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceCreateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceCreateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withKmsKeyId(value: NonEmptyString): Self = {
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
    def withPubliclyAccessible(value: Boolean): Self = {
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
    def withStorageEncrypted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StorageEncrypted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorageEncrypted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StorageEncrypted")(js.undefined)
        ret
    }
    @scala.inline
    def withTdeCredentialArn(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TdeCredentialArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTdeCredentialArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TdeCredentialArn")(js.undefined)
        ret
    }
    @scala.inline
    def withVpcSecurityGroups(value: AwsRdsDbInstanceVpcSecurityGroups): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcSecurityGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcSecurityGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcSecurityGroups")(js.undefined)
        ret
    }
  }
  
}

