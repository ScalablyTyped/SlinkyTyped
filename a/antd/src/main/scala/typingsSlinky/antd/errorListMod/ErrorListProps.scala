package typingsSlinky.antd.errorListMod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ErrorListProps extends js.Object {
  
  var errors: js.UndefOr[js.Array[ReactElement]] = js.native
  
  /** @private Internal usage. Do not use in your production */
  var help: js.UndefOr[ReactElement] = js.native
  
  /** @private Internal usage. Do not use in your production */
  var onDomErrorVisibleChange: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.native
}
object ErrorListProps {
  
  @scala.inline
  def apply(): ErrorListProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorListProps]
  }
  
  @scala.inline
  implicit class ErrorListPropsOps[Self <: ErrorListProps] (val x: Self) extends AnyVal {
    
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
    def deleteErrors: Self = this.set("errors", js.undefined)
    
    @scala.inline
    def setHelpReactElement(value: ReactElement): Self = this.set("help", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelp(value: ReactElement): Self = this.set("help", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHelp: Self = this.set("help", js.undefined)
    
    @scala.inline
    def setOnDomErrorVisibleChange(value: /* visible */ Boolean => Unit): Self = this.set("onDomErrorVisibleChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDomErrorVisibleChange: Self = this.set("onDomErrorVisibleChange", js.undefined)
  }
}
