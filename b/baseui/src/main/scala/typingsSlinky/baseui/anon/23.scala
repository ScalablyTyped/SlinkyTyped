package typingsSlinky.baseui.anon

import typingsSlinky.baseui.baseuiStrings.IO
import typingsSlinky.baseui.baseuiStrings.Plussign246
import typingsSlinky.baseui.baseuiStrings.`British Indian Ocean Territory`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `23` extends js.Object {
  
  var dialCode: Plussign246 = js.native
  
  var id: IO = js.native
  
  var label: `British Indian Ocean Territory` = js.native
}
object `23` {
  
  @scala.inline
  def apply(dialCode: Plussign246, id: IO, label: `British Indian Ocean Territory`): `23` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`23`]
  }
  
  @scala.inline
  implicit class `23Ops`[Self <: `23`] (val x: Self) extends AnyVal {
    
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
    def setDialCode(value: Plussign246): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: IO): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `British Indian Ocean Territory`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
}
