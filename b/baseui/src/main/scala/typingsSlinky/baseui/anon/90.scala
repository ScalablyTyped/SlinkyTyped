package typingsSlinky.baseui.anon

import typingsSlinky.baseui.baseuiStrings.IS
import typingsSlinky.baseui.baseuiStrings.Plussign354
import typingsSlinky.baseui.baseuiStrings.`Iceland LeftparenthesisÍslandRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `90` extends StObject {
  
  var dialCode: Plussign354 = js.native
  
  var id: IS = js.native
  
  var label: `Iceland LeftparenthesisÍslandRightparenthesis` = js.native
}
object `90` {
  
  @scala.inline
  def apply(dialCode: Plussign354, id: IS, label: `Iceland LeftparenthesisÍslandRightparenthesis`): `90` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`90`]
  }
  
  @scala.inline
  implicit class `90MutableBuilder`[Self <: `90`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign354): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: IS): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Iceland LeftparenthesisÍslandRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
