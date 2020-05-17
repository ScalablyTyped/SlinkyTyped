package typingsSlinky.awsSdk.anon

import typingsSlinky.awsSdk.rdsMod.Boolean
import typingsSlinky.awsSdk.rdsMod.FilterList
import typingsSlinky.awsSdk.rdsMod.IntegerOptional
import typingsSlinky.awsSdk.rdsMod.String
import typingsSlinky.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/rds.DescribeDBSnapshotsMessage & {  $waiter ? :aws-sdk.aws-sdk/lib/service.WaiterConfiguration} */
@js.native
trait DescribeDBSnapshotsMessag extends js.Object {
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  /**
    * The ID of the DB instance to retrieve the list of DB snapshots for. This parameter can't be used in conjunction with DBSnapshotIdentifier. This parameter isn't case-sensitive.  Constraints:   If supplied, must match the identifier of an existing DBInstance.  
    */
  var DBInstanceIdentifier: js.UndefOr[String] = js.native
  /**
    *  A specific DB snapshot identifier to describe. This parameter can't be used in conjunction with DBInstanceIdentifier. This value is stored as a lowercase string.  Constraints:   If supplied, must match the identifier of an existing DBSnapshot.   If this identifier is for an automated snapshot, the SnapshotType parameter must also be specified.  
    */
  var DBSnapshotIdentifier: js.UndefOr[String] = js.native
  /**
    * A specific DB resource ID to describe.
    */
  var DbiResourceId: js.UndefOr[String] = js.native
  /**
    * A filter that specifies one or more DB snapshots to describe. Supported filters:    db-instance-id - Accepts DB instance identifiers and DB instance Amazon Resource Names (ARNs).    db-snapshot-id - Accepts DB snapshot identifiers.    dbi-resource-id - Accepts identifiers of source DB instances.    snapshot-type - Accepts types of DB snapshots.    engine - Accepts names of database engines.  
    */
  var Filters: js.UndefOr[FilterList] = js.native
  /**
    * A value that indicates whether to include manual DB cluster snapshots that are public and can be copied or restored by any AWS account. By default, the public snapshots are not included. You can share a manual DB snapshot as public by using the ModifyDBSnapshotAttribute API.
    */
  var IncludePublic: js.UndefOr[Boolean] = js.native
  /**
    * A value that indicates whether to include shared manual DB cluster snapshots from other AWS accounts that this AWS account has been given permission to copy or restore. By default, these snapshots are not included. You can give an AWS account permission to restore a manual DB snapshot from another AWS account by using the ModifyDBSnapshotAttribute API action.
    */
  var IncludeShared: js.UndefOr[Boolean] = js.native
  /**
    *  An optional pagination token provided by a previous DescribeDBSnapshots request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    *  The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token called a marker is included in the response so that you can retrieve the remaining results.  Default: 100 Constraints: Minimum 20, maximum 100.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.native
  /**
    * The type of snapshots to be returned. You can specify one of the following values:    automated - Return all DB snapshots that have been automatically taken by Amazon RDS for my AWS account.    manual - Return all DB snapshots that have been taken by my AWS account.    shared - Return all manual DB snapshots that have been shared to my AWS account.    public - Return all DB snapshots that have been marked as public.    awsbackup - Return the DB snapshots managed by the AWS Backup service. For information about AWS Backup, see the  AWS Backup Developer Guide.   The awsbackup type does not apply to Aurora.   If you don't specify a SnapshotType value, then both automated and manual snapshots are returned. Shared and public DB snapshots are not included in the returned results by default. You can include shared snapshots with these results by enabling the IncludeShared parameter. You can include public snapshots with these results by enabling the IncludePublic parameter. The IncludeShared and IncludePublic parameters don't apply for SnapshotType values of manual or automated. The IncludePublic parameter doesn't apply when SnapshotType is set to shared. The IncludeShared parameter doesn't apply when SnapshotType is set to public.
    */
  var SnapshotType: js.UndefOr[String] = js.native
}

object DescribeDBSnapshotsMessag {
  @scala.inline
  def apply(): DescribeDBSnapshotsMessag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDBSnapshotsMessag]
  }
  @scala.inline
  implicit class DescribeDBSnapshotsMessagOps[Self <: DescribeDBSnapshotsMessag] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$waiter(value: WaiterConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$waiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$waiter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$waiter")(js.undefined)
        ret
    }
    @scala.inline
    def withDBInstanceIdentifier(value: String): Self = {
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
    def withDBSnapshotIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBSnapshotIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDBSnapshotIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBSnapshotIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withDbiResourceId(value: String): Self = {
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
    def withFilters(value: FilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Filters")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludePublic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncludePublic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludePublic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncludePublic")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeShared(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncludeShared")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeShared: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncludeShared")(js.undefined)
        ret
    }
    @scala.inline
    def withMarker(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Marker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Marker")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxRecords(value: IntegerOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxRecords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxRecords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxRecords")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapshotType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnapshotType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapshotType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnapshotType")(js.undefined)
        ret
    }
  }
  
}

