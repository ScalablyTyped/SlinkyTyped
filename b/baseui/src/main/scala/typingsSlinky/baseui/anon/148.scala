package typingsSlinky.baseui.anon

import typingsSlinky.baseui.baseuiStrings.NE
import typingsSlinky.baseui.baseuiStrings.Plussign227
import typingsSlinky.baseui.baseuiStrings.`Niger LeftparenthesisNijarRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `148` extends js.Object {
  
  var dialCode: Plussign227 = js.native
  
  var id: NE = js.native
  
  var label: `Niger LeftparenthesisNijarRightparenthesis` = js.native
}
object `148` {
  
  @scala.inline
  def apply(dialCode: Plussign227, id: NE, label: `Niger LeftparenthesisNijarRightparenthesis`): `148` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`148`]
  }
  
  @scala.inline
  implicit class `148Ops`[Self <: `148`] (val x: Self) extends AnyVal {
    
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
    def setDialCode(value: Plussign227): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: NE): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Niger LeftparenthesisNijarRightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
}
