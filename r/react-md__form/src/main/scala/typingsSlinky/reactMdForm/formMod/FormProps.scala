package typingsSlinky.reactMdForm.formMod

import org.scalajs.dom.raw.HTMLFormElement
import typingsSlinky.react.mod.FormHTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormProps extends FormHTMLAttributes[HTMLFormElement] {
  
  /**
    * Boolean if the form should no longer prevent default submit behavior. If
    * you enable this prop you should honestly just use a `<form>` element
    * instead
    */
  var disablePreventDefault: js.UndefOr[Boolean] = js.native
}
object FormProps {
  
  @scala.inline
  def apply(): FormProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormProps]
  }
  
  @scala.inline
  implicit class FormPropsOps[Self <: FormProps] (val x: Self) extends AnyVal {
    
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
    def setDisablePreventDefault(value: Boolean): Self = this.set("disablePreventDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisablePreventDefault: Self = this.set("disablePreventDefault", js.undefined)
  }
}
