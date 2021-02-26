package typingsSlinky.maximMazurokGapiClientAnalyticsreporting.gapi.client.analyticsreporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoalData extends StObject {
  
  /** URL of the page where this goal was completed. */
  var goalCompletionLocation: js.UndefOr[String] = js.native
  
  /** Total number of goal completions in this activity. */
  var goalCompletions: js.UndefOr[String] = js.native
  
  /** This identifies the goal as configured for the profile. */
  var goalIndex: js.UndefOr[Double] = js.native
  
  /** Name of the goal. */
  var goalName: js.UndefOr[String] = js.native
  
  /** URL of the page one step prior to the goal completion. */
  var goalPreviousStep1: js.UndefOr[String] = js.native
  
  /** URL of the page two steps prior to the goal completion. */
  var goalPreviousStep2: js.UndefOr[String] = js.native
  
  /** URL of the page three steps prior to the goal completion. */
  var goalPreviousStep3: js.UndefOr[String] = js.native
  
  /** Value in this goal. */
  var goalValue: js.UndefOr[Double] = js.native
}
object GoalData {
  
  @scala.inline
  def apply(): GoalData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoalData]
  }
  
  @scala.inline
  implicit class GoalDataMutableBuilder[Self <: GoalData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGoalCompletionLocation(value: String): Self = StObject.set(x, "goalCompletionLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoalCompletionLocationUndefined: Self = StObject.set(x, "goalCompletionLocation", js.undefined)
    
    @scala.inline
    def setGoalCompletions(value: String): Self = StObject.set(x, "goalCompletions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoalCompletionsUndefined: Self = StObject.set(x, "goalCompletions", js.undefined)
    
    @scala.inline
    def setGoalIndex(value: Double): Self = StObject.set(x, "goalIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoalIndexUndefined: Self = StObject.set(x, "goalIndex", js.undefined)
    
    @scala.inline
    def setGoalName(value: String): Self = StObject.set(x, "goalName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoalNameUndefined: Self = StObject.set(x, "goalName", js.undefined)
    
    @scala.inline
    def setGoalPreviousStep1(value: String): Self = StObject.set(x, "goalPreviousStep1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoalPreviousStep1Undefined: Self = StObject.set(x, "goalPreviousStep1", js.undefined)
    
    @scala.inline
    def setGoalPreviousStep2(value: String): Self = StObject.set(x, "goalPreviousStep2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoalPreviousStep2Undefined: Self = StObject.set(x, "goalPreviousStep2", js.undefined)
    
    @scala.inline
    def setGoalPreviousStep3(value: String): Self = StObject.set(x, "goalPreviousStep3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoalPreviousStep3Undefined: Self = StObject.set(x, "goalPreviousStep3", js.undefined)
    
    @scala.inline
    def setGoalValue(value: Double): Self = StObject.set(x, "goalValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoalValueUndefined: Self = StObject.set(x, "goalValue", js.undefined)
  }
}
