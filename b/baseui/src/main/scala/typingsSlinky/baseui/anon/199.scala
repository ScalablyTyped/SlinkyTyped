package typingsSlinky.baseui.anon

import typingsSlinky.baseui.baseuiStrings.Plussign597
import typingsSlinky.baseui.baseuiStrings.SR
import typingsSlinky.baseui.baseuiStrings.Suriname
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `199` extends js.Object {
  
  var dialCode: Plussign597 = js.native
  
  var id: SR = js.native
  
  var label: Suriname = js.native
}
object `199` {
  
  @scala.inline
  def apply(dialCode: Plussign597, id: SR, label: Suriname): `199` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`199`]
  }
  
  @scala.inline
  implicit class `199Ops`[Self <: `199`] (val x: Self) extends AnyVal {
    
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
    def setDialCode(value: Plussign597): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: SR): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Suriname): Self = this.set("label", value.asInstanceOf[js.Any])
  }
}
