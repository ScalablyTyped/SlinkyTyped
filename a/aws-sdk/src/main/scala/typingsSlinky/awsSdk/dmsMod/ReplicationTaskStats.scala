package typingsSlinky.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplicationTaskStats extends StObject {
  
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
  implicit class ReplicationTaskStatsMutableBuilder[Self <: ReplicationTaskStats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElapsedTimeMillis(value: Long): Self = StObject.set(x, "ElapsedTimeMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElapsedTimeMillisUndefined: Self = StObject.set(x, "ElapsedTimeMillis", js.undefined)
    
    @scala.inline
    def setFreshStartDate(value: js.Date): Self = StObject.set(x, "FreshStartDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFreshStartDateUndefined: Self = StObject.set(x, "FreshStartDate", js.undefined)
    
    @scala.inline
    def setFullLoadFinishDate(value: js.Date): Self = StObject.set(x, "FullLoadFinishDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullLoadFinishDateUndefined: Self = StObject.set(x, "FullLoadFinishDate", js.undefined)
    
    @scala.inline
    def setFullLoadProgressPercent(value: Integer): Self = StObject.set(x, "FullLoadProgressPercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullLoadProgressPercentUndefined: Self = StObject.set(x, "FullLoadProgressPercent", js.undefined)
    
    @scala.inline
    def setFullLoadStartDate(value: js.Date): Self = StObject.set(x, "FullLoadStartDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullLoadStartDateUndefined: Self = StObject.set(x, "FullLoadStartDate", js.undefined)
    
    @scala.inline
    def setStartDate(value: js.Date): Self = StObject.set(x, "StartDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDateUndefined: Self = StObject.set(x, "StartDate", js.undefined)
    
    @scala.inline
    def setStopDate(value: js.Date): Self = StObject.set(x, "StopDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopDateUndefined: Self = StObject.set(x, "StopDate", js.undefined)
    
    @scala.inline
    def setTablesErrored(value: Integer): Self = StObject.set(x, "TablesErrored", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTablesErroredUndefined: Self = StObject.set(x, "TablesErrored", js.undefined)
    
    @scala.inline
    def setTablesLoaded(value: Integer): Self = StObject.set(x, "TablesLoaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTablesLoadedUndefined: Self = StObject.set(x, "TablesLoaded", js.undefined)
    
    @scala.inline
    def setTablesLoading(value: Integer): Self = StObject.set(x, "TablesLoading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTablesLoadingUndefined: Self = StObject.set(x, "TablesLoading", js.undefined)
    
    @scala.inline
    def setTablesQueued(value: Integer): Self = StObject.set(x, "TablesQueued", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTablesQueuedUndefined: Self = StObject.set(x, "TablesQueued", js.undefined)
  }
}
