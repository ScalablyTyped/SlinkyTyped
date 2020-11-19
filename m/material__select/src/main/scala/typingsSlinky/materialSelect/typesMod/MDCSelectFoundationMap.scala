package typingsSlinky.materialSelect.typesMod

import typingsSlinky.materialSelect.helperTextFoundationMod.MDCSelectHelperTextFoundation
import typingsSlinky.materialSelect.iconFoundationMod.MDCSelectIconFoundation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MDCSelectFoundationMap extends js.Object {
  
  var helperText: MDCSelectHelperTextFoundation = js.native
  
  var leadingIcon: MDCSelectIconFoundation = js.native
}
object MDCSelectFoundationMap {
  
  @scala.inline
  def apply(helperText: MDCSelectHelperTextFoundation, leadingIcon: MDCSelectIconFoundation): MDCSelectFoundationMap = {
    val __obj = js.Dynamic.literal(helperText = helperText.asInstanceOf[js.Any], leadingIcon = leadingIcon.asInstanceOf[js.Any])
    __obj.asInstanceOf[MDCSelectFoundationMap]
  }
  
  @scala.inline
  implicit class MDCSelectFoundationMapOps[Self <: MDCSelectFoundationMap] (val x: Self) extends AnyVal {
    
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
    def setHelperText(value: MDCSelectHelperTextFoundation): Self = this.set("helperText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeadingIcon(value: MDCSelectIconFoundation): Self = this.set("leadingIcon", value.asInstanceOf[js.Any])
  }
}
