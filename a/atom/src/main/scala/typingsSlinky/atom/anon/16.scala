package typingsSlinky.atom.anon

import typingsSlinky.atom.atomStrings.default
import typingsSlinky.atom.atomStrings.srgb
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `16` extends js.Object {
  
  var scopeDescriptor: typingsSlinky.atom.mod.ScopeDescriptor = js.native
  
  var value: default | srgb = js.native
}
object `16` {
  
  @scala.inline
  def apply(scopeDescriptor: typingsSlinky.atom.mod.ScopeDescriptor, value: default | srgb): `16` = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[`16`]
  }
  
  @scala.inline
  implicit class `16Ops`[Self <: `16`] (val x: Self) extends AnyVal {
    
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
    def setValue(value: default | srgb): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
