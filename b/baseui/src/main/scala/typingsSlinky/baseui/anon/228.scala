package typingsSlinky.baseui.anon

import typingsSlinky.baseui.baseuiStrings.Plussign39
import typingsSlinky.baseui.baseuiStrings.VA
import typingsSlinky.baseui.baseuiStrings.`Vatican City LeftparenthesisCittà del VaticanoRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `228` extends js.Object {
  
  var dialCode: Plussign39 = js.native
  
  var id: VA = js.native
  
  var label: `Vatican City LeftparenthesisCittà del VaticanoRightparenthesis` = js.native
}
object `228` {
  
  @scala.inline
  def apply(
    dialCode: Plussign39,
    id: VA,
    label: `Vatican City LeftparenthesisCittà del VaticanoRightparenthesis`
  ): `228` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`228`]
  }
  
  @scala.inline
  implicit class `228Ops`[Self <: `228`] (val x: Self) extends AnyVal {
    
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
    def setDialCode(value: Plussign39): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: VA): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Vatican City LeftparenthesisCittà del VaticanoRightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
}
