package typingsSlinky.baseui.anon

import typingsSlinky.baseui.baseuiStrings.MR
import typingsSlinky.baseui.baseuiStrings.Plussign222
import typingsSlinky.baseui.baseuiStrings.`Mauritania Leftparenthesis‫موريتانيا‬‎Rightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `128` extends js.Object {
  
  var dialCode: Plussign222 = js.native
  
  var id: MR = js.native
  
  var label: `Mauritania Leftparenthesis‫موريتانيا‬‎Rightparenthesis` = js.native
}
object `128` {
  
  @scala.inline
  def apply(dialCode: Plussign222, id: MR, label: `Mauritania Leftparenthesis‫موريتانيا‬‎Rightparenthesis`): `128` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`128`]
  }
  
  @scala.inline
  implicit class `128Ops`[Self <: `128`] (val x: Self) extends AnyVal {
    
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
    def setDialCode(value: Plussign222): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: MR): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Mauritania Leftparenthesis‫موريتانيا‬‎Rightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
}
