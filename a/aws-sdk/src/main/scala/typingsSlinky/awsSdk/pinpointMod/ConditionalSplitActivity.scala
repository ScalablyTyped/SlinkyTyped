package typingsSlinky.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConditionalSplitActivity extends StObject {
  
  /**
    * The conditions that define the paths for the activity, and the relationship between the conditions.
    */
  var Condition: js.UndefOr[typingsSlinky.awsSdk.pinpointMod.Condition] = js.native
  
  /**
    * The amount of time to wait before determining whether the conditions are met, or the date and time when Amazon Pinpoint determines whether the conditions are met.
    */
  var EvaluationWaitTime: js.UndefOr[WaitTime] = js.native
  
  /**
    * The unique identifier for the activity to perform if the conditions aren't met.
    */
  var FalseActivity: js.UndefOr[string] = js.native
  
  /**
    * The unique identifier for the activity to perform if the conditions are met.
    */
  var TrueActivity: js.UndefOr[string] = js.native
}
object ConditionalSplitActivity {
  
  @scala.inline
  def apply(): ConditionalSplitActivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalSplitActivity]
  }
  
  @scala.inline
  implicit class ConditionalSplitActivityMutableBuilder[Self <: ConditionalSplitActivity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCondition(value: Condition): Self = StObject.set(x, "Condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionUndefined: Self = StObject.set(x, "Condition", js.undefined)
    
    @scala.inline
    def setEvaluationWaitTime(value: WaitTime): Self = StObject.set(x, "EvaluationWaitTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvaluationWaitTimeUndefined: Self = StObject.set(x, "EvaluationWaitTime", js.undefined)
    
    @scala.inline
    def setFalseActivity(value: string): Self = StObject.set(x, "FalseActivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFalseActivityUndefined: Self = StObject.set(x, "FalseActivity", js.undefined)
    
    @scala.inline
    def setTrueActivity(value: string): Self = StObject.set(x, "TrueActivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrueActivityUndefined: Self = StObject.set(x, "TrueActivity", js.undefined)
  }
}
