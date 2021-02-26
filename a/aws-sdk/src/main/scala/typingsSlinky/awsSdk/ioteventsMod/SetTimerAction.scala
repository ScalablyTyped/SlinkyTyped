package typingsSlinky.awsSdk.ioteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetTimerAction extends StObject {
  
  /**
    * The duration of the timer, in seconds. You can use a string expression that includes numbers, variables ($variable.&lt;variable-name&gt;), and input values ($input.&lt;input-name&gt;.&lt;path-to-datum&gt;) as the duration. The range of the duration is 1-31622400 seconds. To ensure accuracy, the minimum duration is 60 seconds. The evaluated result of the duration is rounded down to the nearest whole number. 
    */
  var durationExpression: js.UndefOr[VariableValue] = js.native
  
  /**
    * The number of seconds until the timer expires. The minimum value is 60 seconds to ensure accuracy. The maximum value is 31622400 seconds. 
    */
  var seconds: js.UndefOr[Seconds] = js.native
  
  /**
    * The name of the timer.
    */
  var timerName: TimerName = js.native
}
object SetTimerAction {
  
  @scala.inline
  def apply(timerName: TimerName): SetTimerAction = {
    val __obj = js.Dynamic.literal(timerName = timerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetTimerAction]
  }
  
  @scala.inline
  implicit class SetTimerActionMutableBuilder[Self <: SetTimerAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDurationExpression(value: VariableValue): Self = StObject.set(x, "durationExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationExpressionUndefined: Self = StObject.set(x, "durationExpression", js.undefined)
    
    @scala.inline
    def setSeconds(value: Seconds): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondsUndefined: Self = StObject.set(x, "seconds", js.undefined)
    
    @scala.inline
    def setTimerName(value: TimerName): Self = StObject.set(x, "timerName", value.asInstanceOf[js.Any])
  }
}
