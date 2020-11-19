package typingsSlinky.rbx.messageMessageMod

import typingsSlinky.rbx.rbxStrings.large
import typingsSlinky.rbx.rbxStrings.medium
import typingsSlinky.rbx.rbxStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined rbx.rbx/types.Prefer<rbx.rbx/components/message/message.MessageVariablesOverrides, rbx.rbx/components/message/message.MessageVariablesDefaults> */
@js.native
trait MessageVariables extends js.Object {
  
  var sizes: small | medium | large = js.native
}
object MessageVariables {
  
  @scala.inline
  def apply(sizes: small | medium | large): MessageVariables = {
    val __obj = js.Dynamic.literal(sizes = sizes.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageVariables]
  }
  
  @scala.inline
  implicit class MessageVariablesOps[Self <: MessageVariables] (val x: Self) extends AnyVal {
    
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
    def setSizes(value: small | medium | large): Self = this.set("sizes", value.asInstanceOf[js.Any])
  }
}
