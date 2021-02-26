package typingsSlinky.dateFns.anon

import typingsSlinky.dateFns.dateFnsStrings.ceil
import typingsSlinky.dateFns.dateFnsStrings.day
import typingsSlinky.dateFns.dateFnsStrings.floor
import typingsSlinky.dateFns.dateFnsStrings.hour
import typingsSlinky.dateFns.dateFnsStrings.minute
import typingsSlinky.dateFns.dateFnsStrings.month
import typingsSlinky.dateFns.dateFnsStrings.round
import typingsSlinky.dateFns.dateFnsStrings.second
import typingsSlinky.dateFns.dateFnsStrings.year
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RoundingMethod extends StObject {
  
  var addSuffix: js.UndefOr[Boolean] = js.native
  
  var locale: js.UndefOr[typingsSlinky.dateFns.mod.Locale] = js.native
  
  var roundingMethod: js.UndefOr[floor | ceil | round] = js.native
  
  var unit: js.UndefOr[second | minute | hour | day | month | year] = js.native
}
object RoundingMethod {
  
  @scala.inline
  def apply(): RoundingMethod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoundingMethod]
  }
  
  @scala.inline
  implicit class RoundingMethodMutableBuilder[Self <: RoundingMethod] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddSuffix(value: Boolean): Self = StObject.set(x, "addSuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddSuffixUndefined: Self = StObject.set(x, "addSuffix", js.undefined)
    
    @scala.inline
    def setLocale(value: typingsSlinky.dateFns.mod.Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setRoundingMethod(value: floor | ceil | round): Self = StObject.set(x, "roundingMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoundingMethodUndefined: Self = StObject.set(x, "roundingMethod", js.undefined)
    
    @scala.inline
    def setUnit(value: second | minute | hour | day | month | year): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
  }
}
