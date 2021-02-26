package typingsSlinky.dateFns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Type Aliases
@js.native
trait Interval extends StObject {
  
  var end: js.Date | Double = js.native
  
  var start: js.Date | Double = js.native
}
object Interval {
  
  @scala.inline
  def apply(end: js.Date | Double, start: js.Date | Double): Interval = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Interval]
  }
  
  @scala.inline
  implicit class IntervalMutableBuilder[Self <: Interval] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: js.Date | Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDate(value: js.Date): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: js.Date | Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDate(value: js.Date): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
