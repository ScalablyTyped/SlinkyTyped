package typingsSlinky.baseui.anon

import typingsSlinky.baseui.baseuiStrings.Plussign1721
import typingsSlinky.baseui.baseuiStrings.SX
import typingsSlinky.baseui.baseuiStrings.`Sint Maarten`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `188` extends StObject {
  
  var dialCode: Plussign1721 = js.native
  
  var id: SX = js.native
  
  var label: `Sint Maarten` = js.native
}
object `188` {
  
  @scala.inline
  def apply(dialCode: Plussign1721, id: SX, label: `Sint Maarten`): `188` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`188`]
  }
  
  @scala.inline
  implicit class `188MutableBuilder`[Self <: `188`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign1721): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: SX): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Sint Maarten`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
