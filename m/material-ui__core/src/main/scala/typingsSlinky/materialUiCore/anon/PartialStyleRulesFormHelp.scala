package typingsSlinky.materialUiCore.anon

import typingsSlinky.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/FormHelperText.FormHelperTextClassKey>> */
@js.native
trait PartialStyleRulesFormHelp extends js.Object {
  
  var contained: js.UndefOr[CSSProperties] = js.native
  
  var disabled: js.UndefOr[CSSProperties] = js.native
  
  var error: js.UndefOr[CSSProperties] = js.native
  
  var filled: js.UndefOr[CSSProperties] = js.native
  
  var focused: js.UndefOr[CSSProperties] = js.native
  
  var marginDense: js.UndefOr[CSSProperties] = js.native
  
  var required: js.UndefOr[CSSProperties] = js.native
  
  var root: js.UndefOr[CSSProperties] = js.native
}
object PartialStyleRulesFormHelp {
  
  @scala.inline
  def apply(): PartialStyleRulesFormHelp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesFormHelp]
  }
  
  @scala.inline
  implicit class PartialStyleRulesFormHelpOps[Self <: PartialStyleRulesFormHelp] (val x: Self) extends AnyVal {
    
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
    def setContained(value: CSSProperties): Self = this.set("contained", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContained: Self = this.set("contained", js.undefined)
    
    @scala.inline
    def setDisabled(value: CSSProperties): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setError(value: CSSProperties): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setFilled(value: CSSProperties): Self = this.set("filled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilled: Self = this.set("filled", js.undefined)
    
    @scala.inline
    def setFocused(value: CSSProperties): Self = this.set("focused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocused: Self = this.set("focused", js.undefined)
    
    @scala.inline
    def setMarginDense(value: CSSProperties): Self = this.set("marginDense", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarginDense: Self = this.set("marginDense", js.undefined)
    
    @scala.inline
    def setRequired(value: CSSProperties): Self = this.set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    
    @scala.inline
    def setRoot(value: CSSProperties): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
  }
}
