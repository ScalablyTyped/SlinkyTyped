package typingsSlinky.pulumiAws.rdsGetSnapshotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSnapshotArgs extends js.Object {
  /**
    * Returns the list of snapshots created by the specific db_instance
    */
  val dbInstanceIdentifier: js.UndefOr[String] = js.native
  /**
    * Returns information on a specific snapshot_id.
    */
  val dbSnapshotIdentifier: js.UndefOr[String] = js.native
  /**
    * Set this value to true to include manual DB snapshots that are public and can be
    * copied or restored by any AWS account, otherwise set this value to false. The default is `false`.
    */
  val includePublic: js.UndefOr[Boolean] = js.native
  /**
    * Set this value to true to include shared manual DB snapshots from other
    * AWS accounts that this AWS account has been given permission to copy or restore, otherwise set this value to false.
    * The default is `false`.
    */
  val includeShared: js.UndefOr[Boolean] = js.native
  /**
    * If more than one result is returned, use the most
    * recent Snapshot.
    */
  val mostRecent: js.UndefOr[Boolean] = js.native
  /**
    * The type of snapshots to be returned. If you don't specify a SnapshotType
    * value, then both automated and manual snapshots are returned. Shared and public DB snapshots are not
    * included in the returned results by default. Possible values are, `automated`, `manual`, `shared` and `public`.
    */
  val snapshotType: js.UndefOr[String] = js.native
}

object GetSnapshotArgs {
  @scala.inline
  def apply(): GetSnapshotArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSnapshotArgs]
  }
  @scala.inline
  implicit class GetSnapshotArgsOps[Self <: GetSnapshotArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDbInstanceIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dbInstanceIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDbInstanceIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dbInstanceIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withDbSnapshotIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dbSnapshotIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDbSnapshotIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dbSnapshotIdentifier")(js.undefined)
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
  }
  
}

