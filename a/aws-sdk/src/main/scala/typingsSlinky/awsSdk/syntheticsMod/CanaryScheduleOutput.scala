package typingsSlinky.awsSdk.syntheticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanaryScheduleOutput extends StObject {
  
  /**
    * How long, in seconds, for the canary to continue making regular runs after it was created. The runs are performed according to the schedule in the Expression value.
    */
  var DurationInSeconds: js.UndefOr[MaxOneYearInSeconds] = js.native
  
  /**
    * A rate expression that defines how often the canary is to run. The syntax is rate(number unit). unit can be minute, minutes, or hour.  For example, rate(1 minute) runs the canary once a minute, rate(10 minutes) runs it once every 10 minutes, and rate(1 hour) runs it once every hour. Specifying rate(0 minute) or rate(0 hour) is a special value that causes the canary to run only once when it is started.
    */
  var Expression: js.UndefOr[String] = js.native
}
object CanaryScheduleOutput {
  
  @scala.inline
  def apply(): CanaryScheduleOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CanaryScheduleOutput]
  }
  
  @scala.inline
  implicit class CanaryScheduleOutputMutableBuilder[Self <: CanaryScheduleOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDurationInSeconds(value: MaxOneYearInSeconds): Self = StObject.set(x, "DurationInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationInSecondsUndefined: Self = StObject.set(x, "DurationInSeconds", js.undefined)
    
    @scala.inline
    def setExpression(value: String): Self = StObject.set(x, "Expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpressionUndefined: Self = StObject.set(x, "Expression", js.undefined)
  }
}
