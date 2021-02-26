package typingsSlinky.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSourceRefreshSchedule extends StObject {
  
  /** Daily refresh schedule. */
  var dailySchedule: js.UndefOr[DataSourceRefreshDailySchedule] = js.native
  
  /** True if the refresh schedule is enabled, or false otherwise. */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /** Monthly refresh schedule. */
  var monthlySchedule: js.UndefOr[DataSourceRefreshMonthlySchedule] = js.native
  
  /** Output only. The time interval of the next run. */
  var nextRun: js.UndefOr[Interval] = js.native
  
  /** The scope of the refresh. Must be ALL_DATA_SOURCES. */
  var refreshScope: js.UndefOr[String] = js.native
  
  /** Weekly refresh schedule. */
  var weeklySchedule: js.UndefOr[DataSourceRefreshWeeklySchedule] = js.native
}
object DataSourceRefreshSchedule {
  
  @scala.inline
  def apply(): DataSourceRefreshSchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceRefreshSchedule]
  }
  
  @scala.inline
  implicit class DataSourceRefreshScheduleMutableBuilder[Self <: DataSourceRefreshSchedule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDailySchedule(value: DataSourceRefreshDailySchedule): Self = StObject.set(x, "dailySchedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDailyScheduleUndefined: Self = StObject.set(x, "dailySchedule", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setMonthlySchedule(value: DataSourceRefreshMonthlySchedule): Self = StObject.set(x, "monthlySchedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonthlyScheduleUndefined: Self = StObject.set(x, "monthlySchedule", js.undefined)
    
    @scala.inline
    def setNextRun(value: Interval): Self = StObject.set(x, "nextRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextRunUndefined: Self = StObject.set(x, "nextRun", js.undefined)
    
    @scala.inline
    def setRefreshScope(value: String): Self = StObject.set(x, "refreshScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshScopeUndefined: Self = StObject.set(x, "refreshScope", js.undefined)
    
    @scala.inline
    def setWeeklySchedule(value: DataSourceRefreshWeeklySchedule): Self = StObject.set(x, "weeklySchedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeeklyScheduleUndefined: Self = StObject.set(x, "weeklySchedule", js.undefined)
  }
}
