package typingsSlinky.baseui.anon

import typingsSlinky.baseui.baseuiStrings.GM
import typingsSlinky.baseui.baseuiStrings.Gambia
import typingsSlinky.baseui.baseuiStrings.Plussign220
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `71` extends StObject {
  
  var dialCode: Plussign220 = js.native
  
  var id: GM = js.native
  
  var label: Gambia = js.native
}
object `71` {
  
  @scala.inline
  def apply(dialCode: Plussign220, id: GM, label: Gambia): `71` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`71`]
  }
  
  @scala.inline
  implicit class `71MutableBuilder`[Self <: `71`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign220): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: GM): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Gambia): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
