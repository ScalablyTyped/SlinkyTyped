package typingsSlinky.atom.anon

import typingsSlinky.atom.mod.Invisibles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueInvisibles extends js.Object {
  var scopeDescriptor: typingsSlinky.atom.mod.ScopeDescriptor
  var value: Invisibles
}

object ValueInvisibles {
  @scala.inline
  def apply(scopeDescriptor: typingsSlinky.atom.mod.ScopeDescriptor, value: Invisibles): ValueInvisibles = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueInvisibles]
  }
}

