package typingsSlinky.atom.anon

import typingsSlinky.atom.atomStrings.Bottom
import typingsSlinky.atom.atomStrings.Left
import typingsSlinky.atom.atomStrings.Right
import typingsSlinky.atom.atomStrings.Top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `25` extends js.Object {
  var scopeDescriptor: typingsSlinky.atom.mod.ScopeDescriptor = js.native
  var value: Top | Right | Bottom | Left = js.native
}

object `25` {
  @scala.inline
  def apply(scopeDescriptor: typingsSlinky.atom.mod.ScopeDescriptor, value: Top | Right | Bottom | Left): `25` = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[`25`]
  }
  @scala.inline
  implicit class `25Ops`[Self <: `25`] (val x: Self) extends AnyVal {
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
    def withValue(value: Top | Right | Bottom | Left): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

