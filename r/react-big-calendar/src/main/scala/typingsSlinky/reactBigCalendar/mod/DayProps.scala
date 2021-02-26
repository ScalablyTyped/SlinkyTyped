package typingsSlinky.reactBigCalendar.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DayProps extends StObject {
  
  var date: js.Date = js.native
}
object DayProps {
  
  @scala.inline
  def apply(date: js.Date): DayProps = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
    __obj.asInstanceOf[DayProps]
  }
  
  @scala.inline
  implicit class DayPropsMutableBuilder[Self <: DayProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
  }
}
