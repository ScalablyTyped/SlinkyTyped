package typingsSlinky.baseui.anon

import typingsSlinky.baseui.baseuiStrings.Plussign235
import typingsSlinky.baseui.baseuiStrings.TD
import typingsSlinky.baseui.baseuiStrings.`Chad LeftparenthesisTchadRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `35` extends js.Object {
  
  var dialCode: Plussign235 = js.native
  
  var id: TD = js.native
  
  var label: `Chad LeftparenthesisTchadRightparenthesis` = js.native
}
object `35` {
  
  @scala.inline
  def apply(dialCode: Plussign235, id: TD, label: `Chad LeftparenthesisTchadRightparenthesis`): `35` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`35`]
  }
  
  @scala.inline
  implicit class `35Ops`[Self <: `35`] (val x: Self) extends AnyVal {
    
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
    def setDialCode(value: Plussign235): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: TD): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Chad LeftparenthesisTchadRightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
}
