package typingsSlinky.atom.anon

import typingsSlinky.atom.atomStrings.always
import typingsSlinky.atom.atomStrings.no
import typingsSlinky.atom.atomStrings.yes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScopeDescriptorScopeDescriptorValue extends js.Object {
  var scopeDescriptor: typingsSlinky.atom.mod.ScopeDescriptor
  var value: no | yes | always
}

object ScopeDescriptorScopeDescriptorValue {
  @scala.inline
  def apply(scopeDescriptor: typingsSlinky.atom.mod.ScopeDescriptor, value: no | yes | always): ScopeDescriptorScopeDescriptorValue = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScopeDescriptorScopeDescriptorValue]
  }
}

