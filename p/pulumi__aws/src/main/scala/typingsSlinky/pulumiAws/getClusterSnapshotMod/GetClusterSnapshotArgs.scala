package typingsSlinky.pulumiAws.getClusterSnapshotMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetClusterSnapshotArgs extends js.Object {
  /**
    * Returns the list of snapshots created by the specific db_cluster
    */
  val dbClusterIdentifier: js.UndefOr[String] = js.native
  /**
    * Returns information on a specific snapshot_id.
    */
  val dbClusterSnapshotIdentifier: js.UndefOr[String] = js.native
  /**
    * Set this value to true to include manual DB Cluster Snapshots that are public and can be
    * copied or restored by any AWS account, otherwise set this value to false. The default is `false`.
    */
  val includePublic: js.UndefOr[Boolean] = js.native
  /**
    * Set this value to true to include shared manual DB Cluster Snapshots from other
    * AWS accounts that this AWS account has been given permission to copy or restore, otherwise set this value to false.
    * The default is `false`.
    */
  val includeShared: js.UndefOr[Boolean] = js.native
  /**
    * If more than one result is returned, use the most recent Snapshot.
    */
  val mostRecent: js.UndefOr[Boolean] = js.native
  /**
    * The type of snapshots to be returned. If you don't specify a SnapshotType
    * value, then both automated and manual DB cluster snapshots are returned. Shared and public DB Cluster Snapshots are not
    * included in the returned results by default. Possible values are, `automated`, `manual`, `shared` and `public`.
    */
  val snapshotType: js.UndefOr[String] = js.native
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object GetClusterSnapshotArgs {
  @scala.inline
  def apply(): GetClusterSnapshotArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetClusterSnapshotArgs]
  }
  @scala.inline
  implicit class GetClusterSnapshotArgsOps[Self <: GetClusterSnapshotArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDbClusterIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dbClusterIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDbClusterIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dbClusterIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withDbClusterSnapshotIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dbClusterSnapshotIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDbClusterSnapshotIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dbClusterSnapshotIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludePublic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includePublic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludePublic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includePublic")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeShared(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeShared")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeShared: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeShared")(js.undefined)
        ret
    }
    @scala.inline
    def withMostRecent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mostRecent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMostRecent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mostRecent")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapshotType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshotType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapshotType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshotType")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

