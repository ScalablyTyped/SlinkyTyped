package typingsSlinky.awsSdk.neptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDBClusterSnapshotsMessage extends js.Object {
  /**
    * The ID of the DB cluster to retrieve the list of DB cluster snapshots for. This parameter can't be used in conjunction with the DBClusterSnapshotIdentifier parameter. This parameter is not case-sensitive. Constraints:   If supplied, must match the identifier of an existing DBCluster.  
    */
  var DBClusterIdentifier: js.UndefOr[String] = js.native
  /**
    * A specific DB cluster snapshot identifier to describe. This parameter can't be used in conjunction with the DBClusterIdentifier parameter. This value is stored as a lowercase string. Constraints:   If supplied, must match the identifier of an existing DBClusterSnapshot.   If this identifier is for an automated snapshot, the SnapshotType parameter must also be specified.  
    */
  var DBClusterSnapshotIdentifier: js.UndefOr[String] = js.native
  /**
    * This parameter is not currently supported.
    */
  var Filters: js.UndefOr[FilterList] = js.native
  /**
    * True to include manual DB cluster snapshots that are public and can be copied or restored by any AWS account, and otherwise false. The default is false. The default is false. You can share a manual DB cluster snapshot as public by using the ModifyDBClusterSnapshotAttribute API action.
    */
  var IncludePublic: js.UndefOr[Boolean] = js.native
  /**
    * True to include shared manual DB cluster snapshots from other AWS accounts that this AWS account has been given permission to copy or restore, and otherwise false. The default is false. You can give an AWS account permission to restore a manual DB cluster snapshot from another AWS account by the ModifyDBClusterSnapshotAttribute API action.
    */
  var IncludeShared: js.UndefOr[Boolean] = js.native
  /**
    * An optional pagination token provided by a previous DescribeDBClusterSnapshots request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    * The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token called a marker is included in the response so that the remaining results can be retrieved. Default: 100 Constraints: Minimum 20, maximum 100.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.native
  /**
    * The type of DB cluster snapshots to be returned. You can specify one of the following values:    automated - Return all DB cluster snapshots that have been automatically taken by Amazon Neptune for my AWS account.    manual - Return all DB cluster snapshots that have been taken by my AWS account.    shared - Return all manual DB cluster snapshots that have been shared to my AWS account.    public - Return all DB cluster snapshots that have been marked as public.   If you don't specify a SnapshotType value, then both automated and manual DB cluster snapshots are returned. You can include shared DB cluster snapshots with these results by setting the IncludeShared parameter to true. You can include public DB cluster snapshots with these results by setting the IncludePublic parameter to true. The IncludeShared and IncludePublic parameters don't apply for SnapshotType values of manual or automated. The IncludePublic parameter doesn't apply when SnapshotType is set to shared. The IncludeShared parameter doesn't apply when SnapshotType is set to public.
    */
  var SnapshotType: js.UndefOr[String] = js.native
}

object DescribeDBClusterSnapshotsMessage {
  @scala.inline
  def apply(): DescribeDBClusterSnapshotsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDBClusterSnapshotsMessage]
  }
  @scala.inline
  implicit class DescribeDBClusterSnapshotsMessageOps[Self <: DescribeDBClusterSnapshotsMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDBClusterIdentifier(value: String): Self = {
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
    def withDBClusterSnapshotIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBClusterSnapshotIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDBClusterSnapshotIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBClusterSnapshotIdentifier")(js.undefined)
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

