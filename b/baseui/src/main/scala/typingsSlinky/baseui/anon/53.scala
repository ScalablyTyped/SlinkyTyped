package typingsSlinky.baseui.anon

import typingsSlinky.baseui.baseuiStrings.DJ
import typingsSlinky.baseui.baseuiStrings.Djibouti
import typingsSlinky.baseui.baseuiStrings.Plussign253
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `53` extends StObject {
  
  var dialCode: Plussign253 = js.native
  
  var id: DJ = js.native
  
  var label: Djibouti = js.native
}
object `53` {
  
  @scala.inline
  def apply(dialCode: Plussign253, id: DJ, label: Djibouti): `53` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`53`]
  }
  
  @scala.inline
  implicit class `53MutableBuilder`[Self <: `53`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign253): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: DJ): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Djibouti): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
