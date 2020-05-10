package typingsSlinky.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplicationTaskStats extends js.Object {
  /**
    * The elapsed time of the task, in milliseconds.
    */
  var ElapsedTimeMillis: js.UndefOr[Long] = js.native
  /**
    * The date the replication task was started either with a fresh start or a target reload.
    */
  var FreshStartDate: js.UndefOr[js.Date] = js.native
  /**
    * The date the replication task full load was completed.
    */
  var FullLoadFinishDate: js.UndefOr[js.Date] = js.native
  /**
    * The percent complete for the full load migration task.
    */
  var FullLoadProgressPercent: js.UndefOr[Integer] = js.native
  /**
    * The date the replication task full load was started.
    */
  var FullLoadStartDate: js.UndefOr[js.Date] = js.native
  /**
    * The date the replication task was started either with a fresh start or a resume. For more information, see StartReplicationTaskType.
    */
  var StartDate: js.UndefOr[js.Date] = js.native
  /**
    * The date the replication task was stopped.
    */
  var StopDate: js.UndefOr[js.Date] = js.native
  /**
    * The number of errors that have occurred during this task.
    */
  var TablesErrored: js.UndefOr[Integer] = js.native
  /**
    * The number of tables loaded for this task.
    */
  var TablesLoaded: js.UndefOr[Integer] = js.native
  /**
    * The number of tables currently loading for this task.
    */
  var TablesLoading: js.UndefOr[Integer] = js.native
  /**
    * The number of tables queued for this task.
    */
  var TablesQueued: js.UndefOr[Integer] = js.native
}

object ReplicationTaskStats {
  @scala.inline
  def apply(): ReplicationTaskStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicationTaskStats]
  }
  @scala.inline
  implicit class ReplicationTaskStatsOps[Self <: ReplicationTaskStats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withElapsedTimeMillis(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ElapsedTimeMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElapsedTimeMillis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ElapsedTimeMillis")(js.undefined)
        ret
    }
    @scala.inline
    def withFreshStartDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FreshStartDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFreshStartDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FreshStartDate")(js.undefined)
        ret
    }
    @scala.inline
    def withFullLoadFinishDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FullLoadFinishDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullLoadFinishDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FullLoadFinishDate")(js.undefined)
        ret
    }
    @scala.inline
    def withFullLoadProgressPercent(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FullLoadProgressPercent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullLoadProgressPercent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FullLoadProgressPercent")(js.undefined)
        ret
    }
    @scala.inline
    def withFullLoadStartDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FullLoadStartDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullLoadStartDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FullLoadStartDate")(js.undefined)
        ret
    }
    @scala.inline
    def withStartDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartDate")(js.undefined)
        ret
    }
    @scala.inline
    def withStopDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StopDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStopDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StopDate")(js.undefined)
        ret
    }
    @scala.inline
    def withTablesErrored(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TablesErrored")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTablesErrored: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TablesErrored")(js.undefined)
        ret
    }
    @scala.inline
    def withTablesLoaded(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TablesLoaded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTablesLoaded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TablesLoaded")(js.undefined)
        ret
    }
    @scala.inline
    def withTablesLoading(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TablesLoading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTablesLoading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TablesLoading")(js.undefined)
        ret
    }
    @scala.inline
    def withTablesQueued(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TablesQueued")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTablesQueued: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TablesQueued")(js.undefined)
        ret
    }
  }
  
}

