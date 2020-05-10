package typingsSlinky.atom

import typingsSlinky.atom.atomStrings.always
import typingsSlinky.atom.atomStrings.no
import typingsSlinky.atom.atomStrings.yes
import typingsSlinky.atom.mod.ScopeDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonScopeDescriptorScopeDescriptorValue extends js.Object {
  var scopeDescriptor: ScopeDescriptor = js.native
  var value: no | yes | always = js.native
}

object AnonScopeDescriptorScopeDescriptorValue {
  @scala.inline
  def apply(scopeDescriptor: ScopeDescriptor, value: no | yes | always): AnonScopeDescriptorScopeDescriptorValue = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonScopeDescriptorScopeDescriptorValue]
  }
  @scala.inline
  implicit class AnonScopeDescriptorScopeDescriptorValueOps[Self <: AnonScopeDescriptorScopeDescriptorValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScopeDescriptor(value: ScopeDescriptor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopeDescriptor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: no | yes | always): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

