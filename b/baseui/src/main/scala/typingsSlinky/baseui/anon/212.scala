package typingsSlinky.baseui.anon

import typingsSlinky.baseui.baseuiStrings.Plussign676
import typingsSlinky.baseui.baseuiStrings.TO
import typingsSlinky.baseui.baseuiStrings.Tonga
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `212` extends js.Object {
  
  var dialCode: Plussign676 = js.native
  
  var id: TO = js.native
  
  var label: Tonga = js.native
}
object `212` {
  
  @scala.inline
  def apply(dialCode: Plussign676, id: TO, label: Tonga): `212` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`212`]
  }
  
  @scala.inline
  implicit class `212Ops`[Self <: `212`] (val x: Self) extends AnyVal {
    
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
    def setDialCode(value: Plussign676): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: TO): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Tonga): Self = this.set("label", value.asInstanceOf[js.Any])
  }
}
