package typingsSlinky.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterDbRevision extends js.Object {
  /**
    * The unique identifier of the cluster.
    */
  var ClusterIdentifier: js.UndefOr[String] = js.native
  /**
    * A string representing the current cluster version.
    */
  var CurrentDatabaseRevision: js.UndefOr[String] = js.native
  /**
    * The date on which the database revision was released.
    */
  var DatabaseRevisionReleaseDate: js.UndefOr[js.Date] = js.native
  /**
    * A list of RevisionTarget objects, where each object describes the database revision that a cluster can be updated to.
    */
  var RevisionTargets: js.UndefOr[RevisionTargetsList] = js.native
}

object ClusterDbRevision {
  @scala.inline
  def apply(): ClusterDbRevision = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterDbRevision]
  }
  @scala.inline
  implicit class ClusterDbRevisionOps[Self <: ClusterDbRevision] (val x: Self) extends AnyVal {
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
    def withoutClusterIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentDatabaseRevision(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentDatabaseRevision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentDatabaseRevision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentDatabaseRevision")(js.undefined)
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
    def withRevisionTargets(value: RevisionTargetsList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RevisionTargets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRevisionTargets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RevisionTargets")(js.undefined)
        ret
    }
  }
  
}

