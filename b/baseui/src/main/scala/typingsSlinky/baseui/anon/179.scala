package typingsSlinky.baseui.anon

import typingsSlinky.baseui.baseuiStrings.Plussign685
import typingsSlinky.baseui.baseuiStrings.Samoa
import typingsSlinky.baseui.baseuiStrings.WS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `179` extends StObject {
  
  var dialCode: Plussign685 = js.native
  
  var id: WS = js.native
  
  var label: Samoa = js.native
}
object `179` {
  
  @scala.inline
  def apply(dialCode: Plussign685, id: WS, label: Samoa): `179` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`179`]
  }
  
  @scala.inline
  implicit class `179MutableBuilder`[Self <: `179`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign685): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: WS): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Samoa): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
