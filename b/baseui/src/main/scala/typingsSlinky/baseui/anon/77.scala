package typingsSlinky.baseui.anon

import typingsSlinky.baseui.baseuiStrings.GL
import typingsSlinky.baseui.baseuiStrings.Plussign299
import typingsSlinky.baseui.baseuiStrings.`Greenland LeftparenthesisKalaallit NunaatRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `77` extends js.Object {
  
  var dialCode: Plussign299 = js.native
  
  var id: GL = js.native
  
  var label: `Greenland LeftparenthesisKalaallit NunaatRightparenthesis` = js.native
}
object `77` {
  
  @scala.inline
  def apply(dialCode: Plussign299, id: GL, label: `Greenland LeftparenthesisKalaallit NunaatRightparenthesis`): `77` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`77`]
  }
  
  @scala.inline
  implicit class `77Ops`[Self <: `77`] (val x: Self) extends AnyVal {
    
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
    def setDialCode(value: Plussign299): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: GL): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Greenland LeftparenthesisKalaallit NunaatRightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
}
