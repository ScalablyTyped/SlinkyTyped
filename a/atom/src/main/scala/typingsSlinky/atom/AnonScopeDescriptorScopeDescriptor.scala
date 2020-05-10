package typingsSlinky.atom

import typingsSlinky.atom.mod.FileEncoding
import typingsSlinky.atom.mod.ScopeDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonScopeDescriptorScopeDescriptor extends js.Object {
  var scopeDescriptor: ScopeDescriptor = js.native
  var value: FileEncoding = js.native
}

object AnonScopeDescriptorScopeDescriptor {
  @scala.inline
  def apply(scopeDescriptor: ScopeDescriptor, value: FileEncoding): AnonScopeDescriptorScopeDescriptor = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonScopeDescriptorScopeDescriptor]
  }
  @scala.inline
  implicit class AnonScopeDescriptorScopeDescriptorOps[Self <: AnonScopeDescriptorScopeDescriptor] (val x: Self) extends AnyVal {
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
    def withValue(value: FileEncoding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

