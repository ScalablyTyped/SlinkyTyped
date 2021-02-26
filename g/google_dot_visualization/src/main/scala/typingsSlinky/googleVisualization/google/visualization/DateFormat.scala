package typingsSlinky.googleVisualization.google.visualization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateFormat extends DefaultFormatter {
  
  /**
    * Returns the formatted value of a given value. This method does not require a DataTable.
    */
  def formatValue(value: js.Date): String = js.native
}
object DateFormat {
  
  @scala.inline
  def apply(format: (DataTable, Double) => Unit, formatValue: js.Date => String): DateFormat = {
    val __obj = js.Dynamic.literal(format = js.Any.fromFunction2(format), formatValue = js.Any.fromFunction1(formatValue))
    __obj.asInstanceOf[DateFormat]
  }
  
  @scala.inline
  implicit class DateFormatMutableBuilder[Self <: DateFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormatValue(value: js.Date => String): Self = StObject.set(x, "formatValue", js.Any.fromFunction1(value))
  }
}
