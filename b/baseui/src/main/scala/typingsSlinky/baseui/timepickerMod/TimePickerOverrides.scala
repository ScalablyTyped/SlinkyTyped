package typingsSlinky.baseui.timepickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimePickerOverrides extends js.Object {
  
  var Select: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.native
}
object TimePickerOverrides {
  
  @scala.inline
  def apply(): TimePickerOverrides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimePickerOverrides]
  }
  
  @scala.inline
  implicit class TimePickerOverridesOps[Self <: TimePickerOverrides] (val x: Self) extends AnyVal {
    
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
    def setSelect(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
    ): Self = this.set("Select", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelect: Self = this.set("Select", js.undefined)
  }
}
