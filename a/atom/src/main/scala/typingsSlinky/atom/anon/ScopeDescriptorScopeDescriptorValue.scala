package typingsSlinky.atom.anon

import typingsSlinky.atom.atomStrings.always
import typingsSlinky.atom.atomStrings.no
import typingsSlinky.atom.atomStrings.yes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScopeDescriptorScopeDescriptorValue extends js.Object {
  
  var scopeDescriptor: typingsSlinky.atom.mod.ScopeDescriptor = js.native
  
  var value: no | yes | always = js.native
}
object ScopeDescriptorScopeDescriptorValue {
  
  @scala.inline
  def apply(scopeDescriptor: typingsSlinky.atom.mod.ScopeDescriptor, value: no | yes | always): ScopeDescriptorScopeDescriptorValue = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScopeDescriptorScopeDescriptorValue]
  }
  
  @scala.inline
  implicit class ScopeDescriptorScopeDescriptorValueOps[Self <: ScopeDescriptorScopeDescriptorValue] (val x: Self) extends AnyVal {
    
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
    def setScopeDescriptor(value: typingsSlinky.atom.mod.ScopeDescriptor): Self = this.set("scopeDescriptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: no | yes | always): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
