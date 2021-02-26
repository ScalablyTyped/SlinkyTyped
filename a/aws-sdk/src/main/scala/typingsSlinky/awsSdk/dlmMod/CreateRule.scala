package typingsSlinky.awsSdk.dlmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateRule extends StObject {
  
  /**
    * The schedule, as a Cron expression. The schedule interval must be between 1 hour and 1 year. For more information, see Cron expressions in the Amazon CloudWatch User Guide.
    */
  var CronExpression: js.UndefOr[typingsSlinky.awsSdk.dlmMod.CronExpression] = js.native
  
  /**
    * The interval between snapshots. The supported values are 1, 2, 3, 4, 6, 8, 12, and 24.
    */
  var Interval: js.UndefOr[typingsSlinky.awsSdk.dlmMod.Interval] = js.native
  
  /**
    * The interval unit.
    */
  var IntervalUnit: js.UndefOr[IntervalUnitValues] = js.native
  
  /**
    * The time, in UTC, to start the operation. The supported format is hh:mm. The operation occurs within a one-hour window following the specified time. If you do not specify a time, Amazon DLM selects a time within the next 24 hours.
    */
  var Times: js.UndefOr[TimesList] = js.native
}
object CreateRule {
  
  @scala.inline
  def apply(): CreateRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateRule]
  }
  
  @scala.inline
  implicit class CreateRuleMutableBuilder[Self <: CreateRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCronExpression(value: CronExpression): Self = StObject.set(x, "CronExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCronExpressionUndefined: Self = StObject.set(x, "CronExpression", js.undefined)
    
    @scala.inline
    def setInterval(value: Interval): Self = StObject.set(x, "Interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntervalUndefined: Self = StObject.set(x, "Interval", js.undefined)
    
    @scala.inline
    def setIntervalUnit(value: IntervalUnitValues): Self = StObject.set(x, "IntervalUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntervalUnitUndefined: Self = StObject.set(x, "IntervalUnit", js.undefined)
    
    @scala.inline
    def setTimes(value: TimesList): Self = StObject.set(x, "Times", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimesUndefined: Self = StObject.set(x, "Times", js.undefined)
    
    @scala.inline
    def setTimesVarargs(value: Time*): Self = StObject.set(x, "Times", js.Array(value :_*))
  }
}
