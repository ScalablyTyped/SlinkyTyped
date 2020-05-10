package typingsSlinky.gapiClientSpanner.gapi.client.spanner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDatabaseDdlMetadata extends js.Object {
  /**
    * Reports the commit timestamps of all statements that have
    * succeeded so far, where `commit_timestamps[i]` is the commit
    * timestamp for the statement `statements[i]`.
    */
  var commitTimestamps: js.UndefOr[js.Array[String]] = js.native
  /** The database being modified. */
  var database: js.UndefOr[String] = js.native
  /**
    * For an update this list contains all the statements. For an
    * individual statement, this list contains only that statement.
    */
  var statements: js.UndefOr[js.Array[String]] = js.native
}

object UpdateDatabaseDdlMetadata {
  @scala.inline
  def apply(): UpdateDatabaseDdlMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDatabaseDdlMetadata]
  }
  @scala.inline
  implicit class UpdateDatabaseDdlMetadataOps[Self <: UpdateDatabaseDdlMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommitTimestamps(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commitTimestamps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommitTimestamps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commitTimestamps")(js.undefined)
        ret
    }
    @scala.inline
    def withDatabase(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("database")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatabase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("database")(js.undefined)
        ret
    }
    @scala.inline
    def withStatements(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statements")(js.undefined)
        ret
    }
  }
  
}

