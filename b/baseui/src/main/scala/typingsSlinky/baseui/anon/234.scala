package typingsSlinky.baseui.anon

import typingsSlinky.baseui.baseuiStrings.Plussign263
import typingsSlinky.baseui.baseuiStrings.ZW
import typingsSlinky.baseui.baseuiStrings.Zimbabwe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `234` extends StObject {
  
  var dialCode: Plussign263 = js.native
  
  var id: ZW = js.native
  
  var label: Zimbabwe = js.native
}
object `234` {
  
  @scala.inline
  def apply(dialCode: Plussign263, id: ZW, label: Zimbabwe): `234` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`234`]
  }
  
  @scala.inline
  implicit class `234MutableBuilder`[Self <: `234`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign263): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: ZW): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Zimbabwe): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
