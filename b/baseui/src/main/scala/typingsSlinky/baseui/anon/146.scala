package typingsSlinky.baseui.anon

import typingsSlinky.baseui.baseuiStrings.NZ
import typingsSlinky.baseui.baseuiStrings.Plussign64
import typingsSlinky.baseui.baseuiStrings.`New Zealand`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `146` extends StObject {
  
  var dialCode: Plussign64 = js.native
  
  var id: NZ = js.native
  
  var label: `New Zealand` = js.native
}
object `146` {
  
  @scala.inline
  def apply(dialCode: Plussign64, id: NZ, label: `New Zealand`): `146` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`146`]
  }
  
  @scala.inline
  implicit class `146MutableBuilder`[Self <: `146`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign64): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: NZ): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `New Zealand`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
