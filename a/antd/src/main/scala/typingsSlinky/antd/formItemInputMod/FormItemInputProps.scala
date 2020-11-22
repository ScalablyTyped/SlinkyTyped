package typingsSlinky.antd.formItemInputMod

import slinky.core.facade.ReactElement
import typingsSlinky.antd.formItemMod.ValidateStatus
import typingsSlinky.antd.gridColMod.ColProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormItemInputProps extends js.Object {
  
  var extra: js.UndefOr[ReactElement] = js.native
  
  var help: js.UndefOr[ReactElement] = js.native
  
  var status: js.UndefOr[ValidateStatus] = js.native
  
  var wrapperCol: js.UndefOr[ColProps] = js.native
}
object FormItemInputProps {
  
  @scala.inline
  def apply(): FormItemInputProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormItemInputProps]
  }
  
  @scala.inline
  implicit class FormItemInputPropsOps[Self <: FormItemInputProps] (val x: Self) extends AnyVal {
    
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
    def setExtraReactElement(value: ReactElement): Self = this.set("extra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtra(value: ReactElement): Self = this.set("extra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtra: Self = this.set("extra", js.undefined)
    
    @scala.inline
    def setHelpReactElement(value: ReactElement): Self = this.set("help", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelp(value: ReactElement): Self = this.set("help", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHelp: Self = this.set("help", js.undefined)
    
    @scala.inline
    def setStatus(value: ValidateStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setWrapperCol(value: ColProps): Self = this.set("wrapperCol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapperCol: Self = this.set("wrapperCol", js.undefined)
  }
}
