package typingsSlinky.dateFns.anon

import typingsSlinky.dateFns.dateFnsNumbers.`1`
import typingsSlinky.dateFns.dateFnsNumbers.`2`
import typingsSlinky.dateFns.dateFnsNumbers.`3`
import typingsSlinky.dateFns.dateFnsNumbers.`4`
import typingsSlinky.dateFns.dateFnsNumbers.`5`
import typingsSlinky.dateFns.dateFnsNumbers.`6`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UseAdditionalWeekYearTokens extends StObject {
  
  var firstWeekContainsDate: js.UndefOr[Double] = js.native
  
  var locale: js.UndefOr[typingsSlinky.dateFns.Locale] = js.native
  
  var useAdditionalDayOfYearTokens: js.UndefOr[Boolean] = js.native
  
  var useAdditionalWeekYearTokens: js.UndefOr[Boolean] = js.native
  
  var weekStartsOn: js.UndefOr[typingsSlinky.dateFns.dateFnsNumbers.`0` | `1` | `2` | `3` | `4` | `5` | `6`] = js.native
}
object UseAdditionalWeekYearTokens {
  
  @scala.inline
  def apply(): UseAdditionalWeekYearTokens = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UseAdditionalWeekYearTokens]
  }
  
  @scala.inline
  implicit class UseAdditionalWeekYearTokensMutableBuilder[Self <: UseAdditionalWeekYearTokens] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFirstWeekContainsDate(value: Double): Self = StObject.set(x, "firstWeekContainsDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstWeekContainsDateUndefined: Self = StObject.set(x, "firstWeekContainsDate", js.undefined)
    
    @scala.inline
    def setLocale(value: typingsSlinky.dateFns.Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setUseAdditionalDayOfYearTokens(value: Boolean): Self = StObject.set(x, "useAdditionalDayOfYearTokens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseAdditionalDayOfYearTokensUndefined: Self = StObject.set(x, "useAdditionalDayOfYearTokens", js.undefined)
    
    @scala.inline
    def setUseAdditionalWeekYearTokens(value: Boolean): Self = StObject.set(x, "useAdditionalWeekYearTokens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseAdditionalWeekYearTokensUndefined: Self = StObject.set(x, "useAdditionalWeekYearTokens", js.undefined)
    
    @scala.inline
    def setWeekStartsOn(value: typingsSlinky.dateFns.dateFnsNumbers.`0` | `1` | `2` | `3` | `4` | `5` | `6`): Self = StObject.set(x, "weekStartsOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeekStartsOnUndefined: Self = StObject.set(x, "weekStartsOn", js.undefined)
  }
}
