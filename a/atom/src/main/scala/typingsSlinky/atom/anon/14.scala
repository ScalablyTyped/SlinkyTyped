package typingsSlinky.atom.anon

import typingsSlinky.atom.atomStrings.limited
import typingsSlinky.atom.atomStrings.no
import typingsSlinky.atom.atomStrings.undecided
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `14` extends js.Object {
  
  var scopeDescriptor: typingsSlinky.atom.mod.ScopeDescriptor = js.native
  
  var value: limited | no | undecided = js.native
}
object `14` {
  
  @scala.inline
  def apply(scopeDescriptor: typingsSlinky.atom.mod.ScopeDescriptor, value: limited | no | undecided): `14` = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[`14`]
  }
  
  @scala.inline
  implicit class `14Ops`[Self <: `14`] (val x: Self) extends AnyVal {
    
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
    def setValue(value: limited | no | undecided): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
