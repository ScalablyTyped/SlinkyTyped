package typingsSlinky.reactBigCalendar.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MoveOptions extends StObject {
  
  var action: NavigateAction = js.native
  
  var date: js.Date = js.native
  
  var today: js.Date = js.native
}
object MoveOptions {
  
  @scala.inline
  def apply(action: NavigateAction, date: js.Date, today: js.Date): MoveOptions = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], today = today.asInstanceOf[js.Any])
    __obj.asInstanceOf[MoveOptions]
  }
  
  @scala.inline
  implicit class MoveOptionsMutableBuilder[Self <: MoveOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: NavigateAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToday(value: js.Date): Self = StObject.set(x, "today", value.asInstanceOf[js.Any])
  }
}
