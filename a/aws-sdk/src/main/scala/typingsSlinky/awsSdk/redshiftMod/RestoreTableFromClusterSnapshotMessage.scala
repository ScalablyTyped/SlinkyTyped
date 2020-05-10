package typingsSlinky.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RestoreTableFromClusterSnapshotMessage extends js.Object {
  /**
    * The identifier of the Amazon Redshift cluster to restore the table to.
    */
  var ClusterIdentifier: String = js.native
  /**
    * The name of the table to create as a result of the current request.
    */
  var NewTableName: String = js.native
  /**
    * The identifier of the snapshot to restore the table from. This snapshot must have been created from the Amazon Redshift cluster specified by the ClusterIdentifier parameter.
    */
  var SnapshotIdentifier: String = js.native
  /**
    * The name of the source database that contains the table to restore from.
    */
  var SourceDatabaseName: String = js.native
  /**
    * The name of the source schema that contains the table to restore from. If you do not specify a SourceSchemaName value, the default is public.
    */
  var SourceSchemaName: js.UndefOr[String] = js.native
  /**
    * The name of the source table to restore from.
    */
  var SourceTableName: String = js.native
  /**
    * The name of the database to restore the table to.
    */
  var TargetDatabaseName: js.UndefOr[String] = js.native
  /**
    * The name of the schema to restore the table to.
    */
  var TargetSchemaName: js.UndefOr[String] = js.native
}

object RestoreTableFromClusterSnapshotMessage {
  @scala.inline
  def apply(
    ClusterIdentifier: String,
    NewTableName: String,
    SnapshotIdentifier: String,
    SourceDatabaseName: String,
    SourceTableName: String
  ): RestoreTableFromClusterSnapshotMessage = {
    val __obj = js.Dynamic.literal(ClusterIdentifier = ClusterIdentifier.asInstanceOf[js.Any], NewTableName = NewTableName.asInstanceOf[js.Any], SnapshotIdentifier = SnapshotIdentifier.asInstanceOf[js.Any], SourceDatabaseName = SourceDatabaseName.asInstanceOf[js.Any], SourceTableName = SourceTableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreTableFromClusterSnapshotMessage]
  }
  @scala.inline
  implicit class RestoreTableFromClusterSnapshotMessageOps[Self <: RestoreTableFromClusterSnapshotMessage] (val x: Self) extends AnyVal {
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
    def withNewTableName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NewTableName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSnapshotIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnapshotIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceDatabaseName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceDatabaseName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceTableName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceTableName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceSchemaName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceSchemaName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceSchemaName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceSchemaName")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetDatabaseName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetDatabaseName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetDatabaseName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetDatabaseName")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetSchemaName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetSchemaName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetSchemaName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetSchemaName")(js.undefined)
        ret
    }
  }
  
}

