package typingsSlinky.awsSdk.inspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssessmentRunFilter extends StObject {
  
  /**
    * For a record to match a filter, the value that is specified for this data type property must inclusively match any value between the specified minimum and maximum values of the completedAt property of the AssessmentRun data type.
    */
  var completionTimeRange: js.UndefOr[TimestampRange] = js.native
  
  /**
    * For a record to match a filter, the value that is specified for this data type property must inclusively match any value between the specified minimum and maximum values of the durationInSeconds property of the AssessmentRun data type.
    */
  var durationRange: js.UndefOr[DurationRange] = js.native
  
  /**
    * For a record to match a filter, an explicit value or a string containing a wildcard that is specified for this data type property must match the value of the assessmentRunName property of the AssessmentRun data type.
    */
  var namePattern: js.UndefOr[NamePattern] = js.native
  
  /**
    * For a record to match a filter, the value that is specified for this data type property must be contained in the list of values of the rulesPackages property of the AssessmentRun data type.
    */
  var rulesPackageArns: js.UndefOr[FilterRulesPackageArnList] = js.native
  
  /**
    * For a record to match a filter, the value that is specified for this data type property must inclusively match any value between the specified minimum and maximum values of the startTime property of the AssessmentRun data type.
    */
  var startTimeRange: js.UndefOr[TimestampRange] = js.native
  
  /**
    * For a record to match a filter, the value that is specified for this data type property must match the stateChangedAt property of the AssessmentRun data type.
    */
  var stateChangeTimeRange: js.UndefOr[TimestampRange] = js.native
  
  /**
    * For a record to match a filter, one of the values specified for this data type property must be the exact match of the value of the assessmentRunState property of the AssessmentRun data type.
    */
  var states: js.UndefOr[AssessmentRunStateList] = js.native
}
object AssessmentRunFilter {
  
  @scala.inline
  def apply(): AssessmentRunFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssessmentRunFilter]
  }
  
  @scala.inline
  implicit class AssessmentRunFilterMutableBuilder[Self <: AssessmentRunFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompletionTimeRange(value: TimestampRange): Self = StObject.set(x, "completionTimeRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletionTimeRangeUndefined: Self = StObject.set(x, "completionTimeRange", js.undefined)
    
    @scala.inline
    def setDurationRange(value: DurationRange): Self = StObject.set(x, "durationRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationRangeUndefined: Self = StObject.set(x, "durationRange", js.undefined)
    
    @scala.inline
    def setNamePattern(value: NamePattern): Self = StObject.set(x, "namePattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamePatternUndefined: Self = StObject.set(x, "namePattern", js.undefined)
    
    @scala.inline
    def setRulesPackageArns(value: FilterRulesPackageArnList): Self = StObject.set(x, "rulesPackageArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesPackageArnsUndefined: Self = StObject.set(x, "rulesPackageArns", js.undefined)
    
    @scala.inline
    def setRulesPackageArnsVarargs(value: Arn*): Self = StObject.set(x, "rulesPackageArns", js.Array(value :_*))
    
    @scala.inline
    def setStartTimeRange(value: TimestampRange): Self = StObject.set(x, "startTimeRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeRangeUndefined: Self = StObject.set(x, "startTimeRange", js.undefined)
    
    @scala.inline
    def setStateChangeTimeRange(value: TimestampRange): Self = StObject.set(x, "stateChangeTimeRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateChangeTimeRangeUndefined: Self = StObject.set(x, "stateChangeTimeRange", js.undefined)
    
    @scala.inline
    def setStates(value: AssessmentRunStateList): Self = StObject.set(x, "states", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatesUndefined: Self = StObject.set(x, "states", js.undefined)
    
    @scala.inline
    def setStatesVarargs(value: AssessmentRunState*): Self = StObject.set(x, "states", js.Array(value :_*))
  }
}
