package typingsSlinky.antd.formItemInputMod

import slinky.core.facade.ReactElement
import typingsSlinky.antd.formItemMod.ValidateStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormItemInputMiscProps extends js.Object {
  
  var children: ReactElement = js.native
  
  var errors: js.Array[ReactElement] = js.native
  
  var hasFeedback: js.UndefOr[Boolean] = js.native
  
  def onDomErrorVisibleChange(visible: Boolean): Unit = js.native
  
  var prefixCls: String = js.native
  
  var validateStatus: js.UndefOr[ValidateStatus] = js.native
}
object FormItemInputMiscProps {
  
  @scala.inline
  def apply(errors: js.Array[ReactElement], onDomErrorVisibleChange: Boolean => Unit, prefixCls: String): FormItemInputMiscProps = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], onDomErrorVisibleChange = js.Any.fromFunction1(onDomErrorVisibleChange), prefixCls = prefixCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormItemInputMiscProps]
  }
  
  @scala.inline
  implicit class FormItemInputMiscPropsOps[Self <: FormItemInputMiscProps] (val x: Self) extends AnyVal {
    
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
    def setErrorsVarargs(value: ReactElement*): Self = this.set("errors", js.Array(value :_*))
    
    @scala.inline
    def setErrors(value: js.Array[ReactElement]): Self = this.set("errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDomErrorVisibleChange(value: Boolean => Unit): Self = this.set("onDomErrorVisibleChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setHasFeedback(value: Boolean): Self = this.set("hasFeedback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasFeedback: Self = this.set("hasFeedback", js.undefined)
    
    @scala.inline
    def setValidateStatus(value: ValidateStatus): Self = this.set("validateStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidateStatus: Self = this.set("validateStatus", js.undefined)
  }
}
