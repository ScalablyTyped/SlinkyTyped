package typingsSlinky.materialTextfield.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<std.ValidityState, 'badInput' | 'valid'> */
@js.native
trait PickValidityStatebadInput extends js.Object {
  
  var badInput: Boolean = js.native
  
  var valid: Boolean = js.native
}
object PickValidityStatebadInput {
  
  @scala.inline
  def apply(badInput: Boolean, valid: Boolean): PickValidityStatebadInput = {
    val __obj = js.Dynamic.literal(badInput = badInput.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickValidityStatebadInput]
  }
  
  @scala.inline
  implicit class PickValidityStatebadInputOps[Self <: PickValidityStatebadInput] (val x: Self) extends AnyVal {
    
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
    def setBadInput(value: Boolean): Self = this.set("badInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValid(value: Boolean): Self = this.set("valid", value.asInstanceOf[js.Any])
  }
}
