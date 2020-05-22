package typingsSlinky.atom.anon

import typingsSlinky.atom.atomStrings.atom
import typingsSlinky.atom.atomStrings.experimental
import typingsSlinky.atom.atomStrings.native
import typingsSlinky.atom.atomStrings.poll
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `15` extends js.Object {
  var scopeDescriptor: typingsSlinky.atom.mod.ScopeDescriptor
  var value: native | experimental | poll | atom
}

object `15` {
  @scala.inline
  def apply(
    scopeDescriptor: typingsSlinky.atom.mod.ScopeDescriptor,
    value: native | experimental | poll | atom
  ): `15` = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[`15`]
  }
}

