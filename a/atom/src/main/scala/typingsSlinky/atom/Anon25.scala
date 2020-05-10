package typingsSlinky.atom

import typingsSlinky.atom.atomStrings.Bottom
import typingsSlinky.atom.atomStrings.Left
import typingsSlinky.atom.atomStrings.Right
import typingsSlinky.atom.atomStrings.Top
import typingsSlinky.atom.mod.ScopeDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon25 extends js.Object {
  var scopeDescriptor: ScopeDescriptor = js.native
  var value: Top | Right | Bottom | Left = js.native
}

object Anon25 {
  @scala.inline
  def apply(scopeDescriptor: ScopeDescriptor, value: Top | Right | Bottom | Left): Anon25 = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon25]
  }
  @scala.inline
  implicit class Anon25Ops[Self <: Anon25] (val x: Self) extends AnyVal {
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
    def withValue(value: Top | Right | Bottom | Left): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

