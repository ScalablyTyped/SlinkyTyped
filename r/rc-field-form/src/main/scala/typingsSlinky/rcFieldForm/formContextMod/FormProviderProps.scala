package typingsSlinky.rcFieldForm.formContextMod

import typingsSlinky.rcFieldForm.interfaceMod.ValidateMessages
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormProviderProps extends js.Object {
  
  var onFormChange: js.UndefOr[js.Function2[/* name */ String, /* info */ FormChangeInfo, Unit]] = js.native
  
  var onFormFinish: js.UndefOr[js.Function2[/* name */ String, /* info */ FormFinishInfo, Unit]] = js.native
  
  var validateMessages: js.UndefOr[ValidateMessages] = js.native
}
object FormProviderProps {
  
  @scala.inline
  def apply(): FormProviderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormProviderProps]
  }
  
  @scala.inline
  implicit class FormProviderPropsOps[Self <: FormProviderProps] (val x: Self) extends AnyVal {
    
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
    def setOnFormChange(value: (/* name */ String, /* info */ FormChangeInfo) => Unit): Self = this.set("onFormChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnFormChange: Self = this.set("onFormChange", js.undefined)
    
    @scala.inline
    def setOnFormFinish(value: (/* name */ String, /* info */ FormFinishInfo) => Unit): Self = this.set("onFormFinish", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnFormFinish: Self = this.set("onFormFinish", js.undefined)
    
    @scala.inline
    def setValidateMessages(value: ValidateMessages): Self = this.set("validateMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidateMessages: Self = this.set("validateMessages", js.undefined)
  }
}
