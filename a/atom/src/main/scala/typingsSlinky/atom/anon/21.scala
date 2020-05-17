package typingsSlinky.atom.anon

import typingsSlinky.atom.atomStrings.Cursor
import typingsSlinky.atom.atomStrings.Word
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `21` extends js.Object {
  var scopeDescriptor: typingsSlinky.atom.mod.ScopeDescriptor = js.native
  var value: Word | Cursor = js.native
}

object `21` {
  @scala.inline
  def apply(scopeDescriptor: typingsSlinky.atom.mod.ScopeDescriptor, value: Word | Cursor): `21` = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[`21`]
  }
  @scala.inline
  implicit class `21Ops`[Self <: `21`] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScopeDescriptor(value: typingsSlinky.atom.mod.ScopeDescriptor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopeDescriptor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Word | Cursor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

