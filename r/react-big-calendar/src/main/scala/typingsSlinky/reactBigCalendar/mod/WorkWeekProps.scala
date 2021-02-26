package typingsSlinky.reactBigCalendar.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkWeekProps extends StObject {
  
  var date: js.Date = js.native
}
object WorkWeekProps {
  
  @scala.inline
  def apply(date: js.Date): WorkWeekProps = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkWeekProps]
  }
  
  @scala.inline
  implicit class WorkWeekPropsMutableBuilder[Self <: WorkWeekProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
  }
}
