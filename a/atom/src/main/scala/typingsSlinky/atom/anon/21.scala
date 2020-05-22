package typingsSlinky.atom.anon

import typingsSlinky.atom.atomStrings.Cursor
import typingsSlinky.atom.atomStrings.Word
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `21` extends js.Object {
  var scopeDescriptor: typingsSlinky.atom.mod.ScopeDescriptor
  var value: Word | Cursor
}

object `21` {
  @scala.inline
  def apply(scopeDescriptor: typingsSlinky.atom.mod.ScopeDescriptor, value: Word | Cursor): `21` = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[`21`]
  }
}

