package typingsSlinky.dateFns

import typingsSlinky.dateFns.anon.FirstWeekContainsDate
import typingsSlinky.dateFns.anon.UseAdditionalDayOfYearTokens
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-fns/esm/format", JSImport.Namespace)
@js.native
object formatMod extends js.Object {
  @js.native
  object default extends js.Object {
    def apply(date: Double, format: String): String = js.native
    def apply(date: Double, format: String, options: FirstWeekContainsDate): String = js.native
    def apply(date: Double, format: String, options: UseAdditionalDayOfYearTokens): String = js.native
    def apply(date: js.Date, format: String): String = js.native
    def apply(date: js.Date, format: String, options: FirstWeekContainsDate): String = js.native
    def apply(date: js.Date, format: String, options: UseAdditionalDayOfYearTokens): String = js.native
  }
  
}

