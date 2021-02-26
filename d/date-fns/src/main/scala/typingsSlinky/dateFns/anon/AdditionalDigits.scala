package typingsSlinky.dateFns.anon

import typingsSlinky.dateFns.dateFnsNumbers.`1`
import typingsSlinky.dateFns.dateFnsNumbers.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdditionalDigits extends StObject {
  
  var additionalDigits: js.UndefOr[typingsSlinky.dateFns.dateFnsNumbers.`0` | `1` | `2`] = js.native
}
object AdditionalDigits {
  
  @scala.inline
  def apply(): AdditionalDigits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdditionalDigits]
  }
  
  @scala.inline
  implicit class AdditionalDigitsMutableBuilder[Self <: AdditionalDigits] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditionalDigits(value: typingsSlinky.dateFns.dateFnsNumbers.`0` | `1` | `2`): Self = StObject.set(x, "additionalDigits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalDigitsUndefined: Self = StObject.set(x, "additionalDigits", js.undefined)
  }
}
