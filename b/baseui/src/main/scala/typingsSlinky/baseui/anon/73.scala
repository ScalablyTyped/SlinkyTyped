package typingsSlinky.baseui.anon

import typingsSlinky.baseui.baseuiStrings.DE
import typingsSlinky.baseui.baseuiStrings.Plussign49
import typingsSlinky.baseui.baseuiStrings.`Germany LeftparenthesisDeutschlandRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `73` extends StObject {
  
  var dialCode: Plussign49 = js.native
  
  var id: DE = js.native
  
  var label: `Germany LeftparenthesisDeutschlandRightparenthesis` = js.native
}
object `73` {
  
  @scala.inline
  def apply(dialCode: Plussign49, id: DE, label: `Germany LeftparenthesisDeutschlandRightparenthesis`): `73` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`73`]
  }
  
  @scala.inline
  implicit class `73MutableBuilder`[Self <: `73`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign49): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: DE): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Germany LeftparenthesisDeutschlandRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
