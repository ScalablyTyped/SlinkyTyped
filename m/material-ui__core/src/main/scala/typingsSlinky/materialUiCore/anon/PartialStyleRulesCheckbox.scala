package typingsSlinky.materialUiCore.anon

import typingsSlinky.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/Checkbox.CheckboxClassKey>> */
@js.native
trait PartialStyleRulesCheckbox extends js.Object {
  
  var checked: js.UndefOr[CSSProperties] = js.native
  
  var colorPrimary: js.UndefOr[CSSProperties] = js.native
  
  var colorSecondary: js.UndefOr[CSSProperties] = js.native
  
  var disabled: js.UndefOr[CSSProperties] = js.native
  
  var indeterminate: js.UndefOr[CSSProperties] = js.native
  
  var input: js.UndefOr[CSSProperties] = js.native
  
  var root: js.UndefOr[CSSProperties] = js.native
}
object PartialStyleRulesCheckbox {
  
  @scala.inline
  def apply(): PartialStyleRulesCheckbox = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesCheckbox]
  }
  
  @scala.inline
  implicit class PartialStyleRulesCheckboxOps[Self <: PartialStyleRulesCheckbox] (val x: Self) extends AnyVal {
    
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
    def setChecked(value: CSSProperties): Self = this.set("checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChecked: Self = this.set("checked", js.undefined)
    
    @scala.inline
    def setColorPrimary(value: CSSProperties): Self = this.set("colorPrimary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorPrimary: Self = this.set("colorPrimary", js.undefined)
    
    @scala.inline
    def setColorSecondary(value: CSSProperties): Self = this.set("colorSecondary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorSecondary: Self = this.set("colorSecondary", js.undefined)
    
    @scala.inline
    def setDisabled(value: CSSProperties): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setIndeterminate(value: CSSProperties): Self = this.set("indeterminate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndeterminate: Self = this.set("indeterminate", js.undefined)
    
    @scala.inline
    def setInput(value: CSSProperties): Self = this.set("input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    
    @scala.inline
    def setRoot(value: CSSProperties): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
  }
}
