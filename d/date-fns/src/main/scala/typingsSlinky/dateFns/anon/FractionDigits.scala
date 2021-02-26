package typingsSlinky.dateFns.anon

import typingsSlinky.dateFns.dateFnsNumbers.`1`
import typingsSlinky.dateFns.dateFnsNumbers.`2`
import typingsSlinky.dateFns.dateFnsNumbers.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FractionDigits extends StObject {
  
  var fractionDigits: js.UndefOr[typingsSlinky.dateFns.dateFnsNumbers.`0` | `1` | `2` | `3`] = js.native
}
object FractionDigits {
  
  @scala.inline
  def apply(): FractionDigits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FractionDigits]
  }
  
  @scala.inline
  implicit class FractionDigitsMutableBuilder[Self <: FractionDigits] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFractionDigits(value: typingsSlinky.dateFns.dateFnsNumbers.`0` | `1` | `2` | `3`): Self = StObject.set(x, "fractionDigits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFractionDigitsUndefined: Self = StObject.set(x, "fractionDigits", js.undefined)
  }
}
