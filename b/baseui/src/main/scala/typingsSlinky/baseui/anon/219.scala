package typingsSlinky.baseui.anon

import typingsSlinky.baseui.baseuiStrings.Plussign1340
import typingsSlinky.baseui.baseuiStrings.VI
import typingsSlinky.baseui.baseuiStrings.`UDotSDot Virgin Islands`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `219` extends js.Object {
  
  var dialCode: Plussign1340 = js.native
  
  var id: VI = js.native
  
  var label: `UDotSDot Virgin Islands` = js.native
}
object `219` {
  
  @scala.inline
  def apply(dialCode: Plussign1340, id: VI, label: `UDotSDot Virgin Islands`): `219` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`219`]
  }
  
  @scala.inline
  implicit class `219Ops`[Self <: `219`] (val x: Self) extends AnyVal {
    
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
    def setDialCode(value: Plussign1340): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: VI): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `UDotSDot Virgin Islands`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
}
