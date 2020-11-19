package typingsSlinky.dateFns.anon

import typingsSlinky.dateFns.dateFnsNumbers.`1`
import typingsSlinky.dateFns.dateFnsNumbers.`2`
import typingsSlinky.dateFns.dateFnsNumbers.`3`
import typingsSlinky.dateFns.dateFnsNumbers.`4`
import typingsSlinky.dateFns.dateFnsNumbers.`5`
import typingsSlinky.dateFns.dateFnsNumbers.`6`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UseAdditionalDayOfYearTokens extends js.Object {
  
  var firstWeekContainsDate: js.UndefOr[Double] = js.native
  
  var locale: js.UndefOr[typingsSlinky.dateFns.Locale] = js.native
  
  var useAdditionalDayOfYearTokens: js.UndefOr[Boolean] = js.native
  
  var useAdditionalWeekYearTokens: js.UndefOr[Boolean] = js.native
  
  var weekStartsOn: js.UndefOr[typingsSlinky.dateFns.dateFnsNumbers.`0` | `1` | `2` | `3` | `4` | `5` | `6`] = js.native
}
object UseAdditionalDayOfYearTokens {
  
  @scala.inline
  def apply(): UseAdditionalDayOfYearTokens = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UseAdditionalDayOfYearTokens]
  }
  
  @scala.inline
  implicit class UseAdditionalDayOfYearTokensOps[Self <: UseAdditionalDayOfYearTokens] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFirstWeekContainsDate(value: Double): Self = this.set("firstWeekContainsDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstWeekContainsDate: Self = this.set("firstWeekContainsDate", js.undefined)
    
    @scala.inline
    def setLocale(value: typingsSlinky.dateFns.Locale): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setUseAdditionalDayOfYearTokens(value: Boolean): Self = this.set("useAdditionalDayOfYearTokens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseAdditionalDayOfYearTokens: Self = this.set("useAdditionalDayOfYearTokens", js.undefined)
    
    @scala.inline
    def setUseAdditionalWeekYearTokens(value: Boolean): Self = this.set("useAdditionalWeekYearTokens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseAdditionalWeekYearTokens: Self = this.set("useAdditionalWeekYearTokens", js.undefined)
    
    @scala.inline
    def setWeekStartsOn(value: typingsSlinky.dateFns.dateFnsNumbers.`0` | `1` | `2` | `3` | `4` | `5` | `6`): Self = this.set("weekStartsOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeekStartsOn: Self = this.set("weekStartsOn", js.undefined)
  }
}
