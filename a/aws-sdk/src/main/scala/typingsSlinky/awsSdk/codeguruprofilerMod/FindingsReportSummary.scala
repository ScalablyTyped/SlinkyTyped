package typingsSlinky.awsSdk.codeguruprofilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FindingsReportSummary extends StObject {
  
  /**
    * The universally unique identifier (UUID) of the recommendation report.
    */
  var id: js.UndefOr[FindingsReportId] = js.native
  
  /**
    *  The end time of the period during which the metric is flagged as anomalous. This is specified using the ISO 8601 format. For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC. 
    */
  var profileEndTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The start time of the profile the analysis data is about. This is specified using the ISO 8601 format. For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
    */
  var profileStartTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The name of the profiling group that is associated with the analysis data.
    */
  var profilingGroupName: js.UndefOr[String] = js.native
  
  /**
    * The total number of different recommendations that were found by the analysis.
    */
  var totalNumberOfFindings: js.UndefOr[Integer] = js.native
}
object FindingsReportSummary {
  
  @scala.inline
  def apply(): FindingsReportSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindingsReportSummary]
  }
  
  @scala.inline
  implicit class FindingsReportSummaryMutableBuilder[Self <: FindingsReportSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: FindingsReportId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setProfileEndTime(value: js.Date): Self = StObject.set(x, "profileEndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileEndTimeUndefined: Self = StObject.set(x, "profileEndTime", js.undefined)
    
    @scala.inline
    def setProfileStartTime(value: js.Date): Self = StObject.set(x, "profileStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileStartTimeUndefined: Self = StObject.set(x, "profileStartTime", js.undefined)
    
    @scala.inline
    def setProfilingGroupName(value: String): Self = StObject.set(x, "profilingGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfilingGroupNameUndefined: Self = StObject.set(x, "profilingGroupName", js.undefined)
    
    @scala.inline
    def setTotalNumberOfFindings(value: Integer): Self = StObject.set(x, "totalNumberOfFindings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalNumberOfFindingsUndefined: Self = StObject.set(x, "totalNumberOfFindings", js.undefined)
  }
}
