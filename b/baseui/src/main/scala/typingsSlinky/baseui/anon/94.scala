package typingsSlinky.baseui.anon

import typingsSlinky.baseui.baseuiStrings.IQ
import typingsSlinky.baseui.baseuiStrings.Plussign964
import typingsSlinky.baseui.baseuiStrings.`Iraq Leftparenthesis‫العراق‬‎Rightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `94` extends js.Object {
  
  var dialCode: Plussign964 = js.native
  
  var id: IQ = js.native
  
  var label: `Iraq Leftparenthesis‫العراق‬‎Rightparenthesis` = js.native
}
object `94` {
  
  @scala.inline
  def apply(dialCode: Plussign964, id: IQ, label: `Iraq Leftparenthesis‫العراق‬‎Rightparenthesis`): `94` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`94`]
  }
  
  @scala.inline
  implicit class `94Ops`[Self <: `94`] (val x: Self) extends AnyVal {
    
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
    def setDialCode(value: Plussign964): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: IQ): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Iraq Leftparenthesis‫العراق‬‎Rightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
}
