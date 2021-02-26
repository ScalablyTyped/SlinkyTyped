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
trait WeekStartsOn extends StObject {
  
  var locale: js.UndefOr[typingsSlinky.dateFns.Locale] = js.native
  
  var weekStartsOn: js.UndefOr[typingsSlinky.dateFns.dateFnsNumbers.`0` | `1` | `2` | `3` | `4` | `5` | `6`] = js.native
}
object WeekStartsOn {
  
  @scala.inline
  def apply(): WeekStartsOn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeekStartsOn]
  }
  
  @scala.inline
  implicit class WeekStartsOnMutableBuilder[Self <: WeekStartsOn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocale(value: typingsSlinky.dateFns.Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setWeekStartsOn(value: typingsSlinky.dateFns.dateFnsNumbers.`0` | `1` | `2` | `3` | `4` | `5` | `6`): Self = StObject.set(x, "weekStartsOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeekStartsOnUndefined: Self = StObject.set(x, "weekStartsOn", js.undefined)
  }
}
