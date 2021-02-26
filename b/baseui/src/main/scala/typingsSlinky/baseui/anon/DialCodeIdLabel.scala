package typingsSlinky.baseui.anon

import typingsSlinky.baseui.baseuiStrings.AD
import typingsSlinky.baseui.baseuiStrings.Andorra
import typingsSlinky.baseui.baseuiStrings.Plussign376
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DialCodeIdLabel extends StObject {
  
  var dialCode: Plussign376 = js.native
  
  var id: AD = js.native
  
  var label: Andorra = js.native
}
object DialCodeIdLabel {
  
  @scala.inline
  def apply(dialCode: Plussign376, id: AD, label: Andorra): DialCodeIdLabel = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialCodeIdLabel]
  }
  
  @scala.inline
  implicit class DialCodeIdLabelMutableBuilder[Self <: DialCodeIdLabel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign376): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: AD): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Andorra): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
