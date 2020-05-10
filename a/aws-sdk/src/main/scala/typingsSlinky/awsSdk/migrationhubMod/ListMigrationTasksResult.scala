package typingsSlinky.awsSdk.migrationhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListMigrationTasksResult extends js.Object {
  /**
    * Lists the migration task's summary which includes: MigrationTaskName, ProgressPercent, ProgressUpdateStream, Status, and the UpdateDateTime for each task.
    */
  var MigrationTaskSummaryList: js.UndefOr[typingsSlinky.awsSdk.migrationhubMod.MigrationTaskSummaryList] = js.native
  /**
    * If there are more migration tasks than the max result, return the next token to be passed to the next call as a bookmark of where to start from.
    */
  var NextToken: js.UndefOr[Token] = js.native
}

object ListMigrationTasksResult {
  @scala.inline
  def apply(): ListMigrationTasksResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMigrationTasksResult]
  }
  @scala.inline
  implicit class ListMigrationTasksResultOps[Self <: ListMigrationTasksResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMigrationTaskSummaryList(value: MigrationTaskSummaryList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MigrationTaskSummaryList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMigrationTaskSummaryList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MigrationTaskSummaryList")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: Token): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
  }
  
}

