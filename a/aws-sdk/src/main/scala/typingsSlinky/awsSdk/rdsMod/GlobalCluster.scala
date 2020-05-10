package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalCluster extends js.Object {
  /**
    *  The default database name within the new global database cluster. 
    */
  var DatabaseName: js.UndefOr[String] = js.native
  /**
    *  The deletion protection setting for the new global database cluster. 
    */
  var DeletionProtection: js.UndefOr[BooleanOptional] = js.native
  /**
    *  The Aurora database engine used by the global database cluster. 
    */
  var Engine: js.UndefOr[String] = js.native
  /**
    * Indicates the database engine version.
    */
  var EngineVersion: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) for the global database cluster.
    */
  var GlobalClusterArn: js.UndefOr[String] = js.native
  /**
    *  Contains a user-supplied global database cluster identifier. This identifier is the unique key that identifies a global database cluster. 
    */
  var GlobalClusterIdentifier: js.UndefOr[String] = js.native
  /**
    *  The list of cluster IDs for secondary clusters within the global database cluster. Currently limited to 1 item. 
    */
  var GlobalClusterMembers: js.UndefOr[GlobalClusterMemberList] = js.native
  /**
    *  The AWS Region-unique, immutable identifier for the global database cluster. This identifier is found in AWS CloudTrail log entries whenever the AWS KMS key for the DB cluster is accessed. 
    */
  var GlobalClusterResourceId: js.UndefOr[String] = js.native
  /**
    * Specifies the current state of this global database cluster.
    */
  var Status: js.UndefOr[String] = js.native
  /**
    *  The storage encryption setting for the global database cluster. 
    */
  var StorageEncrypted: js.UndefOr[BooleanOptional] = js.native
}

object GlobalCluster {
  @scala.inline
  def apply(): GlobalCluster = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlobalCluster]
  }
  @scala.inline
  implicit class GlobalClusterOps[Self <: GlobalCluster] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDatabaseName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DatabaseName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatabaseName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DatabaseName")(js.undefined)
        ret
    }
    @scala.inline
    def withDeletionProtection(value: BooleanOptional): Self = {
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
    def withEngine(value: String): Self = {
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
    def withEngineVersion(value: String): Self = {
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
    def withGlobalClusterArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalClusterArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobalClusterArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalClusterArn")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobalClusterIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalClusterIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobalClusterIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalClusterIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobalClusterMembers(value: GlobalClusterMemberList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalClusterMembers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobalClusterMembers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalClusterMembers")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobalClusterResourceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalClusterResourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobalClusterResourceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalClusterResourceId")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
    @scala.inline
    def withStorageEncrypted(value: BooleanOptional): Self = {
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
  }
  
}

