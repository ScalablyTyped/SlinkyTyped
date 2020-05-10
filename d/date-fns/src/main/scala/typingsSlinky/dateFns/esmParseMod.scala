package typingsSlinky.dateFns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-fns/esm/parse", JSImport.Namespace)
@js.native
object esmParseMod extends js.Object {
  @js.native
  object default extends js.Object {
    def apply(dateString: String, formatString: String, referenceDate: Double): js.Date = js.native
    def apply(
      dateString: String,
      formatString: String,
      referenceDate: Double,
      options: AnonUseAdditionalDayOfYearTokensUseAdditionalWeekYearTokens
    ): js.Date = js.native
    def apply(
      dateString: String,
      formatString: String,
      referenceDate: Double,
      options: AnonUseAdditionalWeekYearTokensWeekStartsOn
    ): js.Date = js.native
    def apply(dateString: String, formatString: String, referenceDate: js.Date): js.Date = js.native
    def apply(
      dateString: String,
      formatString: String,
      referenceDate: js.Date,
      options: AnonUseAdditionalDayOfYearTokensUseAdditionalWeekYearTokens
    ): js.Date = js.native
    def apply(
      dateString: String,
      formatString: String,
      referenceDate: js.Date,
      options: AnonUseAdditionalWeekYearTokensWeekStartsOn
    ): js.Date = js.native
  }
  
}

