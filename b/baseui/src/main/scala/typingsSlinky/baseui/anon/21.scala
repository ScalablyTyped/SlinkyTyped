package typingsSlinky.baseui.anon

import typingsSlinky.baseui.baseuiStrings.BW
import typingsSlinky.baseui.baseuiStrings.Botswana
import typingsSlinky.baseui.baseuiStrings.Plussign267
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `21` extends js.Object {
  
  var dialCode: Plussign267 = js.native
  
  var id: BW = js.native
  
  var label: Botswana = js.native
}
object `21` {
  
  @scala.inline
  def apply(dialCode: Plussign267, id: BW, label: Botswana): `21` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`21`]
  }
  
  @scala.inline
  implicit class `21Ops`[Self <: `21`] (val x: Self) extends AnyVal {
    
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
    def setDialCode(value: Plussign267): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: BW): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Botswana): Self = this.set("label", value.asInstanceOf[js.Any])
  }
}
