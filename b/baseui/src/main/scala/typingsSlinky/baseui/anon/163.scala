package typingsSlinky.baseui.anon

import typingsSlinky.baseui.baseuiStrings.PH
import typingsSlinky.baseui.baseuiStrings.Philippines
import typingsSlinky.baseui.baseuiStrings.Plussign63
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `163` extends StObject {
  
  var dialCode: Plussign63 = js.native
  
  var id: PH = js.native
  
  var label: Philippines = js.native
}
object `163` {
  
  @scala.inline
  def apply(dialCode: Plussign63, id: PH, label: Philippines): `163` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`163`]
  }
  
  @scala.inline
  implicit class `163MutableBuilder`[Self <: `163`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign63): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: PH): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Philippines): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
