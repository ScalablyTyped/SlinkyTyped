package typingsSlinky.reactBootstrapTable.anon

import typingsSlinky.reactBootstrapTable.mod.FilterComparator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Date extends StObject {
  
  /**
    * Comparator value.
    */
  var comparator: FilterComparator = js.native
  
  /**
    * Date value. String values will be automatically converted to dates.
    */
  var date: js.Date | String = js.native
}
object Date {
  
  @scala.inline
  def apply(comparator: FilterComparator, date: js.Date | String): Date = {
    val __obj = js.Dynamic.literal(comparator = comparator.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any])
    __obj.asInstanceOf[Date]
  }
  
  @scala.inline
  implicit class DateMutableBuilder[Self <: Date] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComparator(value: FilterComparator): Self = StObject.set(x, "comparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDate(value: js.Date | String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
  }
}
