package typingsSlinky.baseui.anon

import typingsSlinky.baseui.baseuiStrings.GU
import typingsSlinky.baseui.baseuiStrings.Guam
import typingsSlinky.baseui.baseuiStrings.Plussign1671
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `80` extends StObject {
  
  var dialCode: Plussign1671 = js.native
  
  var id: GU = js.native
  
  var label: Guam = js.native
}
object `80` {
  
  @scala.inline
  def apply(dialCode: Plussign1671, id: GU, label: Guam): `80` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`80`]
  }
  
  @scala.inline
  implicit class `80MutableBuilder`[Self <: `80`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign1671): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: GU): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Guam): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
