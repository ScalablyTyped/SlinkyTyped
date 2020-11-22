package typingsSlinky.devexpressUtils

import typingsSlinky.devexpressUtils.anon.TwoDigitYearMax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@devexpress/utils/lib/formatters/date-utils", JSImport.Namespace)
@js.native
object dateUtilsMod extends js.Object {
  
  @js.native
  class DateUtils () extends js.Object
  /* static members */
  @js.native
  object DateUtils extends js.Object {
    
    def expandTwoDigitYear(value: Double, options: TwoDigitYearMax): Double = js.native
    
    def fixTimezoneGap(oldDate: js.Date, newDate: js.Date): Unit = js.native
    
    var getTimeZoneOffset: js.Any = js.native
    
    def toUtcTime(date: js.Date): js.Date = js.native
  }
}
