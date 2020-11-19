package typingsSlinky.baseui.formControlMod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormControlProps extends js.Object {
  
  var caption: js.UndefOr[ReactElement] = js.native
  
  var children: ReactElement = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var error: js.UndefOr[Boolean | ReactElement] = js.native
  
  var label: js.UndefOr[ReactElement] = js.native
  
  var overrides: js.UndefOr[FormControlOverrides] = js.native
  
  var positive: js.UndefOr[ReactElement] = js.native
}
object FormControlProps {
  
  @scala.inline
  def apply(): FormControlProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormControlProps]
  }
  
  @scala.inline
  implicit class FormControlPropsOps[Self <: FormControlProps] (val x: Self) extends AnyVal {
    
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
    def setCaptionReactElement(value: ReactElement): Self = this.set("caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaption(value: ReactElement): Self = this.set("caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaption: Self = this.set("caption", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setErrorReactElement(value: ReactElement): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: Boolean | ReactElement): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setLabelReactElement(value: ReactElement): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: ReactElement): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setOverrides(value: FormControlOverrides): Self = this.set("overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverrides: Self = this.set("overrides", js.undefined)
    
    @scala.inline
    def setPositiveReactElement(value: ReactElement): Self = this.set("positive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositive(value: ReactElement): Self = this.set("positive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePositive: Self = this.set("positive", js.undefined)
  }
}
