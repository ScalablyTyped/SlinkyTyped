package typingsSlinky.reactCalendarTimeline.mod

import typingsSlinky.moment.mod.Moment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Interval extends StObject {
  
  var endTime: Moment = js.native
  
  var startTime: Moment = js.native
}
object Interval {
  
  @scala.inline
  def apply(endTime: Moment, startTime: Moment): Interval = {
    val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Interval]
  }
  
  @scala.inline
  implicit class IntervalMutableBuilder[Self <: Interval] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndTime(value: Moment): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTime(value: Moment): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
  }
}
