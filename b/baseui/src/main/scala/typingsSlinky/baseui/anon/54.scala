package typingsSlinky.baseui.anon

import typingsSlinky.baseui.baseuiStrings.DM
import typingsSlinky.baseui.baseuiStrings.Dominica
import typingsSlinky.baseui.baseuiStrings.Plussign1767
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `54` extends js.Object {
  
  var dialCode: Plussign1767 = js.native
  
  var id: DM = js.native
  
  var label: Dominica = js.native
}
object `54` {
  
  @scala.inline
  def apply(dialCode: Plussign1767, id: DM, label: Dominica): `54` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`54`]
  }
  
  @scala.inline
  implicit class `54Ops`[Self <: `54`] (val x: Self) extends AnyVal {
    
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
    def setDialCode(value: Plussign1767): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: DM): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Dominica): Self = this.set("label", value.asInstanceOf[js.Any])
  }
}
