package typingsSlinky.baseui.anon

import typingsSlinky.baseui.baseuiStrings.AI
import typingsSlinky.baseui.baseuiStrings.Anguilla
import typingsSlinky.baseui.baseuiStrings.Plussign1264
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `1` extends StObject {
  
  var dialCode: Plussign1264 = js.native
  
  var id: AI = js.native
  
  var label: Anguilla = js.native
}
object `1` {
  
  @scala.inline
  def apply(dialCode: Plussign1264, id: AI, label: Anguilla): `1` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`]
  }
  
  @scala.inline
  implicit class `1MutableBuilder`[Self <: `1`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign1264): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: AI): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Anguilla): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
