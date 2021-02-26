package typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateParam extends StObject {
  
  var date: js.Date = js.native
  
  var withMillis: js.UndefOr[Boolean] = js.native
}
object DateParam {
  
  @scala.inline
  def apply(date: js.Date): DateParam = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateParam]
  }
  
  @scala.inline
  implicit class DateParamMutableBuilder[Self <: DateParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithMillis(value: Boolean): Self = StObject.set(x, "withMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithMillisUndefined: Self = StObject.set(x, "withMillis", js.undefined)
  }
}
