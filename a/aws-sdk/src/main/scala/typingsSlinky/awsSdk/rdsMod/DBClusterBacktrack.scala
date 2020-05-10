package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DBClusterBacktrack extends js.Object {
  /**
    * Contains the backtrack identifier.
    */
  var BacktrackIdentifier: js.UndefOr[String] = js.native
  /**
    * The timestamp of the time at which the backtrack was requested.
    */
  var BacktrackRequestCreationTime: js.UndefOr[js.Date] = js.native
  /**
    * The timestamp of the time to which the DB cluster was backtracked.
    */
  var BacktrackTo: js.UndefOr[js.Date] = js.native
  /**
    * The timestamp of the time from which the DB cluster was backtracked.
    */
  var BacktrackedFrom: js.UndefOr[js.Date] = js.native
  /**
    * Contains a user-supplied DB cluster identifier. This identifier is the unique key that identifies a DB cluster.
    */
  var DBClusterIdentifier: js.UndefOr[String] = js.native
  /**
    * The status of the backtrack. This property returns one of the following values:    applying - The backtrack is currently being applied to or rolled back from the DB cluster.    completed - The backtrack has successfully been applied to or rolled back from the DB cluster.    failed - An error occurred while the backtrack was applied to or rolled back from the DB cluster.    pending - The backtrack is currently pending application to or rollback from the DB cluster.  
    */
  var Status: js.UndefOr[String] = js.native
}

object DBClusterBacktrack {
  @scala.inline
  def apply(): DBClusterBacktrack = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBClusterBacktrack]
  }
  @scala.inline
  implicit class DBClusterBacktrackOps[Self <: DBClusterBacktrack] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBacktrackIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BacktrackIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBacktrackIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BacktrackIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withBacktrackRequestCreationTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BacktrackRequestCreationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBacktrackRequestCreationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BacktrackRequestCreationTime")(js.undefined)
        ret
    }
    @scala.inline
    def withBacktrackTo(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BacktrackTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBacktrackTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BacktrackTo")(js.undefined)
        ret
    }
    @scala.inline
    def withBacktrackedFrom(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BacktrackedFrom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBacktrackedFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BacktrackedFrom")(js.undefined)
        ret
    }
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
  }
  
}

