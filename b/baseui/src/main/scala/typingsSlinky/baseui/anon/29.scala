package typingsSlinky.baseui.anon

import typingsSlinky.baseui.baseuiStrings.KH
import typingsSlinky.baseui.baseuiStrings.Plussign855
import typingsSlinky.baseui.baseuiStrings.`Cambodia Leftparenthesisកម្ពុជាRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `29` extends js.Object {
  
  var dialCode: Plussign855 = js.native
  
  var id: KH = js.native
  
  var label: `Cambodia Leftparenthesisកម្ពុជាRightparenthesis` = js.native
}
object `29` {
  
  @scala.inline
  def apply(dialCode: Plussign855, id: KH, label: `Cambodia Leftparenthesisកម្ពុជាRightparenthesis`): `29` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`29`]
  }
  
  @scala.inline
  implicit class `29Ops`[Self <: `29`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDialCode(value: Plussign855): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: KH): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Cambodia Leftparenthesisកម្ពុជាRightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
}
