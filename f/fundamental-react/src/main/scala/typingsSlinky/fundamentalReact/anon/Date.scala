package typingsSlinky.fundamentalReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Date extends StObject {
  
  var date: js.Date = js.native
  
  var formattedDate: String = js.native
}
object Date {
  
  @scala.inline
  def apply(date: js.Date, formattedDate: String): Date = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], formattedDate = formattedDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Date]
  }
  
  @scala.inline
  implicit class DateMutableBuilder[Self <: Date] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormattedDate(value: String): Self = StObject.set(x, "formattedDate", value.asInstanceOf[js.Any])
  }
}
