package typingsSlinky.rbx.buttonButtonMod

import typingsSlinky.rbx.rbxStrings.active
import typingsSlinky.rbx.rbxStrings.focused
import typingsSlinky.rbx.rbxStrings.hovered
import typingsSlinky.rbx.rbxStrings.large
import typingsSlinky.rbx.rbxStrings.loading
import typingsSlinky.rbx.rbxStrings.medium
import typingsSlinky.rbx.rbxStrings.normal
import typingsSlinky.rbx.rbxStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ButtonVariablesDefaults extends js.Object {
  
  var sizes: small | normal | medium | large = js.native
  
  var states: hovered | focused | active | loading = js.native
}
object ButtonVariablesDefaults {
  
  @scala.inline
  def apply(sizes: small | normal | medium | large, states: hovered | focused | active | loading): ButtonVariablesDefaults = {
    val __obj = js.Dynamic.literal(sizes = sizes.asInstanceOf[js.Any], states = states.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonVariablesDefaults]
  }
  
  @scala.inline
  implicit class ButtonVariablesDefaultsOps[Self <: ButtonVariablesDefaults] (val x: Self) extends AnyVal {
    
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
    def setSizes(value: small | normal | medium | large): Self = this.set("sizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStates(value: hovered | focused | active | loading): Self = this.set("states", value.asInstanceOf[js.Any])
  }
}
