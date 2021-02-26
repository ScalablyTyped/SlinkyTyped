package typingsSlinky.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BeginDate extends StObject {
  
  var beginDate: js.Date = js.native
  
  var endDate: js.UndefOr[js.Date] = js.native
  
  var id: String = js.native
}
object BeginDate {
  
  @scala.inline
  def apply(beginDate: js.Date, id: String): BeginDate = {
    val __obj = js.Dynamic.literal(beginDate = beginDate.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeginDate]
  }
  
  @scala.inline
  implicit class BeginDateMutableBuilder[Self <: BeginDate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBeginDate(value: js.Date): Self = StObject.set(x, "beginDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDate(value: js.Date): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
