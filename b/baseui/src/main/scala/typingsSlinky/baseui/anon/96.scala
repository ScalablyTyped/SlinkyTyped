package typingsSlinky.baseui.anon

import typingsSlinky.baseui.baseuiStrings.IM
import typingsSlinky.baseui.baseuiStrings.Plussign44
import typingsSlinky.baseui.baseuiStrings.`Isle of Man`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `96` extends StObject {
  
  var dialCode: Plussign44 = js.native
  
  var id: IM = js.native
  
  var label: `Isle of Man` = js.native
}
object `96` {
  
  @scala.inline
  def apply(dialCode: Plussign44, id: IM, label: `Isle of Man`): `96` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`96`]
  }
  
  @scala.inline
  implicit class `96MutableBuilder`[Self <: `96`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign44): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: IM): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Isle of Man`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
