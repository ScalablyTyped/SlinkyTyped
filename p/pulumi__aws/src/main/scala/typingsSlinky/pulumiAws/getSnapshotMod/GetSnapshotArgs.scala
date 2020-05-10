package typingsSlinky.pulumiAws.getSnapshotMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.ebs.GetSnapshotFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSnapshotArgs extends js.Object {
  /**
    * One or more name/value pairs to filter off of. There are
    * several valid keys, for a full reference, check out
    * [describe-snapshots in the AWS CLI reference][1].
    */
  val filters: js.UndefOr[js.Array[GetSnapshotFilter]] = js.native
  /**
    * If more than one result is returned, use the most recent snapshot.
    */
  val mostRecent: js.UndefOr[Boolean] = js.native
  /**
    * Returns the snapshots owned by the specified owner id. Multiple owners can be specified.
    */
  val owners: js.UndefOr[js.Array[String]] = js.native
  /**
    * One or more AWS accounts IDs that can create volumes from the snapshot.
    */
  val restorableByUserIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Returns information on a specific snapshot_id.
    */
  val snapshotIds: js.UndefOr[js.Array[String]] = js.native
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.native
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
    def withFilters(value: js.Array[GetSnapshotFilter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(js.undefined)
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
    def withOwners(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owners")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwners: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owners")(js.undefined)
        ret
    }
    @scala.inline
    def withRestorableByUserIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restorableByUserIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestorableByUserIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restorableByUserIds")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapshotIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshotIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapshotIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshotIds")(js.undefined)
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

