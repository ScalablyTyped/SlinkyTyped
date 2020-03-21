package typingsSlinky.dateFns

import typingsSlinky.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-fns/esm/parse", JSImport.Namespace)
@js.native
object esmParseMod extends js.Object {
  @js.native
  object default extends js.Object {
    def apply(dateString: String, formatString: String, backupDate: Double): js.Date = js.native
    def apply(
      dateString: String,
      formatString: String,
      backupDate: Double,
      options: AnonUseAdditionalDayOfYearTokensUseAdditionalWeekYearTokens
    ): js.Date = js.native
    def apply(
      dateString: String,
      formatString: String,
      backupDate: Double,
      options: AnonUseAdditionalWeekYearTokensWeekStartsOn
    ): js.Date = js.native
    def apply(dateString: String, formatString: String, backupDate: Date): js.Date = js.native
    def apply(
      dateString: String,
      formatString: String,
      backupDate: Date,
      options: AnonUseAdditionalDayOfYearTokensUseAdditionalWeekYearTokens
    ): js.Date = js.native
    def apply(
      dateString: String,
      formatString: String,
      backupDate: Date,
      options: AnonUseAdditionalWeekYearTokensWeekStartsOn
    ): js.Date = js.native
  }
  
}

