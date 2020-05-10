package typingsSlinky.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RevisionTarget extends js.Object {
  /**
    * A unique string that identifies the version to update the cluster to. You can use this value in ModifyClusterDbRevision.
    */
  var DatabaseRevision: js.UndefOr[String] = js.native
  /**
    * The date on which the database revision was released.
    */
  var DatabaseRevisionReleaseDate: js.UndefOr[js.Date] = js.native
  /**
    * A string that describes the changes and features that will be applied to the cluster when it is updated to the corresponding ClusterDbRevision.
    */
  var Description: js.UndefOr[String] = js.native
}

object RevisionTarget {
  @scala.inline
  def apply(): RevisionTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RevisionTarget]
  }
  @scala.inline
  implicit class RevisionTargetOps[Self <: RevisionTarget] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDatabaseRevision(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DatabaseRevision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatabaseRevision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DatabaseRevision")(js.undefined)
        ret
    }
    @scala.inline
    def withDatabaseRevisionReleaseDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DatabaseRevisionReleaseDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatabaseRevisionReleaseDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DatabaseRevisionReleaseDate")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
  }
  
}

