package typingsSlinky.baseui.anon

import typingsSlinky.baseui.baseuiStrings.CO
import typingsSlinky.baseui.baseuiStrings.Colombia
import typingsSlinky.baseui.baseuiStrings.Plussign57
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `40` extends StObject {
  
  var dialCode: Plussign57 = js.native
  
  var id: CO = js.native
  
  var label: Colombia = js.native
}
object `40` {
  
  @scala.inline
  def apply(dialCode: Plussign57, id: CO, label: Colombia): `40` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`40`]
  }
  
  @scala.inline
  implicit class `40MutableBuilder`[Self <: `40`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign57): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: CO): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Colombia): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
