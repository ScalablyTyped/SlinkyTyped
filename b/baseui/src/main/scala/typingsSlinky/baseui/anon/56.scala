package typingsSlinky.baseui.anon

import typingsSlinky.baseui.baseuiStrings.EC
import typingsSlinky.baseui.baseuiStrings.Ecuador
import typingsSlinky.baseui.baseuiStrings.Plussign593
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `56` extends StObject {
  
  var dialCode: Plussign593 = js.native
  
  var id: EC = js.native
  
  var label: Ecuador = js.native
}
object `56` {
  
  @scala.inline
  def apply(dialCode: Plussign593, id: EC, label: Ecuador): `56` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`56`]
  }
  
  @scala.inline
  implicit class `56MutableBuilder`[Self <: `56`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign593): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: EC): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Ecuador): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
