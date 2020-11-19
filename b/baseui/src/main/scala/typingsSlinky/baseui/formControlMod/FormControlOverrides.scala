package typingsSlinky.baseui.formControlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormControlOverrides extends js.Object {
  
  var Caption: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.native
  
  var ControlContainer: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.native
  
  var Label: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.native
}
object FormControlOverrides {
  
  @scala.inline
  def apply(): FormControlOverrides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormControlOverrides]
  }
  
  @scala.inline
  implicit class FormControlOverridesOps[Self <: FormControlOverrides] (val x: Self) extends AnyVal {
    
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
    def setCaption(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
    ): Self = this.set("Caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaption: Self = this.set("Caption", js.undefined)
    
    @scala.inline
    def setControlContainer(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
    ): Self = this.set("ControlContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteControlContainer: Self = this.set("ControlContainer", js.undefined)
    
    @scala.inline
    def setLabel(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
    ): Self = this.set("Label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("Label", js.undefined)
  }
}
